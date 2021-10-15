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
import com.aliyuncs.linkedmall.transform.v20180116.GetActivityGameInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetActivityGameInfoResponse extends AcsResponse {

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

		private String userProcessDTO;

		private String gameDTO;

		private String userGameCoinInfos;

		private String extInfo;

		public String getUserProcessDTO() {
			return this.userProcessDTO;
		}

		public void setUserProcessDTO(String userProcessDTO) {
			this.userProcessDTO = userProcessDTO;
		}

		public String getGameDTO() {
			return this.gameDTO;
		}

		public void setGameDTO(String gameDTO) {
			this.gameDTO = gameDTO;
		}

		public String getUserGameCoinInfos() {
			return this.userGameCoinInfos;
		}

		public void setUserGameCoinInfos(String userGameCoinInfos) {
			this.userGameCoinInfos = userGameCoinInfos;
		}

		public String getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(String extInfo) {
			this.extInfo = extInfo;
		}
	}

	@Override
	public GetActivityGameInfoResponse getInstance(UnmarshallerContext context) {
		return	GetActivityGameInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
