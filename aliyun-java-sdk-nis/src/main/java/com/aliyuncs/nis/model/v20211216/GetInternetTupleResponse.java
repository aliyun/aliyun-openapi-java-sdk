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
import com.aliyuncs.nis.transform.v20211216.GetInternetTupleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInternetTupleResponse extends AcsResponse {

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

		private String beginTime;

		private String direction;

		private String instanceId;

		private String accessRegion;

		private String cloudIp;

		private String cloudPort;

		private String otherIp;

		private String otherPort;

		private String protocol;

		private String cloudCountry;

		private String cloudProvince;

		private String cloudCity;

		private String cloudIsp;

		private String cloudProduct;

		private String otherCountry;

		private String otherProvince;

		private String otherCity;

		private String otherIsp;

		private String otherProduct;

		private Double rtt;

		private Double byteCount;

		private Double packetCount;

		private Double outOrderCount;

		private Double retranCount;

		private Double inByteCount;

		private Double outByteCount;

		private Double inPacketCount;

		private Double outPacketCount;

		private Double inOutOrderCount;

		private Double outOutOrderCount;

		private Double inRetranCount;

		private Double outRetranCount;

		private Double retransmitRate;

		public String getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(String beginTime) {
			this.beginTime = beginTime;
		}

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getAccessRegion() {
			return this.accessRegion;
		}

		public void setAccessRegion(String accessRegion) {
			this.accessRegion = accessRegion;
		}

		public String getCloudIp() {
			return this.cloudIp;
		}

		public void setCloudIp(String cloudIp) {
			this.cloudIp = cloudIp;
		}

		public String getCloudPort() {
			return this.cloudPort;
		}

		public void setCloudPort(String cloudPort) {
			this.cloudPort = cloudPort;
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

		public String getCloudCountry() {
			return this.cloudCountry;
		}

		public void setCloudCountry(String cloudCountry) {
			this.cloudCountry = cloudCountry;
		}

		public String getCloudProvince() {
			return this.cloudProvince;
		}

		public void setCloudProvince(String cloudProvince) {
			this.cloudProvince = cloudProvince;
		}

		public String getCloudCity() {
			return this.cloudCity;
		}

		public void setCloudCity(String cloudCity) {
			this.cloudCity = cloudCity;
		}

		public String getCloudIsp() {
			return this.cloudIsp;
		}

		public void setCloudIsp(String cloudIsp) {
			this.cloudIsp = cloudIsp;
		}

		public String getCloudProduct() {
			return this.cloudProduct;
		}

		public void setCloudProduct(String cloudProduct) {
			this.cloudProduct = cloudProduct;
		}

		public String getOtherCountry() {
			return this.otherCountry;
		}

		public void setOtherCountry(String otherCountry) {
			this.otherCountry = otherCountry;
		}

		public String getOtherProvince() {
			return this.otherProvince;
		}

		public void setOtherProvince(String otherProvince) {
			this.otherProvince = otherProvince;
		}

		public String getOtherCity() {
			return this.otherCity;
		}

		public void setOtherCity(String otherCity) {
			this.otherCity = otherCity;
		}

		public String getOtherIsp() {
			return this.otherIsp;
		}

		public void setOtherIsp(String otherIsp) {
			this.otherIsp = otherIsp;
		}

		public String getOtherProduct() {
			return this.otherProduct;
		}

		public void setOtherProduct(String otherProduct) {
			this.otherProduct = otherProduct;
		}

		public Double getRtt() {
			return this.rtt;
		}

		public void setRtt(Double rtt) {
			this.rtt = rtt;
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

		public Double getOutOrderCount() {
			return this.outOrderCount;
		}

		public void setOutOrderCount(Double outOrderCount) {
			this.outOrderCount = outOrderCount;
		}

		public Double getRetranCount() {
			return this.retranCount;
		}

		public void setRetranCount(Double retranCount) {
			this.retranCount = retranCount;
		}

		public Double getInByteCount() {
			return this.inByteCount;
		}

		public void setInByteCount(Double inByteCount) {
			this.inByteCount = inByteCount;
		}

		public Double getOutByteCount() {
			return this.outByteCount;
		}

		public void setOutByteCount(Double outByteCount) {
			this.outByteCount = outByteCount;
		}

		public Double getInPacketCount() {
			return this.inPacketCount;
		}

		public void setInPacketCount(Double inPacketCount) {
			this.inPacketCount = inPacketCount;
		}

		public Double getOutPacketCount() {
			return this.outPacketCount;
		}

		public void setOutPacketCount(Double outPacketCount) {
			this.outPacketCount = outPacketCount;
		}

		public Double getInOutOrderCount() {
			return this.inOutOrderCount;
		}

		public void setInOutOrderCount(Double inOutOrderCount) {
			this.inOutOrderCount = inOutOrderCount;
		}

		public Double getOutOutOrderCount() {
			return this.outOutOrderCount;
		}

		public void setOutOutOrderCount(Double outOutOrderCount) {
			this.outOutOrderCount = outOutOrderCount;
		}

		public Double getInRetranCount() {
			return this.inRetranCount;
		}

		public void setInRetranCount(Double inRetranCount) {
			this.inRetranCount = inRetranCount;
		}

		public Double getOutRetranCount() {
			return this.outRetranCount;
		}

		public void setOutRetranCount(Double outRetranCount) {
			this.outRetranCount = outRetranCount;
		}

		public Double getRetransmitRate() {
			return this.retransmitRate;
		}

		public void setRetransmitRate(Double retransmitRate) {
			this.retransmitRate = retransmitRate;
		}
	}

	@Override
	public GetInternetTupleResponse getInstance(UnmarshallerContext context) {
		return	GetInternetTupleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
