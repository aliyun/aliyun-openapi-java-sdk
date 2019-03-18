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

package com.aliyuncs.cf.model.v20151127;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cf.transform.v20151127.QuerySimpleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySimpleResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String msg;

	private Integer code;

	private CollinadataQueryResult collinadataQueryResult;

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

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public CollinadataQueryResult getCollinadataQueryResult() {
		return this.collinadataQueryResult;
	}

	public void setCollinadataQueryResult(CollinadataQueryResult collinadataQueryResult) {
		this.collinadataQueryResult = collinadataQueryResult;
	}

	public static class CollinadataQueryResult {

		private String score;

		private String detail;

		private String risklevel;

		public String getScore() {
			return this.score;
		}

		public void setScore(String score) {
			this.score = score;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getRisklevel() {
			return this.risklevel;
		}

		public void setRisklevel(String risklevel) {
			this.risklevel = risklevel;
		}
	}

	@Override
	public QuerySimpleResponse getInstance(UnmarshallerContext context) {
		return	QuerySimpleResponseUnmarshaller.unmarshall(this, context);
	}
}
