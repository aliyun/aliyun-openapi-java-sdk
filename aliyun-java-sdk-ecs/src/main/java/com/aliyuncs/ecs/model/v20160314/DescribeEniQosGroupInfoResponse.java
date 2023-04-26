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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeEniQosGroupInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEniQosGroupInfoResponse extends AcsResponse {

	private String requestId;

	private QosGroupInfo qosGroupInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public QosGroupInfo getQosGroupInfo() {
		return this.qosGroupInfo;
	}

	public void setQosGroupInfo(QosGroupInfo qosGroupInfo) {
		this.qosGroupInfo = qosGroupInfo;
	}

	public static class QosGroupInfo {

		private String instanceId;

		private List<String> networkInterfaceIds;

		private QosGroup qosGroup;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<String> getNetworkInterfaceIds() {
			return this.networkInterfaceIds;
		}

		public void setNetworkInterfaceIds(List<String> networkInterfaceIds) {
			this.networkInterfaceIds = networkInterfaceIds;
		}

		public QosGroup getQosGroup() {
			return this.qosGroup;
		}

		public void setQosGroup(QosGroup qosGroup) {
			this.qosGroup = qosGroup;
		}

		public static class QosGroup {

			private String type;

			private String rx;

			private String gmtModify;

			private String qosGroupName;

			private String tx;

			private String txPps;

			private String gmtCreate;

			private String rxPps;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getRx() {
				return this.rx;
			}

			public void setRx(String rx) {
				this.rx = rx;
			}

			public String getGmtModify() {
				return this.gmtModify;
			}

			public void setGmtModify(String gmtModify) {
				this.gmtModify = gmtModify;
			}

			public String getQosGroupName() {
				return this.qosGroupName;
			}

			public void setQosGroupName(String qosGroupName) {
				this.qosGroupName = qosGroupName;
			}

			public String getTx() {
				return this.tx;
			}

			public void setTx(String tx) {
				this.tx = tx;
			}

			public String getTxPps() {
				return this.txPps;
			}

			public void setTxPps(String txPps) {
				this.txPps = txPps;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getRxPps() {
				return this.rxPps;
			}

			public void setRxPps(String rxPps) {
				this.rxPps = rxPps;
			}
		}
	}

	@Override
	public DescribeEniQosGroupInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeEniQosGroupInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
