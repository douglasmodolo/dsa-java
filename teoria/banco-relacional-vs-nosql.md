# Banco Relacional vs Não Relacional

---

## Banco Relacional (SQL)

Dados organizados em **tabelas** com linhas e colunas, com relacionamentos entre elas.

**Exemplos:** MySQL, PostgreSQL, SQL Server, Oracle

### Características
- Esquema fixo — estrutura definida antes de inserir dados
- Usa SQL para consultas
- Suporta transações (ACID)
- Relacionamentos entre tabelas via chaves estrangeiras

### Quando usar
- Dados estruturados e relacionados
- Necessidade de consistência e integridade
- Sistemas financeiros, ERPs, e-commerce

---

## Banco Não Relacional (NoSQL)

Dados armazenados em formatos flexíveis — documentos, chave-valor, grafos, colunas.

**Exemplos:** MongoDB, Redis, Cassandra, DynamoDB

### Tipos de NoSQL

| Tipo | Exemplo | Uso comum |
|---|---|---|
| Documento | MongoDB | JSON flexível, catálogos |
| Chave-Valor | Redis | Cache, sessões |
| Colunar | Cassandra | Logs, séries temporais |
| Grafo | Neo4j | Redes sociais, recomendações |

### Características
- Esquema flexível — estrutura pode mudar a qualquer momento
- Alta escalabilidade horizontal
- Alta performance para leitura/escrita
- Eventual consistency (nem sempre consistente no momento exato)

### Quando usar
- Dados não estruturados ou semi-estruturados
- Grande volume de dados (Big Data)
- Alta disponibilidade e escalabilidade
- Redes sociais, IoT, catálogos de produtos

---

## Comparação Direta

| | Relacional (SQL) | Não Relacional (NoSQL) |
|---|---|---|
| Estrutura | Tabelas | Documentos, chave-valor, etc |
| Esquema | Fixo | Flexível |
| Escalabilidade | Vertical (mais hardware) | Horizontal (mais servidores) |
| Consistência | Forte (ACID) | Eventual |
| Query | SQL padronizado | Específico de cada banco |
| Melhor para | Dados relacionados | Dados não estruturados |

---

## ACID vs BASE

### ACID — Bancos Relacionais
- **A**tomicity — tudo ou nada na transação
- **C**onsistency — dados sempre válidos
- **I**solation — transações não interferem entre si
- **D**urability — dados persistidos mesmo após falha

### BASE — Bancos NoSQL
- **B**asically **A**vailable — sempre disponível
- **S**oft state — estado pode mudar com o tempo
- **E**ventually consistent — consistente em algum momento

---

## Diferenças importantes para múltipla escolha

- SQL escala **verticalmente** (mais CPU/RAM no mesmo servidor)
- NoSQL escala **horizontalmente** (mais servidores)
- Redis é um banco NoSQL do tipo **chave-valor** muito usado para **cache**
- MongoDB armazena dados no formato **BSON** (similar ao JSON)
- Transações complexas → **SQL**
- Alto volume e flexibilidade → **NoSQL**