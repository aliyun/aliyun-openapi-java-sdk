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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeParameterGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParameterGroupResponse extends AcsResponse {

	private String requestId;

	private ParameterGroup parameterGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ParameterGroup getParameterGroup() {
		return this.parameterGroup;
	}

	public void setParameterGroup(ParameterGroup parameterGroup) {
		this.parameterGroup = parameterGroup;
	}

	public static class ParameterGroup {

		private String engineVersion;

		private String modified;

		private String parameterGroupName;

		private String parameterGroupDesc;

		private String engine;

		private String paramGroupId;

		private String created;

		private Long category;

		private List<ParamGroupDetail> paramGroupsDetails;

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getModified() {
			return this.modified;
		}

		public void setModified(String modified) {
			this.modified = modified;
		}

		public String getParameterGroupName() {
			return this.parameterGroupName;
		}

		public void setParameterGroupName(String parameterGroupName) {
			this.parameterGroupName = parameterGroupName;
		}

		public String getParameterGroupDesc() {
			return this.parameterGroupDesc;
		}

		public void setParameterGroupDesc(String parameterGroupDesc) {
			this.parameterGroupDesc = parameterGroupDesc;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getParamGroupId() {
			return this.paramGroupId;
		}

		public void setParamGroupId(String paramGroupId) {
			this.paramGroupId = paramGroupId;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public Long getCategory() {
			return this.category;
		}

		public void setCategory(Long category) {
			this.category = category;
		}

		public List<ParamGroupDetail> getParamGroupsDetails() {
			return this.paramGroupsDetails;
		}

		public void setParamGroupsDetails(List<ParamGroupDetail> paramGroupsDetails) {
			this.paramGroupsDetails = paramGroupsDetails;
		}

		public static class ParamGroupDetail {

			private String paramName;

			private String paramValue;

			public String getParamName() {
				return this.paramName;
			}

			public void setParamName(String paramName) {
				this.paramName = paramName;
			}

			public String getParamValue() {
				return this.paramValue;
			}

			public void setParamValue(String paramValue) {
				this.paramValue = paramValue;
			}
		}
	}

	@Override
	public DescribeParameterGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeParameterGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
