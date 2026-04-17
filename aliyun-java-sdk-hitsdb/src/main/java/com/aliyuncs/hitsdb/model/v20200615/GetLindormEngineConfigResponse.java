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

package com.aliyuncs.hitsdb.model.v20200615;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20200615.GetLindormEngineConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLindormEngineConfigResponse extends AcsResponse {

	private String requestId;

	private String accessDeniedDetail;

	private List<EngineConfig> engineConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public List<EngineConfig> getEngineConfigs() {
		return this.engineConfigs;
	}

	public void setEngineConfigs(List<EngineConfig> engineConfigs) {
		this.engineConfigs = engineConfigs;
	}

	public static class EngineConfig {

		private String engine;

		private List<ConfigFile> configFiles;

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public List<ConfigFile> getConfigFiles() {
			return this.configFiles;
		}

		public void setConfigFiles(List<ConfigFile> configFiles) {
			this.configFiles = configFiles;
		}

		public static class ConfigFile {

			private String fileName;

			private List<ConfigItem> configItems;

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public List<ConfigItem> getConfigItems() {
				return this.configItems;
			}

			public void setConfigItems(List<ConfigItem> configItems) {
				this.configItems = configItems;
			}

			public static class ConfigItem {

				private String configItemKey;

				private String configItemValue;

				public String getConfigItemKey() {
					return this.configItemKey;
				}

				public void setConfigItemKey(String configItemKey) {
					this.configItemKey = configItemKey;
				}

				public String getConfigItemValue() {
					return this.configItemValue;
				}

				public void setConfigItemValue(String configItemValue) {
					this.configItemValue = configItemValue;
				}
			}
		}
	}

	@Override
	public GetLindormEngineConfigResponse getInstance(UnmarshallerContext context) {
		return	GetLindormEngineConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
