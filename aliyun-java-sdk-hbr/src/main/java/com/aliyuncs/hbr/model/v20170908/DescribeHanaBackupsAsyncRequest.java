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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeHanaBackupsAsyncRequest extends RpcAcsRequest<DescribeHanaBackupsAsyncResponse> {
	   

	private Long recoveryPointInTime;

	private Long logPosition;

	private String vaultId;

	private Boolean includeLog;

	private String source;

	private Integer pageNumber;

	private String mode;

	private Boolean includeIncremental;

	private Integer pageSize;

	private String clusterId;

	private Boolean useBackint;

	private String databaseName;

	private Integer volumeId;

	private String sourceClusterId;

	private Boolean includeDifferential;

	private Boolean systemCopy;
	public DescribeHanaBackupsAsyncRequest() {
		super("hbr", "2017-09-08", "DescribeHanaBackupsAsync", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getRecoveryPointInTime() {
		return this.recoveryPointInTime;
	}

	public void setRecoveryPointInTime(Long recoveryPointInTime) {
		this.recoveryPointInTime = recoveryPointInTime;
		if(recoveryPointInTime != null){
			putQueryParameter("RecoveryPointInTime", recoveryPointInTime.toString());
		}
	}

	public Long getLogPosition() {
		return this.logPosition;
	}

	public void setLogPosition(Long logPosition) {
		this.logPosition = logPosition;
		if(logPosition != null){
			putQueryParameter("LogPosition", logPosition.toString());
		}
	}

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
		if(vaultId != null){
			putQueryParameter("VaultId", vaultId);
		}
	}

	public Boolean getIncludeLog() {
		return this.includeLog;
	}

	public void setIncludeLog(Boolean includeLog) {
		this.includeLog = includeLog;
		if(includeLog != null){
			putQueryParameter("IncludeLog", includeLog.toString());
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
	}

	public Boolean getIncludeIncremental() {
		return this.includeIncremental;
	}

	public void setIncludeIncremental(Boolean includeIncremental) {
		this.includeIncremental = includeIncremental;
		if(includeIncremental != null){
			putQueryParameter("IncludeIncremental", includeIncremental.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public Boolean getUseBackint() {
		return this.useBackint;
	}

	public void setUseBackint(Boolean useBackint) {
		this.useBackint = useBackint;
		if(useBackint != null){
			putQueryParameter("UseBackint", useBackint.toString());
		}
	}

	public String getDatabaseName() {
		return this.databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
		if(databaseName != null){
			putQueryParameter("DatabaseName", databaseName);
		}
	}

	public Integer getVolumeId() {
		return this.volumeId;
	}

	public void setVolumeId(Integer volumeId) {
		this.volumeId = volumeId;
		if(volumeId != null){
			putQueryParameter("VolumeId", volumeId.toString());
		}
	}

	public String getSourceClusterId() {
		return this.sourceClusterId;
	}

	public void setSourceClusterId(String sourceClusterId) {
		this.sourceClusterId = sourceClusterId;
		if(sourceClusterId != null){
			putQueryParameter("SourceClusterId", sourceClusterId);
		}
	}

	public Boolean getIncludeDifferential() {
		return this.includeDifferential;
	}

	public void setIncludeDifferential(Boolean includeDifferential) {
		this.includeDifferential = includeDifferential;
		if(includeDifferential != null){
			putQueryParameter("IncludeDifferential", includeDifferential.toString());
		}
	}

	public Boolean getSystemCopy() {
		return this.systemCopy;
	}

	public void setSystemCopy(Boolean systemCopy) {
		this.systemCopy = systemCopy;
		if(systemCopy != null){
			putQueryParameter("SystemCopy", systemCopy.toString());
		}
	}

	@Override
	public Class<DescribeHanaBackupsAsyncResponse> getResponseClass() {
		return DescribeHanaBackupsAsyncResponse.class;
	}

}
