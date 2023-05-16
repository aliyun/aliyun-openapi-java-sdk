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

package com.aliyuncs.agency.model.v20180701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.agency.transform.v20180701.InviteSubAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InviteSubAccountResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<Result> results;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Result> getResults() {
		return this.results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public static class Result {

		private String code;

		private String message;

		private Boolean success;

		private Result1 result1;

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

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public Result1 getResult1() {
			return this.result1;
		}

		public void setResult1(Result1 result1) {
			this.result1 = result1;
		}

		public static class Result1 {

			private String regUrl;

			private Integer days;

			private Long inviteId;

			public String getRegUrl() {
				return this.regUrl;
			}

			public void setRegUrl(String regUrl) {
				this.regUrl = regUrl;
			}

			public Integer getDays() {
				return this.days;
			}

			public void setDays(Integer days) {
				this.days = days;
			}

			public Long getInviteId() {
				return this.inviteId;
			}

			public void setInviteId(Long inviteId) {
				this.inviteId = inviteId;
			}
		}
	}

	@Override
	public InviteSubAccountResponse getInstance(UnmarshallerContext context) {
		return	InviteSubAccountResponseUnmarshaller.unmarshall(this, context);
	}
}
