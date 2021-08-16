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
import com.aliyuncs.das.transform.v20200116.GetRunningSqlConcurrencyControlRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRunningSqlConcurrencyControlRulesResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
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

		private Long total;

		private List<RunningRules> list;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<RunningRules> getList() {
			return this.list;
		}

		public void setList(List<RunningRules> list) {
			this.list = list;
		}

		public static class RunningRules {

			private Long itemId;

			private String sqlType;

			private String instanceId;

			private String sqlKeywords;

			private Long startTime;

			private String keywordsHash;

			private Long concurrencyControlTime;

			private String userId;

			private String maxConcurrency;

			private String status;

			public Long getItemId() {
				return this.itemId;
			}

			public void setItemId(Long itemId) {
				this.itemId = itemId;
			}

			public String getSqlType() {
				return this.sqlType;
			}

			public void setSqlType(String sqlType) {
				this.sqlType = sqlType;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getSqlKeywords() {
				return this.sqlKeywords;
			}

			public void setSqlKeywords(String sqlKeywords) {
				this.sqlKeywords = sqlKeywords;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getKeywordsHash() {
				return this.keywordsHash;
			}

			public void setKeywordsHash(String keywordsHash) {
				this.keywordsHash = keywordsHash;
			}

			public Long getConcurrencyControlTime() {
				return this.concurrencyControlTime;
			}

			public void setConcurrencyControlTime(Long concurrencyControlTime) {
				this.concurrencyControlTime = concurrencyControlTime;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getMaxConcurrency() {
				return this.maxConcurrency;
			}

			public void setMaxConcurrency(String maxConcurrency) {
				this.maxConcurrency = maxConcurrency;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public GetRunningSqlConcurrencyControlRulesResponse getInstance(UnmarshallerContext context) {
		return	GetRunningSqlConcurrencyControlRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
