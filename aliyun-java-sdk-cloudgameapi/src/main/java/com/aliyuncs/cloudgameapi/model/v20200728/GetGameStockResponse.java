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

package com.aliyuncs.cloudgameapi.model.v20200728;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudgameapi.transform.v20200728.GetGameStockResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetGameStockResponse extends AcsResponse {

	private String requestId;

	private String gameId;

	private String message;

	private List<DataList> instanceStockList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGameId() {
		return this.gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<DataList> getInstanceStockList() {
		return this.instanceStockList;
	}

	public void setInstanceStockList(List<DataList> instanceStockList) {
		this.instanceStockList = instanceStockList;
	}

	public static class DataList {

		private String instanceId;

		private String reginName;

		private Long userLevel;

		private String instanceSpec;

		private Long availableSlots;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getReginName() {
			return this.reginName;
		}

		public void setReginName(String reginName) {
			this.reginName = reginName;
		}

		public Long getUserLevel() {
			return this.userLevel;
		}

		public void setUserLevel(Long userLevel) {
			this.userLevel = userLevel;
		}

		public String getInstanceSpec() {
			return this.instanceSpec;
		}

		public void setInstanceSpec(String instanceSpec) {
			this.instanceSpec = instanceSpec;
		}

		public Long getAvailableSlots() {
			return this.availableSlots;
		}

		public void setAvailableSlots(Long availableSlots) {
			this.availableSlots = availableSlots;
		}
	}

	@Override
	public GetGameStockResponse getInstance(UnmarshallerContext context) {
		return	GetGameStockResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
