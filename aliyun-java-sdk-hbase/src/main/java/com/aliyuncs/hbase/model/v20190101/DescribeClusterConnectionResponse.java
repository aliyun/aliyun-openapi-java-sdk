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
import com.aliyuncs.hbase.transform.v20190101.DescribeClusterConnectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterConnectionResponse extends AcsResponse {

	private String requestId;

	private String netType;

	private String vpcId;

	private String vSwitchId;

	private String dbType;

	private String isMultimod;

	private List<ZkConnAddr> zkConnAddrs;

	private List<SlbConnAddr> slbConnAddrs;

	private List<ServiceConnAddr> serviceConnAddrs;

	private UiProxyConnAddrInfo uiProxyConnAddrInfo;

	private ThriftConn thriftConn;

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

	public String getDbType() {
		return this.dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public String getIsMultimod() {
		return this.isMultimod;
	}

	public void setIsMultimod(String isMultimod) {
		this.isMultimod = isMultimod;
	}

	public List<ZkConnAddr> getZkConnAddrs() {
		return this.zkConnAddrs;
	}

	public void setZkConnAddrs(List<ZkConnAddr> zkConnAddrs) {
		this.zkConnAddrs = zkConnAddrs;
	}

	public List<SlbConnAddr> getSlbConnAddrs() {
		return this.slbConnAddrs;
	}

	public void setSlbConnAddrs(List<SlbConnAddr> slbConnAddrs) {
		this.slbConnAddrs = slbConnAddrs;
	}

	public List<ServiceConnAddr> getServiceConnAddrs() {
		return this.serviceConnAddrs;
	}

	public void setServiceConnAddrs(List<ServiceConnAddr> serviceConnAddrs) {
		this.serviceConnAddrs = serviceConnAddrs;
	}

	public UiProxyConnAddrInfo getUiProxyConnAddrInfo() {
		return this.uiProxyConnAddrInfo;
	}

	public void setUiProxyConnAddrInfo(UiProxyConnAddrInfo uiProxyConnAddrInfo) {
		this.uiProxyConnAddrInfo = uiProxyConnAddrInfo;
	}

	public ThriftConn getThriftConn() {
		return this.thriftConn;
	}

	public void setThriftConn(ThriftConn thriftConn) {
		this.thriftConn = thriftConn;
	}

	public static class ZkConnAddr {

		private String connAddr;

		private String connAddrPort;

		private String netType;

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

	public static class SlbConnAddr {

		private String slbType;

		private ConnAddrInfo connAddrInfo;

		public String getSlbType() {
			return this.slbType;
		}

		public void setSlbType(String slbType) {
			this.slbType = slbType;
		}

		public ConnAddrInfo getConnAddrInfo() {
			return this.connAddrInfo;
		}

		public void setConnAddrInfo(ConnAddrInfo connAddrInfo) {
			this.connAddrInfo = connAddrInfo;
		}

		public static class ConnAddrInfo {

			private String connAddr;

			private String connAddrPort;

			private String netType;

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
	}

	public static class ServiceConnAddr {

		private String connType;

		private ConnAddrInfo1 connAddrInfo1;

		public String getConnType() {
			return this.connType;
		}

		public void setConnType(String connType) {
			this.connType = connType;
		}

		public ConnAddrInfo1 getConnAddrInfo1() {
			return this.connAddrInfo1;
		}

		public void setConnAddrInfo1(ConnAddrInfo1 connAddrInfo1) {
			this.connAddrInfo1 = connAddrInfo1;
		}

		public static class ConnAddrInfo1 {

			private String connAddr;

			private String connAddrPort;

			private String netType;

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
	}

	public static class UiProxyConnAddrInfo {

		private String connAddr;

		private String connAddrPort;

		private String netType;

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

	public static class ThriftConn {

		private String connAddr;

		private String connAddrPort;

		private String netType;

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
	public DescribeClusterConnectionResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterConnectionResponseUnmarshaller.unmarshall(this, context);
	}
}
