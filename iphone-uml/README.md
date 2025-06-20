# Desafio: Modelagem e Diagramação de um Componente iPhone

Este repositório contém a modelagem UML e a implementação em Java das principais funcionalidades do iPhone conforme apresentado no lançamento de 2007.

## Funcionalidades

- Reprodutor Musical 🎵
- Aparelho Telefônico 📞
- Navegador na Internet 🌐

## Diagrama UML

Feito com Mermaid (visualize em https://mermaid.live):

classDiagram
    %% Interfaces
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    %% Classe IPhone que implementa todas as interfaces
    class IPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    %% Relacionamentos de implementação
    IPhone ..|> ReprodutorMusical
    IPhone ..|> AparelhoTelefonico
    IPhone ..|> NavegadorInternet

## Como executar

Compile os arquivos `.java` com:

```bash
javac *.java 
depois execute o arquivo Main.java para executar os teste utilizando o comando 
java main no terminal 
