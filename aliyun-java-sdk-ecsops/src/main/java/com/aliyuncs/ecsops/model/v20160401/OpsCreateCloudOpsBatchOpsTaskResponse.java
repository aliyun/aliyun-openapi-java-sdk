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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsCreateCloudOpsBatchOpsTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsCreateCloudOpsBatchOpsTaskResponse extends AcsResponse {

	private String requestId;

	private String bizMessage;

	private String bizCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizMessage() {
		return this.bizMessage;
	}

	public void setBizMessage(String bizMessage) {
		this.bizMessage = bizMessage;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long batchOpsTaskId;

		public Long getBatchOpsTaskId() {
			return this.batchOpsTaskId;
		}

		public void setBatchOpsTaskId(Long batchOpsTaskId) {
			this.batchOpsTaskId = batchOpsTaskId;
		}
	}

	@Override
	public OpsCreateCloudOpsBatchOpsTaskResponse getInstance(UnmarshallerContext context) {
		return	OpsCreateCloudOpsBatchOpsTaskResponseUnmarshaller.unmarshall(this, context);
	}
}