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
import com.aliyuncs.ens.transform.v20171110.DescribeServcieScheduleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServcieScheduleResponse extends AcsResponse {

	private Boolean requestRepeated;

	private String tcpPorts;

	private String requestId;

	private String instanceId;

	private Integer instancePort;

	private String instanceIp;

	private Integer index;

	private PodAbstractInfo podAbstractInfo;

	public Boolean getRequestRepeated() {
		return this.requestRepeated;
	}

	public void setRequestRepeated(Boolean requestRepeated) {
		this.requestRepeated = requestRepeated;
	}

	public String getTcpPorts() {
		return this.tcpPorts;
	}

	public void setTcpPorts(String tcpPorts) {
		this.tcpPorts = tcpPorts;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Integer getInstancePort() {
		return this.instancePort;
	}

	public void setInstancePort(Integer instancePort) {
		this.instancePort = instancePort;
	}

	public String getInstanceIp() {
		return this.instanceIp;
	}

	public void setInstanceIp(String instanceIp) {
		this.instanceIp = instanceIp;
	}

	public Integer getIndex() {
		return this.index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public PodAbstractInfo getPodAbstractInfo() {
		return this.podAbstractInfo;
	}

	public void setPodAbstractInfo(PodAbstractInfo podAbstractInfo) {
		this.podAbstractInfo = podAbstractInfo;
	}

	public static class PodAbstractInfo {

		private Boolean status;

		private Boolean resourceScope;

		private Boolean containerService;

		private Boolean namespace;

		private Boolean name;

		private List<ContainerStatus> containerStatuses;

		public Boolean getStatus() {
			return this.status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}

		public Boolean getResourceScope() {
			return this.resourceScope;
		}

		public void setResourceScope(Boolean resourceScope) {
			this.resourceScope = resourceScope;
		}

		public Boolean getContainerService() {
			return this.containerService;
		}

		public void setContainerService(Boolean containerService) {
			this.containerService = containerService;
		}

		public Boolean getNamespace() {
			return this.namespace;
		}

		public void setNamespace(Boolean namespace) {
			this.namespace = namespace;
		}

		public Boolean getName() {
			return this.name;
		}

		public void setName(Boolean name) {
			this.name = name;
		}

		public List<ContainerStatus> getContainerStatuses() {
			return this.containerStatuses;
		}

		public void setContainerStatuses(List<ContainerStatus> containerStatuses) {
			this.containerStatuses = containerStatuses;
		}

		public static class ContainerStatus {

			private String containerId;

			private String name;

			public String getContainerId() {
				return this.containerId;
			}

			public void setContainerId(String containerId) {
				this.containerId = containerId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public DescribeServcieScheduleResponse getInstance(UnmarshallerContext context) {
		return	DescribeServcieScheduleResponseUnmarshaller.unmarshall(this, context);
	}
}
