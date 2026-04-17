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

package com.aliyuncs.hitsdb.model.v20200615;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20200615.ListLdpsComputeGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLdpsComputeGroupsResponse extends AcsResponse {

	private String requestId;

	private String accessDeniedDetail;

	private List<ComputeGroup> groupList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public List<ComputeGroup> getGroupList() {
		return this.groupList;
	}

	public void setGroupList(List<ComputeGroup> groupList) {
		this.groupList = groupList;
	}

	public static class ComputeGroup {

		private String groupName;

		private Map<Object,Object> properties;

		private Boolean isDefault;

		private String state;

		private String exceptionInfo;

		private String rayVpcWebUIAddr;

		private String webUI;

		private String rayInteractiveAccessAddr;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Map<Object,Object> getProperties() {
			return this.properties;
		}

		public void setProperties(Map<Object,Object> properties) {
			this.properties = properties;
		}

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getExceptionInfo() {
			return this.exceptionInfo;
		}

		public void setExceptionInfo(String exceptionInfo) {
			this.exceptionInfo = exceptionInfo;
		}

		public String getRayVpcWebUIAddr() {
			return this.rayVpcWebUIAddr;
		}

		public void setRayVpcWebUIAddr(String rayVpcWebUIAddr) {
			this.rayVpcWebUIAddr = rayVpcWebUIAddr;
		}

		public String getWebUI() {
			return this.webUI;
		}

		public void setWebUI(String webUI) {
			this.webUI = webUI;
		}

		public String getRayInteractiveAccessAddr() {
			return this.rayInteractiveAccessAddr;
		}

		public void setRayInteractiveAccessAddr(String rayInteractiveAccessAddr) {
			this.rayInteractiveAccessAddr = rayInteractiveAccessAddr;
		}
	}

	@Override
	public ListLdpsComputeGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListLdpsComputeGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
