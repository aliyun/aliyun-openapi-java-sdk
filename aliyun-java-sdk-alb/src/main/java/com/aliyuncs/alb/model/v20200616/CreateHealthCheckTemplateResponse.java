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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.alb.transform.v20200616.CreateHealthCheckTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateHealthCheckTemplateResponse extends AcsResponse {

	private String healthCheckTemplateId;

	private String requestId;

	public String getHealthCheckTemplateId() {
		return this.healthCheckTemplateId;
	}

	public void setHealthCheckTemplateId(String healthCheckTemplateId) {
		this.healthCheckTemplateId = healthCheckTemplateId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public CreateHealthCheckTemplateResponse getInstance(UnmarshallerContext context) {
		return	CreateHealthCheckTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
