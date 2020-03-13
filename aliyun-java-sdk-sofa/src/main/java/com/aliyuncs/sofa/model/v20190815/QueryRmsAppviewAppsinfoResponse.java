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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryRmsAppviewAppsinfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsAppviewAppsinfoResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Response response;

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

	public Response getResponse() {
		return this.response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public static class Response {

		private Entity entity;

		public Entity getEntity() {
			return this.entity;
		}

		public void setEntity(Entity entity) {
			this.entity = entity;
		}

		public static class Entity {

			private List<DataItem> data;

			public List<DataItem> getData() {
				return this.data;
			}

			public void setData(List<DataItem> data) {
				this.data = data;
			}

			public static class DataItem {

				private String id;

				private String name;

				private String utcCreated;

				private String utcModified;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getUtcCreated() {
					return this.utcCreated;
				}

				public void setUtcCreated(String utcCreated) {
					this.utcCreated = utcCreated;
				}

				public String getUtcModified() {
					return this.utcModified;
				}

				public void setUtcModified(String utcModified) {
					this.utcModified = utcModified;
				}
			}
		}
	}

	@Override
	public QueryRmsAppviewAppsinfoResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsAppviewAppsinfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
