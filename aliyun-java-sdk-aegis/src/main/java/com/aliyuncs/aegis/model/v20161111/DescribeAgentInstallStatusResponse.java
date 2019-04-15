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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeAgentInstallStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAgentInstallStatusResponse extends AcsResponse {

	private String requestId;

	private List<AegisClientInvokeStatusResponse> aegisClientInvokeStatusResponseList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AegisClientInvokeStatusResponse> getAegisClientInvokeStatusResponseList() {
		return this.aegisClientInvokeStatusResponseList;
	}

	public void setAegisClientInvokeStatusResponseList(List<AegisClientInvokeStatusResponse> aegisClientInvokeStatusResponseList) {
		this.aegisClientInvokeStatusResponseList = aegisClientInvokeStatusResponseList;
	}

	public static class AegisClientInvokeStatusResponse {

		private String uuid;

		private String message;

		private Integer result;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Integer getResult() {
			return this.result;
		}

		public void setResult(Integer result) {
			this.result = result;
		}
	}

	@Override
	public DescribeAgentInstallStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeAgentInstallStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
