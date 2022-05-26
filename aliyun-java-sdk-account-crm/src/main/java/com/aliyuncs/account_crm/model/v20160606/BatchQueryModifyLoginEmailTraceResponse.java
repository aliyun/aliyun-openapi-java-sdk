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

package com.aliyuncs.account_crm.model.v20160606;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.BatchQueryModifyLoginEmailTraceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchQueryModifyLoginEmailTraceResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private List<Trace> traces;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<Trace> getTraces() {
		return this.traces;
	}

	public void setTraces(List<Trace> traces) {
		this.traces = traces;
	}

	public static class Trace {

		private String status;

		private String traceNo;

		private String newLoginEmail;

		private String pk;

		private String oldLoginEmail;

		private String nowLoginEmail;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTraceNo() {
			return this.traceNo;
		}

		public void setTraceNo(String traceNo) {
			this.traceNo = traceNo;
		}

		public String getNewLoginEmail() {
			return this.newLoginEmail;
		}

		public void setNewLoginEmail(String newLoginEmail) {
			this.newLoginEmail = newLoginEmail;
		}

		public String getPk() {
			return this.pk;
		}

		public void setPk(String pk) {
			this.pk = pk;
		}

		public String getOldLoginEmail() {
			return this.oldLoginEmail;
		}

		public void setOldLoginEmail(String oldLoginEmail) {
			this.oldLoginEmail = oldLoginEmail;
		}

		public String getNowLoginEmail() {
			return this.nowLoginEmail;
		}

		public void setNowLoginEmail(String nowLoginEmail) {
			this.nowLoginEmail = nowLoginEmail;
		}
	}

	@Override
	public BatchQueryModifyLoginEmailTraceResponse getInstance(UnmarshallerContext context) {
		return	BatchQueryModifyLoginEmailTraceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
