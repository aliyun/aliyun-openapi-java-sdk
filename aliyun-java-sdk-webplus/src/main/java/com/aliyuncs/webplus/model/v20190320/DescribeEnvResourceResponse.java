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

package com.aliyuncs.webplus.model.v20190320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.DescribeEnvResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnvResourceResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private EnvResource envResource;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public EnvResource getEnvResource() {
		return this.envResource;
	}

	public void setEnvResource(EnvResource envResource) {
		this.envResource = envResource;
	}

	public static class EnvResource {

		private String envId;

		private String envName;

		private String launchConfigurationId;

		private String launchTemplateId;

		private List<Instance> instances;

		private List<VSwitch> vSwitches;

		private List<LoadBalancer> loadBalancers;

		private List<SecurityGroup> defaultSecurityGroups;

		private MonitorGroup monitorGroup;

		private ScalingGroup scalingGroup;

		private Vpc vpc;

		public String getEnvId() {
			return this.envId;
		}

		public void setEnvId(String envId) {
			this.envId = envId;
		}

		public String getEnvName() {
			return this.envName;
		}

		public void setEnvName(String envName) {
			this.envName = envName;
		}

		public String getLaunchConfigurationId() {
			return this.launchConfigurationId;
		}

		public void setLaunchConfigurationId(String launchConfigurationId) {
			this.launchConfigurationId = launchConfigurationId;
		}

		public String getLaunchTemplateId() {
			return this.launchTemplateId;
		}

		public void setLaunchTemplateId(String launchTemplateId) {
			this.launchTemplateId = launchTemplateId;
		}

		public List<Instance> getInstances() {
			return this.instances;
		}

		public void setInstances(List<Instance> instances) {
			this.instances = instances;
		}

		public List<VSwitch> getVSwitches() {
			return this.vSwitches;
		}

		public void setVSwitches(List<VSwitch> vSwitches) {
			this.vSwitches = vSwitches;
		}

		public List<LoadBalancer> getLoadBalancers() {
			return this.loadBalancers;
		}

		public void setLoadBalancers(List<LoadBalancer> loadBalancers) {
			this.loadBalancers = loadBalancers;
		}

		public List<SecurityGroup> getDefaultSecurityGroups() {
			return this.defaultSecurityGroups;
		}

		public void setDefaultSecurityGroups(List<SecurityGroup> defaultSecurityGroups) {
			this.defaultSecurityGroups = defaultSecurityGroups;
		}

		public MonitorGroup getMonitorGroup() {
			return this.monitorGroup;
		}

		public void setMonitorGroup(MonitorGroup monitorGroup) {
			this.monitorGroup = monitorGroup;
		}

		public ScalingGroup getScalingGroup() {
			return this.scalingGroup;
		}

		public void setScalingGroup(ScalingGroup scalingGroup) {
			this.scalingGroup = scalingGroup;
		}

		public Vpc getVpc() {
			return this.vpc;
		}

		public void setVpc(Vpc vpc) {
			this.vpc = vpc;
		}

		public static class Instance {

			private String id;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class VSwitch {

			private String id;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class LoadBalancer {

			private String id;

			private String addressType;

			private Integer port;

			private String protocol;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getAddressType() {
				return this.addressType;
			}

			public void setAddressType(String addressType) {
				this.addressType = addressType;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			/**
			 * @deprecated use getBizProtocol instead of this.
			 */
			@Deprecated
			public String getProtocol() {
				return this.protocol;
			}

			/**
			 * @deprecated use setBizProtocol instead of this.
			 */
			@Deprecated
			public void setProtocol(String protocol) {
				this.protocol = protocol;
			}
		}

		public static class SecurityGroup {

			private String id;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class MonitorGroup {

			private String id;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class ScalingGroup {

			private String id;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class Vpc {

			private String id;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public DescribeEnvResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnvResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
