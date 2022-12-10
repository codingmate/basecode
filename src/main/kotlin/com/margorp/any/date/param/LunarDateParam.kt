package com.margorp.any.date.param

import org.jetbrains.annotations.NotNull

data class LunarDateParam(val type: String = "lunar"
                          ,@field:NotNull("year is not null") val year: Int?
                          , @field:NotNull val month: Int?
                          , @NotNull val day: Int?)