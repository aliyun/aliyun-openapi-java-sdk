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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryScheduledTaskKeyValueConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryScheduledTaskKeyValueConfigsResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private List<ScheduledTaskKeyValueConfig> scheduledTaskKeyValueConfigs;

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

	public List<ScheduledTaskKeyValueConfig> getScheduledTaskKeyValueConfigs() {
		return this.scheduledTaskKeyValueConfigs;
	}

	public void setScheduledTaskKeyValueConfigs(List<ScheduledTaskKeyValueConfig> scheduledTaskKeyValueConfigs) {
		this.scheduledTaskKeyValueConfigs = scheduledTaskKeyValueConfigs;
	}

	public static class ScheduledTaskKeyValueConfig {

		private Long aliUid;

		private String configKey;

		private String description;

		private String configValue;

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getConfigKey() {
			return this.configKey;
		}

		public void setConfigKey(String configKey) {
			this.configKey = configKey;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getConfigValue() {
			return this.configValue;
		}

		public void setConfigValue(String configValue) {
			this.configValue = configValue;
		}
	}

	@Override
	public OpsQueryScheduledTaskKeyValueConfigsResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryScheduledTaskKeyValueConfigsResponseUnmarshaller.unmarshall(this, context);
	}
}
