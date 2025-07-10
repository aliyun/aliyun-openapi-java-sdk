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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.ListSecretsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSecretsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String status;

	private Long count;

	private List<SecretsItem> secrets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public List<SecretsItem> getSecrets() {
		return this.secrets;
	}

	public void setSecrets(List<SecretsItem> secrets) {
		this.secrets = secrets;
	}

	public static class SecretsItem {

		private String accountId;

		private String regionId;

		private String dBInstanceId;

		private String secretName;

		private String secretArn;

		private String description;

		private String username;

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getSecretName() {
			return this.secretName;
		}

		public void setSecretName(String secretName) {
			this.secretName = secretName;
		}

		public String getSecretArn() {
			return this.secretArn;
		}

		public void setSecretArn(String secretArn) {
			this.secretArn = secretArn;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}
	}

	@Override
	public ListSecretsResponse getInstance(UnmarshallerContext context) {
		return	ListSecretsResponseUnmarshaller.unmarshall(this, context);
	}
}
