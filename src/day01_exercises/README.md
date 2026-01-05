# Day 01 — Java Basics: Types, Casting, Strings & Input

Neste primeiro dia do projeto **30 Days of Java**, o foco foi construir uma base sólida
sobre como o Java lida com **tipos primitivos, conversões, caracteres, strings e entrada de dados**.

O objetivo não foi apenas fazer o código funcionar, mas **entender o comportamento da linguagem**
em situações reais, evitando erros silenciosos comuns em aplicações backend.

---

## 📌 Conteúdos Estudados

- Variáveis e regras de nomenclatura
- Tipos primitivos do Java
- Representação numérica (decimal, binário, hexadecimal)
- Separador visual `_`
- Casting implícito e explícito
- Overflow aritmético
- Tipo `char` e Unicode
- Strings e Text Blocks
- Entrada de dados com `Scanner`
- Bug clássico do `nextLine()`

---

## 🧪 Exercícios Implementados

### ✅ Exercício 01 — Radar Financeiro
Simulação de conversão de valores monetários, abordando:
- casting explícito
- arredondamento
- truncamento
- riscos do uso de `double` para valores financeiros

---

### ✅ Exercício 02 — Conversor Universal
Conversão de um número inteiro para:
- decimal
- binário
- hexadecimal  
  Reforçando o conceito de **base numérica ≠ tipo de dado**.

---

### ✅ Exercício 03 — Analisador de Overflow
Demonstração prática de overflow aritmético com `byte`,
explicando o comportamento do complemento de dois.

---

### ✅ Exercício 04 — Simulador de Perda de Dados
Conversão de `double` para `int`, `long` e `float`,
e análise da perda de precisão entre os tipos.

---

### ✅ Exercício 05 — Detector de Casting Implícito
Identificação clara de:
- casting implícito (widening)
- casting explícito (narrowing)
  e seus riscos.

---

### ✅ Exercício 06 — Decodificador de Caracteres
Exploração do tipo `char` como valor Unicode,
incluindo navegação entre caracteres.

---

### ✅ Exercício 07 — Verificador de Letra
Classificação manual de caracteres (maiúsculo, minúsculo, número ou símbolo)
sem uso de métodos prontos.

---

### ✅ Exercício 08 — Gerador de Perfil
Uso de **Text Blocks** para gerar um perfil formatado,
reforçando imutabilidade de `String`.

---

### ✅ Exercício 09 — Analisador de String
Manipulação direta de `String`:
- contagem de caracteres
- contagem de espaços
- acesso ao primeiro e último caractere

---

### ✅ Exercício 10 — Scanner Bug Hunter
Análise e correção do bug clássico envolvendo `nextInt()` e `nextLine()`,
com explicação detalhada sobre o buffer de entrada.

---

## 🎯 Principais Aprendizados do Dia

- Tipos primitivos possuem **limites bem definidos**
- Overflow ocorre de forma silenciosa
- Casting explícito assume riscos
- `char` é um número, não apenas uma letra
- `double` não é ideal para valores financeiros
- Entrada de dados exige atenção ao buffer
- Código legível e bem explicado é parte da qualidade

---

## 🚀 Próximos Passos

No **Day 02**, o foco será:
- operadores aritméticos e lógicos
- controle de fluxo (`if`, `else`, `switch`)
- laços (`for`, `while`)
- primeiros padrões de lógica backend

---

📌 *Este repositório prioriza aprendizado profundo, clareza de código e evolução consistente.*