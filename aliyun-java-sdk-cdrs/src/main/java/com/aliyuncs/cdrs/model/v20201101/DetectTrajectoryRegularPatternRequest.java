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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DetectTrajectoryRegularPatternRequest extends RpcAcsRequest<DetectTrajectoryRegularPatternResponse> {
	   

	private String predictDate;

	private String corpId;

	private String idValue;

	private String idType;
	public DetectTrajectoryRegularPatternRequest() {
		super("CDRS", "2020-11-01", "DetectTrajectoryRegularPattern");
		setMethod(MethodType.POST);
	}

	public String getPredictDate() {
		return this.predictDate;
	}

	public void setPredictDate(String predictDate) {
		this.predictDate = predictDate;
		if(predictDate != null){
			putBodyParameter("PredictDate", predictDate);
		}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getIdValue() {
		return this.idValue;
	}

	public void setIdValue(String idValue) {
		this.idValue = idValue;
		if(idValue != null){
			putBodyParameter("IdValue", idValue);
		}
	}

	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
		if(idType != null){
			putBodyParameter("IdType", idType);
		}
	}

	@Override
	public Class<DetectTrajectoryRegularPatternResponse> getResponseClass() {
		return DetectTrajectoryRegularPatternResponse.class;
	}

}
