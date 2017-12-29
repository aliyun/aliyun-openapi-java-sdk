/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.csb.model.v20171118;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.csb.transform.v20171118.CreateCredentialsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateCredentialsResponse extends AcsResponse {

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

			private Long id;

			private CurrentCredential currentCredential;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public CurrentCredential getCurrentCredential() {
				return this.currentCredential;
			}

			public void setCurrentCredential(CurrentCredential currentCredential) {
				this.currentCredential = currentCredential;
			}

			public static class CurrentCredential {

				private String secretKey;

				private String accessKey;

				public String getSecretKey() {
					return this.secretKey;
				}

				public void setSecretKey(String secretKey) {
					this.secretKey = secretKey;
				}

				public String getAccessKey() {
					return this.accessKey;
				}

				public void setAccessKey(String accessKey) {
					this.accessKey = accessKey;
				}
			}
		}
	}

	@Override
	public CreateCredentialsResponse getInstance(UnmarshallerContext context) {
		return	CreateCredentialsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
