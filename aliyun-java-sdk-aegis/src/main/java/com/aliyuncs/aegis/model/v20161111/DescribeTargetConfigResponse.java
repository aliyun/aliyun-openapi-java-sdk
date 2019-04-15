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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeTargetConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTargetConfigResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<TargetConfig> targetConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<TargetConfig> getTargetConfigs() {
		return this.targetConfigs;
	}

	public void setTargetConfigs(List<TargetConfig> targetConfigs) {
		this.targetConfigs = targetConfigs;
	}

	public static class TargetConfig {

		private String type;

		private String config;

		private String overAllConfig;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public String getOverAllConfig() {
			return this.overAllConfig;
		}

		public void setOverAllConfig(String overAllConfig) {
			this.overAllConfig = overAllConfig;
		}
	}

	@Override
	public DescribeTargetConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeTargetConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
