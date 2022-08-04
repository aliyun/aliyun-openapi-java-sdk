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

package com.aliyuncs.trademark.model.v20180724;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.QuerySbjRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySbjRuleResponse extends AcsResponse {

	private String ruleId;

	private String bizType;

	private String requestId;

	private List<SbjRuleItem> sbjRuleList;

	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SbjRuleItem> getSbjRuleList() {
		return this.sbjRuleList;
	}

	public void setSbjRuleList(List<SbjRuleItem> sbjRuleList) {
		this.sbjRuleList = sbjRuleList;
	}

	public static class SbjRuleItem {

		private String fieldName;

		private String sbjFieldId;

		private String espExtFieldName;

		private String requiredExpression;

		private String validateRegularExpression;

		private String fileType;

		private String showExpression;

		private String defaultValue;

		private String frontendType;

		private String trademarkServiceExpression;

		private List<FrontendOption> frontendOptions;

		public String getFieldName() {
			return this.fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getSbjFieldId() {
			return this.sbjFieldId;
		}

		public void setSbjFieldId(String sbjFieldId) {
			this.sbjFieldId = sbjFieldId;
		}

		public String getEspExtFieldName() {
			return this.espExtFieldName;
		}

		public void setEspExtFieldName(String espExtFieldName) {
			this.espExtFieldName = espExtFieldName;
		}

		public String getRequiredExpression() {
			return this.requiredExpression;
		}

		public void setRequiredExpression(String requiredExpression) {
			this.requiredExpression = requiredExpression;
		}

		public String getValidateRegularExpression() {
			return this.validateRegularExpression;
		}

		public void setValidateRegularExpression(String validateRegularExpression) {
			this.validateRegularExpression = validateRegularExpression;
		}

		public String getFileType() {
			return this.fileType;
		}

		public void setFileType(String fileType) {
			this.fileType = fileType;
		}

		public String getShowExpression() {
			return this.showExpression;
		}

		public void setShowExpression(String showExpression) {
			this.showExpression = showExpression;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public String getFrontendType() {
			return this.frontendType;
		}

		public void setFrontendType(String frontendType) {
			this.frontendType = frontendType;
		}

		public String getTrademarkServiceExpression() {
			return this.trademarkServiceExpression;
		}

		public void setTrademarkServiceExpression(String trademarkServiceExpression) {
			this.trademarkServiceExpression = trademarkServiceExpression;
		}

		public List<FrontendOption> getFrontendOptions() {
			return this.frontendOptions;
		}

		public void setFrontendOptions(List<FrontendOption> frontendOptions) {
			this.frontendOptions = frontendOptions;
		}

		public static class FrontendOption {

			private String title;

			private String value;

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
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
	public QuerySbjRuleResponse getInstance(UnmarshallerContext context) {
		return	QuerySbjRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
