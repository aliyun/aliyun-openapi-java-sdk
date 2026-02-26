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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListEnvCustomJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEnvCustomJobsResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private List<Monitoring> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Monitoring> getData() {
		return this.data;
	}

	public void setData(List<Monitoring> data) {
		this.data = data;
	}

	public static class Monitoring {

		private String environmentId;

		private String regionId;

		private String customJobName;

		private String configYaml;

		private String status;

		private String creationTimestamp;

		private String addonName;

		private String addonReleaseName;

		private String addonVersion;

		private List<ScrapeConfig> scrapeConfigs;

		public String getEnvironmentId() {
			return this.environmentId;
		}

		public void setEnvironmentId(String environmentId) {
			this.environmentId = environmentId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getCustomJobName() {
			return this.customJobName;
		}

		public void setCustomJobName(String customJobName) {
			this.customJobName = customJobName;
		}

		public String getConfigYaml() {
			return this.configYaml;
		}

		public void setConfigYaml(String configYaml) {
			this.configYaml = configYaml;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTimestamp() {
			return this.creationTimestamp;
		}

		public void setCreationTimestamp(String creationTimestamp) {
			this.creationTimestamp = creationTimestamp;
		}

		public String getAddonName() {
			return this.addonName;
		}

		public void setAddonName(String addonName) {
			this.addonName = addonName;
		}

		public String getAddonReleaseName() {
			return this.addonReleaseName;
		}

		public void setAddonReleaseName(String addonReleaseName) {
			this.addonReleaseName = addonReleaseName;
		}

		public String getAddonVersion() {
			return this.addonVersion;
		}

		public void setAddonVersion(String addonVersion) {
			this.addonVersion = addonVersion;
		}

		public List<ScrapeConfig> getScrapeConfigs() {
			return this.scrapeConfigs;
		}

		public void setScrapeConfigs(List<ScrapeConfig> scrapeConfigs) {
			this.scrapeConfigs = scrapeConfigs;
		}

		public static class ScrapeConfig {

			private String jobName;

			private String scrapeInterval;

			private String metricsPath;

			private List<String> scrapeDiscoverys;

			public String getJobName() {
				return this.jobName;
			}

			public void setJobName(String jobName) {
				this.jobName = jobName;
			}

			public String getScrapeInterval() {
				return this.scrapeInterval;
			}

			public void setScrapeInterval(String scrapeInterval) {
				this.scrapeInterval = scrapeInterval;
			}

			public String getMetricsPath() {
				return this.metricsPath;
			}

			public void setMetricsPath(String metricsPath) {
				this.metricsPath = metricsPath;
			}

			public List<String> getScrapeDiscoverys() {
				return this.scrapeDiscoverys;
			}

			public void setScrapeDiscoverys(List<String> scrapeDiscoverys) {
				this.scrapeDiscoverys = scrapeDiscoverys;
			}
		}
	}

	@Override
	public ListEnvCustomJobsResponse getInstance(UnmarshallerContext context) {
		return	ListEnvCustomJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
