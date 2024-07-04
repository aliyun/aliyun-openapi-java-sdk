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
import com.aliyuncs.nis.transform.v20211216.GetNisNetworkRankingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNisNetworkRankingResponse extends AcsResponse {

	private String requestId;

	private List<Rankings> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Rankings> getData() {
		return this.data;
	}

	public void setData(List<Rankings> data) {
		this.data = data;
	}

	public static class Rankings {

		private String regionNo;

		private String instanceId;

		private String bandwidthPackageId;

		private String sourceIp;

		private String sourcePort;

		private String sourceIsp;

		private String destinationIp;

		private String destinationPort;

		private String destinationIsp;

		private String protocol;

		private String country;

		private String province;

		private String city;

		private String isp;

		private String asn;

		private String iP;

		private String destinationRegionNo;

		private String vbrId;

		private String attachmentId;

		private String sourceZone;

		private String destinationZone;

		private Double byteCount;

		private Double packetCount;

		private Double rTT;

		private Double retransmitRate;

		private Double inBps;

		private Double inPps;

		private Double outBps;

		private Double outPps;

		private Double newSessionPerSecond;

		private Double activeSessionCount;

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getBandwidthPackageId() {
			return this.bandwidthPackageId;
		}

		public void setBandwidthPackageId(String bandwidthPackageId) {
			this.bandwidthPackageId = bandwidthPackageId;
		}

		public String getSourceIp() {
			return this.sourceIp;
		}

		public void setSourceIp(String sourceIp) {
			this.sourceIp = sourceIp;
		}

		public String getSourcePort() {
			return this.sourcePort;
		}

		public void setSourcePort(String sourcePort) {
			this.sourcePort = sourcePort;
		}

		public String getSourceIsp() {
			return this.sourceIsp;
		}

		public void setSourceIsp(String sourceIsp) {
			this.sourceIsp = sourceIsp;
		}

		public String getDestinationIp() {
			return this.destinationIp;
		}

		public void setDestinationIp(String destinationIp) {
			this.destinationIp = destinationIp;
		}

		public String getDestinationPort() {
			return this.destinationPort;
		}

		public void setDestinationPort(String destinationPort) {
			this.destinationPort = destinationPort;
		}

		public String getDestinationIsp() {
			return this.destinationIsp;
		}

		public void setDestinationIsp(String destinationIsp) {
			this.destinationIsp = destinationIsp;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public String getAsn() {
			return this.asn;
		}

		public void setAsn(String asn) {
			this.asn = asn;
		}

		public String getIP() {
			return this.iP;
		}

		public void setIP(String iP) {
			this.iP = iP;
		}

		public String getDestinationRegionNo() {
			return this.destinationRegionNo;
		}

		public void setDestinationRegionNo(String destinationRegionNo) {
			this.destinationRegionNo = destinationRegionNo;
		}

		public String getVbrId() {
			return this.vbrId;
		}

		public void setVbrId(String vbrId) {
			this.vbrId = vbrId;
		}

		public String getAttachmentId() {
			return this.attachmentId;
		}

		public void setAttachmentId(String attachmentId) {
			this.attachmentId = attachmentId;
		}

		public String getSourceZone() {
			return this.sourceZone;
		}

		public void setSourceZone(String sourceZone) {
			this.sourceZone = sourceZone;
		}

		public String getDestinationZone() {
			return this.destinationZone;
		}

		public void setDestinationZone(String destinationZone) {
			this.destinationZone = destinationZone;
		}

		public Double getByteCount() {
			return this.byteCount;
		}

		public void setByteCount(Double byteCount) {
			this.byteCount = byteCount;
		}

		public Double getPacketCount() {
			return this.packetCount;
		}

		public void setPacketCount(Double packetCount) {
			this.packetCount = packetCount;
		}

		public Double getRTT() {
			return this.rTT;
		}

		public void setRTT(Double rTT) {
			this.rTT = rTT;
		}

		public Double getRetransmitRate() {
			return this.retransmitRate;
		}

		public void setRetransmitRate(Double retransmitRate) {
			this.retransmitRate = retransmitRate;
		}

		public Double getInBps() {
			return this.inBps;
		}

		public void setInBps(Double inBps) {
			this.inBps = inBps;
		}

		public Double getInPps() {
			return this.inPps;
		}

		public void setInPps(Double inPps) {
			this.inPps = inPps;
		}

		public Double getOutBps() {
			return this.outBps;
		}

		public void setOutBps(Double outBps) {
			this.outBps = outBps;
		}

		public Double getOutPps() {
			return this.outPps;
		}

		public void setOutPps(Double outPps) {
			this.outPps = outPps;
		}

		public Double getNewSessionPerSecond() {
			return this.newSessionPerSecond;
		}

		public void setNewSessionPerSecond(Double newSessionPerSecond) {
			this.newSessionPerSecond = newSessionPerSecond;
		}

		public Double getActiveSessionCount() {
			return this.activeSessionCount;
		}

		public void setActiveSessionCount(Double activeSessionCount) {
			this.activeSessionCount = activeSessionCount;
		}
	}

	@Override
	public GetNisNetworkRankingResponse getInstance(UnmarshallerContext context) {
		return	GetNisNetworkRankingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
