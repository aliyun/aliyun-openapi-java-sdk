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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.CreateDataFlowSubTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateDataFlowSubTaskResponse extends AcsResponse {

	private String requestId;

	private String dataFlowSubTaskId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDataFlowSubTaskId() {
		return this.dataFlowSubTaskId;
	}

	public void setDataFlowSubTaskId(String dataFlowSubTaskId) {
		this.dataFlowSubTaskId = dataFlowSubTaskId;
	}

	@Override
	public CreateDataFlowSubTaskResponse getInstance(UnmarshallerContext context) {
		return	CreateDataFlowSubTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
