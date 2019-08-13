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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeClusterServiceConfigHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterServiceConfigHistoryResponse extends AcsResponse {

	private String requestId;

	private Config config;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Config getConfig() {
		return this.config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public static class Config {

		private String serviceName;

		private String configVersion;

		private Boolean applied;

		private String createTime;

		private String author;

		private String comment;

		private List<ConfigValue> configValueList;

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getConfigVersion() {
			return this.configVersion;
		}

		public void setConfigVersion(String configVersion) {
			this.configVersion = configVersion;
		}

		public Boolean getApplied() {
			return this.applied;
		}

		public void setApplied(Boolean applied) {
			this.applied = applied;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAuthor() {
			return this.author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public List<ConfigValue> getConfigValueList() {
			return this.configValueList;
		}

		public void setConfigValueList(List<ConfigValue> configValueList) {
			this.configValueList = configValueList;
		}

		public static class ConfigValue {

			private String configName;

			private List<ConfigItemValue> configItemValueList;

			public String getConfigName() {
				return this.configName;
			}

			public void setConfigName(String configName) {
				this.configName = configName;
			}

			public List<ConfigItemValue> getConfigItemValueList() {
				return this.configItemValueList;
			}

			public void setConfigItemValueList(List<ConfigItemValue> configItemValueList) {
				this.configItemValueList = configItemValueList;
			}

			public static class ConfigItemValue {

				private String itemName;

				private String value;

				private String oldValue;

				private String changeType;

				public String getItemName() {
					return this.itemName;
				}

				public void setItemName(String itemName) {
					this.itemName = itemName;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getOldValue() {
					return this.oldValue;
				}

				public void setOldValue(String oldValue) {
					this.oldValue = oldValue;
				}

				public String getChangeType() {
					return this.changeType;
				}

				public void setChangeType(String changeType) {
					this.changeType = changeType;
				}
			}
		}
	}

	@Override
	public DescribeClusterServiceConfigHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterServiceConfigHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
