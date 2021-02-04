package com.example.coroutinesexample

import retrofit2.HttpException


interface Result<T> {
    fun onSuccess(t: T)
    fun onFailure(message: String)
    fun onException(e: HttpException)
}