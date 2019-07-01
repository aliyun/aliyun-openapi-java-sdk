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
import com.aliyuncs.green.transform.v20170823.DescribeOpenApiUsageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOpenApiUsageResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<OpenApiUsage> openApiUsageList;

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

	public List<OpenApiUsage> getOpenApiUsageList() {
		return this.openApiUsageList;
	}

	public void setOpenApiUsageList(List<OpenApiUsage> openApiUsageList) {
		this.openApiUsageList = openApiUsageList;
	}

	public static class OpenApiUsage {

		private String date;

		private String resourceType;

		private String scene;

		private Integer totalCount;

		private Integer passCount;

		private Integer reviewCount;

		private Integer blockCount;

		private Integer innerTotalCount;

		private Integer outerTotalCount;

		private Integer totalDuration;

		private Integer passDuration;

		private Integer reviewDuration;

		private Integer blockDuration;

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

		public String getScene() {
			return this.scene;
		}

		public void setScene(String scene) {
			this.scene = scene;
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

		public Integer getInnerTotalCount() {
			return this.innerTotalCount;
		}

		public void setInnerTotalCount(Integer innerTotalCount) {
			this.innerTotalCount = innerTotalCount;
		}

		public Integer getOuterTotalCount() {
			return this.outerTotalCount;
		}

		public void setOuterTotalCount(Integer outerTotalCount) {
			this.outerTotalCount = outerTotalCount;
		}

		public Integer getTotalDuration() {
			return this.totalDuration;
		}

		public void setTotalDuration(Integer totalDuration) {
			this.totalDuration = totalDuration;
		}

		public Integer getPassDuration() {
			return this.passDuration;
		}

		public void setPassDuration(Integer passDuration) {
			this.passDuration = passDuration;
		}

		public Integer getReviewDuration() {
			return this.reviewDuration;
		}

		public void setReviewDuration(Integer reviewDuration) {
			this.reviewDuration = reviewDuration;
		}

		public Integer getBlockDuration() {
			return this.blockDuration;
		}

		public void setBlockDuration(Integer blockDuration) {
			this.blockDuration = blockDuration;
		}
	}

	@Override
	public DescribeOpenApiUsageResponse getInstance(UnmarshallerContext context) {
		return	DescribeOpenApiUsageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
