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

package com.aliyuncs.ons.model.v20180516;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20180516.OnsConsumerGetConnectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsConsumerGetConnectionResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ConnectionDo> connectionList;

		public List<ConnectionDo> getConnectionList() {
			return this.connectionList;
		}

		public void setConnectionList(List<ConnectionDo> connectionList) {
			this.connectionList = connectionList;
		}

		public static class ConnectionDo {

			private String clientId;

			private String clientAddr;

			private String language;

			private String version;

			public String getClientId() {
				return this.clientId;
			}

			public void setClientId(String clientId) {
				this.clientId = clientId;
			}

			public String getClientAddr() {
				return this.clientAddr;
			}

			public void setClientAddr(String clientAddr) {
				this.clientAddr = clientAddr;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public String getBizVersion() {
				return this.version;
			}

			public void setBizVersion(String version) {
				this.version = version;
			}

			/**
			 * @deprecated use getBizVersion instead of this.
			 */
			@Deprecated
			public String getVersion() {
				return this.version;
			}

			/**
			 * @deprecated use setBizVersion instead of this.
			 */
			@Deprecated
			public void setVersion(String version) {
				this.version = version;
			}
		}
	}

	@Override
	public OnsConsumerGetConnectionResponse getInstance(UnmarshallerContext context) {
		return	OnsConsumerGetConnectionResponseUnmarshaller.unmarshall(this, context);
	}
}
