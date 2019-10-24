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

package com.aliyuncs.hbase.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeEndpointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEndpointsResponse extends AcsResponse {

	private String requestId;

	private String netType;

	private String vpcId;

	private String vSwitchId;

	private String engine;

	private List<ConnAddrInfo> connAddrs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNetType() {
		return this.netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public List<ConnAddrInfo> getConnAddrs() {
		return this.connAddrs;
	}

	public void setConnAddrs(List<ConnAddrInfo> connAddrs) {
		this.connAddrs = connAddrs;
	}

	public static class ConnAddrInfo {

		private String connType;

		private String connAddr;

		private String connAddrPort;

		private String netType;

		public String getConnType() {
			return this.connType;
		}

		public void setConnType(String connType) {
			this.connType = connType;
		}

		public String getConnAddr() {
			return this.connAddr;
		}

		public void setConnAddr(String connAddr) {
			this.connAddr = connAddr;
		}

		public String getConnAddrPort() {
			return this.connAddrPort;
		}

		public void setConnAddrPort(String connAddrPort) {
			this.connAddrPort = connAddrPort;
		}

		public String getNetType() {
			return this.netType;
		}

		public void setNetType(String netType) {
			this.netType = netType;
		}
	}

	@Override
	public DescribeEndpointsResponse getInstance(UnmarshallerContext context) {
		return	DescribeEndpointsResponseUnmarshaller.unmarshall(this, context);
	}
}
