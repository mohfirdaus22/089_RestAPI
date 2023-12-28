package com.example.pakeapi.ui.home.viewmodel

import com.example.consumerestapi.model.Kontak


data class InsertUiEvent(
    val id: Int = 0,
    val nama: String = "",
    val alamat: String = "",
    val nohp: String = ""
)

fun InsertUiEvent.toKontak() : Kontak = Kontak(
    id = id,
    nama = nama,
    alamat = alamat,
    noHp = nohp
)

data class InsertUiState(
    val insertUiEvent: InsertUiEvent = InsertUiEvent()
)

fun Kontak.toInsertUiEvent(): InsertUiEvent = InsertUiEvent(
    id = id,
    nama = nama,
    alamat = alamat,
    nohp = noHp
)
fun Kontak.toUiStateKontak(): InsertUiState = InsertUiState(
    insertUiEvent = toInsertUiEvent()
)