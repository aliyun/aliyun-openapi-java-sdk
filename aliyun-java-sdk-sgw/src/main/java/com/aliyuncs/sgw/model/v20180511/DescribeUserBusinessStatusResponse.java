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
import com.aliyuncs.sgw.transform.v20180511.DescribeUserBusinessStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserBusinessStatusResponse extends AcsResponse {

	private Boolean isIndebtedOverdue;

	private Boolean isRiskControl;

	private String requestId;

	private String message;

	private Boolean isIndebted;

	private Boolean isEnabled;

	private String code;

	private Boolean success;

	public Boolean getIsIndebtedOverdue() {
		return this.isIndebtedOverdue;
	}

	public void setIsIndebtedOverdue(Boolean isIndebtedOverdue) {
		this.isIndebtedOverdue = isIndebtedOverdue;
	}

	public Boolean getIsRiskControl() {
		return this.isRiskControl;
	}

	public void setIsRiskControl(Boolean isRiskControl) {
		this.isRiskControl = isRiskControl;
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

	public Boolean getIsIndebted() {
		return this.isIndebted;
	}

	public void setIsIndebted(Boolean isIndebted) {
		this.isIndebted = isIndebted;
	}

	public Boolean getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
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
	public DescribeUserBusinessStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserBusinessStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
