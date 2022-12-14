package com.example.recyclerview

import com.example.recyclerview.models.Profile

class DataSource {
    companion object {
        fun createDataSet(): ArrayList<Profile> {
            val list = ArrayList<Profile>()

            list.add(
                Profile(
                    "Teste1",
                    "Teste1",
                    R.drawable.teste,
                    "https://www.tecmundo.com.br/internet/247418-flork-meme-que-ele-parar-bolos.htm"
                )
            )
            list.add(
                Profile(
                    "Teste2",
                    "Teste2",
                    R.drawable.teste1,
                    "https://www.google.com.br/"
                )
            )
            list.add(
                Profile(
                    "Teste3",
                    "Teste3",
                    R.drawable.teste2,
                    "https://www.youtube.com/"
                )
            )
            list.add(
                Profile(
                    "Teste4",
                    "Teste4",
                    R.drawable.teste3,
                    "https://g1.globo.com/"
                )
            )
            return list
        }
    }

}