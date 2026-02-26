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
import com.aliyuncs.sas.transform.v20181203.DescribeCommonTargetResultListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCommonTargetResultListResponse extends AcsResponse {

	private String requestId;

	private TargetConfig targetConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TargetConfig getTargetConfig() {
		return this.targetConfig;
	}

	public void setTargetConfig(TargetConfig targetConfig) {
		this.targetConfig = targetConfig;
	}

	public static class TargetConfig {

		private String type;

		private String flag;

		private String totalCount;

		private String targetDefault;

		private String targetType;

		private List<String> targetList;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFlag() {
			return this.flag;
		}

		public void setFlag(String flag) {
			this.flag = flag;
		}

		public String getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}

		public String getTargetDefault() {
			return this.targetDefault;
		}

		public void setTargetDefault(String targetDefault) {
			this.targetDefault = targetDefault;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public List<String> getTargetList() {
			return this.targetList;
		}

		public void setTargetList(List<String> targetList) {
			this.targetList = targetList;
		}
	}

	@Override
	public DescribeCommonTargetResultListResponse getInstance(UnmarshallerContext context) {
		return	DescribeCommonTargetResultListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
