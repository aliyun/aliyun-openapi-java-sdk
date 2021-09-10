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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20190307.CreateWhitelistSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateWhitelistSettingResponse extends AcsResponse {

	private String requestId;

	private Boolean resultObject;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getResultObject() {
		return this.resultObject;
	}

	public void setResultObject(Boolean resultObject) {
		this.resultObject = resultObject;
	}

	@Override
	public CreateWhitelistSettingResponse getInstance(UnmarshallerContext context) {
		return	CreateWhitelistSettingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
