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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.ListDynamicRoutesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDynamicRoutesResponse extends AcsResponse {

	private String requestId;

	private Integer totalNum;

	private List<DynamicRoute> dynamicRoutes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public List<DynamicRoute> getDynamicRoutes() {
		return this.dynamicRoutes;
	}

	public void setDynamicRoutes(List<DynamicRoute> dynamicRoutes) {
		this.dynamicRoutes = dynamicRoutes;
	}

	public static class DynamicRoute {

		private String dynamicRouteId;

		private String name;

		private String description;

		private String status;

		private Integer priority;

		private String applicationType;

		private String dynamicRouteType;

		private String nextHop;

		private String createTime;

		private List<String> regionIds;

		private List<String> applicationIds;

		private List<String> tagIds;

		public String getDynamicRouteId() {
			return this.dynamicRouteId;
		}

		public void setDynamicRouteId(String dynamicRouteId) {
			this.dynamicRouteId = dynamicRouteId;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getApplicationType() {
			return this.applicationType;
		}

		public void setApplicationType(String applicationType) {
			this.applicationType = applicationType;
		}

		public String getDynamicRouteType() {
			return this.dynamicRouteType;
		}

		public void setDynamicRouteType(String dynamicRouteType) {
			this.dynamicRouteType = dynamicRouteType;
		}

		public String getNextHop() {
			return this.nextHop;
		}

		public void setNextHop(String nextHop) {
			this.nextHop = nextHop;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public List<String> getRegionIds() {
			return this.regionIds;
		}

		public void setRegionIds(List<String> regionIds) {
			this.regionIds = regionIds;
		}

		public List<String> getApplicationIds() {
			return this.applicationIds;
		}

		public void setApplicationIds(List<String> applicationIds) {
			this.applicationIds = applicationIds;
		}

		public List<String> getTagIds() {
			return this.tagIds;
		}

		public void setTagIds(List<String> tagIds) {
			this.tagIds = tagIds;
		}
	}

	@Override
	public ListDynamicRoutesResponse getInstance(UnmarshallerContext context) {
		return	ListDynamicRoutesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
