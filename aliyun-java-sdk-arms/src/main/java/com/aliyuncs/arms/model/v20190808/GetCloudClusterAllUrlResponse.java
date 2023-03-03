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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetCloudClusterAllUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCloudClusterAllUrlResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String productCode;

		private String region;

		private RemoteUrl remoteUrl;

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public RemoteUrl getRemoteUrl() {
			return this.remoteUrl;
		}

		public void setRemoteUrl(RemoteUrl remoteUrl) {
			this.remoteUrl = remoteUrl;
		}

		public static class RemoteUrl {

			private String remoteWriteUrl;

			private String internetRemoteWriteUrl;

			private String remoteReadUrl;

			private String internetRemoteReadUrl;

			private String grafanaUrl;

			private String internetGrafanaUrl;

			private String internetPushGatewayUrl;

			private String pushGatewayUrl;

			private Boolean authToken;

			private String token;

			public String getRemoteWriteUrl() {
				return this.remoteWriteUrl;
			}

			public void setRemoteWriteUrl(String remoteWriteUrl) {
				this.remoteWriteUrl = remoteWriteUrl;
			}

			public String getInternetRemoteWriteUrl() {
				return this.internetRemoteWriteUrl;
			}

			public void setInternetRemoteWriteUrl(String internetRemoteWriteUrl) {
				this.internetRemoteWriteUrl = internetRemoteWriteUrl;
			}

			public String getRemoteReadUrl() {
				return this.remoteReadUrl;
			}

			public void setRemoteReadUrl(String remoteReadUrl) {
				this.remoteReadUrl = remoteReadUrl;
			}

			public String getInternetRemoteReadUrl() {
				return this.internetRemoteReadUrl;
			}

			public void setInternetRemoteReadUrl(String internetRemoteReadUrl) {
				this.internetRemoteReadUrl = internetRemoteReadUrl;
			}

			public String getGrafanaUrl() {
				return this.grafanaUrl;
			}

			public void setGrafanaUrl(String grafanaUrl) {
				this.grafanaUrl = grafanaUrl;
			}

			public String getInternetGrafanaUrl() {
				return this.internetGrafanaUrl;
			}

			public void setInternetGrafanaUrl(String internetGrafanaUrl) {
				this.internetGrafanaUrl = internetGrafanaUrl;
			}

			public String getInternetPushGatewayUrl() {
				return this.internetPushGatewayUrl;
			}

			public void setInternetPushGatewayUrl(String internetPushGatewayUrl) {
				this.internetPushGatewayUrl = internetPushGatewayUrl;
			}

			public String getPushGatewayUrl() {
				return this.pushGatewayUrl;
			}

			public void setPushGatewayUrl(String pushGatewayUrl) {
				this.pushGatewayUrl = pushGatewayUrl;
			}

			public Boolean getAuthToken() {
				return this.authToken;
			}

			public void setAuthToken(Boolean authToken) {
				this.authToken = authToken;
			}

			public String getToken() {
				return this.token;
			}

			public void setToken(String token) {
				this.token = token;
			}
		}
	}

	@Override
	public GetCloudClusterAllUrlResponse getInstance(UnmarshallerContext context) {
		return	GetCloudClusterAllUrlResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
