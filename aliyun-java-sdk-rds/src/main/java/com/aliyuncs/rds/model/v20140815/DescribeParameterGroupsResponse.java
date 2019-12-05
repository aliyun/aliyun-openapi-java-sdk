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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeParameterGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParameterGroupsResponse extends AcsResponse {

	private String requestId;

	private Boolean signalForOptimizeParams;

	private List<ParameterGroup> parameterGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSignalForOptimizeParams() {
		return this.signalForOptimizeParams;
	}

	public void setSignalForOptimizeParams(Boolean signalForOptimizeParams) {
		this.signalForOptimizeParams = signalForOptimizeParams;
	}

	public List<ParameterGroup> getParameterGroups() {
		return this.parameterGroups;
	}

	public void setParameterGroups(List<ParameterGroup> parameterGroups) {
		this.parameterGroups = parameterGroups;
	}

	public static class ParameterGroup {

		private Integer parameterGroupType;

		private String parameterGroupName;

		private Integer paramCounts;

		private String parameterGroupDesc;

		private Integer forceRestart;

		private String engine;

		private String engineVersion;

		private String createTime;

		private String updateTime;

		private String parameterGroupId;

		public Integer getParameterGroupType() {
			return this.parameterGroupType;
		}

		public void setParameterGroupType(Integer parameterGroupType) {
			this.parameterGroupType = parameterGroupType;
		}

		public String getParameterGroupName() {
			return this.parameterGroupName;
		}

		public void setParameterGroupName(String parameterGroupName) {
			this.parameterGroupName = parameterGroupName;
		}

		public Integer getParamCounts() {
			return this.paramCounts;
		}

		public void setParamCounts(Integer paramCounts) {
			this.paramCounts = paramCounts;
		}

		public String getParameterGroupDesc() {
			return this.parameterGroupDesc;
		}

		public void setParameterGroupDesc(String parameterGroupDesc) {
			this.parameterGroupDesc = parameterGroupDesc;
		}

		public Integer getForceRestart() {
			return this.forceRestart;
		}

		public void setForceRestart(Integer forceRestart) {
			this.forceRestart = forceRestart;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getParameterGroupId() {
			return this.parameterGroupId;
		}

		public void setParameterGroupId(String parameterGroupId) {
			this.parameterGroupId = parameterGroupId;
		}
	}

	@Override
	public DescribeParameterGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeParameterGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
