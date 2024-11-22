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
public class GetDiagnosisResultRequest extends RoaAcsRequest<GetDiagnosisResultResponse> {
	   

	private String diagnosisId;

	private String ownerUid;
	public GetDiagnosisResultRequest() {
		super("qianzhou", "2021-11-11", "GetDiagnosisResult");
		setUriPattern("/popapi/GetDiagnosisResult");
		setMethod(MethodType.GET);
	}

	public String getDiagnosisId() {
		return this.diagnosisId;
	}

	public void setDiagnosisId(String diagnosisId) {
		this.diagnosisId = diagnosisId;
		if(diagnosisId != null){
			putQueryParameter("diagnosisId", diagnosisId);
		}
	}

	public String getOwnerUid() {
		return this.ownerUid;
	}

	public void setOwnerUid(String ownerUid) {
		this.ownerUid = ownerUid;
		if(ownerUid != null){
			putQueryParameter("ownerUid", ownerUid);
		}
	}

	@Override
	public Class<GetDiagnosisResultResponse> getResponseClass() {
		return GetDiagnosisResultResponse.class;
	}

}
