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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateJobRequest extends RpcAcsRequest<UpdateJobResponse> {
	   

	private String currentSnapshotId;

	private String clientId;

	private String vaultId;

	private String jobStatus;

	private String source;

	private String jobId;

	private String policyId;

	private String jobOption;

	private String exclude;

	private String jobName;

	private Long retention;

	private String include;

	private String token;

	private String schedule;

	private String lastSnapshotId;
	public UpdateJobRequest() {
		super("hbr", "2017-09-08", "UpdateJob", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCurrentSnapshotId() {
		return this.currentSnapshotId;
	}

	public void setCurrentSnapshotId(String currentSnapshotId) {
		this.currentSnapshotId = currentSnapshotId;
		if(currentSnapshotId != null){
			putQueryParameter("CurrentSnapshotId", currentSnapshotId);
		}
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
		if(clientId != null){
			putQueryParameter("ClientId", clientId);
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

	public String getJobStatus() {
		return this.jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
		if(jobStatus != null){
			putQueryParameter("JobStatus", jobStatus);
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

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
		}
	}

	public String getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
		if(policyId != null){
			putQueryParameter("PolicyId", policyId);
		}
	}

	public String getJobOption() {
		return this.jobOption;
	}

	public void setJobOption(String jobOption) {
		this.jobOption = jobOption;
		if(jobOption != null){
			putQueryParameter("JobOption", jobOption);
		}
	}

	public String getExclude() {
		return this.exclude;
	}

	public void setExclude(String exclude) {
		this.exclude = exclude;
		if(exclude != null){
			putBodyParameter("Exclude", exclude);
		}
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
		if(jobName != null){
			putQueryParameter("JobName", jobName);
		}
	}

	public Long getRetention() {
		return this.retention;
	}

	public void setRetention(Long retention) {
		this.retention = retention;
		if(retention != null){
			putQueryParameter("Retention", retention.toString());
		}
	}

	public String getInclude() {
		return this.include;
	}

	public void setInclude(String include) {
		this.include = include;
		if(include != null){
			putBodyParameter("Include", include);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getSchedule() {
		return this.schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
		if(schedule != null){
			putQueryParameter("Schedule", schedule);
		}
	}

	public String getLastSnapshotId() {
		return this.lastSnapshotId;
	}

	public void setLastSnapshotId(String lastSnapshotId) {
		this.lastSnapshotId = lastSnapshotId;
		if(lastSnapshotId != null){
			putQueryParameter("LastSnapshotId", lastSnapshotId);
		}
	}

	@Override
	public Class<UpdateJobResponse> getResponseClass() {
		return UpdateJobResponse.class;
	}

}
