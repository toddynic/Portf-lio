# Função para classificar o triângulo
def classificar_triangulo(lado1, lado2, lado3):
    # Verifica se os lados formam um triângulo válido
    if lado1 <= 0 or lado2 <= 0 or lado3 <= 0:
        return "Os lados devem ser positivos!"
    
    if lado1 + lado2 > lado3 and lado1 + lado3 > lado2 and lado2 + lado3 > lado1:
        # Classificando os tipos de triângulos
        if lado1 == lado2 == lado3:
            return "O triângulo é Equilátero."
        elif lado1 == lado2 or lado1 == lado3 or lado2 == lado3:
            return "O triângulo é Isósceles."
        else:
            return "O triângulo é Escaleno."
    else:
        return "Não é possível formar um triângulo com esses lados."

# Solicitando os lados ao usuário
lado1 = float(input("Digite o comprimento do primeiro lado: "))
lado2 = float(input("Digite o comprimento do segundo lado: "))
lado3 = float(input("Digite o comprimento do terceiro lado: "))

# Exibindo o resultado
resultado = classificar_triangulo(lado1, lado2, lado3)
print(resultado)