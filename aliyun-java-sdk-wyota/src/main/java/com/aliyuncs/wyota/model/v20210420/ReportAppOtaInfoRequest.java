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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ReportAppOtaInfoRequest extends RpcAcsRequest<ReportAppOtaInfoResponse> {
	   

	private String note;

	private Integer clientType;

	private String taskUid;

	private String clientUid;

	private String targetVersion;

	private String project;

	private String osType;

	private String baseVersion;

	private Integer status;
	public ReportAppOtaInfoRequest() {
		super("wyota", "2021-04-20", "ReportAppOtaInfo");
		setMethod(MethodType.POST);
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
		if(note != null){
			putQueryParameter("Note", note);
		}
	}

	public Integer getClientType() {
		return this.clientType;
	}

	public void setClientType(Integer clientType) {
		this.clientType = clientType;
		if(clientType != null){
			putQueryParameter("ClientType", clientType.toString());
		}
	}

	public String getTaskUid() {
		return this.taskUid;
	}

	public void setTaskUid(String taskUid) {
		this.taskUid = taskUid;
		if(taskUid != null){
			putQueryParameter("TaskUid", taskUid);
		}
	}

	public String getClientUid() {
		return this.clientUid;
	}

	public void setClientUid(String clientUid) {
		this.clientUid = clientUid;
		if(clientUid != null){
			putQueryParameter("ClientUid", clientUid);
		}
	}

	public String getTargetVersion() {
		return this.targetVersion;
	}

	public void setTargetVersion(String targetVersion) {
		this.targetVersion = targetVersion;
		if(targetVersion != null){
			putQueryParameter("TargetVersion", targetVersion);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
		if(osType != null){
			putQueryParameter("OsType", osType);
		}
	}

	public String getBaseVersion() {
		return this.baseVersion;
	}

	public void setBaseVersion(String baseVersion) {
		this.baseVersion = baseVersion;
		if(baseVersion != null){
			putQueryParameter("BaseVersion", baseVersion);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<ReportAppOtaInfoResponse> getResponseClass() {
		return ReportAppOtaInfoResponse.class;
	}

}
