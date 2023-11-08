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

package com.aliyuncs.amqp_open.model.v20191212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.amqp_open.transform.v20191212.ListDownStreamBindingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDownStreamBindingsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer maxResults;

		private String nextToken;

		private List<BindingVO> bindings;

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public List<BindingVO> getBindings() {
			return this.bindings;
		}

		public void setBindings(List<BindingVO> bindings) {
			this.bindings = bindings;
		}

		public static class BindingVO {

			private String sourceExchange;

			private String argument;

			private String bindingKey;

			private String bindingType;

			private String destinationName;

			public String getSourceExchange() {
				return this.sourceExchange;
			}

			public void setSourceExchange(String sourceExchange) {
				this.sourceExchange = sourceExchange;
			}

			public String getArgument() {
				return this.argument;
			}

			public void setArgument(String argument) {
				this.argument = argument;
			}

			public String getBindingKey() {
				return this.bindingKey;
			}

			public void setBindingKey(String bindingKey) {
				this.bindingKey = bindingKey;
			}

			public String getBindingType() {
				return this.bindingType;
			}

			public void setBindingType(String bindingType) {
				this.bindingType = bindingType;
			}

			public String getDestinationName() {
				return this.destinationName;
			}

			public void setDestinationName(String destinationName) {
				this.destinationName = destinationName;
			}
		}
	}

	@Override
	public ListDownStreamBindingsResponse getInstance(UnmarshallerContext context) {
		return	ListDownStreamBindingsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
