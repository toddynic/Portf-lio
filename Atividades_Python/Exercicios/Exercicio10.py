# Pergunta ao usuário para digitar um número
numeroReal = float(input("Digite um número: "))

# Verifica se o número é positivo, negativo ou zero
if numeroReal > 0:
    print("O número digitado é positivo.")
elif numeroReal < 0:
    print("O número digitado é negativo.")
else:
    print("O número digitado é zero.")