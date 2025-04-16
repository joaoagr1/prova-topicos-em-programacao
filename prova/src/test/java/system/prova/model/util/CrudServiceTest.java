package system.prova.model.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CrudServiceTest {

    @Mock
    private FakeRepository fakeRepository;

    @InjectMocks
    private FakeService fakeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSave() {
        FakeEntity entity = new FakeEntity(1L, "Teste");
        when(fakeRepository.save(entity)).thenReturn(entity);

        FakeEntity savedEntity = fakeService.save(entity);

        assertNotNull(savedEntity);
        assertEquals("Teste", savedEntity.getName());
        verify(fakeRepository, times(1)).save(entity);
    }

    @Test
    void testFindById() {
        FakeEntity entity = new FakeEntity(1L, "Teste");
        when(fakeRepository.findById(1L)).thenReturn(Optional.of(entity));

        Optional<FakeEntity> foundEntity = fakeService.findById(1L);

        assertTrue(foundEntity.isPresent());
        assertEquals("Teste", foundEntity.get().getName());
        verify(fakeRepository, times(1)).findById(1L);
    }

    @Test
    void testFindAll() {
        List<FakeEntity> entities = List.of(new FakeEntity(1L, "A"), new FakeEntity(2L, "B"));
        when(fakeRepository.findAll()).thenReturn(entities);

        List<FakeEntity> result = fakeService.findAll();

        assertEquals(2, result.size());
        verify(fakeRepository, times(1)).findAll();
    }

    @Test
    void testUpdate() {
        FakeEntity existingEntity = new FakeEntity(1L, "Original");
        FakeEntity updatedEntity = new FakeEntity(1L, "Atualizado");

        when(fakeRepository.findById(1L)).thenReturn(Optional.of(existingEntity));
        when(fakeRepository.save(existingEntity)).thenReturn(existingEntity);

        FakeEntity result = fakeService.update(1L, updatedEntity);

        assertEquals("Atualizado", result.getName());
        verify(fakeRepository, times(1)).findById(1L);
        verify(fakeRepository, times(1)).save(existingEntity);
    }

    @Test
    void testDelete() {
        when(fakeRepository.existsById(1L)).thenReturn(true);
        doNothing().when(fakeRepository).deleteById(1L);

        assertDoesNotThrow(() -> fakeService.delete(1L));

        verify(fakeRepository, times(1)).existsById(1L);
        verify(fakeRepository, times(1)).deleteById(1L);
    }

    @Test
    void testDeleteNotFound() {
        when(fakeRepository.existsById(99L)).thenReturn(false);

        Exception exception = assertThrows(RuntimeException.class, () -> fakeService.delete(99L));

        assertEquals("Registro não encontrado", exception.getMessage());
        verify(fakeRepository, times(1)).existsById(99L);
    }
}