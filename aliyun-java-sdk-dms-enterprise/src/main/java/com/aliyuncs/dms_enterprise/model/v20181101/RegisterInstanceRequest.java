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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RegisterInstanceRequest extends RpcAcsRequest<RegisterInstanceResponse> {
	
	public RegisterInstanceRequest() {
		super("dms-enterprise", "2018-11-01", "RegisterInstance", "dmsenterprise");
	}

	private String ecsInstanceId;

	private String ecsRegion;

	private Integer exportTimeout;

	private String databasePassword;

	private String instanceAlias;

	private String networkType;

	private Long tid;

	private String sid;

	private String databaseUser;

	private Integer port;

	private String vpcId;

	private String instanceSource;

	private String envType;

	private String host;

	private String instanceType;

	private Integer queryTimeout;

	private Long dbaUid;

	private String safeRule;

	public String getEcsInstanceId() {
		return this.ecsInstanceId;
	}

	public void setEcsInstanceId(String ecsInstanceId) {
		this.ecsInstanceId = ecsInstanceId;
		if(ecsInstanceId != null){
			putQueryParameter("EcsInstanceId", ecsInstanceId);
		}
	}

	public String getEcsRegion() {
		return this.ecsRegion;
	}

	public void setEcsRegion(String ecsRegion) {
		this.ecsRegion = ecsRegion;
		if(ecsRegion != null){
			putQueryParameter("EcsRegion", ecsRegion);
		}
	}

	public Integer getExportTimeout() {
		return this.exportTimeout;
	}

	public void setExportTimeout(Integer exportTimeout) {
		this.exportTimeout = exportTimeout;
		if(exportTimeout != null){
			putQueryParameter("ExportTimeout", exportTimeout.toString());
		}
	}

	public String getDatabasePassword() {
		return this.databasePassword;
	}

	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
		if(databasePassword != null){
			putQueryParameter("DatabasePassword", databasePassword);
		}
	}

	public String getInstanceAlias() {
		return this.instanceAlias;
	}

	public void setInstanceAlias(String instanceAlias) {
		this.instanceAlias = instanceAlias;
		if(instanceAlias != null){
			putQueryParameter("InstanceAlias", instanceAlias);
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
		if(sid != null){
			putQueryParameter("Sid", sid);
		}
	}

	public String getDatabaseUser() {
		return this.databaseUser;
	}

	public void setDatabaseUser(String databaseUser) {
		this.databaseUser = databaseUser;
		if(databaseUser != null){
			putQueryParameter("DatabaseUser", databaseUser);
		}
	}

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port.toString());
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getInstanceSource() {
		return this.instanceSource;
	}

	public void setInstanceSource(String instanceSource) {
		this.instanceSource = instanceSource;
		if(instanceSource != null){
			putQueryParameter("InstanceSource", instanceSource);
		}
	}

	public String getEnvType() {
		return this.envType;
	}

	public void setEnvType(String envType) {
		this.envType = envType;
		if(envType != null){
			putQueryParameter("EnvType", envType);
		}
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
		if(host != null){
			putQueryParameter("Host", host);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public Integer getQueryTimeout() {
		return this.queryTimeout;
	}

	public void setQueryTimeout(Integer queryTimeout) {
		this.queryTimeout = queryTimeout;
		if(queryTimeout != null){
			putQueryParameter("QueryTimeout", queryTimeout.toString());
		}
	}

	public Long getDbaUid() {
		return this.dbaUid;
	}

	public void setDbaUid(Long dbaUid) {
		this.dbaUid = dbaUid;
		if(dbaUid != null){
			putQueryParameter("DbaUid", dbaUid.toString());
		}
	}

	public String getSafeRule() {
		return this.safeRule;
	}

	public void setSafeRule(String safeRule) {
		this.safeRule = safeRule;
		if(safeRule != null){
			putQueryParameter("SafeRule", safeRule);
		}
	}

	@Override
	public Class<RegisterInstanceResponse> getResponseClass() {
		return RegisterInstanceResponse.class;
	}

}
