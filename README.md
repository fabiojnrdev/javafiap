# Treinamento Java

Repositório com exercícios e projetos de programação em Java, cobrindo desde conceitos básicos até programação orientada a objetos.

## 📚 Estrutura do Projeto

O projeto está organizado em três módulos principais:

### 1. **Java - FIAP**
Conceitos fundamentais de Java com foco em tipos de dados, operadores e estruturas de controle básicas.

**Arquivos:**
- [Loop.java] - Demonstração de laço `for`
- [ParOuImpar.java] - Verifica se um número é par ou ímpar
- [Preco.java] - Cálculo de preço com condições
- [TiposPrimitivos.java]- Demonstração dos 8 tipos primitivos

---

### 2. **Java - Fase 1**
Exercícios progressivos com operadores, estruturas de controle, laços e tratamento de exceções.

#### **Operadores e Expressões**

- **[CalculadoraSimples.java]**
  - Operações básicas: soma, subtração, multiplicação, divisão, resto
  - Operadores lógicos (&&) e comparação
  - Demonstração de precedência de operadores

- **[CalculadoraAtualizada.java]**
  - Comparação de cálculos com e sem parênteses
  - Demonstração de precedência de operadores
  - Variáveis booleanas

#### **Estruturas de Controle**

- **[Estacoes.java]**
  - Entrada de dados via Scanner
  - Estrutura `switch/case`
  - Normalização de strings (toUpperCase, toLowerCase)
  - Validação de entrada

- **[Idade.java]**
  - Estrutura `if/else`
  - Tratamento de exceção `InputMismatchException`
  - Classificação por faixa etária

- **[Imc.java]**
  - Cálculo de IMC (Índice de Massa Corporal)
  - Uso de `Locale.US` para padrão decimal
  - Formatação com `printf`
  - Estrutura `if/else if/else` com múltiplas condições
  - Classificação de categorias de peso

#### **Laços**

- **[NumerosPares.java]**
  - Laço `for` com incremento customizado (`i += 2`)
  - Impressão de números pares de 2 a 20

- **[SomaPares.java]**
  - Laço `for` com intervalo dinâmico
  - Validação de entrada
  - Cálculo de soma de números pares
  - Lógica para encontrar o primeiro número par

- **[Fatorial.java]**
  - Laço `while`
  - Cálculo de fatorial
  - Tratamento de exceção com `try/catch/finally`
  - Multiplicação acumulada

#### **Menu e Controle de Fluxo**

- **[Menu.java]**
  - Laço `do/while`
  - Estrutura `switch/case` com múltiplas opções
  - Uso de `continue` para opções inválidas
  - Soma de intervalo e impressão de ímpares
  - Menu interativo que repete até seleção de saída

---

### 3. **Java - Programação Orientada a Objetos**
Introdução a conceitos de POO com classes, objetos, atributos e métodos.

- **[Carro.java]**
  - **Classe com atributos:** cor, modelo, ano
  - **Construtores:** construtor parametrizado e construtor padrão
  - **Métodos:** `exibirInfo()` e `acelerar(int velocidade)`
  - **Criação e manipulação de objetos**
  - **Comparação de objetos** (comparando anos de diferentes carros)
  - **Lógica para encontrar o carro mais recente**
  
  **Exemplo de uso:**
  ```java
  Carro meuCarro = new Carro("Preto", "Bmw 320i", 2026);
  meuCarro.exibirInfo();
  meuCarro.acelerar(130);
  ```

---

## 🎯 Conceitos Abordados

### Nível Iniciante (FIAP)
- ✅ Tipos de dados primitivos (int, double, boolean, char, etc.)
- ✅ Operadores aritméticos e lógicos
- ✅ Entrada/saída (Scanner, System.out)

### Nível Intermediário (Fase 1)
- ✅ Estruturas de controle (if/else, switch/case)
- ✅ Laços de repetição (for, while, do/while)
- ✅ Manipulação de strings
- ✅ Formatação de saída (printf)
- ✅ Tratamento de exceções (try/catch/finally)
- ✅ Validação de entrada

### Nível Avançado (POO)
- ✅ Classes e objetos
- ✅ Atributos de instância
- ✅ Construtores
- ✅ Métodos
- ✅ Comparação de objetos
- ✅ Encapsulamento básico

---

## 🚀 Como Executar

### Para compilar um arquivo:
```bash
javac NomeDoArquivo.java
```

### Para executar um programa:
```bash
java NomeDoArquivo
```

### Exemplo completo:
```bash
cd "Java - FIAP"
javac ParOuImpar.java
java ParOuImpar
```

---

## 💻 Requisitos

- **JDK 8** ou superior instalado
- Terminal ou linha de comando (CMD, PowerShell, Bash, etc.)
- Editor de texto ou IDE (VS Code, IntelliJ IDEA, NetBeans, etc.)

---

## 📝 Notas Importantes

- Alguns programas requerem entrada do usuário via Scanner
- Certifique-se de fornecer dados válidos conforme solicitado
- O tratamento de exceções é demonstrado em vários exercícios
- A formatação de saída utiliza `printf` em alguns programas

---

## 📖 Recursos

- [Documentação Oracle Java](https://docs.oracle.com/javase/)
- [Tutorial de Java (W3Schools)](https://www.w3schools.com/java/)
- FIAP - Cursos de programação

---

**Última atualização:** Janeiro de 2026
