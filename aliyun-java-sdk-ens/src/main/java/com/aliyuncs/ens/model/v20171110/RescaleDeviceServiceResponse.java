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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.RescaleDeviceServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RescaleDeviceServiceResponse extends AcsResponse {

	private String requestId;

	private List<ResourceDetailInfo> resourceDetailInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResourceDetailInfo> getResourceDetailInfos() {
		return this.resourceDetailInfos;
	}

	public void setResourceDetailInfos(List<ResourceDetailInfo> resourceDetailInfos) {
		this.resourceDetailInfos = resourceDetailInfos;
	}

	public static class ResourceDetailInfo {

		private String regionID;

		private String iD;

		private String iP;

		private String server;

		private String type;

		private String status;

		private String mac;

		private String iSP;

		public String getRegionID() {
			return this.regionID;
		}

		public void setRegionID(String regionID) {
			this.regionID = regionID;
		}

		public String getID() {
			return this.iD;
		}

		public void setID(String iD) {
			this.iD = iD;
		}

		public String getIP() {
			return this.iP;
		}

		public void setIP(String iP) {
			this.iP = iP;
		}

		public String getServer() {
			return this.server;
		}

		public void setServer(String server) {
			this.server = server;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMac() {
			return this.mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
		}

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}
	}

	@Override
	public RescaleDeviceServiceResponse getInstance(UnmarshallerContext context) {
		return	RescaleDeviceServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
