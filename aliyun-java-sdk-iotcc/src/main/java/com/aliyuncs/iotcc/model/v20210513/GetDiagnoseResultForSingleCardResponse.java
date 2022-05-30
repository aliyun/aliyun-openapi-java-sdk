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

package com.aliyuncs.iotcc.model.v20210513;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotcc.transform.v20210513.GetDiagnoseResultForSingleCardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDiagnoseResultForSingleCardResponse extends AcsResponse {

	private String requestId;

	private String ioTCloudConnectorId;

	private String cardIp;

	private String iccId;

	private String destination;

	private Long beginTime;

	private Long endTime;

	private String status;

	private List<DiagnoseResult> errorResult;

	private List<DiagnoseItemItem> diagnoseItem;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getIoTCloudConnectorId() {
		return this.ioTCloudConnectorId;
	}

	public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
		this.ioTCloudConnectorId = ioTCloudConnectorId;
	}

	public String getCardIp() {
		return this.cardIp;
	}

	public void setCardIp(String cardIp) {
		this.cardIp = cardIp;
	}

	public String getIccId() {
		return this.iccId;
	}

	public void setIccId(String iccId) {
		this.iccId = iccId;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<DiagnoseResult> getErrorResult() {
		return this.errorResult;
	}

	public void setErrorResult(List<DiagnoseResult> errorResult) {
		this.errorResult = errorResult;
	}

	public List<DiagnoseItemItem> getDiagnoseItem() {
		return this.diagnoseItem;
	}

	public void setDiagnoseItem(List<DiagnoseItemItem> diagnoseItem) {
		this.diagnoseItem = diagnoseItem;
	}

	public static class DiagnoseResult {

		private String errorLevel;

		private String errorPart;

		private String errorDesc;

		private String errorSuggestion;

		public String getErrorLevel() {
			return this.errorLevel;
		}

		public void setErrorLevel(String errorLevel) {
			this.errorLevel = errorLevel;
		}

		public String getErrorPart() {
			return this.errorPart;
		}

		public void setErrorPart(String errorPart) {
			this.errorPart = errorPart;
		}

		public String getErrorDesc() {
			return this.errorDesc;
		}

		public void setErrorDesc(String errorDesc) {
			this.errorDesc = errorDesc;
		}

		public String getErrorSuggestion() {
			return this.errorSuggestion;
		}

		public void setErrorSuggestion(String errorSuggestion) {
			this.errorSuggestion = errorSuggestion;
		}
	}

	public static class DiagnoseItemItem {

		private String part;

		private String status;

		public String getPart() {
			return this.part;
		}

		public void setPart(String part) {
			this.part = part;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public GetDiagnoseResultForSingleCardResponse getInstance(UnmarshallerContext context) {
		return	GetDiagnoseResultForSingleCardResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
