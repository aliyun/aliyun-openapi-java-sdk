/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateUserSettingRequest extends RpcAcsRequest<CreateUserSettingResponse> {
	
	public CreateUserSettingRequest() {
		super("aegis", "2016-11-11", "CreateUserSetting", "vipaegis");
	}

	private String sourceIp;

	private String alertLevels;

	private Integer invalidWarningKeepDays;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getAlertLevels() {
		return this.alertLevels;
	}

	public void setAlertLevels(String alertLevels) {
		this.alertLevels = alertLevels;
		if(alertLevels != null){
			putQueryParameter("AlertLevels", alertLevels);
		}
	}

	public Integer getInvalidWarningKeepDays() {
		return this.invalidWarningKeepDays;
	}

	public void setInvalidWarningKeepDays(Integer invalidWarningKeepDays) {
		this.invalidWarningKeepDays = invalidWarningKeepDays;
		if(invalidWarningKeepDays != null){
			putQueryParameter("InvalidWarningKeepDays", invalidWarningKeepDays.toString());
		}
	}

	@Override
	public Class<CreateUserSettingResponse> getResponseClass() {
		return CreateUserSettingResponse.class;
	}

}
