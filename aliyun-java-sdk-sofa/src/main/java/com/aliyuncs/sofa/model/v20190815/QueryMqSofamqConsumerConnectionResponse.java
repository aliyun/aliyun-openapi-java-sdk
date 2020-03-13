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
import com.aliyuncs.sofa.transform.v20190815.QueryMqSofamqConsumerConnectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMqSofamqConsumerConnectionResponse extends AcsResponse {

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

		private List<ConnectionListItem> connectionList;

		public List<ConnectionListItem> getConnectionList() {
			return this.connectionList;
		}

		public void setConnectionList(List<ConnectionListItem> connectionList) {
			this.connectionList = connectionList;
		}

		public static class ConnectionListItem {

			private String clientAddr;

			private String clientId;

			private String language;

			private String remoteIp;

			private String version;

			public String getClientAddr() {
				return this.clientAddr;
			}

			public void setClientAddr(String clientAddr) {
				this.clientAddr = clientAddr;
			}

			public String getClientId() {
				return this.clientId;
			}

			public void setClientId(String clientId) {
				this.clientId = clientId;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public String getRemoteIp() {
				return this.remoteIp;
			}

			public void setRemoteIp(String remoteIp) {
				this.remoteIp = remoteIp;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
		}
	}

	@Override
	public QueryMqSofamqConsumerConnectionResponse getInstance(UnmarshallerContext context) {
		return	QueryMqSofamqConsumerConnectionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
