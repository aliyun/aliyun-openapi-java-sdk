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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListSkillGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSkillGroupsResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<SkillGroup> list;

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

		public List<SkillGroup> getList() {
			return this.list;
		}

		public void setList(List<SkillGroup> list) {
			this.list = list;
		}

		public static class SkillGroup {

			private String description;

			private String displayName;

			private String instanceId;

			private Integer phoneNumberCount;

			private String skillGroupId;

			private String skillGroupName;

			private Integer userCount;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Integer getPhoneNumberCount() {
				return this.phoneNumberCount;
			}

			public void setPhoneNumberCount(Integer phoneNumberCount) {
				this.phoneNumberCount = phoneNumberCount;
			}

			public String getSkillGroupId() {
				return this.skillGroupId;
			}

			public void setSkillGroupId(String skillGroupId) {
				this.skillGroupId = skillGroupId;
			}

			public String getSkillGroupName() {
				return this.skillGroupName;
			}

			public void setSkillGroupName(String skillGroupName) {
				this.skillGroupName = skillGroupName;
			}

			public Integer getUserCount() {
				return this.userCount;
			}

			public void setUserCount(Integer userCount) {
				this.userCount = userCount;
			}
		}
	}

	@Override
	public ListSkillGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListSkillGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
