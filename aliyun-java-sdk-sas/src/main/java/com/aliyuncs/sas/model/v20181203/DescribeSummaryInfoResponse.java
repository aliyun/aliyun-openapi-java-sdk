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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeSummaryInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSummaryInfoResponse extends AcsResponse {

	private String requestId;

	private Integer aegisClientOfflineCount;

	private Integer securityScore;

	private Integer aegisClientOnlineCount;

	private Boolean success;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getAegisClientOfflineCount() {
		return this.aegisClientOfflineCount;
	}

	public void setAegisClientOfflineCount(Integer aegisClientOfflineCount) {
		this.aegisClientOfflineCount = aegisClientOfflineCount;
	}

	public Integer getSecurityScore() {
		return this.securityScore;
	}

	public void setSecurityScore(Integer securityScore) {
		this.securityScore = securityScore;
	}

	public Integer getAegisClientOnlineCount() {
		return this.aegisClientOnlineCount;
	}

	public void setAegisClientOnlineCount(Integer aegisClientOnlineCount) {
		this.aegisClientOnlineCount = aegisClientOnlineCount;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	@Override
	public DescribeSummaryInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeSummaryInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
