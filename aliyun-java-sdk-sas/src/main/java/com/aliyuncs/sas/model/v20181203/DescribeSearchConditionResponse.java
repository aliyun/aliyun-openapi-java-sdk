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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeSearchConditionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSearchConditionResponse extends AcsResponse {

	private String requestId;

	private List<Condition> conditionList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Condition> getConditionList() {
		return this.conditionList;
	}

	public void setConditionList(List<Condition> conditionList) {
		this.conditionList = conditionList;
	}

	public static class Condition {

		private String name;

		private String filterConditions;

		private String nameKey;

		private String conditionType;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getFilterConditions() {
			return this.filterConditions;
		}

		public void setFilterConditions(String filterConditions) {
			this.filterConditions = filterConditions;
		}

		public String getNameKey() {
			return this.nameKey;
		}

		public void setNameKey(String nameKey) {
			this.nameKey = nameKey;
		}

		public String getConditionType() {
			return this.conditionType;
		}

		public void setConditionType(String conditionType) {
			this.conditionType = conditionType;
		}
	}

	@Override
	public DescribeSearchConditionResponse getInstance(UnmarshallerContext context) {
		return	DescribeSearchConditionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
