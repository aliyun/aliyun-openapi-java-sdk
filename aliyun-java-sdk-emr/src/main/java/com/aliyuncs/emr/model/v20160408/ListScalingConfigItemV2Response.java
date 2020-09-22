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
import com.aliyuncs.emr.transform.v20160408.ListScalingConfigItemV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListScalingConfigItemV2Response extends AcsResponse {

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

		private String configItemType;

		private String scalingGroupBizId;

		private String scalingConfigItemBizId;

		private String configItemInformation;

		public String getConfigItemType() {
			return this.configItemType;
		}

		public void setConfigItemType(String configItemType) {
			this.configItemType = configItemType;
		}

		public String getScalingGroupBizId() {
			return this.scalingGroupBizId;
		}

		public void setScalingGroupBizId(String scalingGroupBizId) {
			this.scalingGroupBizId = scalingGroupBizId;
		}

		public String getScalingConfigItemBizId() {
			return this.scalingConfigItemBizId;
		}

		public void setScalingConfigItemBizId(String scalingConfigItemBizId) {
			this.scalingConfigItemBizId = scalingConfigItemBizId;
		}

		public String getConfigItemInformation() {
			return this.configItemInformation;
		}

		public void setConfigItemInformation(String configItemInformation) {
			this.configItemInformation = configItemInformation;
		}
	}

	@Override
	public ListScalingConfigItemV2Response getInstance(UnmarshallerContext context) {
		return	ListScalingConfigItemV2ResponseUnmarshaller.unmarshall(this, context);
	}
}
