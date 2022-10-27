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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.UpdateKibanaWhiteIpsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateKibanaWhiteIpsResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<String> kibanaPrivateIPWhitelist;

		private List<String> kibanaIPWhitelist;

		private NetworkConfig networkConfig;

		public List<String> getKibanaPrivateIPWhitelist() {
			return this.kibanaPrivateIPWhitelist;
		}

		public void setKibanaPrivateIPWhitelist(List<String> kibanaPrivateIPWhitelist) {
			this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
		}

		public List<String> getKibanaIPWhitelist() {
			return this.kibanaIPWhitelist;
		}

		public void setKibanaIPWhitelist(List<String> kibanaIPWhitelist) {
			this.kibanaIPWhitelist = kibanaIPWhitelist;
		}

		public NetworkConfig getNetworkConfig() {
			return this.networkConfig;
		}

		public void setNetworkConfig(NetworkConfig networkConfig) {
			this.networkConfig = networkConfig;
		}

		public static class NetworkConfig {

			private String vpcId;

			private String vswitchId;

			private String vsArea;

			private String type;

			private List<WhiteIpGroupListItem> whiteIpGroupList;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVswitchId() {
				return this.vswitchId;
			}

			public void setVswitchId(String vswitchId) {
				this.vswitchId = vswitchId;
			}

			public String getVsArea() {
				return this.vsArea;
			}

			public void setVsArea(String vsArea) {
				this.vsArea = vsArea;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<WhiteIpGroupListItem> getWhiteIpGroupList() {
				return this.whiteIpGroupList;
			}

			public void setWhiteIpGroupList(List<WhiteIpGroupListItem> whiteIpGroupList) {
				this.whiteIpGroupList = whiteIpGroupList;
			}

			public static class WhiteIpGroupListItem {

				private String groupName;

				private String whiteIpType;

				private List<String> ips;

				public String getGroupName() {
					return this.groupName;
				}

				public void setGroupName(String groupName) {
					this.groupName = groupName;
				}

				public String getWhiteIpType() {
					return this.whiteIpType;
				}

				public void setWhiteIpType(String whiteIpType) {
					this.whiteIpType = whiteIpType;
				}

				public List<String> getIps() {
					return this.ips;
				}

				public void setIps(List<String> ips) {
					this.ips = ips;
				}
			}
		}
	}

	@Override
	public UpdateKibanaWhiteIpsResponse getInstance(UnmarshallerContext context) {
		return	UpdateKibanaWhiteIpsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
