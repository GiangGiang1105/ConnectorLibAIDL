package com.example.connectorlibrary.enitity

@Suppress("UNUSED")
@Retention(AnnotationRetention.SOURCE)
annotation class ResponseCode {

    companion object {
        const val OK = 0
        const val ERROR_SIGN_UP = -1
        const val ERROR_SIGN_IN = -2
        const val ERROR_GET_USER = -3
        const val ERROR_UPDATE_USER = -4
        const val ERROR_GET_LIST_USERS = -5
        const val ERROR_INSERT_HEALTH = -6
        const val ERROR_HEALTHS = -7
        const val ERROR_GET_SYMPTOMS = -8
        const val ERROR_GET_STATISTIC_COVID = -9
        const val ERROR_GET_STATICS = -10
    }
}