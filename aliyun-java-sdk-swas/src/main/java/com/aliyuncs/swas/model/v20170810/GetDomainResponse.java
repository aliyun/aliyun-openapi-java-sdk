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
import com.aliyuncs.swas.transform.v20170810.GetDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDomainResponse extends AcsResponse {

	private Boolean httpsOn;

	private Boolean isSuccess;

	private String requestId;

	private Boolean httpsSettingOn;

	private String certId;

	private String domain;

	private String code;

	public Boolean getHttpsOn() {
		return this.httpsOn;
	}

	public void setHttpsOn(Boolean httpsOn) {
		this.httpsOn = httpsOn;
	}

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getHttpsSettingOn() {
		return this.httpsSettingOn;
	}

	public void setHttpsSettingOn(Boolean httpsSettingOn) {
		this.httpsSettingOn = httpsSettingOn;
	}

	public String getCertId() {
		return this.certId;
	}

	public void setCertId(String certId) {
		this.certId = certId;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public GetDomainResponse getInstance(UnmarshallerContext context) {
		return	GetDomainResponseUnmarshaller.unmarshall(this, context);
	}
}
