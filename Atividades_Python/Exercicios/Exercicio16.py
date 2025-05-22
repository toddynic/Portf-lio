# Solicita a idade do usuário
idade = int(input("Digite a sua idade: "))

# Classifica a idade
if idade >= 0 and idade <= 12:
    print("Você é uma Criança.")
elif idade >= 13 and idade <= 17:
    print("Você é um Adolescente.")
elif idade >= 18 and idade <= 29:
    print("Você é um Adulto Jovem.")
else:
    print("Você é um Adulto.")