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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeResubmitConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResubmitConfigResponse extends AcsResponse {

	private String requestId;

	private String dBClusterId;

	private List<RulesItem> rules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public List<RulesItem> getRules() {
		return this.rules;
	}

	public void setRules(List<RulesItem> rules) {
		this.rules = rules;
	}

	public static class RulesItem {

		private String peakMemory;

		private String queryTime;

		private String targetGroupName;

		private Boolean exceedMemoryException;

		private String groupName;

		public String getPeakMemory() {
			return this.peakMemory;
		}

		public void setPeakMemory(String peakMemory) {
			this.peakMemory = peakMemory;
		}

		public String getQueryTime() {
			return this.queryTime;
		}

		public void setQueryTime(String queryTime) {
			this.queryTime = queryTime;
		}

		public String getTargetGroupName() {
			return this.targetGroupName;
		}

		public void setTargetGroupName(String targetGroupName) {
			this.targetGroupName = targetGroupName;
		}

		public Boolean getExceedMemoryException() {
			return this.exceedMemoryException;
		}

		public void setExceedMemoryException(Boolean exceedMemoryException) {
			this.exceedMemoryException = exceedMemoryException;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
	}

	@Override
	public DescribeResubmitConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeResubmitConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
