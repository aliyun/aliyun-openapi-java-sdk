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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryEcsClusterInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryEcsClusterInfoResponse extends AcsResponse {

	private String supportStorageType;

	private Integer ncCount;

	private String deployType;

	private String networkArch;

	private String agIp;

	private String requestId;

	private String zoneId;

	private String instanceFamily;

	private String clusterName;

	private Integer clusterConfig;

	private String regionName;

	private String regionNo;

	public String getSupportStorageType() {
		return this.supportStorageType;
	}

	public void setSupportStorageType(String supportStorageType) {
		this.supportStorageType = supportStorageType;
	}

	public Integer getNcCount() {
		return this.ncCount;
	}

	public void setNcCount(Integer ncCount) {
		this.ncCount = ncCount;
	}

	public String getDeployType() {
		return this.deployType;
	}

	public void setDeployType(String deployType) {
		this.deployType = deployType;
	}

	public String getNetworkArch() {
		return this.networkArch;
	}

	public void setNetworkArch(String networkArch) {
		this.networkArch = networkArch;
	}

	public String getAgIp() {
		return this.agIp;
	}

	public void setAgIp(String agIp) {
		this.agIp = agIp;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getInstanceFamily() {
		return this.instanceFamily;
	}

	public void setInstanceFamily(String instanceFamily) {
		this.instanceFamily = instanceFamily;
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public Integer getClusterConfig() {
		return this.clusterConfig;
	}

	public void setClusterConfig(Integer clusterConfig) {
		this.clusterConfig = clusterConfig;
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
	}

	@Override
	public OpsQueryEcsClusterInfoResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryEcsClusterInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
