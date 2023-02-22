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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetHoneypotProbeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetHoneypotProbeResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String probeId;

		private String probeType;

		private String displayName;

		private String osType;

		private String probeVersion;

		private String hostIp;

		private Boolean ping;

		private Boolean arp;

		private Long deployTime;

		private Integer status;

		private Double cpuLoad;

		private Double memoryLoad;

		private String uuid;

		private String proxyIp;

		private String vpcId;

		private List<HoneypotProbeBindListItem> honeypotProbeBindList;

		private List<String> listenIpList;

		private List<String> canListenIpList;

		private List<String> cidrList;

		private ControlNode controlNode;

		private HoneyPotProbeScanPort honeyPotProbeScanPort;

		public String getProbeId() {
			return this.probeId;
		}

		public void setProbeId(String probeId) {
			this.probeId = probeId;
		}

		public String getProbeType() {
			return this.probeType;
		}

		public void setProbeType(String probeType) {
			this.probeType = probeType;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getProbeVersion() {
			return this.probeVersion;
		}

		public void setProbeVersion(String probeVersion) {
			this.probeVersion = probeVersion;
		}

		public String getHostIp() {
			return this.hostIp;
		}

		public void setHostIp(String hostIp) {
			this.hostIp = hostIp;
		}

		public Boolean getPing() {
			return this.ping;
		}

		public void setPing(Boolean ping) {
			this.ping = ping;
		}

		public Boolean getArp() {
			return this.arp;
		}

		public void setArp(Boolean arp) {
			this.arp = arp;
		}

		public Long getDeployTime() {
			return this.deployTime;
		}

		public void setDeployTime(Long deployTime) {
			this.deployTime = deployTime;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Double getCpuLoad() {
			return this.cpuLoad;
		}

		public void setCpuLoad(Double cpuLoad) {
			this.cpuLoad = cpuLoad;
		}

		public Double getMemoryLoad() {
			return this.memoryLoad;
		}

		public void setMemoryLoad(Double memoryLoad) {
			this.memoryLoad = memoryLoad;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getProxyIp() {
			return this.proxyIp;
		}

		public void setProxyIp(String proxyIp) {
			this.proxyIp = proxyIp;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public List<HoneypotProbeBindListItem> getHoneypotProbeBindList() {
			return this.honeypotProbeBindList;
		}

		public void setHoneypotProbeBindList(List<HoneypotProbeBindListItem> honeypotProbeBindList) {
			this.honeypotProbeBindList = honeypotProbeBindList;
		}

		public List<String> getListenIpList() {
			return this.listenIpList;
		}

		public void setListenIpList(List<String> listenIpList) {
			this.listenIpList = listenIpList;
		}

		public List<String> getCanListenIpList() {
			return this.canListenIpList;
		}

		public void setCanListenIpList(List<String> canListenIpList) {
			this.canListenIpList = canListenIpList;
		}

		public List<String> getCidrList() {
			return this.cidrList;
		}

		public void setCidrList(List<String> cidrList) {
			this.cidrList = cidrList;
		}

		public ControlNode getControlNode() {
			return this.controlNode;
		}

		public void setControlNode(ControlNode controlNode) {
			this.controlNode = controlNode;
		}

		public HoneyPotProbeScanPort getHoneyPotProbeScanPort() {
			return this.honeyPotProbeScanPort;
		}

		public void setHoneyPotProbeScanPort(HoneyPotProbeScanPort honeyPotProbeScanPort) {
			this.honeyPotProbeScanPort = honeyPotProbeScanPort;
		}

		public static class HoneypotProbeBindListItem {

			private Integer status;

			private String honeypotId;

			private String bindId;

			private List<BindPortListItem> bindPortList;

			private List<String> serviceIpList;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getHoneypotId() {
				return this.honeypotId;
			}

			public void setHoneypotId(String honeypotId) {
				this.honeypotId = honeypotId;
			}

			public String getBindId() {
				return this.bindId;
			}

			public void setBindId(String bindId) {
				this.bindId = bindId;
			}

			public List<BindPortListItem> getBindPortList() {
				return this.bindPortList;
			}

			public void setBindPortList(List<BindPortListItem> bindPortList) {
				this.bindPortList = bindPortList;
			}

			public List<String> getServiceIpList() {
				return this.serviceIpList;
			}

			public void setServiceIpList(List<String> serviceIpList) {
				this.serviceIpList = serviceIpList;
			}

			public static class BindPortListItem {

				private Integer startPort;

				private Integer endPort;

				private String proto;

				private Boolean fixed;

				private Integer targetPort;

				private Long id;

				private Boolean bindPort;

				private String err;

				private String msg;

				private Integer status;

				public Integer getStartPort() {
					return this.startPort;
				}

				public void setStartPort(Integer startPort) {
					this.startPort = startPort;
				}

				public Integer getEndPort() {
					return this.endPort;
				}

				public void setEndPort(Integer endPort) {
					this.endPort = endPort;
				}

				public String getProto() {
					return this.proto;
				}

				public void setProto(String proto) {
					this.proto = proto;
				}

				public Boolean getFixed() {
					return this.fixed;
				}

				public void setFixed(Boolean fixed) {
					this.fixed = fixed;
				}

				public Integer getTargetPort() {
					return this.targetPort;
				}

				public void setTargetPort(Integer targetPort) {
					this.targetPort = targetPort;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public Boolean getBindPort() {
					return this.bindPort;
				}

				public void setBindPort(Boolean bindPort) {
					this.bindPort = bindPort;
				}

				public String getErr() {
					return this.err;
				}

				public void setErr(String err) {
					this.err = err;
				}

				public String getMsg() {
					return this.msg;
				}

				public void setMsg(String msg) {
					this.msg = msg;
				}

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
				}
			}
		}

		public static class ControlNode {

			private String nodeId;

			private String nodeName;

			private String ecsInstanceId;

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getEcsInstanceId() {
				return this.ecsInstanceId;
			}

			public void setEcsInstanceId(String ecsInstanceId) {
				this.ecsInstanceId = ecsInstanceId;
			}
		}

		public static class HoneyPotProbeScanPort {

			private Long id;

			private String probeId;

			private Integer status;

			private String ports;

			private List<String> serviceIpList1;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getProbeId() {
				return this.probeId;
			}

			public void setProbeId(String probeId) {
				this.probeId = probeId;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getPorts() {
				return this.ports;
			}

			public void setPorts(String ports) {
				this.ports = ports;
			}

			public List<String> getServiceIpList1() {
				return this.serviceIpList1;
			}

			public void setServiceIpList1(List<String> serviceIpList1) {
				this.serviceIpList1 = serviceIpList1;
			}
		}
	}

	@Override
	public GetHoneypotProbeResponse getInstance(UnmarshallerContext context) {
		return	GetHoneypotProbeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
