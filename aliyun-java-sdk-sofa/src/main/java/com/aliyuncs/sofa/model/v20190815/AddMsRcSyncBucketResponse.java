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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.AddMsRcSyncBucketResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddMsRcSyncBucketResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String clusterTaskId;

		private String clusterTaskStatus;

		private String sourceClusterId;

		private String targetClusterId;

		public String getClusterTaskId() {
			return this.clusterTaskId;
		}

		public void setClusterTaskId(String clusterTaskId) {
			this.clusterTaskId = clusterTaskId;
		}

		public String getClusterTaskStatus() {
			return this.clusterTaskStatus;
		}

		public void setClusterTaskStatus(String clusterTaskStatus) {
			this.clusterTaskStatus = clusterTaskStatus;
		}

		public String getSourceClusterId() {
			return this.sourceClusterId;
		}

		public void setSourceClusterId(String sourceClusterId) {
			this.sourceClusterId = sourceClusterId;
		}

		public String getTargetClusterId() {
			return this.targetClusterId;
		}

		public void setTargetClusterId(String targetClusterId) {
			this.targetClusterId = targetClusterId;
		}
	}

	@Override
	public AddMsRcSyncBucketResponse getInstance(UnmarshallerContext context) {
		return	AddMsRcSyncBucketResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
