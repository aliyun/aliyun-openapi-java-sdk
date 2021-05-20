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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeCreatePrePaidInstanceResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCreatePrePaidInstanceResultResponse extends AcsResponse {

	private String requestId;

	private InstanceCreateResult instanceCreateResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public InstanceCreateResult getInstanceCreateResult() {
		return this.instanceCreateResult;
	}

	public void setInstanceCreateResult(InstanceCreateResult instanceCreateResult) {
		this.instanceCreateResult = instanceCreateResult;
	}

	public static class InstanceCreateResult {

		private String instanceCreateStatus;

		private String instanceId;

		public String getInstanceCreateStatus() {
			return this.instanceCreateStatus;
		}

		public void setInstanceCreateStatus(String instanceCreateStatus) {
			this.instanceCreateStatus = instanceCreateStatus;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}
	}

	@Override
	public DescribeCreatePrePaidInstanceResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeCreatePrePaidInstanceResultResponseUnmarshaller.unmarshall(this, context);
	}
}
