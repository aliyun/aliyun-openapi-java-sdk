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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.QueryDepartmentTreeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDepartmentTreeResponse extends AcsResponse {

	private String requestId;

	private List<DepartmentNodeInfoDTO> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DepartmentNodeInfoDTO> getData() {
		return this.data;
	}

	public void setData(List<DepartmentNodeInfoDTO> data) {
		this.data = data;
	}

	public static class DepartmentNodeInfoDTO {

		private Long departmentId;

		private String departmentName;

		private String contactName;

		private String contactMobile;

		private Long parentId;

		private List<String> children;

		public Long getDepartmentId() {
			return this.departmentId;
		}

		public void setDepartmentId(Long departmentId) {
			this.departmentId = departmentId;
		}

		public String getDepartmentName() {
			return this.departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		public String getContactName() {
			return this.contactName;
		}

		public void setContactName(String contactName) {
			this.contactName = contactName;
		}

		public String getContactMobile() {
			return this.contactMobile;
		}

		public void setContactMobile(String contactMobile) {
			this.contactMobile = contactMobile;
		}

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}

		public List<String> getChildren() {
			return this.children;
		}

		public void setChildren(List<String> children) {
			this.children = children;
		}
	}

	@Override
	public QueryDepartmentTreeResponse getInstance(UnmarshallerContext context) {
		return	QueryDepartmentTreeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
