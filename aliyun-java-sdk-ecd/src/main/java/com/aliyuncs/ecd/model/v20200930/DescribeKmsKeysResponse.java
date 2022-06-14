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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeKmsKeysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeKmsKeysResponse extends AcsResponse {

	private String requestId;

	private String kmsServiceStatus;

	private String authorizeStatus;

	private List<Key> keys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getKmsServiceStatus() {
		return this.kmsServiceStatus;
	}

	public void setKmsServiceStatus(String kmsServiceStatus) {
		this.kmsServiceStatus = kmsServiceStatus;
	}

	public String getAuthorizeStatus() {
		return this.authorizeStatus;
	}

	public void setAuthorizeStatus(String authorizeStatus) {
		this.authorizeStatus = authorizeStatus;
	}

	public List<Key> getKeys() {
		return this.keys;
	}

	public void setKeys(List<Key> keys) {
		this.keys = keys;
	}

	public static class Key {

		private String keyId;

		private String arn;

		private String alias;

		private String type;

		public String getKeyId() {
			return this.keyId;
		}

		public void setKeyId(String keyId) {
			this.keyId = keyId;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public DescribeKmsKeysResponse getInstance(UnmarshallerContext context) {
		return	DescribeKmsKeysResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
