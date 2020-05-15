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

package com.aliyuncs.ons.model.v20190214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20190214.OnsGroupListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsGroupListResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private List<SubscribeInfoDo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public List<SubscribeInfoDo> getData() {
		return this.data;
	}

	public void setData(List<SubscribeInfoDo> data) {
		this.data = data;
	}

	public static class SubscribeInfoDo {

		private String owner;

		private String groupId;

		private Long updateTime;

		private String remark;

		private String instanceId;

		private Boolean independentNaming;

		private Long createTime;

		private String groupType;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getIndependentNaming() {
			return this.independentNaming;
		}

		public void setIndependentNaming(Boolean independentNaming) {
			this.independentNaming = independentNaming;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getGroupType() {
			return this.groupType;
		}

		public void setGroupType(String groupType) {
			this.groupType = groupType;
		}
	}

	@Override
	public OnsGroupListResponse getInstance(UnmarshallerContext context) {
		return	OnsGroupListResponseUnmarshaller.unmarshall(this, context);
	}
}
