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

package com.aliyuncs.ververica.model.v20200501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ververica.transform.v20200501.UpdateDeploymentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateDeploymentResponse extends AcsResponse {

	private String requestId;

	private Integer data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getData() {
		return this.data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	@Override
	public UpdateDeploymentResponse getInstance(UnmarshallerContext context) {
		return	UpdateDeploymentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
