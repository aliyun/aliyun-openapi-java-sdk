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

package com.aliyuncs.digitalstore.model.v20200107;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.digitalstore.transform.v20200107.ListMenusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMenusResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long id;

		private String name;

		private Long parentId;

		private Integer sequence;

		private List<AclItem> acl;

		private List<ChildModuleItem> childModule;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}

		public Integer getSequence() {
			return this.sequence;
		}

		public void setSequence(Integer sequence) {
			this.sequence = sequence;
		}

		public List<AclItem> getAcl() {
			return this.acl;
		}

		public void setAcl(List<AclItem> acl) {
			this.acl = acl;
		}

		public List<ChildModuleItem> getChildModule() {
			return this.childModule;
		}

		public void setChildModule(List<ChildModuleItem> childModule) {
			this.childModule = childModule;
		}

		public static class AclItem {

			private Long id;

			private String name;

			private String code;

			private Integer type;

			private Integer status;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}
		}

		public static class ChildModuleItem {

			private Long id;

			private String name;

			private Long parentId;

			private Integer sequence;

			private List<AclItem2> acl1;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getParentId() {
				return this.parentId;
			}

			public void setParentId(Long parentId) {
				this.parentId = parentId;
			}

			public Integer getSequence() {
				return this.sequence;
			}

			public void setSequence(Integer sequence) {
				this.sequence = sequence;
			}

			public List<AclItem2> getAcl1() {
				return this.acl1;
			}

			public void setAcl1(List<AclItem2> acl1) {
				this.acl1 = acl1;
			}

			public static class AclItem2 {

				private Long id;

				private String name;

				private String code;

				private Integer type;

				private Integer status;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public Integer getType() {
					return this.type;
				}

				public void setType(Integer type) {
					this.type = type;
				}

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
				}
			}
		}
	}

	@Override
	public ListMenusResponse getInstance(UnmarshallerContext context) {
		return	ListMenusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
