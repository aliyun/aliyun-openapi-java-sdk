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

package com.aliyuncs.emas_dmp.model.v20210402;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emas_dmp.transform.v20210402.ListTagTreeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTagTreeResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private List<Tag> tags;

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private Integer id;

			private String name;

			private String foreignCode;

			private Integer typeId;

			private Integer level;

			private Integer parentId;

			private Boolean enabled;

			private List<Sub1> subList;

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getForeignCode() {
				return this.foreignCode;
			}

			public void setForeignCode(String foreignCode) {
				this.foreignCode = foreignCode;
			}

			public Integer getTypeId() {
				return this.typeId;
			}

			public void setTypeId(Integer typeId) {
				this.typeId = typeId;
			}

			public Integer getLevel() {
				return this.level;
			}

			public void setLevel(Integer level) {
				this.level = level;
			}

			public Integer getParentId() {
				return this.parentId;
			}

			public void setParentId(Integer parentId) {
				this.parentId = parentId;
			}

			public Boolean getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}

			public List<Sub1> getSubList() {
				return this.subList;
			}

			public void setSubList(List<Sub1> subList) {
				this.subList = subList;
			}

			public static class Sub1 {

				private Integer id;

				private String name;

				private String foreignCode;

				private Integer typeId;

				private Integer level;

				private Integer parentId;

				private Boolean enabled;

				private List<Sub2> subs;

				public Integer getId() {
					return this.id;
				}

				public void setId(Integer id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getForeignCode() {
					return this.foreignCode;
				}

				public void setForeignCode(String foreignCode) {
					this.foreignCode = foreignCode;
				}

				public Integer getTypeId() {
					return this.typeId;
				}

				public void setTypeId(Integer typeId) {
					this.typeId = typeId;
				}

				public Integer getLevel() {
					return this.level;
				}

				public void setLevel(Integer level) {
					this.level = level;
				}

				public Integer getParentId() {
					return this.parentId;
				}

				public void setParentId(Integer parentId) {
					this.parentId = parentId;
				}

				public Boolean getEnabled() {
					return this.enabled;
				}

				public void setEnabled(Boolean enabled) {
					this.enabled = enabled;
				}

				public List<Sub2> getSubs() {
					return this.subs;
				}

				public void setSubs(List<Sub2> subs) {
					this.subs = subs;
				}

				public static class Sub2 {

					private Integer id;

					private String name;

					private String foreignCode;

					private Integer typeId;

					private Integer level;

					private Integer parentId;

					private String subs;

					private Boolean enabled;

					public Integer getId() {
						return this.id;
					}

					public void setId(Integer id) {
						this.id = id;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getForeignCode() {
						return this.foreignCode;
					}

					public void setForeignCode(String foreignCode) {
						this.foreignCode = foreignCode;
					}

					public Integer getTypeId() {
						return this.typeId;
					}

					public void setTypeId(Integer typeId) {
						this.typeId = typeId;
					}

					public Integer getLevel() {
						return this.level;
					}

					public void setLevel(Integer level) {
						this.level = level;
					}

					public Integer getParentId() {
						return this.parentId;
					}

					public void setParentId(Integer parentId) {
						this.parentId = parentId;
					}

					public String getSubs() {
						return this.subs;
					}

					public void setSubs(String subs) {
						this.subs = subs;
					}

					public Boolean getEnabled() {
						return this.enabled;
					}

					public void setEnabled(Boolean enabled) {
						this.enabled = enabled;
					}
				}
			}
		}
	}

	@Override
	public ListTagTreeResponse getInstance(UnmarshallerContext context) {
		return	ListTagTreeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
