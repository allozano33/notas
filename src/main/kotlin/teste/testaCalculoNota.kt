fun testaCalculoNota() {
    val calculoNota = CalculoNota(
        6.0,
        6.0,
        0.0
    )

    fun soma(atividade: Int, avaliacao: Int): Int {
        return atividade + avaliacao;
    }

    calculoNota.atividade = (10 * 0.4)
    println("Nota das Atividades ${calculoNota.atividade}")
    calculoNota.avaliacao = (2 * 0.6)

    calculoNota.resultado = (calculoNota.atividade + calculoNota.avaliacao)

    println("Sua Nota é ${calculoNota.resultado}")
    if (calculoNota.resultado >= 5)
        println("Aprovado")
    else
        println("Reprovado")
}
