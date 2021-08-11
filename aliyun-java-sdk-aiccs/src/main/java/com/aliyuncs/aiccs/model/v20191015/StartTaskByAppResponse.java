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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.StartTaskByAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartTaskByAppResponse extends AcsResponse {

	private String status;

	private String message;

	private String buildId;

	private Long passNumber;

	private Long totalNumber;

	private String url;

	private Boolean success;

	private Long testSetRecordId;

	private String requestId;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getBuildId() {
		return this.buildId;
	}

	public void setBuildId(String buildId) {
		this.buildId = buildId;
	}

	public Long getPassNumber() {
		return this.passNumber;
	}

	public void setPassNumber(Long passNumber) {
		this.passNumber = passNumber;
	}

	public Long getTotalNumber() {
		return this.totalNumber;
	}

	public void setTotalNumber(Long totalNumber) {
		this.totalNumber = totalNumber;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTestSetRecordId() {
		return this.testSetRecordId;
	}

	public void setTestSetRecordId(Long testSetRecordId) {
		this.testSetRecordId = testSetRecordId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public StartTaskByAppResponse getInstance(UnmarshallerContext context) {
		return	StartTaskByAppResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
