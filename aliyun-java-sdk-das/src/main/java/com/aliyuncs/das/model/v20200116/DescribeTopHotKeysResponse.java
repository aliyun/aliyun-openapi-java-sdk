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
import com.aliyuncs.das.transform.v20200116.DescribeTopHotKeysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTopHotKeysResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private String success;

	private List<HotKey> data;

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

	public List<HotKey> getData() {
		return this.data;
	}

	public void setData(List<HotKey> data) {
		this.data = data;
	}

	public static class HotKey {

		private String keyType;

		private String nodeId;

		private Integer lfu;

		private String hot;

		private String key;

		private Integer db;

		public String getKeyType() {
			return this.keyType;
		}

		public void setKeyType(String keyType) {
			this.keyType = keyType;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public Integer getLfu() {
			return this.lfu;
		}

		public void setLfu(Integer lfu) {
			this.lfu = lfu;
		}

		public String getHot() {
			return this.hot;
		}

		public void setHot(String hot) {
			this.hot = hot;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public Integer getDb() {
			return this.db;
		}

		public void setDb(Integer db) {
			this.db = db;
		}
	}

	@Override
	public DescribeTopHotKeysResponse getInstance(UnmarshallerContext context) {
		return	DescribeTopHotKeysResponseUnmarshaller.unmarshall(this, context);
	}
}
