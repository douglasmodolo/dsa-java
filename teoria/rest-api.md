# REST API

REST (Representational State Transfer) é um estilo de arquitetura para APIs que usa o protocolo HTTP.

---

## Verbos HTTP

| Verbo | Uso | Idempotente? |
|---|---|---|
| GET | Buscar dados | ✅ Sim |
| POST | Criar recurso | ❌ Não |
| PUT | Atualizar recurso completo | ✅ Sim |
| PATCH | Atualizar recurso parcial | ✅ Sim |
| DELETE | Deletar recurso | ✅ Sim |

> **Idempotente:** chamar várias vezes produz o mesmo resultado.
> Exemplo: deletar o mesmo recurso duas vezes tem o mesmo efeito que deletar uma vez.

---

## Status Codes

### 2xx — Sucesso
| Código | Significado | Quando usar |
|---|---|---|
| 200 | OK | GET, PUT, PATCH com sucesso |
| 201 | Created | POST que criou um recurso |
| 204 | No Content | DELETE com sucesso |

### 3xx — Redirecionamento
| Código | Significado |
|---|---|
| 301 | Moved Permanently |
| 302 | Found (redirecionamento temporário) |

### 4xx — Erro do Cliente
| Código | Significado | Quando usar |
|---|---|---|
| 400 | Bad Request | Dados inválidos na requisição |
| 401 | Unauthorized | Não autenticado |
| 403 | Forbidden | Autenticado mas sem permissão |
| 404 | Not Found | Recurso não encontrado |
| 409 | Conflict | Recurso já existe |
| 422 | Unprocessable Entity | Dados semanticamente inválidos |

### 5xx — Erro do Servidor
| Código | Significado |
|---|---|
| 500 | Internal Server Error |
| 502 | Bad Gateway |
| 503 | Service Unavailable |

---

## Boas Práticas de Design

### URLs

**Correto:**
- `GET /clientes` → lista todos
- `GET /clientes/1` → busca por id
- `GET /clientes/1/pedidos` → pedidos do cliente 1

**Incorreto:**
- `GET /getClientes`
- `DELETE /deletarCliente?id=1`
- `POST /cliente_criar`

**Regras:**
- Usar **substantivos**, não verbos — o verbo HTTP já indica a ação
- Usar **plural** para coleções
- Usar **kebab-case** para múltiplas palavras (`/meus-pedidos`)

### Versionamento

- `GET /api/v1/clientes`
- `GET /api/v2/clientes`

---

## Diferença entre REST e outras arquiteturas

| | REST | GraphQL | gRPC |
|---|---|---|---|
| Protocolo | HTTP | HTTP | HTTP/2 |
| Formato | JSON/XML | JSON | Protocol Buffers |
| Flexibilidade | Média | Alta | Baixa |
| Performance | Boa | Boa | Muito alta |
| Quando usar | APIs públicas | Dados complexos | Microserviços internos |

---

## Diferença importante — 401 vs 403

- **401 Unauthorized** → você **não está logado**
- **403 Forbidden** → você está logado mas **não tem permissão**

## Diferença importante — PUT vs PATCH

- **PUT** → envia o objeto **completo** para substituir
- **PATCH** → envia apenas os **campos que mudaram**