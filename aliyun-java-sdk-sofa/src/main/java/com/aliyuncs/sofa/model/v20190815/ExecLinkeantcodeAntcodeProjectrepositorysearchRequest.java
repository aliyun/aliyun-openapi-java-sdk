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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExecLinkeantcodeAntcodeProjectrepositorysearchRequest extends RpcAcsRequest<ExecLinkeantcodeAntcodeProjectrepositorysearchResponse> {
	   

	private String limit;

	private String id;

	private String requestGitOperate;

	private String query;

	private String refName;
	public ExecLinkeantcodeAntcodeProjectrepositorysearchRequest() {
		super("SOFA", "2019-08-15", "ExecLinkeantcodeAntcodeProjectrepositorysearch", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLimit() {
		return this.limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
		if(limit != null){
			putBodyParameter("Limit", limit);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
		if(query != null){
			putBodyParameter("Query", query);
		}
	}

	public String getRefName() {
		return this.refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
		if(refName != null){
			putBodyParameter("RefName", refName);
		}
	}

	@Override
	public Class<ExecLinkeantcodeAntcodeProjectrepositorysearchResponse> getResponseClass() {
		return ExecLinkeantcodeAntcodeProjectrepositorysearchResponse.class;
	}

}
