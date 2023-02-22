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
import com.aliyuncs.sas.transform.v20181203.GetCloudAssetCriteriaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCloudAssetCriteriaResponse extends AcsResponse {

	private String requestId;

	private List<Criteria> criteriaList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Criteria> getCriteriaList() {
		return this.criteriaList;
	}

	public void setCriteriaList(List<Criteria> criteriaList) {
		this.criteriaList = criteriaList;
	}

	public static class Criteria {

		private String type;

		private String name;

		private String values;

		private String multiValues;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValues() {
			return this.values;
		}

		public void setValues(String values) {
			this.values = values;
		}

		public String getMultiValues() {
			return this.multiValues;
		}

		public void setMultiValues(String multiValues) {
			this.multiValues = multiValues;
		}
	}

	@Override
	public GetCloudAssetCriteriaResponse getInstance(UnmarshallerContext context) {
		return	GetCloudAssetCriteriaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
