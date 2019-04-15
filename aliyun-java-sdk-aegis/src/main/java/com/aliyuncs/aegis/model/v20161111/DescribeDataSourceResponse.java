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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeDataSourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataSourceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer count;

	private List<Data> metaDatas;

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

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Data> getMetaDatas() {
		return this.metaDatas;
	}

	public void setMetaDatas(List<Data> metaDatas) {
		this.metaDatas = metaDatas;
	}

	public static class Data {

		private Integer dataSourceId;

		private String dateSourceName;

		private String description;

		private List<MetaDataField> metaDataFields;

		public Integer getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(Integer dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getDateSourceName() {
			return this.dateSourceName;
		}

		public void setDateSourceName(String dateSourceName) {
			this.dateSourceName = dateSourceName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<MetaDataField> getMetaDataFields() {
			return this.metaDataFields;
		}

		public void setMetaDataFields(List<MetaDataField> metaDataFields) {
			this.metaDataFields = metaDataFields;
		}

		public static class MetaDataField {

			private String filedName;

			private String filed;

			private String valueType;

			private String sample;

			private List<Operator> operatorList;

			public String getFiledName() {
				return this.filedName;
			}

			public void setFiledName(String filedName) {
				this.filedName = filedName;
			}

			public String getFiled() {
				return this.filed;
			}

			public void setFiled(String filed) {
				this.filed = filed;
			}

			public String getValueType() {
				return this.valueType;
			}

			public void setValueType(String valueType) {
				this.valueType = valueType;
			}

			public String getSample() {
				return this.sample;
			}

			public void setSample(String sample) {
				this.sample = sample;
			}

			public List<Operator> getOperatorList() {
				return this.operatorList;
			}

			public void setOperatorList(List<Operator> operatorList) {
				this.operatorList = operatorList;
			}

			public static class Operator {

				private String name;

				private String description;

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
			}
		}
	}

	@Override
	public DescribeDataSourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataSourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
