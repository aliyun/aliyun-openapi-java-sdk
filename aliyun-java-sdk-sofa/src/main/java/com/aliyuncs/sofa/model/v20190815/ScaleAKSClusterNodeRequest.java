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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ScaleAKSClusterNodeRequest extends RpcAcsRequest<ScaleAKSClusterNodeResponse> {
	   

	private String workspace;

	private List<NodeSpecs> nodeSpecss;

	private String operatorName;
	public ScaleAKSClusterNodeRequest() {
		super("SOFA", "2019-08-15", "ScaleAKSClusterNode", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public List<NodeSpecs> getNodeSpecss() {
		return this.nodeSpecss;
	}

	public void setNodeSpecss(List<NodeSpecs> nodeSpecss) {
		this.nodeSpecss = nodeSpecss;	
		if (nodeSpecss != null) {
			for (int depth1 = 0; depth1 < nodeSpecss.size(); depth1++) {
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".Amount" , nodeSpecss.get(depth1).getAmount());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".Password" , nodeSpecss.get(depth1).getPassword());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".DataDiskSize" , nodeSpecss.get(depth1).getDataDiskSize());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".DataDiskSpecId" , nodeSpecss.get(depth1).getDataDiskSpecId());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".SecurityGroupId" , nodeSpecss.get(depth1).getSecurityGroupId());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".SystemDiskSize" , nodeSpecss.get(depth1).getSystemDiskSize());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".ZoneId" , nodeSpecss.get(depth1).getZoneId());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".NamePrefix" , nodeSpecss.get(depth1).getNamePrefix());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".Cell" , nodeSpecss.get(depth1).getCell());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".ComputerSpecId" , nodeSpecss.get(depth1).getComputerSpecId());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".VswicthId" , nodeSpecss.get(depth1).getVswicthId());
				putBodyParameter("NodeSpecs." + (depth1 + 1) + ".SystemDiskSpecId" , nodeSpecss.get(depth1).getSystemDiskSpecId());
			}
		}	
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
		if(operatorName != null){
			putBodyParameter("OperatorName", operatorName);
		}
	}

	public static class NodeSpecs {

		private Long amount;

		private String password;

		private Long dataDiskSize;

		private String dataDiskSpecId;

		private String securityGroupId;

		private Long systemDiskSize;

		private String zoneId;

		private String namePrefix;

		private String cell;

		private String computerSpecId;

		private String vswicthId;

		private String systemDiskSpecId;

		public Long getAmount() {
			return this.amount;
		}

		public void setAmount(Long amount) {
			this.amount = amount;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Long getDataDiskSize() {
			return this.dataDiskSize;
		}

		public void setDataDiskSize(Long dataDiskSize) {
			this.dataDiskSize = dataDiskSize;
		}

		public String getDataDiskSpecId() {
			return this.dataDiskSpecId;
		}

		public void setDataDiskSpecId(String dataDiskSpecId) {
			this.dataDiskSpecId = dataDiskSpecId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public Long getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Long systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getNamePrefix() {
			return this.namePrefix;
		}

		public void setNamePrefix(String namePrefix) {
			this.namePrefix = namePrefix;
		}

		public String getCell() {
			return this.cell;
		}

		public void setCell(String cell) {
			this.cell = cell;
		}

		public String getComputerSpecId() {
			return this.computerSpecId;
		}

		public void setComputerSpecId(String computerSpecId) {
			this.computerSpecId = computerSpecId;
		}

		public String getVswicthId() {
			return this.vswicthId;
		}

		public void setVswicthId(String vswicthId) {
			this.vswicthId = vswicthId;
		}

		public String getSystemDiskSpecId() {
			return this.systemDiskSpecId;
		}

		public void setSystemDiskSpecId(String systemDiskSpecId) {
			this.systemDiskSpecId = systemDiskSpecId;
		}
	}

	@Override
	public Class<ScaleAKSClusterNodeResponse> getResponseClass() {
		return ScaleAKSClusterNodeResponse.class;
	}

}
