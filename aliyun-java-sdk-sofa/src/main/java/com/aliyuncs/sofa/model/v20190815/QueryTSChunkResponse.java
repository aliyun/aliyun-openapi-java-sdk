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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryTSChunkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryTSChunkResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long allNum;

		private String chunkData;

		private Long consume;

		private String digest;

		private String executeClient;

		private String executeId;

		private String generateClient;

		private String gmtBegin;

		private String gmtEnd;

		private Long id;

		private String msg;

		private String progress;

		private String shardingRule;

		private String status;

		private Long successNum;

		private String type;

		public Long getAllNum() {
			return this.allNum;
		}

		public void setAllNum(Long allNum) {
			this.allNum = allNum;
		}

		public String getChunkData() {
			return this.chunkData;
		}

		public void setChunkData(String chunkData) {
			this.chunkData = chunkData;
		}

		public Long getConsume() {
			return this.consume;
		}

		public void setConsume(Long consume) {
			this.consume = consume;
		}

		public String getDigest() {
			return this.digest;
		}

		public void setDigest(String digest) {
			this.digest = digest;
		}

		public String getExecuteClient() {
			return this.executeClient;
		}

		public void setExecuteClient(String executeClient) {
			this.executeClient = executeClient;
		}

		public String getExecuteId() {
			return this.executeId;
		}

		public void setExecuteId(String executeId) {
			this.executeId = executeId;
		}

		public String getGenerateClient() {
			return this.generateClient;
		}

		public void setGenerateClient(String generateClient) {
			this.generateClient = generateClient;
		}

		public String getGmtBegin() {
			return this.gmtBegin;
		}

		public void setGmtBegin(String gmtBegin) {
			this.gmtBegin = gmtBegin;
		}

		public String getGmtEnd() {
			return this.gmtEnd;
		}

		public void setGmtEnd(String gmtEnd) {
			this.gmtEnd = gmtEnd;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public String getShardingRule() {
			return this.shardingRule;
		}

		public void setShardingRule(String shardingRule) {
			this.shardingRule = shardingRule;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getSuccessNum() {
			return this.successNum;
		}

		public void setSuccessNum(Long successNum) {
			this.successNum = successNum;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public QueryTSChunkResponse getInstance(UnmarshallerContext context) {
		return	QueryTSChunkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
