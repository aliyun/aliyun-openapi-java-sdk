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

package com.aliyuncs.clickhouse.model.v20191111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.clickhouse.transform.v20191111.DescribeLogStoreKeysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogStoreKeysResponse extends AcsResponse {

	private String requestId;

	private List<String> logStoreKeys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getLogStoreKeys() {
		return this.logStoreKeys;
	}

	public void setLogStoreKeys(List<String> logStoreKeys) {
		this.logStoreKeys = logStoreKeys;
	}

	@Override
	public DescribeLogStoreKeysResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogStoreKeysResponseUnmarshaller.unmarshall(this, context);
	}
}
