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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeConstraintsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeConstraintsResponse extends AcsResponse {

	private String requestId;

	private String name;

	private List<SupportedResourceModel> constraintInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SupportedResourceModel> getConstraintInfo() {
		return this.constraintInfo;
	}

	public void setConstraintInfo(List<SupportedResourceModel> constraintInfo) {
		this.constraintInfo = constraintInfo;
	}

	public static class SupportedResourceModel {

		private String value;

		private Integer max;

		private Integer min;

		private String unit;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Integer getMax() {
			return this.max;
		}

		public void setMax(Integer max) {
			this.max = max;
		}

		public Integer getMin() {
			return this.min;
		}

		public void setMin(Integer min) {
			this.min = min;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}
	}

	@Override
	public OpsDescribeConstraintsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeConstraintsResponseUnmarshaller.unmarshall(this, context);
	}
}
