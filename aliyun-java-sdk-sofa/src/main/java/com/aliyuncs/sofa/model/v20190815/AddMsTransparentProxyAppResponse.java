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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.AddMsTransparentProxyAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddMsTransparentProxyAppResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String appName;

		private Long id;

		private String instanceId;

		private Long nodeNum;

		private Long openNum;

		private Long runNum;

		private List<SupportProtocolsItem> supportProtocols;

		private AppConfig appConfig;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getNodeNum() {
			return this.nodeNum;
		}

		public void setNodeNum(Long nodeNum) {
			this.nodeNum = nodeNum;
		}

		public Long getOpenNum() {
			return this.openNum;
		}

		public void setOpenNum(Long openNum) {
			this.openNum = openNum;
		}

		public Long getRunNum() {
			return this.runNum;
		}

		public void setRunNum(Long runNum) {
			this.runNum = runNum;
		}

		public List<SupportProtocolsItem> getSupportProtocols() {
			return this.supportProtocols;
		}

		public void setSupportProtocols(List<SupportProtocolsItem> supportProtocols) {
			this.supportProtocols = supportProtocols;
		}

		public AppConfig getAppConfig() {
			return this.appConfig;
		}

		public void setAppConfig(AppConfig appConfig) {
			this.appConfig = appConfig;
		}

		public static class SupportProtocolsItem {

			private Long maxReq;

			private Long port;

			private String protocol;

			public Long getMaxReq() {
				return this.maxReq;
			}

			public void setMaxReq(Long maxReq) {
				this.maxReq = maxReq;
			}

			public Long getPort() {
				return this.port;
			}

			public void setPort(Long port) {
				this.port = port;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}
		}

		public static class AppConfig {

			private Blacklist blacklist;

			public Blacklist getBlacklist() {
				return this.blacklist;
			}

			public void setBlacklist(Blacklist blacklist) {
				this.blacklist = blacklist;
			}

			public static class Blacklist {

				private List<InBoundItem> inBound;

				private List<OutBoundItem> outBound;

				public List<InBoundItem> getInBound() {
					return this.inBound;
				}

				public void setInBound(List<InBoundItem> inBound) {
					this.inBound = inBound;
				}

				public List<OutBoundItem> getOutBound() {
					return this.outBound;
				}

				public void setOutBound(List<OutBoundItem> outBound) {
					this.outBound = outBound;
				}

				public static class InBoundItem {

					private List<IpRangeItem> ipRange;

					private List<PortRangeItem> portRange;

					public List<IpRangeItem> getIpRange() {
						return this.ipRange;
					}

					public void setIpRange(List<IpRangeItem> ipRange) {
						this.ipRange = ipRange;
					}

					public List<PortRangeItem> getPortRange() {
						return this.portRange;
					}

					public void setPortRange(List<PortRangeItem> portRange) {
						this.portRange = portRange;
					}

					public static class IpRangeItem {

						private Long defaultValue;

						private String endIp;

						private String startIp;

						public Long getDefaultValue() {
							return this.defaultValue;
						}

						public void setDefaultValue(Long defaultValue) {
							this.defaultValue = defaultValue;
						}

						public String getEndIp() {
							return this.endIp;
						}

						public void setEndIp(String endIp) {
							this.endIp = endIp;
						}

						public String getStartIp() {
							return this.startIp;
						}

						public void setStartIp(String startIp) {
							this.startIp = startIp;
						}
					}

					public static class PortRangeItem {

						private Long defaultValue;

						private Long endPort;

						private Long startPort;

						public Long getDefaultValue() {
							return this.defaultValue;
						}

						public void setDefaultValue(Long defaultValue) {
							this.defaultValue = defaultValue;
						}

						public Long getEndPort() {
							return this.endPort;
						}

						public void setEndPort(Long endPort) {
							this.endPort = endPort;
						}

						public Long getStartPort() {
							return this.startPort;
						}

						public void setStartPort(Long startPort) {
							this.startPort = startPort;
						}
					}
				}

				public static class OutBoundItem {

					private List<IpRangeItem3> ipRange1;

					private List<PortRangeItem4> portRange2;

					public List<IpRangeItem3> getIpRange1() {
						return this.ipRange1;
					}

					public void setIpRange1(List<IpRangeItem3> ipRange1) {
						this.ipRange1 = ipRange1;
					}

					public List<PortRangeItem4> getPortRange2() {
						return this.portRange2;
					}

					public void setPortRange2(List<PortRangeItem4> portRange2) {
						this.portRange2 = portRange2;
					}

					public static class IpRangeItem3 {

						private Long defaultValue;

						private String endIp;

						private String startIp;

						public Long getDefaultValue() {
							return this.defaultValue;
						}

						public void setDefaultValue(Long defaultValue) {
							this.defaultValue = defaultValue;
						}

						public String getEndIp() {
							return this.endIp;
						}

						public void setEndIp(String endIp) {
							this.endIp = endIp;
						}

						public String getStartIp() {
							return this.startIp;
						}

						public void setStartIp(String startIp) {
							this.startIp = startIp;
						}
					}

					public static class PortRangeItem4 {

						private Long defaultValue;

						private Long endPort;

						private Long startPort;

						public Long getDefaultValue() {
							return this.defaultValue;
						}

						public void setDefaultValue(Long defaultValue) {
							this.defaultValue = defaultValue;
						}

						public Long getEndPort() {
							return this.endPort;
						}

						public void setEndPort(Long endPort) {
							this.endPort = endPort;
						}

						public Long getStartPort() {
							return this.startPort;
						}

						public void setStartPort(Long startPort) {
							this.startPort = startPort;
						}
					}
				}
			}
		}
	}

	@Override
	public AddMsTransparentProxyAppResponse getInstance(UnmarshallerContext context) {
		return	AddMsTransparentProxyAppResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
