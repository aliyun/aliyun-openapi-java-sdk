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

package com.aliyuncs.pts.model.v20190810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20190810.ListReceiversResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListReceiversResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Boolean success;

	private List<Receiver> receivers;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Receiver> getReceivers() {
		return this.receivers;
	}

	public void setReceivers(List<Receiver> receivers) {
		this.receivers = receivers;
	}

	public static class Receiver {

		private String id;

		private String name;

		private String emailCheckCode;

		private String mobileCheckCode;

		private String dingTalk;

		private String mobile;

		private String source;

		private Integer deleted;

		private String email;

		private String wangwang;

		private String uid;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmailCheckCode() {
			return this.emailCheckCode;
		}

		public void setEmailCheckCode(String emailCheckCode) {
			this.emailCheckCode = emailCheckCode;
		}

		public String getMobileCheckCode() {
			return this.mobileCheckCode;
		}

		public void setMobileCheckCode(String mobileCheckCode) {
			this.mobileCheckCode = mobileCheckCode;
		}

		public String getDingTalk() {
			return this.dingTalk;
		}

		public void setDingTalk(String dingTalk) {
			this.dingTalk = dingTalk;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public Integer getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Integer deleted) {
			this.deleted = deleted;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getWangwang() {
			return this.wangwang;
		}

		public void setWangwang(String wangwang) {
			this.wangwang = wangwang;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}
	}

	@Override
	public ListReceiversResponse getInstance(UnmarshallerContext context) {
		return	ListReceiversResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
