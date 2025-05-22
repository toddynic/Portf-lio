# Solicita ao usuário o valor do produto
valor_produto = float(input("Digite o valor do produto: R$ "))

# Verifica se o valor é maior que 100 para aplicar o desconto
if valor_produto > 100:
    desconto = valor_produto * 0.10  # Desconto de 10%
    valor_com_desconto = valor_produto - desconto
    print(f"O valor do produto com desconto de 10% é: R$ {valor_com_desconto:.2f}")
else:
    print(f"O valor do produto sem desconto é: R$ {valor_produto:.2f}")