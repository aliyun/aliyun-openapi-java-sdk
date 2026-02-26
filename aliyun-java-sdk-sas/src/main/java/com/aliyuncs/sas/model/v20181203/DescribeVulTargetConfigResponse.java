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
import com.aliyuncs.sas.transform.v20181203.DescribeVulTargetConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulTargetConfigResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<TargetConfig> targetConfigs;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TargetConfig> getTargetConfigs() {
		return this.targetConfigs;
	}

	public void setTargetConfigs(List<TargetConfig> targetConfigs) {
		this.targetConfigs = targetConfigs;
	}

	public static class TargetConfig {

		private String type;

		private String overAllConfig;

		private String config;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getOverAllConfig() {
			return this.overAllConfig;
		}

		public void setOverAllConfig(String overAllConfig) {
			this.overAllConfig = overAllConfig;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}
	}

	@Override
	public DescribeVulTargetConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeVulTargetConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
