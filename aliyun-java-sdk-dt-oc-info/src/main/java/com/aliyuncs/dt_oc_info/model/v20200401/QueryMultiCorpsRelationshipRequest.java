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
public class QueryMultiCorpsRelationshipRequest extends RpcAcsRequest<QueryMultiCorpsRelationshipResponse> {
	   

	private String corpNames;

	private Integer maxPath;
	public QueryMultiCorpsRelationshipRequest() {
		super("dt-oc-info", "2020-04-01", "QueryMultiCorpsRelationship");
		setMethod(MethodType.POST);
	}

	public String getCorpNames() {
		return this.corpNames;
	}

	public void setCorpNames(String corpNames) {
		this.corpNames = corpNames;
		if(corpNames != null){
			putBodyParameter("CorpNames", corpNames);
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
	public Class<QueryMultiCorpsRelationshipResponse> getResponseClass() {
		return QueryMultiCorpsRelationshipResponse.class;
	}

}
