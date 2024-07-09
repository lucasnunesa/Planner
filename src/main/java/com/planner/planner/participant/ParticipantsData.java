package com.planner.planner.participant;

import java.util.UUID;

public record ParticipantsData(UUID id, String name, Boolean isConfirmed) {
}
