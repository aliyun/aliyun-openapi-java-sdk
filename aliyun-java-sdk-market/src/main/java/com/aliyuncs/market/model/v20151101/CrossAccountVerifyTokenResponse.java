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

package com.aliyuncs.market.model.v20151101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.CrossAccountVerifyTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CrossAccountVerifyTokenResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Result result;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

		private String name;

		private String uid;

		private Long authTime;

		private List<String> authRoles;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public Long getAuthTime() {
			return this.authTime;
		}

		public void setAuthTime(Long authTime) {
			this.authTime = authTime;
		}

		public List<String> getAuthRoles() {
			return this.authRoles;
		}

		public void setAuthRoles(List<String> authRoles) {
			this.authRoles = authRoles;
		}
	}

	@Override
	public CrossAccountVerifyTokenResponse getInstance(UnmarshallerContext context) {
		return	CrossAccountVerifyTokenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
