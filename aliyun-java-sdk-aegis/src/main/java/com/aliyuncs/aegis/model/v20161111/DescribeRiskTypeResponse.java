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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeRiskTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRiskTypeResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private List<RiskType> riskTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<RiskType> getRiskTypes() {
		return this.riskTypes;
	}

	public void setRiskTypes(List<RiskType> riskTypes) {
		this.riskTypes = riskTypes;
	}

	public static class RiskType {

		private String typeName;

		private String alias;

		private String warnCount;

		private List<SubType> subTypes;

		public String getTypeName() {
			return this.typeName;
		}

		public void setTypeName(String typeName) {
			this.typeName = typeName;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public String getWarnCount() {
			return this.warnCount;
		}

		public void setWarnCount(String warnCount) {
			this.warnCount = warnCount;
		}

		public List<SubType> getSubTypes() {
			return this.subTypes;
		}

		public void setSubTypes(List<SubType> subTypes) {
			this.subTypes = subTypes;
		}

		public static class SubType {

			private String warnCount;

			private String typeName;

			private String alias;

			public String getWarnCount() {
				return this.warnCount;
			}

			public void setWarnCount(String warnCount) {
				this.warnCount = warnCount;
			}

			public String getTypeName() {
				return this.typeName;
			}

			public void setTypeName(String typeName) {
				this.typeName = typeName;
			}

			public String getAlias() {
				return this.alias;
			}

			public void setAlias(String alias) {
				this.alias = alias;
			}
		}
	}

	@Override
	public DescribeRiskTypeResponse getInstance(UnmarshallerContext context) {
		return	DescribeRiskTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
