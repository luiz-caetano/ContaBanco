
# 🏦 ContaTerminal – Bootcamp Backend Java (DIO | Santander)

[![Java Version](https://img.shields.io/badge/Java-11%2B-orange.svg)]()  [![Build Status](https://img.shields.io/badge/Build-Pass-brightgreen.svg)]()  [![Made with DIO ☕️](https://img.shields.io/badge/Made%20with-DIO%20Bootcamp-red.svg)]()

---

## 🧠 Sobre o projeto
Console app em Java que simula a criação de uma conta bancária. O usuário informa agência, conta e nome do titular, com validação de entrada para garantir que números sejam realmente numéricos. Ao final, exibe uma mensagem de boas-vindas com os dados cadastrados e saldo disponível.

---

## 💡 Objetivos
- Exercitar leitura de dados pelo console usando `Scanner`
- Aprender validação com `hasNextInt()` e consumir entradas inválidas com `next()`
- Implementar loops até receber dados numéricos válidos
- Praticar output formatado com `printf` (inteiros e número decimal com duas casas)

---

## 🛠️ Como compilar e executar

```bash
javac ContaTerminal.java
java ContaTerminal
````

O programa irá solicitar, nessa ordem:

1. **Agência** (recebe somente números)
2. **Conta** (recebe somente números)
3. **Nome do titular**

Exemplo de interação:

```
Digite sua AGÊNCIA:
abc
Entrada inválida! Digite apenas números:
1234
Digite número da CONTA:
...
```

---

## ✅ Validação de entrada

O código aplica:

* `while (!sc.hasNextInt()) { ... sc.next(); }` para garantir que só seja aceito um número inteiro
* Usa `sc.next()` para **consumir** qualquer entrada inválida antes de tentar ler novamente

---

## 🎯 Exemplo de código principal

```java
Scanner sc = new Scanner(System.in);

System.out.println("Digite sua AGÊNCIA: ");
int agencia;
while (true) {
    if (sc.hasNextInt()) {
        agencia = sc.nextInt();
        break;
    } else {
        System.out.println("Entrada inválida! Digite apenas números:");
        sc.next(); // consome entrada inválida
    }
}

System.out.println("Digite número da CONTA: ");
int conta;
while (true) {
    if (sc.hasNextInt()) {
        conta = sc.nextInt();
        break;
    } else {
        System.out.println("Entrada inválida! Digite apenas números:");
        sc.next(); // consome entrada inválida
    }
}

System.out.println("Digite o nome do titular: ");
String titular = sc.next();

double saldo = 237.48;

System.out.printf(
  "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, " +
  "conta %d e seu saldo R$ %.2f já está disponível para saque%n",
  titular, agencia, conta, saldo
);
sc.close();
```

---

## 🚀 Possíveis evoluções

* Usar `nextLine()` para permitir nome completo com espaços
* Substituir o `Scanner` por `System.console().readLine()`
* Implementar menu interativo com opções como depósito, saque e saída
* Adicionar persistência simples com gravação em arquivo ou JSON

---

## 🧷 Créditos

Desafio do **DIO Backend Bootcamp**, em parceria com **Santander**.

---

## 📚 Referências

* Tratamento de entrada inválida com `Scanner`, `hasNextInt()` e `sc.next()`
* Alternativa usando `System.console()` para leitura de dados

---

