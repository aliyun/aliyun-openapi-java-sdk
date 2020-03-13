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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.DescribeDSTSlsConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDSTSlsConfigResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String accessKey;

	private String accessKeyId;

	private String createTime;

	private String openStatus;

	private Boolean supportBizLog;

	private String tenantId;

	private String tokenRedirectUrl;

	private Boolean tokenValid;

	private String type;

	private String updateTime;

	private Boolean valid;

	private String slsMachineGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getAccessKeyId() {
		return this.accessKeyId;
	}

	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getOpenStatus() {
		return this.openStatus;
	}

	public void setOpenStatus(String openStatus) {
		this.openStatus = openStatus;
	}

	public Boolean getSupportBizLog() {
		return this.supportBizLog;
	}

	public void setSupportBizLog(Boolean supportBizLog) {
		this.supportBizLog = supportBizLog;
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTokenRedirectUrl() {
		return this.tokenRedirectUrl;
	}

	public void setTokenRedirectUrl(String tokenRedirectUrl) {
		this.tokenRedirectUrl = tokenRedirectUrl;
	}

	public Boolean getTokenValid() {
		return this.tokenValid;
	}

	public void setTokenValid(Boolean tokenValid) {
		this.tokenValid = tokenValid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Boolean getValid() {
		return this.valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public String getSlsMachineGroup() {
		return this.slsMachineGroup;
	}

	public void setSlsMachineGroup(String slsMachineGroup) {
		this.slsMachineGroup = slsMachineGroup;
	}

	@Override
	public DescribeDSTSlsConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeDSTSlsConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
