package com.iniongungroup.mobile.droid.tivhymns.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

/**
 * Created by Isaac Iniongun on 03/07/2020.
 * For Atsam a Ikyenge project.
 */

@Entity
class Theme(@PrimaryKey val id: String = UUID.randomUUID().toString(), val name: String)