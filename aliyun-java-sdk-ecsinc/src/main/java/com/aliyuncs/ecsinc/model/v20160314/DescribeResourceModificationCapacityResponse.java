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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.DescribeResourceModificationCapacityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceModificationCapacityResponse extends AcsResponse {

	private String requestId;

	private Long availableCount;

	private List<FailedInstanceResponse> failedInstanceResults;

	private List<String> passedInstanceIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getAvailableCount() {
		return this.availableCount;
	}

	public void setAvailableCount(Long availableCount) {
		this.availableCount = availableCount;
	}

	public List<FailedInstanceResponse> getFailedInstanceResults() {
		return this.failedInstanceResults;
	}

	public void setFailedInstanceResults(List<FailedInstanceResponse> failedInstanceResults) {
		this.failedInstanceResults = failedInstanceResults;
	}

	public List<String> getPassedInstanceIds() {
		return this.passedInstanceIds;
	}

	public void setPassedInstanceIds(List<String> passedInstanceIds) {
		this.passedInstanceIds = passedInstanceIds;
	}

	public static class FailedInstanceResponse {

		private String failedInstanceId;

		private String code;

		private String message;

		public String getFailedInstanceId() {
			return this.failedInstanceId;
		}

		public void setFailedInstanceId(String failedInstanceId) {
			this.failedInstanceId = failedInstanceId;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public DescribeResourceModificationCapacityResponse getInstance(UnmarshallerContext context) {
		return	DescribeResourceModificationCapacityResponseUnmarshaller.unmarshall(this, context);
	}
}
