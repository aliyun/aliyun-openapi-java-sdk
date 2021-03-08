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
import com.aliyuncs.polardb.transform.v20170801.DescribeParameterGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParameterGroupResponse extends AcsResponse {

	private String requestId;

	private List<ParameterGroupItem> parameterGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ParameterGroupItem> getParameterGroup() {
		return this.parameterGroup;
	}

	public void setParameterGroup(List<ParameterGroupItem> parameterGroup) {
		this.parameterGroup = parameterGroup;
	}

	public static class ParameterGroupItem {

		private String dBVersion;

		private String parameterGroupId;

		private String forceRestart;

		private String parameterGroupName;

		private String createTime;

		private String parameterGroupDesc;

		private String parameterGroupType;

		private Integer parameterCounts;

		private String dBType;

		private List<ParameterDetailItem> parameterDetail;

		public String getDBVersion() {
			return this.dBVersion;
		}

		public void setDBVersion(String dBVersion) {
			this.dBVersion = dBVersion;
		}

		public String getParameterGroupId() {
			return this.parameterGroupId;
		}

		public void setParameterGroupId(String parameterGroupId) {
			this.parameterGroupId = parameterGroupId;
		}

		public String getForceRestart() {
			return this.forceRestart;
		}

		public void setForceRestart(String forceRestart) {
			this.forceRestart = forceRestart;
		}

		public String getParameterGroupName() {
			return this.parameterGroupName;
		}

		public void setParameterGroupName(String parameterGroupName) {
			this.parameterGroupName = parameterGroupName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getParameterGroupDesc() {
			return this.parameterGroupDesc;
		}

		public void setParameterGroupDesc(String parameterGroupDesc) {
			this.parameterGroupDesc = parameterGroupDesc;
		}

		public String getParameterGroupType() {
			return this.parameterGroupType;
		}

		public void setParameterGroupType(String parameterGroupType) {
			this.parameterGroupType = parameterGroupType;
		}

		public Integer getParameterCounts() {
			return this.parameterCounts;
		}

		public void setParameterCounts(Integer parameterCounts) {
			this.parameterCounts = parameterCounts;
		}

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public List<ParameterDetailItem> getParameterDetail() {
			return this.parameterDetail;
		}

		public void setParameterDetail(List<ParameterDetailItem> parameterDetail) {
			this.parameterDetail = parameterDetail;
		}

		public static class ParameterDetailItem {

			private String paramValue;

			private String paramName;

			public String getParamValue() {
				return this.paramValue;
			}

			public void setParamValue(String paramValue) {
				this.paramValue = paramValue;
			}

			public String getParamName() {
				return this.paramName;
			}

			public void setParamName(String paramName) {
				this.paramName = paramName;
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
