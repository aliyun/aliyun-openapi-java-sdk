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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.SmartqQueryAbilityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SmartqQueryAbilityResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String conclusionText;

		private String logicSql;

		private String chartType;

		private List<ValuesItem> values;

		private List<MetaTypeItem> metaType;

		private List<String> dataList;

		public String getConclusionText() {
			return this.conclusionText;
		}

		public void setConclusionText(String conclusionText) {
			this.conclusionText = conclusionText;
		}

		public String getLogicSql() {
			return this.logicSql;
		}

		public void setLogicSql(String logicSql) {
			this.logicSql = logicSql;
		}

		public String getChartType() {
			return this.chartType;
		}

		public void setChartType(String chartType) {
			this.chartType = chartType;
		}

		public List<ValuesItem> getValues() {
			return this.values;
		}

		public void setValues(List<ValuesItem> values) {
			this.values = values;
		}

		public List<MetaTypeItem> getMetaType() {
			return this.metaType;
		}

		public void setMetaType(List<MetaTypeItem> metaType) {
			this.metaType = metaType;
		}

		public List<String> getDataList() {
			return this.dataList;
		}

		public void setDataList(List<String> dataList) {
			this.dataList = dataList;
		}

		public static class ValuesItem {

			private List<String> row;

			public List<String> getRow() {
				return this.row;
			}

			public void setRow(List<String> row) {
				this.row = row;
			}
		}

		public static class MetaTypeItem {

			private String type;

			private String value;

			private String key;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	@Override
	public SmartqQueryAbilityResponse getInstance(UnmarshallerContext context) {
		return	SmartqQueryAbilityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
