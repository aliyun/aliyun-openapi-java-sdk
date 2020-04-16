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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeUserBaselineAuthorizationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserBaselineAuthorizationResponse extends AcsResponse {

	private String requestId;

	private UserBaselineAuthorization userBaselineAuthorization;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UserBaselineAuthorization getUserBaselineAuthorization() {
		return this.userBaselineAuthorization;
	}

	public void setUserBaselineAuthorization(UserBaselineAuthorization userBaselineAuthorization) {
		this.userBaselineAuthorization = userBaselineAuthorization;
	}

	public static class UserBaselineAuthorization {

		private Integer status;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public DescribeUserBaselineAuthorizationResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserBaselineAuthorizationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
