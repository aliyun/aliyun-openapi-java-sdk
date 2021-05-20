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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cccxspaceinner.transform.v20191227.QueryAgentGroupByBuIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAgentGroupByBuIdResponse extends AcsResponse {

	private String message;

	private String code;

	private Boolean success;

	private List<XspaceAgentGroup> data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<XspaceAgentGroup> getData() {
		return this.data;
	}

	public void setData(List<XspaceAgentGroup> data) {
		this.data = data;
	}

	public static class XspaceAgentGroup {

		private Integer status;

		private Long buId;

		private String showName;

		private String description;

		private Long groupId;

		private String groupName;

		private Long departmentId;

		private Boolean isPublic;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getBuId() {
			return this.buId;
		}

		public void setBuId(Long buId) {
			this.buId = buId;
		}

		public String getShowName() {
			return this.showName;
		}

		public void setShowName(String showName) {
			this.showName = showName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Long getDepartmentId() {
			return this.departmentId;
		}

		public void setDepartmentId(Long departmentId) {
			this.departmentId = departmentId;
		}

		public Boolean getIsPublic() {
			return this.isPublic;
		}

		public void setIsPublic(Boolean isPublic) {
			this.isPublic = isPublic;
		}
	}

	@Override
	public QueryAgentGroupByBuIdResponse getInstance(UnmarshallerContext context) {
		return	QueryAgentGroupByBuIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
