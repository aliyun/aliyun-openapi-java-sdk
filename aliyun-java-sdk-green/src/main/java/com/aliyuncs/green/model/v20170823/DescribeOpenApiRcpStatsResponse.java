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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeOpenApiRcpStatsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOpenApiRcpStatsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<Stat> statList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Stat> getStatList() {
		return this.statList;
	}

	public void setStatList(List<Stat> statList) {
		this.statList = statList;
	}

	public static class Stat {

		private String date;

		private String resourceType;

		private Integer totalCount;

		private Integer passCount;

		private Integer reviewCount;

		private Integer blockCount;

		private Integer totalDuration;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPassCount() {
			return this.passCount;
		}

		public void setPassCount(Integer passCount) {
			this.passCount = passCount;
		}

		public Integer getReviewCount() {
			return this.reviewCount;
		}

		public void setReviewCount(Integer reviewCount) {
			this.reviewCount = reviewCount;
		}

		public Integer getBlockCount() {
			return this.blockCount;
		}

		public void setBlockCount(Integer blockCount) {
			this.blockCount = blockCount;
		}

		public Integer getTotalDuration() {
			return this.totalDuration;
		}

		public void setTotalDuration(Integer totalDuration) {
			this.totalDuration = totalDuration;
		}
	}

	@Override
	public DescribeOpenApiRcpStatsResponse getInstance(UnmarshallerContext context) {
		return	DescribeOpenApiRcpStatsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
