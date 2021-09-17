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
import com.aliyuncs.das.transform.v20200116.DescribeHotBigKeysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHotBigKeysResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private String success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String hotKeyMsg;

		private String bigKeyMsg;

		private List<HotKey> hotKeys;

		private List<BigKey> bigKeys;

		public String getHotKeyMsg() {
			return this.hotKeyMsg;
		}

		public void setHotKeyMsg(String hotKeyMsg) {
			this.hotKeyMsg = hotKeyMsg;
		}

		public String getBigKeyMsg() {
			return this.bigKeyMsg;
		}

		public void setBigKeyMsg(String bigKeyMsg) {
			this.bigKeyMsg = bigKeyMsg;
		}

		public List<HotKey> getHotKeys() {
			return this.hotKeys;
		}

		public void setHotKeys(List<HotKey> hotKeys) {
			this.hotKeys = hotKeys;
		}

		public List<BigKey> getBigKeys() {
			return this.bigKeys;
		}

		public void setBigKeys(List<BigKey> bigKeys) {
			this.bigKeys = bigKeys;
		}

		public static class HotKey {

			private String key;

			private Integer db;

			private String hot;

			private String keyType;

			private Integer lfu;

			private String nodeId;

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

			public String getHot() {
				return this.hot;
			}

			public void setHot(String hot) {
				this.hot = hot;
			}

			public String getKeyType() {
				return this.keyType;
			}

			public void setKeyType(String keyType) {
				this.keyType = keyType;
			}

			public Integer getLfu() {
				return this.lfu;
			}

			public void setLfu(Integer lfu) {
				this.lfu = lfu;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}
		}

		public static class BigKey {

			private Integer db;

			private String key;

			private String keyType;

			private Long size;

			private String nodeId;

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
		}
	}

	@Override
	public DescribeHotBigKeysResponse getInstance(UnmarshallerContext context) {
		return	DescribeHotBigKeysResponseUnmarshaller.unmarshall(this, context);
	}
}
