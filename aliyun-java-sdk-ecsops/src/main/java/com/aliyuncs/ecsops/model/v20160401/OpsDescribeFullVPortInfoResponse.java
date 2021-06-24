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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeFullVPortInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeFullVPortInfoResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Eni eni;

		private Vport vport;

		public Eni getEni() {
			return this.eni;
		}

		public void setEni(Eni eni) {
			this.eni = eni;
		}

		public Vport getVport() {
			return this.vport;
		}

		public void setVport(Vport vport) {
			this.vport = vport;
		}

		public static class Eni {

			private String vpcId;

			private String vPortId;

			private String instanceId;

			private Long rx;

			private String vSwitchId;

			private Long tx;

			private String vPortName;

			private Long txPps;

			private String eniNetworkType;

			private String eniNo;

			private String eniStatus;

			private Long rxPps;

			private String eniType;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVPortId() {
				return this.vPortId;
			}

			public void setVPortId(String vPortId) {
				this.vPortId = vPortId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Long getRx() {
				return this.rx;
			}

			public void setRx(Long rx) {
				this.rx = rx;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public Long getTx() {
				return this.tx;
			}

			public void setTx(Long tx) {
				this.tx = tx;
			}

			public String getVPortName() {
				return this.vPortName;
			}

			public void setVPortName(String vPortName) {
				this.vPortName = vPortName;
			}

			public Long getTxPps() {
				return this.txPps;
			}

			public void setTxPps(Long txPps) {
				this.txPps = txPps;
			}

			public String getEniNetworkType() {
				return this.eniNetworkType;
			}

			public void setEniNetworkType(String eniNetworkType) {
				this.eniNetworkType = eniNetworkType;
			}

			public String getEniNo() {
				return this.eniNo;
			}

			public void setEniNo(String eniNo) {
				this.eniNo = eniNo;
			}

			public String getEniStatus() {
				return this.eniStatus;
			}

			public void setEniStatus(String eniStatus) {
				this.eniStatus = eniStatus;
			}

			public Long getRxPps() {
				return this.rxPps;
			}

			public void setRxPps(Long rxPps) {
				this.rxPps = rxPps;
			}

			public String getEniType() {
				return this.eniType;
			}

			public void setEniType(String eniType) {
				this.eniType = eniType;
			}
		}

		public static class Vport {

			private String vpcId;

			private String vPortId;

			private String instanceId;

			private Long rx;

			private String vSwitchId;

			private Long tx;

			private String vPortName;

			private Long txPps;

			private String eniNetworkType;

			private String eniNo;

			private String eniStatus;

			private Long rxPps;

			private String eniType;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVPortId() {
				return this.vPortId;
			}

			public void setVPortId(String vPortId) {
				this.vPortId = vPortId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Long getRx() {
				return this.rx;
			}

			public void setRx(Long rx) {
				this.rx = rx;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public Long getTx() {
				return this.tx;
			}

			public void setTx(Long tx) {
				this.tx = tx;
			}

			public String getVPortName() {
				return this.vPortName;
			}

			public void setVPortName(String vPortName) {
				this.vPortName = vPortName;
			}

			public Long getTxPps() {
				return this.txPps;
			}

			public void setTxPps(Long txPps) {
				this.txPps = txPps;
			}

			public String getEniNetworkType() {
				return this.eniNetworkType;
			}

			public void setEniNetworkType(String eniNetworkType) {
				this.eniNetworkType = eniNetworkType;
			}

			public String getEniNo() {
				return this.eniNo;
			}

			public void setEniNo(String eniNo) {
				this.eniNo = eniNo;
			}

			public String getEniStatus() {
				return this.eniStatus;
			}

			public void setEniStatus(String eniStatus) {
				this.eniStatus = eniStatus;
			}

			public Long getRxPps() {
				return this.rxPps;
			}

			public void setRxPps(Long rxPps) {
				this.rxPps = rxPps;
			}

			public String getEniType() {
				return this.eniType;
			}

			public void setEniType(String eniType) {
				this.eniType = eniType;
			}
		}
	}

	@Override
	public OpsDescribeFullVPortInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeFullVPortInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
