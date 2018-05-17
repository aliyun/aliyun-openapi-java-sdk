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

package com.aliyuncs.pvtz.model.v20180101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.pvtz.transform.v20180101.CheckZoneNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckZoneNameResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Boolean check;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Boolean getCheck() {
		return this.check;
	}

	public void setCheck(Boolean check) {
		this.check = check;
	}

	@Override
	public CheckZoneNameResponse getInstance(UnmarshallerContext context) {
		return	CheckZoneNameResponseUnmarshaller.unmarshall(this, context);
	}
}
