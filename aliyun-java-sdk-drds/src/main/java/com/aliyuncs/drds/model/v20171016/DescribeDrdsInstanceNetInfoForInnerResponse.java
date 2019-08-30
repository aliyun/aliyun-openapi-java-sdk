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

package com.aliyuncs.drds.model.v20171016;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20171016.DescribeDrdsInstanceNetInfoForInnerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrdsInstanceNetInfoForInnerResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String drdsInstanceId;

	private String networkType;

	private List<NetInfo> netInfos;

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

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public List<NetInfo> getNetInfos() {
		return this.netInfos;
	}

	public void setNetInfos(List<NetInfo> netInfos) {
		this.netInfos = netInfos;
	}

	public static class NetInfo {

		private String iP;

		private String port;

		private String type;

		private Boolean isForVpc;

		public String getIP() {
			return this.iP;
		}

		public void setIP(String iP) {
			this.iP = iP;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getIsForVpc() {
			return this.isForVpc;
		}

		public void setIsForVpc(Boolean isForVpc) {
			this.isForVpc = isForVpc;
		}
	}

	@Override
	public DescribeDrdsInstanceNetInfoForInnerResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrdsInstanceNetInfoForInnerResponseUnmarshaller.unmarshall(this, context);
	}
}
