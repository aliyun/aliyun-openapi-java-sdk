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
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeAutomateResponseConfigFeatureResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutomateResponseConfigFeatureResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String requestId;

	private List<DataItem> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String feature;

		private String dataType;

		private List<SupportOperator> supportOperators;

		private List<RightValueEnum> rightValueEnums;

		public String getFeature() {
			return this.feature;
		}

		public void setFeature(String feature) {
			this.feature = feature;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public List<SupportOperator> getSupportOperators() {
			return this.supportOperators;
		}

		public void setSupportOperators(List<SupportOperator> supportOperators) {
			this.supportOperators = supportOperators;
		}

		public List<RightValueEnum> getRightValueEnums() {
			return this.rightValueEnums;
		}

		public void setRightValueEnums(List<RightValueEnum> rightValueEnums) {
			this.rightValueEnums = rightValueEnums;
		}

		public static class SupportOperator {

			private Boolean hasRightValue;

			private String operator;

			private String operatorName;

			private String operatorDescCn;

			private String operatorDescEn;

			private String supportDataType;

			private Integer index;

			private List<String> supportTag;

			public Boolean getHasRightValue() {
				return this.hasRightValue;
			}

			public void setHasRightValue(Boolean hasRightValue) {
				this.hasRightValue = hasRightValue;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}

			public String getOperatorName() {
				return this.operatorName;
			}

			public void setOperatorName(String operatorName) {
				this.operatorName = operatorName;
			}

			public String getOperatorDescCn() {
				return this.operatorDescCn;
			}

			public void setOperatorDescCn(String operatorDescCn) {
				this.operatorDescCn = operatorDescCn;
			}

			public String getOperatorDescEn() {
				return this.operatorDescEn;
			}

			public void setOperatorDescEn(String operatorDescEn) {
				this.operatorDescEn = operatorDescEn;
			}

			public String getSupportDataType() {
				return this.supportDataType;
			}

			public void setSupportDataType(String supportDataType) {
				this.supportDataType = supportDataType;
			}

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}

			public List<String> getSupportTag() {
				return this.supportTag;
			}

			public void setSupportTag(List<String> supportTag) {
				this.supportTag = supportTag;
			}
		}

		public static class RightValueEnum {

			private String value;

			private String valueMds;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getValueMds() {
				return this.valueMds;
			}

			public void setValueMds(String valueMds) {
				this.valueMds = valueMds;
			}
		}
	}

	@Override
	public DescribeAutomateResponseConfigFeatureResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutomateResponseConfigFeatureResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
