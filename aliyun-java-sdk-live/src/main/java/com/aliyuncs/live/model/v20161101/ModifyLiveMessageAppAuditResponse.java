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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ModifyLiveMessageAppAuditResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyLiveMessageAppAuditResponse extends AcsResponse {

	private String requestId;

	private String appId;

	private String appSign;

	private Integer auditType;

	private String auditUrl;

	private Boolean auditNeedAuthentication;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppSign() {
		return this.appSign;
	}

	public void setAppSign(String appSign) {
		this.appSign = appSign;
	}

	public Integer getAuditType() {
		return this.auditType;
	}

	public void setAuditType(Integer auditType) {
		this.auditType = auditType;
	}

	public String getAuditUrl() {
		return this.auditUrl;
	}

	public void setAuditUrl(String auditUrl) {
		this.auditUrl = auditUrl;
	}

	public Boolean getAuditNeedAuthentication() {
		return this.auditNeedAuthentication;
	}

	public void setAuditNeedAuthentication(Boolean auditNeedAuthentication) {
		this.auditNeedAuthentication = auditNeedAuthentication;
	}

	@Override
	public ModifyLiveMessageAppAuditResponse getInstance(UnmarshallerContext context) {
		return	ModifyLiveMessageAppAuditResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
