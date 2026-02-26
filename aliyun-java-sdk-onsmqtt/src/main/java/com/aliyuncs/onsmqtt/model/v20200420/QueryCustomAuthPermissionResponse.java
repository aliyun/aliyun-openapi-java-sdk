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

package com.aliyuncs.onsmqtt.model.v20200420;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.onsmqtt.transform.v20200420.QueryCustomAuthPermissionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCustomAuthPermissionResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private Boolean success;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String nextToken;

		private List<ResultsItem> results;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public List<ResultsItem> getResults() {
			return this.results;
		}

		public void setResults(List<ResultsItem> results) {
			this.results = results;
		}

		public static class ResultsItem {

			private String identity;

			private String permitAction;

			private String effect;

			private String identityType;

			private String topic;

			public String getIdentity() {
				return this.identity;
			}

			public void setIdentity(String identity) {
				this.identity = identity;
			}

			public String getPermitAction() {
				return this.permitAction;
			}

			public void setPermitAction(String permitAction) {
				this.permitAction = permitAction;
			}

			public String getEffect() {
				return this.effect;
			}

			public void setEffect(String effect) {
				this.effect = effect;
			}

			public String getIdentityType() {
				return this.identityType;
			}

			public void setIdentityType(String identityType) {
				this.identityType = identityType;
			}

			public String getTopic() {
				return this.topic;
			}

			public void setTopic(String topic) {
				this.topic = topic;
			}
		}
	}

	@Override
	public QueryCustomAuthPermissionResponse getInstance(UnmarshallerContext context) {
		return	QueryCustomAuthPermissionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
