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
import com.aliyuncs.sas.transform.v20181203.DescribeVpcHoneyPotCriteriaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpcHoneyPotCriteriaResponse extends AcsResponse {

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

		private String values;

		private String name;

		private String type;

		public String getValues() {
			return this.values;
		}

		public void setValues(String values) {
			this.values = values;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public DescribeVpcHoneyPotCriteriaResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpcHoneyPotCriteriaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
