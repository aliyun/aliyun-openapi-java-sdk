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

package com.aliyuncs.itag.model.v20210517;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.itag.transform.v20210517.QuerySkipUserSubTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySkipUserSubTaskResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String errInfo;

	private String msg;

	private Boolean succ;

	private String errorCode;

	private Result result;

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

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long maxSkipCount;

		private Long skipedCount;

		private Long leftSkipCount;

		public Long getMaxSkipCount() {
			return this.maxSkipCount;
		}

		public void setMaxSkipCount(Long maxSkipCount) {
			this.maxSkipCount = maxSkipCount;
		}

		public Long getSkipedCount() {
			return this.skipedCount;
		}

		public void setSkipedCount(Long skipedCount) {
			this.skipedCount = skipedCount;
		}

		public Long getLeftSkipCount() {
			return this.leftSkipCount;
		}

		public void setLeftSkipCount(Long leftSkipCount) {
			this.leftSkipCount = leftSkipCount;
		}
	}

	@Override
	public QuerySkipUserSubTaskResponse getInstance(UnmarshallerContext context) {
		return	QuerySkipUserSubTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
