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
                    R.drawable.flork1
                )
            )
            list.add(
                Profile(
                    "Teste2",
                    "Teste2",
                    R.drawable.flork2
                )
            )
            list.add(
                Profile(
                    "Teste3",
                    "Teste3",
                    R.drawable.flork3
                )
            )
            list.add(
                Profile(
                    "Teste4",
                    "Teste4",
                    R.drawable.flork4
                )
            )
            return list
        }
    }

}