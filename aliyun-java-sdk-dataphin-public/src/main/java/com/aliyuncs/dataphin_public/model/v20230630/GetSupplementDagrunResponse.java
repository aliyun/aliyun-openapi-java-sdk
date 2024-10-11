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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetSupplementDagrunResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSupplementDagrunResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<DagrunInfo> dagrunList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public List<DagrunInfo> getDagrunList() {
		return this.dagrunList;
	}

	public void setDagrunList(List<DagrunInfo> dagrunList) {
		this.dagrunList = dagrunList;
	}

	public static class DagrunInfo {

		private String id;

		private String bizDate;

		private String status;

		private Long startExecuteTime;

		private Long endExecuteTime;

		private String supplementId;

		private String duration;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getBizDate() {
			return this.bizDate;
		}

		public void setBizDate(String bizDate) {
			this.bizDate = bizDate;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getStartExecuteTime() {
			return this.startExecuteTime;
		}

		public void setStartExecuteTime(Long startExecuteTime) {
			this.startExecuteTime = startExecuteTime;
		}

		public Long getEndExecuteTime() {
			return this.endExecuteTime;
		}

		public void setEndExecuteTime(Long endExecuteTime) {
			this.endExecuteTime = endExecuteTime;
		}

		public String getSupplementId() {
			return this.supplementId;
		}

		public void setSupplementId(String supplementId) {
			this.supplementId = supplementId;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}
	}

	@Override
	public GetSupplementDagrunResponse getInstance(UnmarshallerContext context) {
		return	GetSupplementDagrunResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
