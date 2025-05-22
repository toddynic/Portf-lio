#Cálculo de Desconto

#Pede o preço e o percentual de desconto e calcular o valor com o desconto e quanto foi descontado

valor=float(input("Fale o valor: R$"))
porcen=float(input("Fale a porcentagem do desconto(Ex:20.50):"))/100

print(f"\nValor com o desconto:R${(valor-(valor*porcen)):.2f}")
print(f"Quanto foi descontado:R${(valor*porcen):.2f}")