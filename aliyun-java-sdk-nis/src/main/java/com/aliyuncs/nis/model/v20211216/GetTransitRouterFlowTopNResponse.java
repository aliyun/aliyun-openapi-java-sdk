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

package com.aliyuncs.nis.model.v20211216;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nis.transform.v20211216.GetTransitRouterFlowTopNResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTransitRouterFlowTopNResponse extends AcsResponse {

	private String requestId;

	private List<TrFlowlogTopN> transitRouterFlowTopN;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TrFlowlogTopN> getTransitRouterFlowTopN() {
		return this.transitRouterFlowTopN;
	}

	public void setTransitRouterFlowTopN(List<TrFlowlogTopN> transitRouterFlowTopN) {
		this.transitRouterFlowTopN = transitRouterFlowTopN;
	}

	public static class TrFlowlogTopN {

		private String accountId;

		private String cenId;

		private String thisRegion;

		private String thisIp;

		private String thisPort;

		private String otherRegion;

		private String otherIp;

		private String otherPort;

		private String protocol;

		private String startTime;

		private String endTime;

		private Double packets;

		private Double bytes;

		private String bandwithPackageId;

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public String getThisRegion() {
			return this.thisRegion;
		}

		public void setThisRegion(String thisRegion) {
			this.thisRegion = thisRegion;
		}

		public String getThisIp() {
			return this.thisIp;
		}

		public void setThisIp(String thisIp) {
			this.thisIp = thisIp;
		}

		public String getThisPort() {
			return this.thisPort;
		}

		public void setThisPort(String thisPort) {
			this.thisPort = thisPort;
		}

		public String getOtherRegion() {
			return this.otherRegion;
		}

		public void setOtherRegion(String otherRegion) {
			this.otherRegion = otherRegion;
		}

		public String getOtherIp() {
			return this.otherIp;
		}

		public void setOtherIp(String otherIp) {
			this.otherIp = otherIp;
		}

		public String getOtherPort() {
			return this.otherPort;
		}

		public void setOtherPort(String otherPort) {
			this.otherPort = otherPort;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Double getPackets() {
			return this.packets;
		}

		public void setPackets(Double packets) {
			this.packets = packets;
		}

		public Double getBytes() {
			return this.bytes;
		}

		public void setBytes(Double bytes) {
			this.bytes = bytes;
		}

		public String getBandwithPackageId() {
			return this.bandwithPackageId;
		}

		public void setBandwithPackageId(String bandwithPackageId) {
			this.bandwithPackageId = bandwithPackageId;
		}
	}

	@Override
	public GetTransitRouterFlowTopNResponse getInstance(UnmarshallerContext context) {
		return	GetTransitRouterFlowTopNResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
