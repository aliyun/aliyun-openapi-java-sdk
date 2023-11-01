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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.DoQuickFieldResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DoQuickFieldResponse extends AcsResponse {

	private Boolean success;

	private Integer code;

	private String message;

	private String errCode;

	private String requestId;

	private String dyCode;

	private String dyMessage;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDyCode() {
		return this.dyCode;
	}

	public void setDyCode(String dyCode) {
		this.dyCode = dyCode;
	}

	public String getDyMessage() {
		return this.dyMessage;
	}

	public void setDyMessage(String dyMessage) {
		this.dyMessage = dyMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer queryMode;

		private Long limited;

		private Integer count;

		private Boolean hasSQL;

		private String whereQuery;

		private String pQuery;

		private Long processedRows;

		private Boolean completeOrNot;

		private String aggQueryd;

		private List<String> keys;

		private List<String> logs;

		public Integer getQueryMode() {
			return this.queryMode;
		}

		public void setQueryMode(Integer queryMode) {
			this.queryMode = queryMode;
		}

		public Long getLimited() {
			return this.limited;
		}

		public void setLimited(Long limited) {
			this.limited = limited;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Boolean getHasSQL() {
			return this.hasSQL;
		}

		public void setHasSQL(Boolean hasSQL) {
			this.hasSQL = hasSQL;
		}

		public String getWhereQuery() {
			return this.whereQuery;
		}

		public void setWhereQuery(String whereQuery) {
			this.whereQuery = whereQuery;
		}

		public String getPQuery() {
			return this.pQuery;
		}

		public void setPQuery(String pQuery) {
			this.pQuery = pQuery;
		}

		public Long getProcessedRows() {
			return this.processedRows;
		}

		public void setProcessedRows(Long processedRows) {
			this.processedRows = processedRows;
		}

		public Boolean getCompleteOrNot() {
			return this.completeOrNot;
		}

		public void setCompleteOrNot(Boolean completeOrNot) {
			this.completeOrNot = completeOrNot;
		}

		public String getAggQueryd() {
			return this.aggQueryd;
		}

		public void setAggQueryd(String aggQueryd) {
			this.aggQueryd = aggQueryd;
		}

		public List<String> getKeys() {
			return this.keys;
		}

		public void setKeys(List<String> keys) {
			this.keys = keys;
		}

		public List<String> getLogs() {
			return this.logs;
		}

		public void setLogs(List<String> logs) {
			this.logs = logs;
		}
	}

	@Override
	public DoQuickFieldResponse getInstance(UnmarshallerContext context) {
		return	DoQuickFieldResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
