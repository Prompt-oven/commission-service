package com.promptoven.commissionservice.dto.in;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateCommissionRequestDto {

    private String commissionTitle;
    private String clientUuid;
    private String creatorUuid;
    private String commissionDescription;
    private Long commissionPrice;
    private LocalDate commissionDeadline;
    private String commissionModel;
    private String commissionRequest;
    private String commissionModifyRequest;
}
