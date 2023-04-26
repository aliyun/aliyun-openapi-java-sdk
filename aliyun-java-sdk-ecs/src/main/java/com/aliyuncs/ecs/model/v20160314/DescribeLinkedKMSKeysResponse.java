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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeLinkedKMSKeysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLinkedKMSKeysResponse extends AcsResponse {

	private String requestId;

	private List<KMSKey> kMSKeys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<KMSKey> getKMSKeys() {
		return this.kMSKeys;
	}

	public void setKMSKeys(List<KMSKey> kMSKeys) {
		this.kMSKeys = kMSKeys;
	}

	public static class KMSKey {

		private String alias;

		private String kMSKeyId;

		public String getAlias() {
			return this.alias;
		}

		public void setAlias(String alias) {
			this.alias = alias;
		}

		public String getKMSKeyId() {
			return this.kMSKeyId;
		}

		public void setKMSKeyId(String kMSKeyId) {
			this.kMSKeyId = kMSKeyId;
		}
	}

	@Override
	public DescribeLinkedKMSKeysResponse getInstance(UnmarshallerContext context) {
		return	DescribeLinkedKMSKeysResponseUnmarshaller.unmarshall(this, context);
	}
}
