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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.foas.transform.v20181111.GetInstanceCheckpointResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceCheckpointResponse extends AcsResponse {

	private String requestId;

	private String checkpoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCheckpoints() {
		return this.checkpoints;
	}

	public void setCheckpoints(String checkpoints) {
		this.checkpoints = checkpoints;
	}

	@Override
	public GetInstanceCheckpointResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceCheckpointResponseUnmarshaller.unmarshall(this, context);
	}
}
