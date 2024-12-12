package com.promptoven.commissionservice.vo.out;

import com.promptoven.commissionservice.domain.CommissionStatus;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommissionListResponseVo {

    private String commissionUuid;
    private String title;
    private String clientUuid;
    private Long price;
    private LocalDate deadline;
    private CommissionStatus status;
    private LocalDateTime requestedDate;
}