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

package com.aliyuncs.sgw.model.v20180511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.DescribeGatewayModificationClassesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatewayModificationClassesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<TargetGatewayClass> targetGatewayClasses;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public List<TargetGatewayClass> getTargetGatewayClasses() {
		return this.targetGatewayClasses;
	}

	public void setTargetGatewayClasses(List<TargetGatewayClass> targetGatewayClasses) {
		this.targetGatewayClasses = targetGatewayClasses;
	}

	public static class TargetGatewayClass {

		private String gatewayClass;

		private Boolean isAvailable;

		public String getGatewayClass() {
			return this.gatewayClass;
		}

		public void setGatewayClass(String gatewayClass) {
			this.gatewayClass = gatewayClass;
		}

		public Boolean getIsAvailable() {
			return this.isAvailable;
		}

		public void setIsAvailable(Boolean isAvailable) {
			this.isAvailable = isAvailable;
		}
	}

	@Override
	public DescribeGatewayModificationClassesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGatewayModificationClassesResponseUnmarshaller.unmarshall(this, context);
	}
}
