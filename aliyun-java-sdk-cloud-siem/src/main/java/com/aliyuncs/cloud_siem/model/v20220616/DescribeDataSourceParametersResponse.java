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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeDataSourceParametersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataSourceParametersResponse extends AcsResponse {

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

		private String dataSourceType;

		private Integer paraLevel;

		private String paraCode;

		private String paraName;

		private String paraType;

		private Integer required;

		private String formatCheck;

		private String title;

		private String hit;

		private String defaultValue;

		private Boolean disabled;

		private Integer canEditted;

		private String cloudCode;

		private List<ParamValueItem> paramValue;

		public String getDataSourceType() {
			return this.dataSourceType;
		}

		public void setDataSourceType(String dataSourceType) {
			this.dataSourceType = dataSourceType;
		}

		public Integer getParaLevel() {
			return this.paraLevel;
		}

		public void setParaLevel(Integer paraLevel) {
			this.paraLevel = paraLevel;
		}

		public String getParaCode() {
			return this.paraCode;
		}

		public void setParaCode(String paraCode) {
			this.paraCode = paraCode;
		}

		public String getParaName() {
			return this.paraName;
		}

		public void setParaName(String paraName) {
			this.paraName = paraName;
		}

		public String getParaType() {
			return this.paraType;
		}

		public void setParaType(String paraType) {
			this.paraType = paraType;
		}

		public Integer getRequired() {
			return this.required;
		}

		public void setRequired(Integer required) {
			this.required = required;
		}

		public String getFormatCheck() {
			return this.formatCheck;
		}

		public void setFormatCheck(String formatCheck) {
			this.formatCheck = formatCheck;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getHit() {
			return this.hit;
		}

		public void setHit(String hit) {
			this.hit = hit;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public Boolean getDisabled() {
			return this.disabled;
		}

		public void setDisabled(Boolean disabled) {
			this.disabled = disabled;
		}

		public Integer getCanEditted() {
			return this.canEditted;
		}

		public void setCanEditted(Integer canEditted) {
			this.canEditted = canEditted;
		}

		public String getCloudCode() {
			return this.cloudCode;
		}

		public void setCloudCode(String cloudCode) {
			this.cloudCode = cloudCode;
		}

		public List<ParamValueItem> getParamValue() {
			return this.paramValue;
		}

		public void setParamValue(List<ParamValueItem> paramValue) {
			this.paramValue = paramValue;
		}

		public static class ParamValueItem {

			private String label;

			private String value;

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeDataSourceParametersResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataSourceParametersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
