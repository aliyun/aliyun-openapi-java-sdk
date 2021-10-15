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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.StartUserGameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartUserGameResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Model model;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private String processId;

		private String gameId;

		private String activityId;

		private String name;

		private String type;

		private String desc;

		private String bizId;

		private String content;

		private String status;

		private String currentStepStatus;

		private String currentStepId;

		private String gameCoinRecords;

		private String gameAwardRecords;

		private String extInfo;

		private String routeId;

		public String getProcessId() {
			return this.processId;
		}

		public void setProcessId(String processId) {
			this.processId = processId;
		}

		public String getGameId() {
			return this.gameId;
		}

		public void setGameId(String gameId) {
			this.gameId = gameId;
		}

		public String getActivityId() {
			return this.activityId;
		}

		public void setActivityId(String activityId) {
			this.activityId = activityId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCurrentStepStatus() {
			return this.currentStepStatus;
		}

		public void setCurrentStepStatus(String currentStepStatus) {
			this.currentStepStatus = currentStepStatus;
		}

		public String getCurrentStepId() {
			return this.currentStepId;
		}

		public void setCurrentStepId(String currentStepId) {
			this.currentStepId = currentStepId;
		}

		public String getGameCoinRecords() {
			return this.gameCoinRecords;
		}

		public void setGameCoinRecords(String gameCoinRecords) {
			this.gameCoinRecords = gameCoinRecords;
		}

		public String getGameAwardRecords() {
			return this.gameAwardRecords;
		}

		public void setGameAwardRecords(String gameAwardRecords) {
			this.gameAwardRecords = gameAwardRecords;
		}

		public String getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(String extInfo) {
			this.extInfo = extInfo;
		}

		public String getRouteId() {
			return this.routeId;
		}

		public void setRouteId(String routeId) {
			this.routeId = routeId;
		}
	}

	@Override
	public StartUserGameResponse getInstance(UnmarshallerContext context) {
		return	StartUserGameResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
