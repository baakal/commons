package io.mosip.admin.usermgmt.service;

import io.mosip.admin.usermgmt.dto.RidVerificationRequestDto;
import io.mosip.admin.usermgmt.dto.UserRegistrationRequestDto;
import io.mosip.admin.usermgmt.dto.UserRegistrationResponseDto;

public interface UserRegistrationService {

	UserRegistrationResponseDto register(UserRegistrationRequestDto request);
	UserRegistrationResponseDto ridVerification(RidVerificationRequestDto request);
}
