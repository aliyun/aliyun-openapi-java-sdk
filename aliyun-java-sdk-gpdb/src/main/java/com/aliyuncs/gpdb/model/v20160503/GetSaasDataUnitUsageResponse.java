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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.GetSaasDataUnitUsageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSaasDataUnitUsageResponse extends AcsResponse {

	private String requestId;

	private String endTime;

	private String startTime;

	private String serviceId;

	private List<TimeSeriesItem> timeSeries;

	private List<DistributionItem> distribution;

	private List<WarningsItem> warnings;

	private Summary summary;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public List<TimeSeriesItem> getTimeSeries() {
		return this.timeSeries;
	}

	public void setTimeSeries(List<TimeSeriesItem> timeSeries) {
		this.timeSeries = timeSeries;
	}

	public List<DistributionItem> getDistribution() {
		return this.distribution;
	}

	public void setDistribution(List<DistributionItem> distribution) {
		this.distribution = distribution;
	}

	public List<WarningsItem> getWarnings() {
		return this.warnings;
	}

	public void setWarnings(List<WarningsItem> warnings) {
		this.warnings = warnings;
	}

	public Summary getSummary() {
		return this.summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	public static class TimeSeriesItem {

		private String dataUnit;

		private String time;

		private List<ScenesItem> scenes;

		public String getDataUnit() {
			return this.dataUnit;
		}

		public void setDataUnit(String dataUnit) {
			this.dataUnit = dataUnit;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public List<ScenesItem> getScenes() {
			return this.scenes;
		}

		public void setScenes(List<ScenesItem> scenes) {
			this.scenes = scenes;
		}

		public static class ScenesItem {

			private String dataUnit;

			private String projectName;

			private String usageScene;

			private String projectId;

			public String getDataUnit() {
				return this.dataUnit;
			}

			public void setDataUnit(String dataUnit) {
				this.dataUnit = dataUnit;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getUsageScene() {
				return this.usageScene;
			}

			public void setUsageScene(String usageScene) {
				this.usageScene = usageScene;
			}

			public String getProjectId() {
				return this.projectId;
			}

			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}
		}
	}

	public static class DistributionItem {

		private String dataUnit;

		private String projectName;

		private String usageScene;

		private String usageSceneName;

		private String projectId;

		public String getDataUnit() {
			return this.dataUnit;
		}

		public void setDataUnit(String dataUnit) {
			this.dataUnit = dataUnit;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getUsageScene() {
			return this.usageScene;
		}

		public void setUsageScene(String usageScene) {
			this.usageScene = usageScene;
		}

		public String getUsageSceneName() {
			return this.usageSceneName;
		}

		public void setUsageSceneName(String usageSceneName) {
			this.usageSceneName = usageSceneName;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}
	}

	public static class WarningsItem {

		private String message;

		private String code;

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}
	}

	public static class Summary {

		private String dataUnit;

		public String getDataUnit() {
			return this.dataUnit;
		}

		public void setDataUnit(String dataUnit) {
			this.dataUnit = dataUnit;
		}
	}

	@Override
	public GetSaasDataUnitUsageResponse getInstance(UnmarshallerContext context) {
		return	GetSaasDataUnitUsageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
