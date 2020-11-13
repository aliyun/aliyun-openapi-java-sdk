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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudgameapi.transform.v20200728.DispatchGameSlotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DispatchGameSlotResponse extends AcsResponse {

	private String requestId;

	private String gameId;

	private String gameSession;

	private Integer queueState;

	private Integer queueCode;

	private String message;

	private String regionName;

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

	public String getGameSession() {
		return this.gameSession;
	}

	public void setGameSession(String gameSession) {
		this.gameSession = gameSession;
	}

	public Integer getQueueState() {
		return this.queueState;
	}

	public void setQueueState(Integer queueState) {
		this.queueState = queueState;
	}

	public Integer getQueueCode() {
		return this.queueCode;
	}

	public void setQueueCode(Integer queueCode) {
		this.queueCode = queueCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Override
	public DispatchGameSlotResponse getInstance(UnmarshallerContext context) {
		return	DispatchGameSlotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
