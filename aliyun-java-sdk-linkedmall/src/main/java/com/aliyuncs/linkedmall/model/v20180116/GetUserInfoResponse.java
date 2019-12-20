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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.GetUserInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserInfoResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private LoginResult loginResult;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LoginResult getLoginResult() {
		return this.loginResult;
	}

	public void setLoginResult(LoginResult loginResult) {
		this.loginResult = loginResult;
	}

	public static class LoginResult {

		private Long lmUserId;

		private String bizId;

		private String bizUid;

		private String bizUserName;

		private String returnUrl;

		private Map<Object,Object> extInfo;

		private List<String> subBizId;

		public Long getLmUserId() {
			return this.lmUserId;
		}

		public void setLmUserId(Long lmUserId) {
			this.lmUserId = lmUserId;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getBizUid() {
			return this.bizUid;
		}

		public void setBizUid(String bizUid) {
			this.bizUid = bizUid;
		}

		public String getBizUserName() {
			return this.bizUserName;
		}

		public void setBizUserName(String bizUserName) {
			this.bizUserName = bizUserName;
		}

		public String getReturnUrl() {
			return this.returnUrl;
		}

		public void setReturnUrl(String returnUrl) {
			this.returnUrl = returnUrl;
		}

		public Map<Object,Object> getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(Map<Object,Object> extInfo) {
			this.extInfo = extInfo;
		}

		public List<String> getSubBizId() {
			return this.subBizId;
		}

		public void setSubBizId(List<String> subBizId) {
			this.subBizId = subBizId;
		}
	}

	@Override
	public GetUserInfoResponse getInstance(UnmarshallerContext context) {
		return	GetUserInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
