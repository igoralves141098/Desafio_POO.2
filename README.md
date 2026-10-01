Desafio de POO em Java — Herança, Composição e Exceções Customizadas

Repositório com a resolução de 11 exercícios práticos de Programação Orientada a Objetos em Java, cada um simulando um domínio de negócio diferente (saúde animal, RH, pagamentos, logística, banking, segurança, fiscal, cloud, controle de acesso, frotas e imobiliário).

O foco do desafio não é apenas fazer o código funcionar, mas aplicar corretamente os pilares de herança, composição, encapsulamento e tratamento de exceções, seguindo um padrão arquitetural consistente em todas as questões.

🎯 Diretrizes técnicas aplicadas
Modularização em pacotes: cada questão possui seu próprio pacote (questao01 a questao11), contendo suas classes, a classe Main e as exceções correspondentes.
Exceções customizadas: todas herdam de Exception (checked exceptions), armazenam os dados do erro em atributos private final, repassam a mensagem via super(mensagem) no construtor e expõem os dados através de getters — nunca apenas uma string solta.
Tratamento de exceções: construtores e métodos que lançam erros assinam throws em sua assinatura; na Main, os blocos try/catch imprimem tanto e.getMessage() quanto os dados específicos obtidos pelos getters da exceção.
Encapsulamento: private para atributos exclusivos, protected para atributos compartilhados na hierarquia de herança, public para os métodos de acesso.
Reuso com super: os construtores das subclasses repassam os dados pertencentes à superclasse em vez de duplicá-los.
🗂️ Estrutura do repositório
src/
├── questao01/   Prontuário Veterinário        (Herança direta + Composição)
├── questao02/   RH Corporativo                (Herança direta + Composição)
├── questao03/   Gateway de Pagamentos         (Composição na Superclasse)
├── questao04/   Logística e Almoxarifado      (Reuso concreto sem composição)
├── questao05/   Core Banking                  (Superclasse abstrata sem métodos abstratos)
├── questao06/   Terminal Transacional POS     (Classe final)
├── questao07/   Sistema ERP Fiscal            (Cadeia de 3 níveis: avó → filha → neta)
├── questao08/   Orquestração de Nuvem         (Classe abstrata + Composição)
├── questao09/   Gestão de Acessos Corporativos(Proteção de estado na superclasse)
├── questao10/   Telemetria e Frotas de Carga  (Reuso concreto e auditoria)
└── questao11/   Setor Imobiliário             (Cadeia de 3 níveis com subclasse final)

Cada pacote contém, no mínimo:

A(s) classe(s) de domínio (superclasse, subclasse e, quando aplicável, a classe de composição);
A exceção customizada correspondente;
Uma classe Main com cenários de teste: um fluxo válido e um fluxo que dispara a exceção.
📋 Resumo das questões
#	Tema	Conceito principal
01	Prontuário Veterinário	Herança + Composição
02	RH Corporativo	Herança + Composição
03	Gateway de Pagamentos	Composição na superclasse
04	Logística / Almoxarifado	Reuso de método concreto herdado
05	Core Banking	Classe abstrata sem métodos abstratos
06	Terminal POS	Classe final
07	ERP Fiscal	Herança em cadeia (3 níveis)
08	Orquestração de Nuvem	Classe abstrata + Composição
09	Gestão de Acessos	Estado protegido na superclasse
10	Frotas de Carga	Reuso concreto e auditoria via exceção
11	Setor Imobiliário	Herança em cadeia (3 níveis) + subclasse final
▶️ Como compilar e executar

Pré-requisito: JDK 17+ instalado.

bash
# Compilar todos os pacotes
javac -d out $(find src -name "*.java")

# Executar a Main de uma questão específica (exemplo: questão 01)
java -cp out questao01.Main

Repita o segundo comando trocando questao01 pelo pacote desejado (questao02, questao03, ..., questao11).

🧠 Principal aprendizado

Antes de implementar qualquer classe, a pergunta orientadora foi sempre: "de quem é essa responsabilidade?" — isso definiu onde cada atributo deveria ser declarado (private vs protected), em qual construtor a validação de regra de negócio deveria ocorrer, e quando um método deveria apenas ser herdado em vez de reescrito.

Desenvolvido como parte de uma atividade de Programação Orientada a Objetos (POO).
