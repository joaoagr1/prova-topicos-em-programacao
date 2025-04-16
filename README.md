📘 Documentação da API - prova
🌐 URL Base
arduino
Copiar
Editar
http://localhost:8080
📁 Pessoas
🔍 GET /pessoas
Retorna todas as pessoas cadastradas.

🔍 GET /pessoas/{id}
Retorna os dados de uma pessoa específica.

✏️ PUT /pessoas/{id}
Atualiza os dados de uma pessoa.

Exemplo de corpo:
json
Copiar
Editar
{
  "name": "João Pedro",
  "age": 3
}
➕ POST /pessoas
Cria uma nova pessoa com vínculo de emprego.

Exemplo de corpo:
json
Copiar
Editar
{
  "name": "João da Silva",
  "age": 15,
  "emprego": 1
}
➕ POST /pessoas/create-with-job
Cria uma nova pessoa com empregoId.

Exemplo de corpo:
json
Copiar
Editar
{
  "name": "João da Silva",
  "age": 15,
  "empregoId": 1
}
❌ DELETE /pessoas/{id}
Deleta uma pessoa.

Exemplo de corpo:
json
Copiar
Editar
{
  "name": "João Silva",
  "email": "joao@email.com",
  "password": "123456"
}
📁 Empregos
🔍 GET /empregos
Retorna todos os empregos cadastrados.

🔍 GET /empregos/{id}
Retorna os dados de um emprego específico.

✏️ PUT /empregos/{id}
Atualiza os dados de um emprego.

Exemplo de corpo:
json
Copiar
Editar
{
  "endereco": "Jardim italia"
}
➕ POST /empregos
Cria um novo emprego.

Exemplo de corpo:
json
Copiar
Editar
{
  "endereco": "Rua augusta"
}
❌ DELETE /empregos/{id}
Deleta um emprego.

Exemplo de corpo:
json
Copiar
Editar
{
  "name": "João Silva",
  "email": "joao@email.com",
  "password": "123456"
}
