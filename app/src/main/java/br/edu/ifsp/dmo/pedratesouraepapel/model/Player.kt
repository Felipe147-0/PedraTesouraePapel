package br.edu.ifsp.pedratesouraepapel.model
class Player(val name: String) {
    var points: Int = 0
        private set
    fun recordPoint(){
        points += 1
    }
}