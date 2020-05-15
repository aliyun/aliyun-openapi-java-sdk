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

package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.kms.transform.v20160120.DeleteSecretResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteSecretResponse extends AcsResponse {

	private String requestId;

	private String secretName;

	private String plannedDeleteTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSecretName() {
		return this.secretName;
	}

	public void setSecretName(String secretName) {
		this.secretName = secretName;
	}

	public String getPlannedDeleteTime() {
		return this.plannedDeleteTime;
	}

	public void setPlannedDeleteTime(String plannedDeleteTime) {
		this.plannedDeleteTime = plannedDeleteTime;
	}

	@Override
	public DeleteSecretResponse getInstance(UnmarshallerContext context) {
		return	DeleteSecretResponseUnmarshaller.unmarshall(this, context);
	}
}
