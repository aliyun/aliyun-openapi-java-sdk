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

package com.aliyuncs.dyplsapi.model.v20170525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyplsapi.transform.v20170525.BindBatchAxgResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BindBatchAxgResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<SecretBind> secretBindList;

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

	public List<SecretBind> getSecretBindList() {
		return this.secretBindList;
	}

	public void setSecretBindList(List<SecretBind> secretBindList) {
		this.secretBindList = secretBindList;
	}

	public static class SecretBind {

		private String secretNo;

		private String subsId;

		private String extension;

		private String groupId;

		private String phoneNoA;

		private String code;

		private String message;

		public String getSecretNo() {
			return this.secretNo;
		}

		public void setSecretNo(String secretNo) {
			this.secretNo = secretNo;
		}

		public String getSubsId() {
			return this.subsId;
		}

		public void setSubsId(String subsId) {
			this.subsId = subsId;
		}

		public String getExtension() {
			return this.extension;
		}

		public void setExtension(String extension) {
			this.extension = extension;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getPhoneNoA() {
			return this.phoneNoA;
		}

		public void setPhoneNoA(String phoneNoA) {
			this.phoneNoA = phoneNoA;
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
	}

	@Override
	public BindBatchAxgResponse getInstance(UnmarshallerContext context) {
		return	BindBatchAxgResponseUnmarshaller.unmarshall(this, context);
	}
}
