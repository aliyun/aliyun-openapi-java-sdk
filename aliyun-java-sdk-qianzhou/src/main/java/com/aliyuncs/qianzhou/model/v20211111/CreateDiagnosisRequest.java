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

package com.aliyuncs.qianzhou.model.v20211111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateDiagnosisRequest extends RoaAcsRequest<CreateDiagnosisResponse> {
	   

	private String diagnosisType;

	private String clusterID;

	private String body;
	public CreateDiagnosisRequest() {
		super("qianzhou", "2021-11-11", "CreateDiagnosis");
		setUriPattern("/popapi/createDiagnosis");
		setMethod(MethodType.POST);
	}

	public String getDiagnosisType() {
		return this.diagnosisType;
	}

	public void setDiagnosisType(String diagnosisType) {
		this.diagnosisType = diagnosisType;
		if(diagnosisType != null){
			putQueryParameter("diagnosisType", diagnosisType);
		}
	}

	public String getClusterID() {
		return this.clusterID;
	}

	public void setClusterID(String clusterID) {
		this.clusterID = clusterID;
		if(clusterID != null){
			putQueryParameter("clusterID", clusterID);
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
	}

	@Override
	public Class<CreateDiagnosisResponse> getResponseClass() {
		return CreateDiagnosisResponse.class;
	}

}
