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

package com.aliyuncs.brinekingdom.model.v20190627;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.brinekingdom.transform.v20190627.QueryAzoneByNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAzoneByNameResponse extends AcsResponse {

	private String _class;

	private String errorMessage;

	private Boolean success;

	private String resultCode;

	private String requestId;

	private Result result;

	public String get_Class() {
		return this._class;
	}

	public void set_Class(String _class) {
		this._class = _class;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

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

		private String azAlias;

		private String azCnName;

		private Long azId;

		private String azName;

		private String cityCnName;

		private String cityEnName;

		private String _class;

		private String cnStatus;

		private String creator;

		private String creatorNic;

		private String enStatus;

		private Long lastUpdate;

		private String modifier;

		private String modifierNic;

		private String roomCode;

		private String roomName;

		public String getAzAlias() {
			return this.azAlias;
		}

		public void setAzAlias(String azAlias) {
			this.azAlias = azAlias;
		}

		public String getAzCnName() {
			return this.azCnName;
		}

		public void setAzCnName(String azCnName) {
			this.azCnName = azCnName;
		}

		public Long getAzId() {
			return this.azId;
		}

		public void setAzId(Long azId) {
			this.azId = azId;
		}

		public String getAzName() {
			return this.azName;
		}

		public void setAzName(String azName) {
			this.azName = azName;
		}

		public String getCityCnName() {
			return this.cityCnName;
		}

		public void setCityCnName(String cityCnName) {
			this.cityCnName = cityCnName;
		}

		public String getCityEnName() {
			return this.cityEnName;
		}

		public void setCityEnName(String cityEnName) {
			this.cityEnName = cityEnName;
		}

		public String get_Class() {
			return this._class;
		}

		public void set_Class(String _class) {
			this._class = _class;
		}

		public String getCnStatus() {
			return this.cnStatus;
		}

		public void setCnStatus(String cnStatus) {
			this.cnStatus = cnStatus;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getCreatorNic() {
			return this.creatorNic;
		}

		public void setCreatorNic(String creatorNic) {
			this.creatorNic = creatorNic;
		}

		public String getEnStatus() {
			return this.enStatus;
		}

		public void setEnStatus(String enStatus) {
			this.enStatus = enStatus;
		}

		public Long getLastUpdate() {
			return this.lastUpdate;
		}

		public void setLastUpdate(Long lastUpdate) {
			this.lastUpdate = lastUpdate;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public String getModifierNic() {
			return this.modifierNic;
		}

		public void setModifierNic(String modifierNic) {
			this.modifierNic = modifierNic;
		}

		public String getRoomCode() {
			return this.roomCode;
		}

		public void setRoomCode(String roomCode) {
			this.roomCode = roomCode;
		}

		public String getRoomName() {
			return this.roomName;
		}

		public void setRoomName(String roomName) {
			this.roomName = roomName;
		}
	}

	@Override
	public QueryAzoneByNameResponse getInstance(UnmarshallerContext context) {
		return	QueryAzoneByNameResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
