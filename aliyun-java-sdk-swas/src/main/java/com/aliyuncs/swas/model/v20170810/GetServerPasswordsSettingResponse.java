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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas.transform.v20170810.GetServerPasswordsSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServerPasswordsSettingResponse extends AcsResponse {

	private Boolean isSuccess;

	private Boolean vncPasswordSetting;

	private String requestId;

	private Boolean passwordSetting;

	private String code;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Boolean getVncPasswordSetting() {
		return this.vncPasswordSetting;
	}

	public void setVncPasswordSetting(Boolean vncPasswordSetting) {
		this.vncPasswordSetting = vncPasswordSetting;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getPasswordSetting() {
		return this.passwordSetting;
	}

	public void setPasswordSetting(Boolean passwordSetting) {
		this.passwordSetting = passwordSetting;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public GetServerPasswordsSettingResponse getInstance(UnmarshallerContext context) {
		return	GetServerPasswordsSettingResponseUnmarshaller.unmarshall(this, context);
	}
}
