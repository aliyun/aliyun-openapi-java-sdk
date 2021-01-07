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

package com.aliyuncs.airec.model.v20201126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.DescribeExperimentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExperimentResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String experimentId;

		private String name;

		private String description;

		private String status;

		private Boolean base;

		private String onlineTime;

		private String offlineTime;

		private List<Algorithm> algorithms;

		private List<String> buckets;

		public String getExperimentId() {
			return this.experimentId;
		}

		public void setExperimentId(String experimentId) {
			this.experimentId = experimentId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getBase() {
			return this.base;
		}

		public void setBase(Boolean base) {
			this.base = base;
		}

		public String getOnlineTime() {
			return this.onlineTime;
		}

		public void setOnlineTime(String onlineTime) {
			this.onlineTime = onlineTime;
		}

		public String getOfflineTime() {
			return this.offlineTime;
		}

		public void setOfflineTime(String offlineTime) {
			this.offlineTime = offlineTime;
		}

		public List<Algorithm> getAlgorithms() {
			return this.algorithms;
		}

		public void setAlgorithms(List<Algorithm> algorithms) {
			this.algorithms = algorithms;
		}

		public List<String> getBuckets() {
			return this.buckets;
		}

		public void setBuckets(List<String> buckets) {
			this.buckets = buckets;
		}

		public static class Algorithm {

			private String key;

			private String name;

			private String category;

			private String type;

			private String defaultValue;

			private String experimentValue;

			private Boolean hasConfig;

			private List<ConfigItem> config;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDefaultValue() {
				return this.defaultValue;
			}

			public void setDefaultValue(String defaultValue) {
				this.defaultValue = defaultValue;
			}

			public String getExperimentValue() {
				return this.experimentValue;
			}

			public void setExperimentValue(String experimentValue) {
				this.experimentValue = experimentValue;
			}

			public Boolean getHasConfig() {
				return this.hasConfig;
			}

			public void setHasConfig(Boolean hasConfig) {
				this.hasConfig = hasConfig;
			}

			public List<ConfigItem> getConfig() {
				return this.config;
			}

			public void setConfig(List<ConfigItem> config) {
				this.config = config;
			}

			public static class ConfigItem {

				private String key;

				private String name;

				private String defaultValue;

				private String experimentValue;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getDefaultValue() {
					return this.defaultValue;
				}

				public void setDefaultValue(String defaultValue) {
					this.defaultValue = defaultValue;
				}

				public String getExperimentValue() {
					return this.experimentValue;
				}

				public void setExperimentValue(String experimentValue) {
					this.experimentValue = experimentValue;
				}
			}
		}
	}

	@Override
	public DescribeExperimentResponse getInstance(UnmarshallerContext context) {
		return	DescribeExperimentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
