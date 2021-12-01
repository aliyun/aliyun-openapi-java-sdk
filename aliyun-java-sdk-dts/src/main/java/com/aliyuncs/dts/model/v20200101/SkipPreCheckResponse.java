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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dts.transform.v20200101.SkipPreCheckResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SkipPreCheckResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String errCode;

	private Boolean success;

	private String errMessage;

	private String skipNames;

	private String code;

	private String scheduleJobId;

	private String dynamicMessage;

	private String migrationJobId;

	private String skipItems;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public String getSkipNames() {
		return this.skipNames;
	}

	public void setSkipNames(String skipNames) {
		this.skipNames = skipNames;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getScheduleJobId() {
		return this.scheduleJobId;
	}

	public void setScheduleJobId(String scheduleJobId) {
		this.scheduleJobId = scheduleJobId;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getMigrationJobId() {
		return this.migrationJobId;
	}

	public void setMigrationJobId(String migrationJobId) {
		this.migrationJobId = migrationJobId;
	}

	public String getSkipItems() {
		return this.skipItems;
	}

	public void setSkipItems(String skipItems) {
		this.skipItems = skipItems;
	}

	@Override
	public SkipPreCheckResponse getInstance(UnmarshallerContext context) {
		return	SkipPreCheckResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
