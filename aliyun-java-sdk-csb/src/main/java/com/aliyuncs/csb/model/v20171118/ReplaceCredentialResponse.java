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

package com.aliyuncs.csb.model.v20171118;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.csb.transform.v20171118.ReplaceCredentialResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ReplaceCredentialResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Credentials credentials;

		public Credentials getCredentials() {
			return this.credentials;
		}

		public void setCredentials(Credentials credentials) {
			this.credentials = credentials;
		}

		public static class Credentials {

			private Long gmtCreate;

			private Long id;

			private String name;

			private String userId;

			private CurrentCredential currentCredential;

			private NewCredential newCredential;

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public CurrentCredential getCurrentCredential() {
				return this.currentCredential;
			}

			public void setCurrentCredential(CurrentCredential currentCredential) {
				this.currentCredential = currentCredential;
			}

			public NewCredential getNewCredential() {
				return this.newCredential;
			}

			public void setNewCredential(NewCredential newCredential) {
				this.newCredential = newCredential;
			}

			public static class CurrentCredential {

				private String accessKey;

				private String secretKey;

				public String getAccessKey() {
					return this.accessKey;
				}

				public void setAccessKey(String accessKey) {
					this.accessKey = accessKey;
				}

				public String getSecretKey() {
					return this.secretKey;
				}

				public void setSecretKey(String secretKey) {
					this.secretKey = secretKey;
				}
			}

			public static class NewCredential {

				private String accessKey;

				private String secretKey;

				public String getAccessKey() {
					return this.accessKey;
				}

				public void setAccessKey(String accessKey) {
					this.accessKey = accessKey;
				}

				public String getSecretKey() {
					return this.secretKey;
				}

				public void setSecretKey(String secretKey) {
					this.secretKey = secretKey;
				}
			}
		}
	}

	@Override
	public ReplaceCredentialResponse getInstance(UnmarshallerContext context) {
		return	ReplaceCredentialResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
