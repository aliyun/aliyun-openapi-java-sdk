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
import com.aliyuncs.elasticsearch.transform.v20170613.UpdateWhiteIpsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateWhiteIpsResponse extends AcsResponse {

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

		private List<String> esIPWhitelist;

		private NetworkConfig networkConfig;

		public List<String> getEsIPWhitelist() {
			return this.esIPWhitelist;
		}

		public void setEsIPWhitelist(List<String> esIPWhitelist) {
			this.esIPWhitelist = esIPWhitelist;
		}

		public NetworkConfig getNetworkConfig() {
			return this.networkConfig;
		}

		public void setNetworkConfig(NetworkConfig networkConfig) {
			this.networkConfig = networkConfig;
		}

		public static class NetworkConfig {

			private List<WhiteIpGroupListItem> whiteIpGroupList;

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
	public UpdateWhiteIpsResponse getInstance(UnmarshallerContext context) {
		return	UpdateWhiteIpsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
