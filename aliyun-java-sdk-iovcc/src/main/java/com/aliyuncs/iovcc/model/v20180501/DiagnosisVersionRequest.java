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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DiagnosisVersionRequest extends RpcAcsRequest<DiagnosisVersionResponse> {
	   

	private String startTime;

	private String versionId;

	private String originalId;

	private String projectId;

	private String diagnoseStyle;

	private String endTime;

	private String idType;

	private String versionType;
	public DiagnosisVersionRequest() {
		super("iovcc", "2018-05-01", "DiagnosisVersion", "iovcc");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId);
		}
	}

	public String getOriginalId() {
		return this.originalId;
	}

	public void setOriginalId(String originalId) {
		this.originalId = originalId;
		if(originalId != null){
			putQueryParameter("OriginalId", originalId);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getDiagnoseStyle() {
		return this.diagnoseStyle;
	}

	public void setDiagnoseStyle(String diagnoseStyle) {
		this.diagnoseStyle = diagnoseStyle;
		if(diagnoseStyle != null){
			putQueryParameter("DiagnoseStyle", diagnoseStyle);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
		if(idType != null){
			putQueryParameter("IdType", idType);
		}
	}

	public String getVersionType() {
		return this.versionType;
	}

	public void setVersionType(String versionType) {
		this.versionType = versionType;
		if(versionType != null){
			putQueryParameter("VersionType", versionType);
		}
	}

	@Override
	public Class<DiagnosisVersionResponse> getResponseClass() {
		return DiagnosisVersionResponse.class;
	}

}
