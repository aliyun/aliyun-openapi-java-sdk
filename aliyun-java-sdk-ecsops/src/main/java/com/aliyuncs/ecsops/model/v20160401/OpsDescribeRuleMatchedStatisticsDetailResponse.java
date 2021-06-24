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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeRuleMatchedStatisticsDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeRuleMatchedStatisticsDetailResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer page;

	private Integer count;

	private List<RuleMatchedStatisticsDetail> ruleMatchedStatisticsDetails;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<RuleMatchedStatisticsDetail> getRuleMatchedStatisticsDetails() {
		return this.ruleMatchedStatisticsDetails;
	}

	public void setRuleMatchedStatisticsDetails(List<RuleMatchedStatisticsDetail> ruleMatchedStatisticsDetails) {
		this.ruleMatchedStatisticsDetails = ruleMatchedStatisticsDetails;
	}

	public static class RuleMatchedStatisticsDetail {

		private String eventId;

		private String firstMatchedDate;

		private String dimensions;

		private String lastMatchedDate;

		private Integer matchedTimes;

		private String targetId;

		private String regionId;

		private String features;

		private String targetType;

		private String ruleName;

		private String shortDesc;

		private String reason;

		private String actions;

		public String getEventId() {
			return this.eventId;
		}

		public void setEventId(String eventId) {
			this.eventId = eventId;
		}

		public String getFirstMatchedDate() {
			return this.firstMatchedDate;
		}

		public void setFirstMatchedDate(String firstMatchedDate) {
			this.firstMatchedDate = firstMatchedDate;
		}

		public String getDimensions() {
			return this.dimensions;
		}

		public void setDimensions(String dimensions) {
			this.dimensions = dimensions;
		}

		public String getLastMatchedDate() {
			return this.lastMatchedDate;
		}

		public void setLastMatchedDate(String lastMatchedDate) {
			this.lastMatchedDate = lastMatchedDate;
		}

		public Integer getMatchedTimes() {
			return this.matchedTimes;
		}

		public void setMatchedTimes(Integer matchedTimes) {
			this.matchedTimes = matchedTimes;
		}

		public String getTargetId() {
			return this.targetId;
		}

		public void setTargetId(String targetId) {
			this.targetId = targetId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getFeatures() {
			return this.features;
		}

		public void setFeatures(String features) {
			this.features = features;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getShortDesc() {
			return this.shortDesc;
		}

		public void setShortDesc(String shortDesc) {
			this.shortDesc = shortDesc;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getActions() {
			return this.actions;
		}

		public void setActions(String actions) {
			this.actions = actions;
		}
	}

	@Override
	public OpsDescribeRuleMatchedStatisticsDetailResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeRuleMatchedStatisticsDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
