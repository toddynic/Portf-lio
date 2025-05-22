#Cálculo de IMC

#Pede peso e a altura e calcula o IMC(Índice de Massa Corporal) e seu resultado

def calculadoramc(imc):
    if imc <= 18.5:
        return "Magreza"
    elif 18.5 < imc <= 24.9:
        return "Saudável"
    elif 25 <= imc <= 29.9:
        return "Sobrepeso"
    elif 30 <= imc <= 34.9:
        return "Obesidade severa grau 1"
    elif 35 <= imc <= 39.9:
        return "Obesidade severa grau 2"
    else:
        return "Obesidade mórbida grau 3"

peso = float(input("Coloque seu peso em kg(Ex: 75.5): "))

altura= float(input("Coloque sua altura em metros(Ex:1.70): "))

imc=peso/(altura*altura)

print(f"\nSeu IMC(Índice de Massa Corporal): {imc:.2f}")

print("Seu resultado no IMC: "+ calculadoramc(imc))