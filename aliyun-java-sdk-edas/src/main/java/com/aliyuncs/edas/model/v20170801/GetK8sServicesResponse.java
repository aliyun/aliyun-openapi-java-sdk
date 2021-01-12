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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetK8sServicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetK8sServicesResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<ServicesItem> services;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public List<ServicesItem> getServices() {
		return this.services;
	}

	public void setServices(List<ServicesItem> services) {
		this.services = services;
	}

	public static class ServicesItem {

		private String name;

		private String type;

		private String clusterIP;

		private List<ServicePortsItem> servicePorts;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getClusterIP() {
			return this.clusterIP;
		}

		public void setClusterIP(String clusterIP) {
			this.clusterIP = clusterIP;
		}

		public List<ServicePortsItem> getServicePorts() {
			return this.servicePorts;
		}

		public void setServicePorts(List<ServicePortsItem> servicePorts) {
			this.servicePorts = servicePorts;
		}

		public static class ServicePortsItem {

			private String protocol;

			private Integer port;

			private String targetPort;

			private Integer nodePort;

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getTargetPort() {
				return this.targetPort;
			}

			public void setTargetPort(String targetPort) {
				this.targetPort = targetPort;
			}

			public Integer getNodePort() {
				return this.nodePort;
			}

			public void setNodePort(Integer nodePort) {
				this.nodePort = nodePort;
			}
		}
	}

	@Override
	public GetK8sServicesResponse getInstance(UnmarshallerContext context) {
		return	GetK8sServicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
