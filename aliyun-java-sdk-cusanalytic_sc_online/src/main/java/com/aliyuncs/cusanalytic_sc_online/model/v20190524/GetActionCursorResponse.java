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

package com.aliyuncs.cusanalytic_sc_online.model.v20190524;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cusanalytic_sc_online.transform.v20190524.GetActionCursorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetActionCursorResponse extends AcsResponse {

	private String errorMsg;

	private Long timestamp;

	private Boolean success;

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	@Override
	public GetActionCursorResponse getInstance(UnmarshallerContext context) {
		return	GetActionCursorResponseUnmarshaller.unmarshall(this, context);
	}
}
