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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.UpdateHealthCheckUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateHealthCheckUrlResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private String healthCheckURL;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHealthCheckURL() {
		return this.healthCheckURL;
	}

	public void setHealthCheckURL(String healthCheckURL) {
		this.healthCheckURL = healthCheckURL;
	}

	@Override
	public UpdateHealthCheckUrlResponse getInstance(UnmarshallerContext context) {
		return	UpdateHealthCheckUrlResponseUnmarshaller.unmarshall(this, context);
	}
}
