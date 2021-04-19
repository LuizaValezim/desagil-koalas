# desagil-koalas

**Resposta parte 1:** Visto que na classe DataFrame existem várias responsabilidades diferentes atribuidas e, consequentemente, várias repetições de código desnecessárias, as quais tornam o código massante e muito longo (prejudicando o entendimento do mesmo), é possível realizar uma melhoria de coesão.
Uma forma para não evitar tais coisas podemos é de criar classes exclusivas para cada método ou para um conjunto de métodos, já que assim podemos chamar classes que dependem de outras (exemplo: avg depende da sum, evitando, assim, repetição). 
