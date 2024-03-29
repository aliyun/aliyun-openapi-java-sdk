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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dyplsapi.transform.v20170525.BindAxnResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BindAxnResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private SecretBindDTO secretBindDTO;

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

	public SecretBindDTO getSecretBindDTO() {
		return this.secretBindDTO;
	}

	public void setSecretBindDTO(SecretBindDTO secretBindDTO) {
		this.secretBindDTO = secretBindDTO;
	}

	public static class SecretBindDTO {

		private String extension;

		private String subsId;

		private String secretNo;

		public String getExtension() {
			return this.extension;
		}

		public void setExtension(String extension) {
			this.extension = extension;
		}

		public String getSubsId() {
			return this.subsId;
		}

		public void setSubsId(String subsId) {
			this.subsId = subsId;
		}

		public String getSecretNo() {
			return this.secretNo;
		}

		public void setSecretNo(String secretNo) {
			this.secretNo = secretNo;
		}
	}

	@Override
	public BindAxnResponse getInstance(UnmarshallerContext context) {
		return	BindAxnResponseUnmarshaller.unmarshall(this, context);
	}
}
