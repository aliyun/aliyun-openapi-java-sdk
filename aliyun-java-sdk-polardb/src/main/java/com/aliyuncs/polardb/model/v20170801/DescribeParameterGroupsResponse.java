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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeParameterGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParameterGroupsResponse extends AcsResponse {

	private String requestId;

	private List<ParameterGroupsItem> parameterGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ParameterGroupsItem> getParameterGroups() {
		return this.parameterGroups;
	}

	public void setParameterGroups(List<ParameterGroupsItem> parameterGroups) {
		this.parameterGroups = parameterGroups;
	}

	public static class ParameterGroupsItem {

		private String dBType;

		private String dBVersion;

		private String parameterGroupName;

		private String forceRestart;

		private String parameterGroupType;

		private Long parameterCounts;

		private String parameterGroupDesc;

		private String createTime;

		private String parameterGroupId;

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public String getDBVersion() {
			return this.dBVersion;
		}

		public void setDBVersion(String dBVersion) {
			this.dBVersion = dBVersion;
		}

		public String getParameterGroupName() {
			return this.parameterGroupName;
		}

		public void setParameterGroupName(String parameterGroupName) {
			this.parameterGroupName = parameterGroupName;
		}

		public String getForceRestart() {
			return this.forceRestart;
		}

		public void setForceRestart(String forceRestart) {
			this.forceRestart = forceRestart;
		}

		public String getParameterGroupType() {
			return this.parameterGroupType;
		}

		public void setParameterGroupType(String parameterGroupType) {
			this.parameterGroupType = parameterGroupType;
		}

		public Long getParameterCounts() {
			return this.parameterCounts;
		}

		public void setParameterCounts(Long parameterCounts) {
			this.parameterCounts = parameterCounts;
		}

		public String getParameterGroupDesc() {
			return this.parameterGroupDesc;
		}

		public void setParameterGroupDesc(String parameterGroupDesc) {
			this.parameterGroupDesc = parameterGroupDesc;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
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

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
