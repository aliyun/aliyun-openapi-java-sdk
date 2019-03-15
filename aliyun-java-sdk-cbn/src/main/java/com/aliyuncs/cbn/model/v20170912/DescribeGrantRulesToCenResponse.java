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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.DescribeGrantRulesToCenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGrantRulesToCenResponse extends AcsResponse {

	private String requestId;

	private List<GrantRule> grantRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<GrantRule> getGrantRules() {
		return this.grantRules;
	}

	public void setGrantRules(List<GrantRule> grantRules) {
		this.grantRules = grantRules;
	}

	public static class GrantRule {

		private String cenId;

		private String childInstanceRegionId;

		private String childInstanceType;

		private String childInstanceId;

		private Long childInstanceOwnerId;

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public String getChildInstanceRegionId() {
			return this.childInstanceRegionId;
		}

		public void setChildInstanceRegionId(String childInstanceRegionId) {
			this.childInstanceRegionId = childInstanceRegionId;
		}

		public String getChildInstanceType() {
			return this.childInstanceType;
		}

		public void setChildInstanceType(String childInstanceType) {
			this.childInstanceType = childInstanceType;
		}

		public String getChildInstanceId() {
			return this.childInstanceId;
		}

		public void setChildInstanceId(String childInstanceId) {
			this.childInstanceId = childInstanceId;
		}

		public Long getChildInstanceOwnerId() {
			return this.childInstanceOwnerId;
		}

		public void setChildInstanceOwnerId(Long childInstanceOwnerId) {
			this.childInstanceOwnerId = childInstanceOwnerId;
		}
	}

	@Override
	public DescribeGrantRulesToCenResponse getInstance(UnmarshallerContext context) {
		return	DescribeGrantRulesToCenResponseUnmarshaller.unmarshall(this, context);
	}
}
