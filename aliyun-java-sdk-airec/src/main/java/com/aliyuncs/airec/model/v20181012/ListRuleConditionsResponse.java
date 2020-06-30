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

package com.aliyuncs.airec.model.v20181012;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20181012.ListRuleConditionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRuleConditionsResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String selectType;

		private String selectionOperation;

		private String selectValue;

		public String getSelectType() {
			return this.selectType;
		}

		public void setSelectType(String selectType) {
			this.selectType = selectType;
		}

		public String getSelectionOperation() {
			return this.selectionOperation;
		}

		public void setSelectionOperation(String selectionOperation) {
			this.selectionOperation = selectionOperation;
		}

		public String getSelectValue() {
			return this.selectValue;
		}

		public void setSelectValue(String selectValue) {
			this.selectValue = selectValue;
		}
	}

	@Override
	public ListRuleConditionsResponse getInstance(UnmarshallerContext context) {
		return	ListRuleConditionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
