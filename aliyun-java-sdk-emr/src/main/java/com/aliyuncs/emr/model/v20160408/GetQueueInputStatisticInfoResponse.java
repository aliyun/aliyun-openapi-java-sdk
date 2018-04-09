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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.GetQueueInputStatisticInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQueueInputStatisticInfoResponse extends AcsResponse {

	private String requestId;

	private List<ClusterStatQueueInput> queueInputList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClusterStatQueueInput> getQueueInputList() {
		return this.queueInputList;
	}

	public void setQueueInputList(List<ClusterStatQueueInput> queueInputList) {
		this.queueInputList = queueInputList;
	}

	public static class ClusterStatQueueInput {

		private String queue;

		private Long bytesInput;

		public String getQueue() {
			return this.queue;
		}

		public void setQueue(String queue) {
			this.queue = queue;
		}

		public Long getBytesInput() {
			return this.bytesInput;
		}

		public void setBytesInput(Long bytesInput) {
			this.bytesInput = bytesInput;
		}
	}

	@Override
	public GetQueueInputStatisticInfoResponse getInstance(UnmarshallerContext context) {
		return	GetQueueInputStatisticInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
