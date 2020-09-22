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
import com.aliyuncs.emr.transform.v20160408.ListScalingGroupV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListScalingGroupV2Response extends AcsResponse {

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

		private String scalingGroupId;

		private String name;

		private String description;

		private String activeStatus;

		private String hostGroupBizId;

		private String scalingInMode;

		private Integer scalingMinSize;

		private Integer scalingMaxSize;

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getActiveStatus() {
			return this.activeStatus;
		}

		public void setActiveStatus(String activeStatus) {
			this.activeStatus = activeStatus;
		}

		public String getHostGroupBizId() {
			return this.hostGroupBizId;
		}

		public void setHostGroupBizId(String hostGroupBizId) {
			this.hostGroupBizId = hostGroupBizId;
		}

		public String getScalingInMode() {
			return this.scalingInMode;
		}

		public void setScalingInMode(String scalingInMode) {
			this.scalingInMode = scalingInMode;
		}

		public Integer getScalingMinSize() {
			return this.scalingMinSize;
		}

		public void setScalingMinSize(Integer scalingMinSize) {
			this.scalingMinSize = scalingMinSize;
		}

		public Integer getScalingMaxSize() {
			return this.scalingMaxSize;
		}

		public void setScalingMaxSize(Integer scalingMaxSize) {
			this.scalingMaxSize = scalingMaxSize;
		}
	}

	@Override
	public ListScalingGroupV2Response getInstance(UnmarshallerContext context) {
		return	ListScalingGroupV2ResponseUnmarshaller.unmarshall(this, context);
	}
}
