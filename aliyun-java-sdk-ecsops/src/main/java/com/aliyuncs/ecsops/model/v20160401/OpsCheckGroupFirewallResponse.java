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
import com.aliyuncs.ecsops.transform.v20160401.OpsCheckGroupFirewallResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsCheckGroupFirewallResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean consistent;

		private String failCode;

		private String failMessage;

		private String comment;

		public Boolean getConsistent() {
			return this.consistent;
		}

		public void setConsistent(Boolean consistent) {
			this.consistent = consistent;
		}

		public String getFailCode() {
			return this.failCode;
		}

		public void setFailCode(String failCode) {
			this.failCode = failCode;
		}

		public String getFailMessage() {
			return this.failMessage;
		}

		public void setFailMessage(String failMessage) {
			this.failMessage = failMessage;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}
	}

	@Override
	public OpsCheckGroupFirewallResponse getInstance(UnmarshallerContext context) {
		return	OpsCheckGroupFirewallResponseUnmarshaller.unmarshall(this, context);
	}
}
