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
import com.aliyuncs.emr.transform.v20160408.GetUserOutputStatisticInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserOutputStatisticInfoResponse extends AcsResponse {

	private String requestId;

	private List<ClusterStatUserOutput> userOutputList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ClusterStatUserOutput> getUserOutputList() {
		return this.userOutputList;
	}

	public void setUserOutputList(List<ClusterStatUserOutput> userOutputList) {
		this.userOutputList = userOutputList;
	}

	public static class ClusterStatUserOutput {

		private String user;

		private Long bytesOutput;

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public Long getBytesOutput() {
			return this.bytesOutput;
		}

		public void setBytesOutput(Long bytesOutput) {
			this.bytesOutput = bytesOutput;
		}
	}

	@Override
	public GetUserOutputStatisticInfoResponse getInstance(UnmarshallerContext context) {
		return	GetUserOutputStatisticInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
