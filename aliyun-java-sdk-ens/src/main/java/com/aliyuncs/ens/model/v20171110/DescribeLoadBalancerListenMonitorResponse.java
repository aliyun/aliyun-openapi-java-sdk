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
import com.aliyuncs.ens.transform.v20171110.DescribeLoadBalancerListenMonitorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancerListenMonitorResponse extends AcsResponse {

	private String requestId;

	private List<ElbListenMonitorList> loadBalancerMonitorListenData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ElbListenMonitorList> getLoadBalancerMonitorListenData() {
		return this.loadBalancerMonitorListenData;
	}

	public void setLoadBalancerMonitorListenData(List<ElbListenMonitorList> loadBalancerMonitorListenData) {
		this.loadBalancerMonitorListenData = loadBalancerMonitorListenData;
	}

	public static class ElbListenMonitorList {

		private String loadBalancerId;

		private String ensRegionId;

		private String vip;

		private String vni;

		private String vPort;

		private String proto;

		private String conns;

		private String actConns;

		private String inActConns;

		private String dropConns;

		private String inPkts;

		private String outPkts;

		private String inDropPkts;

		private String outDropPkts;

		private String inBytes;

		private String outBytes;

		private String inDropBytes;

		private String outDropBytes;

		private String validRsNum;

		private String inValidRsNum;

		private String bizTime;

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getVip() {
			return this.vip;
		}

		public void setVip(String vip) {
			this.vip = vip;
		}

		public String getVni() {
			return this.vni;
		}

		public void setVni(String vni) {
			this.vni = vni;
		}

		public String getVPort() {
			return this.vPort;
		}

		public void setVPort(String vPort) {
			this.vPort = vPort;
		}

		public String getProto() {
			return this.proto;
		}

		public void setProto(String proto) {
			this.proto = proto;
		}

		public String getConns() {
			return this.conns;
		}

		public void setConns(String conns) {
			this.conns = conns;
		}

		public String getActConns() {
			return this.actConns;
		}

		public void setActConns(String actConns) {
			this.actConns = actConns;
		}

		public String getInActConns() {
			return this.inActConns;
		}

		public void setInActConns(String inActConns) {
			this.inActConns = inActConns;
		}

		public String getDropConns() {
			return this.dropConns;
		}

		public void setDropConns(String dropConns) {
			this.dropConns = dropConns;
		}

		public String getInPkts() {
			return this.inPkts;
		}

		public void setInPkts(String inPkts) {
			this.inPkts = inPkts;
		}

		public String getOutPkts() {
			return this.outPkts;
		}

		public void setOutPkts(String outPkts) {
			this.outPkts = outPkts;
		}

		public String getInDropPkts() {
			return this.inDropPkts;
		}

		public void setInDropPkts(String inDropPkts) {
			this.inDropPkts = inDropPkts;
		}

		public String getOutDropPkts() {
			return this.outDropPkts;
		}

		public void setOutDropPkts(String outDropPkts) {
			this.outDropPkts = outDropPkts;
		}

		public String getInBytes() {
			return this.inBytes;
		}

		public void setInBytes(String inBytes) {
			this.inBytes = inBytes;
		}

		public String getOutBytes() {
			return this.outBytes;
		}

		public void setOutBytes(String outBytes) {
			this.outBytes = outBytes;
		}

		public String getInDropBytes() {
			return this.inDropBytes;
		}

		public void setInDropBytes(String inDropBytes) {
			this.inDropBytes = inDropBytes;
		}

		public String getOutDropBytes() {
			return this.outDropBytes;
		}

		public void setOutDropBytes(String outDropBytes) {
			this.outDropBytes = outDropBytes;
		}

		public String getValidRsNum() {
			return this.validRsNum;
		}

		public void setValidRsNum(String validRsNum) {
			this.validRsNum = validRsNum;
		}

		public String getInValidRsNum() {
			return this.inValidRsNum;
		}

		public void setInValidRsNum(String inValidRsNum) {
			this.inValidRsNum = inValidRsNum;
		}

		public String getBizTime() {
			return this.bizTime;
		}

		public void setBizTime(String bizTime) {
			this.bizTime = bizTime;
		}
	}

	@Override
	public DescribeLoadBalancerListenMonitorResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancerListenMonitorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
