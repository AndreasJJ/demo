package com.andreasjj.entity

import javax.persistence.Entity
import javax.persistence.Column

import java.time.Instant

import io.micronaut.data.annotation.DateCreated
import io.micronaut.data.annotation.DateUpdated
import io.micronaut.data.annotation.EmbeddedId

@Entity
data class Round(
    @EmbeddedId
    var roundId: RoundId,
    @DateCreated
    @Column(name = "created_timestamp")
    var createdTimestamp: Instant,
    @DateUpdated
    @Column(name="update_timestamp")
    var updateTimestamp: Instant,
)