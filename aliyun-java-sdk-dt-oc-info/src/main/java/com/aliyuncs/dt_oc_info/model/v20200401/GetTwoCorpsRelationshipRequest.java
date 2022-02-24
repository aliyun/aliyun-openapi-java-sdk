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

package com.aliyuncs.dt_oc_info.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetTwoCorpsRelationshipRequest extends RpcAcsRequest<GetTwoCorpsRelationshipResponse> {
	   

	private String fromCorpName;

	private String endCropName;

	private Integer maxPath;
	public GetTwoCorpsRelationshipRequest() {
		super("dt-oc-info", "2020-04-01", "GetTwoCorpsRelationship");
		setMethod(MethodType.POST);
	}

	public String getFromCorpName() {
		return this.fromCorpName;
	}

	public void setFromCorpName(String fromCorpName) {
		this.fromCorpName = fromCorpName;
		if(fromCorpName != null){
			putQueryParameter("FromCorpName", fromCorpName);
		}
	}

	public String getEndCropName() {
		return this.endCropName;
	}

	public void setEndCropName(String endCropName) {
		this.endCropName = endCropName;
		if(endCropName != null){
			putQueryParameter("EndCropName", endCropName);
		}
	}

	public Integer getMaxPath() {
		return this.maxPath;
	}

	public void setMaxPath(Integer maxPath) {
		this.maxPath = maxPath;
		if(maxPath != null){
			putQueryParameter("MaxPath", maxPath.toString());
		}
	}

	@Override
	public Class<GetTwoCorpsRelationshipResponse> getResponseClass() {
		return GetTwoCorpsRelationshipResponse.class;
	}

}
