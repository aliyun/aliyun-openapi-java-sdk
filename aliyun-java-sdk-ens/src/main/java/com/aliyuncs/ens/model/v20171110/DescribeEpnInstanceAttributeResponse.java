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
import com.aliyuncs.ens.transform.v20171110.DescribeEpnInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEpnInstanceAttributeResponse extends AcsResponse {

	private String ePNInstanceId;

	private String ePNInstanceName;

	private String networkingModel;

	private String requestId;

	private List<ConfVersionsItem> confVersions;

	private List<EPNInstance> instances;

	private List<EPNInstance1> vSwitches;

	public String getEPNInstanceId() {
		return this.ePNInstanceId;
	}

	public void setEPNInstanceId(String ePNInstanceId) {
		this.ePNInstanceId = ePNInstanceId;
	}

	public String getEPNInstanceName() {
		return this.ePNInstanceName;
	}

	public void setEPNInstanceName(String ePNInstanceName) {
		this.ePNInstanceName = ePNInstanceName;
	}

	public String getNetworkingModel() {
		return this.networkingModel;
	}

	public void setNetworkingModel(String networkingModel) {
		this.networkingModel = networkingModel;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ConfVersionsItem> getConfVersions() {
		return this.confVersions;
	}

	public void setConfVersions(List<ConfVersionsItem> confVersions) {
		this.confVersions = confVersions;
	}

	public List<EPNInstance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<EPNInstance> instances) {
		this.instances = instances;
	}

	public List<EPNInstance1> getVSwitches() {
		return this.vSwitches;
	}

	public void setVSwitches(List<EPNInstance1> vSwitches) {
		this.vSwitches = vSwitches;
	}

	public static class ConfVersionsItem {

		private String confVersion;

		private String ensRegionId;

		public String getConfVersion() {
			return this.confVersion;
		}

		public void setConfVersion(String confVersion) {
			this.confVersion = confVersion;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}
	}

	public static class EPNInstance {

		private String ensRegionId;

		private String instanceId;

		private String instanceName;

		private String isp;

		private String privateIpAddress;

		private String publicIpAddress;

		private String status;

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public String getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(String privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
		}

		public String getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(String publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class EPNInstance1 {

		private String cidrBlock;

		private String ensRegionId;

		private String vSwitchId;

		private String vSwitchName;

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getVSwitchName() {
			return this.vSwitchName;
		}

		public void setVSwitchName(String vSwitchName) {
			this.vSwitchName = vSwitchName;
		}
	}

	@Override
	public DescribeEpnInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeEpnInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
