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

package com.aliyuncs.das.model.v20200116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.DescribeTopBigKeysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTopBigKeysResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private String success;

	private List<BigKey> data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<BigKey> getData() {
		return this.data;
	}

	public void setData(List<BigKey> data) {
		this.data = data;
	}

	public static class BigKey {

		private String keyType;

		private Long size;

		private String nodeId;

		private Integer db;

		private String key;

		public String getKeyType() {
			return this.keyType;
		}

		public void setKeyType(String keyType) {
			this.keyType = keyType;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public Integer getDb() {
			return this.db;
		}

		public void setDb(Integer db) {
			this.db = db;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public DescribeTopBigKeysResponse getInstance(UnmarshallerContext context) {
		return	DescribeTopBigKeysResponseUnmarshaller.unmarshall(this, context);
	}
}
