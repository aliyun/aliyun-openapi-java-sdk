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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListScalingActivityV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListScalingActivityV2Response extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private String nextToken;

	private List<Item> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String bizId;

		private Long startTime;

		private Long endTime;

		private Integer expectNum;

		private String instanceIds;

		private Integer totalCapacity;

		private String cause;

		private String description;

		private String transition;

		private String status;

		private String scalingRuleId;

		private String scalingRuleName;

		private String hostGroupBizId;

		private String hostGroupName;

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Integer getExpectNum() {
			return this.expectNum;
		}

		public void setExpectNum(Integer expectNum) {
			this.expectNum = expectNum;
		}

		public String getInstanceIds() {
			return this.instanceIds;
		}

		public void setInstanceIds(String instanceIds) {
			this.instanceIds = instanceIds;
		}

		public Integer getTotalCapacity() {
			return this.totalCapacity;
		}

		public void setTotalCapacity(Integer totalCapacity) {
			this.totalCapacity = totalCapacity;
		}

		public String getCause() {
			return this.cause;
		}

		public void setCause(String cause) {
			this.cause = cause;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTransition() {
			return this.transition;
		}

		public void setTransition(String transition) {
			this.transition = transition;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getScalingRuleId() {
			return this.scalingRuleId;
		}

		public void setScalingRuleId(String scalingRuleId) {
			this.scalingRuleId = scalingRuleId;
		}

		public String getScalingRuleName() {
			return this.scalingRuleName;
		}

		public void setScalingRuleName(String scalingRuleName) {
			this.scalingRuleName = scalingRuleName;
		}

		public String getHostGroupBizId() {
			return this.hostGroupBizId;
		}

		public void setHostGroupBizId(String hostGroupBizId) {
			this.hostGroupBizId = hostGroupBizId;
		}

		public String getHostGroupName() {
			return this.hostGroupName;
		}

		public void setHostGroupName(String hostGroupName) {
			this.hostGroupName = hostGroupName;
		}
	}

	@Override
	public ListScalingActivityV2Response getInstance(UnmarshallerContext context) {
		return	ListScalingActivityV2ResponseUnmarshaller.unmarshall(this, context);
	}
}
