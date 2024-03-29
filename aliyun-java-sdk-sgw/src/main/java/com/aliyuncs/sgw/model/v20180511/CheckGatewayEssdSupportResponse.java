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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.CheckGatewayEssdSupportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckGatewayEssdSupportResponse extends AcsResponse {

	private Boolean isSupportEssd;

	private String requestId;

	private String message;

	private Boolean isServiceAffect;

	private String code;

	private Boolean success;

	public Boolean getIsSupportEssd() {
		return this.isSupportEssd;
	}

	public void setIsSupportEssd(Boolean isSupportEssd) {
		this.isSupportEssd = isSupportEssd;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getIsServiceAffect() {
		return this.isServiceAffect;
	}

	public void setIsServiceAffect(Boolean isServiceAffect) {
		this.isServiceAffect = isServiceAffect;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	@Override
	public CheckGatewayEssdSupportResponse getInstance(UnmarshallerContext context) {
		return	CheckGatewayEssdSupportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
