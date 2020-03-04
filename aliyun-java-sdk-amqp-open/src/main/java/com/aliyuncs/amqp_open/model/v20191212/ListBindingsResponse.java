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
import com.aliyuncs.amqp_open.transform.v20191212.ListBindingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBindingsResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String nextToken;

		private Integer maxResults;

		private List<BindingDO> bindings;

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public List<BindingDO> getBindings() {
			return this.bindings;
		}

		public void setBindings(List<BindingDO> bindings) {
			this.bindings = bindings;
		}

		public static class BindingDO {

			private String sourceExchange;

			private String destinationName;

			private String bindingType;

			private String bindingKey;

			private String argument;

			public String getSourceExchange() {
				return this.sourceExchange;
			}

			public void setSourceExchange(String sourceExchange) {
				this.sourceExchange = sourceExchange;
			}

			public String getDestinationName() {
				return this.destinationName;
			}

			public void setDestinationName(String destinationName) {
				this.destinationName = destinationName;
			}

			public String getBindingType() {
				return this.bindingType;
			}

			public void setBindingType(String bindingType) {
				this.bindingType = bindingType;
			}

			public String getBindingKey() {
				return this.bindingKey;
			}

			public void setBindingKey(String bindingKey) {
				this.bindingKey = bindingKey;
			}

			public String getArgument() {
				return this.argument;
			}

			public void setArgument(String argument) {
				this.argument = argument;
			}
		}
	}

	@Override
	public ListBindingsResponse getInstance(UnmarshallerContext context) {
		return	ListBindingsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
