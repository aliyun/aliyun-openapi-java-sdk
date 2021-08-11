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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotcc.transform.v20210513.CreateConnectionPoolResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateConnectionPoolResponse extends AcsResponse {

	private String requestId;

	private String connectionPoolId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getConnectionPoolId() {
		return this.connectionPoolId;
	}

	public void setConnectionPoolId(String connectionPoolId) {
		this.connectionPoolId = connectionPoolId;
	}

	@Override
	public CreateConnectionPoolResponse getInstance(UnmarshallerContext context) {
		return	CreateConnectionPoolResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
