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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.GetHealthMonitorLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHealthMonitorLogsResponse extends AcsResponse {

	private String requestId;

	private List<Logs> logInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Logs> getLogInfo() {
		return this.logInfo;
	}

	public void setLogInfo(List<Logs> logInfo) {
		this.logInfo = logInfo;
	}

	public static class Logs {

		private String healthId;

		private String hostName;

		private String instanceId;

		private String itemDescription;

		private String itemName;

		private String level;

		private String sceneDescription;

		private String sceneName;

		private Integer time;

		private List<CheckListItem> checkList;

		public String getHealthId() {
			return this.healthId;
		}

		public void setHealthId(String healthId) {
			this.healthId = healthId;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getItemDescription() {
			return this.itemDescription;
		}

		public void setItemDescription(String itemDescription) {
			this.itemDescription = itemDescription;
		}

		public String getItemName() {
			return this.itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getSceneDescription() {
			return this.sceneDescription;
		}

		public void setSceneDescription(String sceneDescription) {
			this.sceneDescription = sceneDescription;
		}

		public String getSceneName() {
			return this.sceneName;
		}

		public void setSceneName(String sceneName) {
			this.sceneName = sceneName;
		}

		public Integer getTime() {
			return this.time;
		}

		public void setTime(Integer time) {
			this.time = time;
		}

		public List<CheckListItem> getCheckList() {
			return this.checkList;
		}

		public void setCheckList(List<CheckListItem> checkList) {
			this.checkList = checkList;
		}

		public static class CheckListItem {

			private String checkDescription;

			private String checkInfo;

			private String checkName;

			private String checkSolution;

			public String getCheckDescription() {
				return this.checkDescription;
			}

			public void setCheckDescription(String checkDescription) {
				this.checkDescription = checkDescription;
			}

			public String getCheckInfo() {
				return this.checkInfo;
			}

			public void setCheckInfo(String checkInfo) {
				this.checkInfo = checkInfo;
			}

			public String getCheckName() {
				return this.checkName;
			}

			public void setCheckName(String checkName) {
				this.checkName = checkName;
			}

			public String getCheckSolution() {
				return this.checkSolution;
			}

			public void setCheckSolution(String checkSolution) {
				this.checkSolution = checkSolution;
			}
		}
	}

	@Override
	public GetHealthMonitorLogsResponse getInstance(UnmarshallerContext context) {
		return	GetHealthMonitorLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
