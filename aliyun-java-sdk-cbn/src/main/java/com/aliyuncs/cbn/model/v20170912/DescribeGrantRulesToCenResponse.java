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

	private Long totalCount;

	private Long maxResults;

	private String nextToken;

	private List<GrantRule> grantRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<GrantRule> getGrantRules() {
		return this.grantRules;
	}

	public void setGrantRules(List<GrantRule> grantRules) {
		this.grantRules = grantRules;
	}

	public static class GrantRule {

		private String childInstanceType;

		private String childInstanceRegionId;

		private Long childInstanceOwnerId;

		private String childInstanceId;

		private String cenId;

		private String orderType;

		private Long cenOwnerId;

		private Long createTime;

		public String getChildInstanceType() {
			return this.childInstanceType;
		}

		public void setChildInstanceType(String childInstanceType) {
			this.childInstanceType = childInstanceType;
		}

		public String getChildInstanceRegionId() {
			return this.childInstanceRegionId;
		}

		public void setChildInstanceRegionId(String childInstanceRegionId) {
			this.childInstanceRegionId = childInstanceRegionId;
		}

		public Long getChildInstanceOwnerId() {
			return this.childInstanceOwnerId;
		}

		public void setChildInstanceOwnerId(Long childInstanceOwnerId) {
			this.childInstanceOwnerId = childInstanceOwnerId;
		}

		public String getChildInstanceId() {
			return this.childInstanceId;
		}

		public void setChildInstanceId(String childInstanceId) {
			this.childInstanceId = childInstanceId;
		}

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public Long getCenOwnerId() {
			return this.cenOwnerId;
		}

		public void setCenOwnerId(Long cenOwnerId) {
			this.cenOwnerId = cenOwnerId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public DescribeGrantRulesToCenResponse getInstance(UnmarshallerContext context) {
		return	DescribeGrantRulesToCenResponseUnmarshaller.unmarshall(this, context);
	}
}
