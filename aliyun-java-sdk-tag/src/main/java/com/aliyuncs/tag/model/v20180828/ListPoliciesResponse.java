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

package com.aliyuncs.tag.model.v20180828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.tag.transform.v20180828.ListPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPoliciesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<Policy> policyList;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Policy> getPolicyList() {
		return this.policyList;
	}

	public void setPolicyList(List<Policy> policyList) {
		this.policyList = policyList;
	}

	public static class Policy {

		private String policyContent;

		private String policyDesc;

		private String policyId;

		private String policyName;

		private String userType;

		public String getPolicyContent() {
			return this.policyContent;
		}

		public void setPolicyContent(String policyContent) {
			this.policyContent = policyContent;
		}

		public String getPolicyDesc() {
			return this.policyDesc;
		}

		public void setPolicyDesc(String policyDesc) {
			this.policyDesc = policyDesc;
		}

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getPolicyName() {
			return this.policyName;
		}

		public void setPolicyName(String policyName) {
			this.policyName = policyName;
		}

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}
	}

	@Override
	public ListPoliciesResponse getInstance(UnmarshallerContext context) {
		return	ListPoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
