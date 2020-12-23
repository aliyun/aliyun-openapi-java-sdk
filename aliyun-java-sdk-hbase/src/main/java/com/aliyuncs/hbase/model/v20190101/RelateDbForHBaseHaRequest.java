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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbase.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RelateDbForHBaseHaRequest extends RpcAcsRequest<RelateDbForHBaseHaResponse> {
	   

	private String haMigrateType;

	private String haActiveHdfsUri;

	private String haStandbyVersion;

	private Boolean isStandbyStandard;

	private String haActiveClusterKey;

	private String haStandbyPassword;

	private String haStandbyClusterKey;

	private String haStandbyHbaseFsDir;

	private String haActiveHbaseFsDir;

	private String haActiveDBType;

	private String haActivePassword;

	private Boolean isActiveStandard;

	private String haStandbyUser;

	private String haActive;

	private String haStandby;

	private String haStandbyHdfsUri;

	private String haActiveVersion;

	private String clusterId;

	private String haStandbyDBType;

	private String haTables;

	private String haActiveUser;
	public RelateDbForHBaseHaRequest() {
		super("HBase", "2019-01-01", "RelateDbForHBaseHa", "hbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHaMigrateType() {
		return this.haMigrateType;
	}

	public void setHaMigrateType(String haMigrateType) {
		this.haMigrateType = haMigrateType;
		if(haMigrateType != null){
			putQueryParameter("HaMigrateType", haMigrateType);
		}
	}

	public String getHaActiveHdfsUri() {
		return this.haActiveHdfsUri;
	}

	public void setHaActiveHdfsUri(String haActiveHdfsUri) {
		this.haActiveHdfsUri = haActiveHdfsUri;
		if(haActiveHdfsUri != null){
			putQueryParameter("HaActiveHdfsUri", haActiveHdfsUri);
		}
	}

	public String getHaStandbyVersion() {
		return this.haStandbyVersion;
	}

	public void setHaStandbyVersion(String haStandbyVersion) {
		this.haStandbyVersion = haStandbyVersion;
		if(haStandbyVersion != null){
			putQueryParameter("HaStandbyVersion", haStandbyVersion);
		}
	}

	public Boolean getIsStandbyStandard() {
		return this.isStandbyStandard;
	}

	public void setIsStandbyStandard(Boolean isStandbyStandard) {
		this.isStandbyStandard = isStandbyStandard;
		if(isStandbyStandard != null){
			putQueryParameter("IsStandbyStandard", isStandbyStandard.toString());
		}
	}

	public String getHaActiveClusterKey() {
		return this.haActiveClusterKey;
	}

	public void setHaActiveClusterKey(String haActiveClusterKey) {
		this.haActiveClusterKey = haActiveClusterKey;
		if(haActiveClusterKey != null){
			putQueryParameter("HaActiveClusterKey", haActiveClusterKey);
		}
	}

	public String getHaStandbyPassword() {
		return this.haStandbyPassword;
	}

	public void setHaStandbyPassword(String haStandbyPassword) {
		this.haStandbyPassword = haStandbyPassword;
		if(haStandbyPassword != null){
			putQueryParameter("HaStandbyPassword", haStandbyPassword);
		}
	}

	public String getHaStandbyClusterKey() {
		return this.haStandbyClusterKey;
	}

	public void setHaStandbyClusterKey(String haStandbyClusterKey) {
		this.haStandbyClusterKey = haStandbyClusterKey;
		if(haStandbyClusterKey != null){
			putQueryParameter("HaStandbyClusterKey", haStandbyClusterKey);
		}
	}

	public String getHaStandbyHbaseFsDir() {
		return this.haStandbyHbaseFsDir;
	}

	public void setHaStandbyHbaseFsDir(String haStandbyHbaseFsDir) {
		this.haStandbyHbaseFsDir = haStandbyHbaseFsDir;
		if(haStandbyHbaseFsDir != null){
			putQueryParameter("HaStandbyHbaseFsDir", haStandbyHbaseFsDir);
		}
	}

	public String getHaActiveHbaseFsDir() {
		return this.haActiveHbaseFsDir;
	}

	public void setHaActiveHbaseFsDir(String haActiveHbaseFsDir) {
		this.haActiveHbaseFsDir = haActiveHbaseFsDir;
		if(haActiveHbaseFsDir != null){
			putQueryParameter("HaActiveHbaseFsDir", haActiveHbaseFsDir);
		}
	}

	public String getHaActiveDBType() {
		return this.haActiveDBType;
	}

	public void setHaActiveDBType(String haActiveDBType) {
		this.haActiveDBType = haActiveDBType;
		if(haActiveDBType != null){
			putQueryParameter("HaActiveDBType", haActiveDBType);
		}
	}

	public String getHaActivePassword() {
		return this.haActivePassword;
	}

	public void setHaActivePassword(String haActivePassword) {
		this.haActivePassword = haActivePassword;
		if(haActivePassword != null){
			putQueryParameter("HaActivePassword", haActivePassword);
		}
	}

	public Boolean getIsActiveStandard() {
		return this.isActiveStandard;
	}

	public void setIsActiveStandard(Boolean isActiveStandard) {
		this.isActiveStandard = isActiveStandard;
		if(isActiveStandard != null){
			putQueryParameter("IsActiveStandard", isActiveStandard.toString());
		}
	}

	public String getHaStandbyUser() {
		return this.haStandbyUser;
	}

	public void setHaStandbyUser(String haStandbyUser) {
		this.haStandbyUser = haStandbyUser;
		if(haStandbyUser != null){
			putQueryParameter("HaStandbyUser", haStandbyUser);
		}
	}

	public String getHaActive() {
		return this.haActive;
	}

	public void setHaActive(String haActive) {
		this.haActive = haActive;
		if(haActive != null){
			putQueryParameter("HaActive", haActive);
		}
	}

	public String getHaStandby() {
		return this.haStandby;
	}

	public void setHaStandby(String haStandby) {
		this.haStandby = haStandby;
		if(haStandby != null){
			putQueryParameter("HaStandby", haStandby);
		}
	}

	public String getHaStandbyHdfsUri() {
		return this.haStandbyHdfsUri;
	}

	public void setHaStandbyHdfsUri(String haStandbyHdfsUri) {
		this.haStandbyHdfsUri = haStandbyHdfsUri;
		if(haStandbyHdfsUri != null){
			putQueryParameter("HaStandbyHdfsUri", haStandbyHdfsUri);
		}
	}

	public String getHaActiveVersion() {
		return this.haActiveVersion;
	}

	public void setHaActiveVersion(String haActiveVersion) {
		this.haActiveVersion = haActiveVersion;
		if(haActiveVersion != null){
			putQueryParameter("HaActiveVersion", haActiveVersion);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getHaStandbyDBType() {
		return this.haStandbyDBType;
	}

	public void setHaStandbyDBType(String haStandbyDBType) {
		this.haStandbyDBType = haStandbyDBType;
		if(haStandbyDBType != null){
			putQueryParameter("HaStandbyDBType", haStandbyDBType);
		}
	}

	public String getHaTables() {
		return this.haTables;
	}

	public void setHaTables(String haTables) {
		this.haTables = haTables;
		if(haTables != null){
			putQueryParameter("HaTables", haTables);
		}
	}

	public String getHaActiveUser() {
		return this.haActiveUser;
	}

	public void setHaActiveUser(String haActiveUser) {
		this.haActiveUser = haActiveUser;
		if(haActiveUser != null){
			putQueryParameter("HaActiveUser", haActiveUser);
		}
	}

	@Override
	public Class<RelateDbForHBaseHaResponse> getResponseClass() {
		return RelateDbForHBaseHaResponse.class;
	}

}
