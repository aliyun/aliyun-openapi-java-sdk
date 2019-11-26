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

package com.aliyuncs.dyvms.model.v20170620;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyvms.transform.v20170620.UpdateCallInNumberConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateCallInNumberConfigResponse extends AcsResponse {

	private String requestId;

	private String code;

	private Long data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getData() {
		return this.data;
	}

	public void setData(Long data) {
		this.data = data;
	}

	@Override
	public UpdateCallInNumberConfigResponse getInstance(UnmarshallerContext context) {
		return	UpdateCallInNumberConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
