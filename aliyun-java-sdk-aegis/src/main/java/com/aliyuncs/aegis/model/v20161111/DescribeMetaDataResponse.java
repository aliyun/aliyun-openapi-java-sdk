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
import com.aliyuncs.aegis.transform.v20161111.DescribeMetaDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetaDataResponse extends AcsResponse {

	private String requestId;

	private MetaData metaData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MetaData getMetaData() {
		return this.metaData;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}

	public static class MetaData {

		private String logStoreName;

		private String projectName;

		private Integer status;

		private List<DatasourceField> datasourceFieldList;

		public String getLogStoreName() {
			return this.logStoreName;
		}

		public void setLogStoreName(String logStoreName) {
			this.logStoreName = logStoreName;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public List<DatasourceField> getDatasourceFieldList() {
			return this.datasourceFieldList;
		}

		public void setDatasourceFieldList(List<DatasourceField> datasourceFieldList) {
			this.datasourceFieldList = datasourceFieldList;
		}

		public static class DatasourceField {

			private String fieldName;

			private String valueType;

			private String fieldDescription;

			private String fieldAliasName;

			private String fieldType;

			private String fieldValue;

			private Integer isIdentification;

			public String getFieldName() {
				return this.fieldName;
			}

			public void setFieldName(String fieldName) {
				this.fieldName = fieldName;
			}

			public String getValueType() {
				return this.valueType;
			}

			public void setValueType(String valueType) {
				this.valueType = valueType;
			}

			public String getFieldDescription() {
				return this.fieldDescription;
			}

			public void setFieldDescription(String fieldDescription) {
				this.fieldDescription = fieldDescription;
			}

			public String getFieldAliasName() {
				return this.fieldAliasName;
			}

			public void setFieldAliasName(String fieldAliasName) {
				this.fieldAliasName = fieldAliasName;
			}

			public String getFieldType() {
				return this.fieldType;
			}

			public void setFieldType(String fieldType) {
				this.fieldType = fieldType;
			}

			public String getFieldValue() {
				return this.fieldValue;
			}

			public void setFieldValue(String fieldValue) {
				this.fieldValue = fieldValue;
			}

			public Integer getIsIdentification() {
				return this.isIdentification;
			}

			public void setIsIdentification(Integer isIdentification) {
				this.isIdentification = isIdentification;
			}
		}
	}

	@Override
	public DescribeMetaDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeMetaDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
