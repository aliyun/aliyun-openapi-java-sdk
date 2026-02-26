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

package com.aliyuncs.adcp.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adcp.transform.v20220101.DescribePoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePoliciesResponse extends AcsResponse {

	private String requestId;

	private List<Policy> policies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Policy> getPolicies() {
		return this.policies;
	}

	public void setPolicies(List<Policy> policies) {
		this.policies = policies;
	}

	public static class Policy {

		private String category;

		private List<String> names;

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public List<String> getNames() {
			return this.names;
		}

		public void setNames(List<String> names) {
			this.names = names;
		}
	}

	@Override
	public DescribePoliciesResponse getInstance(UnmarshallerContext context) {
		return	DescribePoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
