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

package com.aliyuncs.trademark_inner.model.v20180801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark_inner.transform.v20180801.SearchClassificationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchClassificationResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String classificationCode;

		private String classificationName;

		private Integer level;

		private String officialCode;

		private Integer id;

		private List<SecondClassificationItem> secondClassification;

		public String getClassificationCode() {
			return this.classificationCode;
		}

		public void setClassificationCode(String classificationCode) {
			this.classificationCode = classificationCode;
		}

		public String getClassificationName() {
			return this.classificationName;
		}

		public void setClassificationName(String classificationName) {
			this.classificationName = classificationName;
		}

		public Integer getLevel() {
			return this.level;
		}

		public void setLevel(Integer level) {
			this.level = level;
		}

		public String getOfficialCode() {
			return this.officialCode;
		}

		public void setOfficialCode(String officialCode) {
			this.officialCode = officialCode;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public List<SecondClassificationItem> getSecondClassification() {
			return this.secondClassification;
		}

		public void setSecondClassification(List<SecondClassificationItem> secondClassification) {
			this.secondClassification = secondClassification;
		}

		public static class SecondClassificationItem {

			private String classificationCode;

			private String classificationName;

			private Integer level;

			private String parentCode;

			private String officialCode;

			private Integer id;

			private List<ChildrenItem> children;

			public String getClassificationCode() {
				return this.classificationCode;
			}

			public void setClassificationCode(String classificationCode) {
				this.classificationCode = classificationCode;
			}

			public String getClassificationName() {
				return this.classificationName;
			}

			public void setClassificationName(String classificationName) {
				this.classificationName = classificationName;
			}

			public Integer getLevel() {
				return this.level;
			}

			public void setLevel(Integer level) {
				this.level = level;
			}

			public String getParentCode() {
				return this.parentCode;
			}

			public void setParentCode(String parentCode) {
				this.parentCode = parentCode;
			}

			public String getOfficialCode() {
				return this.officialCode;
			}

			public void setOfficialCode(String officialCode) {
				this.officialCode = officialCode;
			}

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public List<ChildrenItem> getChildren() {
				return this.children;
			}

			public void setChildren(List<ChildrenItem> children) {
				this.children = children;
			}

			public static class ChildrenItem {

				private String classificationCode;

				private String classificationName;

				private Integer level;

				private String parentCode;

				private String officialCode;

				private Integer id;

				public String getClassificationCode() {
					return this.classificationCode;
				}

				public void setClassificationCode(String classificationCode) {
					this.classificationCode = classificationCode;
				}

				public String getClassificationName() {
					return this.classificationName;
				}

				public void setClassificationName(String classificationName) {
					this.classificationName = classificationName;
				}

				public Integer getLevel() {
					return this.level;
				}

				public void setLevel(Integer level) {
					this.level = level;
				}

				public String getParentCode() {
					return this.parentCode;
				}

				public void setParentCode(String parentCode) {
					this.parentCode = parentCode;
				}

				public String getOfficialCode() {
					return this.officialCode;
				}

				public void setOfficialCode(String officialCode) {
					this.officialCode = officialCode;
				}

				public Integer getId() {
					return this.id;
				}

				public void setId(Integer id) {
					this.id = id;
				}
			}
		}
	}

	@Override
	public SearchClassificationResponse getInstance(UnmarshallerContext context) {
		return	SearchClassificationResponseUnmarshaller.unmarshall(this, context);
	}
}
