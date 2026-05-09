# Complexidade de Algoritmos — Big O

Big O descreve como o tempo de execução de um algoritmo cresce conforme o tamanho da entrada aumenta.

**A pergunta que resolve qualquer questão:**
> Quantos loops tem o código e eles estão aninhados ou separados?

---

## Tipos de Complexidade

### O(1) — Constante
Tempo fixo, independente do tamanho da entrada.

**Quando ocorre:**
- Acesso por índice em array
- Busca por chave em HashMap
- Operações matemáticas simples

**Exemplos no projeto:**
```java
arr[0];                  // acesso direto
map.get(key);            // HashMap
map.containsKey(key);    // HashMap
number % 2 == 0;         // EvenOrOdd.java
```

---

### O(log n) — Logarítmica
O problema é dividido pela metade a cada passo.

**Quando ocorre:**
- Algoritmos de "dividir para conquistar"
- Requer entrada **ordenada**

**Exemplos no projeto:**
```java
// BinarySearch.java
while (esquerda <= direita) {
    int meio = (esquerda + direita) / 2;
    // descarta metade a cada iteração
}
```

---

### O(n) — Linear
O tempo cresce proporcionalmente ao tamanho da entrada.

**Quando ocorre:**
- Um único loop
- Dois loops **separados** (O(n) + O(n) = O(n))

**Exemplos no projeto:**
```java
// LinearSearch.java
for (int i = 0; i < arr.length; i++) { ... }

// MostFrequent.java — dois loops separados = O(n)
for (int num : arr) { map.put(...) }  // loop 1
for (int num : arr) { if (...) }      // loop 2
```

---

### O(n log n) — Linearítmica
Padrão ouro para ordenação de grandes volumes.

**Quando ocorre:**
- Algoritmos que dividem e depois percorrem
- `Arrays.sort()` do Java internamente

**Exemplos no projeto:**
```java
// MergeSort.java
// divide recursivamente (log n) e junta percorrendo (n)
return merge(sort(esquerda), sort(direita));

// Anagrams.java
Arrays.sort(chars); // O(n log n) para ordenar os caracteres
```

---

### O(n²) — Quadrática
O tempo cresce ao quadrado. Perigoso para grandes volumes.

**Quando ocorre:**
- Dois loops **aninhados**

**Exemplos no projeto:**
```java
// BubbleSort.java
for (int i = 0; i < arr.length - 1; i++) {
    for (int j = 0; j < arr.length - 1 - i; j++) { ... }
}

// TwoSum.java — versão ingênua (comentada)
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr.length; j++) { ... }
}
```

---

## Comparação Visual

| Complexidade | n = 1.000 elementos |
|---|---|
| O(1) | 1 operação |
| O(log n) | 10 operações |
| O(n) | 1.000 operações |
| O(n log n) | 10.000 operações |
| O(n²) | 1.000.000 operações |
---

## Regra Rápida para Múltipla Escolha

| Situação | Complexidade |
|---|---|
| Sem loop | O(1) |
| Acesso HashMap/array por índice | O(1) |
| 1 loop | O(n) |
| 2 loops separados | O(n) |
| 2 loops aninhados | O(n²) |
| Divide ao meio a cada passo | O(log n) |
| Ordena + percorre | O(n log n) |