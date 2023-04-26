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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeAccountLimitsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountLimitsResponse extends AcsResponse {

	private String requestId;

	private List<AccountLimit> accountLimitTypeSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AccountLimit> getAccountLimitTypeSet() {
		return this.accountLimitTypeSet;
	}

	public void setAccountLimitTypeSet(List<AccountLimit> accountLimitTypeSet) {
		this.accountLimitTypeSet = accountLimitTypeSet;
	}

	public static class AccountLimit {

		private String limitName;

		private List<String> limitValueSet;

		public String getLimitName() {
			return this.limitName;
		}

		public void setLimitName(String limitName) {
			this.limitName = limitName;
		}

		public List<String> getLimitValueSet() {
			return this.limitValueSet;
		}

		public void setLimitValueSet(List<String> limitValueSet) {
			this.limitValueSet = limitValueSet;
		}
	}

	@Override
	public DescribeAccountLimitsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountLimitsResponseUnmarshaller.unmarshall(this, context);
	}
}
