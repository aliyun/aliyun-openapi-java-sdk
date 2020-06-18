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

package com.aliyuncs.aliyuncvc.model.v20190919;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aliyuncvc.transform.v20190919.QueryUserInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryUserInfoResponse extends AcsResponse {

	private Integer errorCode;

	private String message;

	private Boolean success;

	private String requestId;

	private UserInfo userInfo;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public static class UserInfo {

		private Integer curNum;

		private Integer memberConcurrentMax;

		private Integer maxNum;

		public Integer getCurNum() {
			return this.curNum;
		}

		public void setCurNum(Integer curNum) {
			this.curNum = curNum;
		}

		public Integer getMemberConcurrentMax() {
			return this.memberConcurrentMax;
		}

		public void setMemberConcurrentMax(Integer memberConcurrentMax) {
			this.memberConcurrentMax = memberConcurrentMax;
		}

		public Integer getMaxNum() {
			return this.maxNum;
		}

		public void setMaxNum(Integer maxNum) {
			this.maxNum = maxNum;
		}
	}

	@Override
	public QueryUserInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryUserInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
