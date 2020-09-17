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
public class ExecLinkeLinktRisksearchRequest extends RpcAcsRequest<ExecLinkeLinktRisksearchResponse> {
	   

	private String limit;

	private String keyword;

	private String projectSign;

	private String start;

	private String finished;

	private String assignedTo;
	public ExecLinkeLinktRisksearchRequest() {
		super("SOFA", "2019-08-15", "ExecLinkeLinktRisksearch", "sofacafedeps");
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

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putBodyParameter("Keyword", keyword);
		}
	}

	public String getProjectSign() {
		return this.projectSign;
	}

	public void setProjectSign(String projectSign) {
		this.projectSign = projectSign;
		if(projectSign != null){
			putBodyParameter("ProjectSign", projectSign);
		}
	}

	public String getStart() {
		return this.start;
	}

	public void setStart(String start) {
		this.start = start;
		if(start != null){
			putBodyParameter("Start", start);
		}
	}

	public String getFinished() {
		return this.finished;
	}

	public void setFinished(String finished) {
		this.finished = finished;
		if(finished != null){
			putBodyParameter("Finished", finished);
		}
	}

	public String getAssignedTo() {
		return this.assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
		if(assignedTo != null){
			putBodyParameter("AssignedTo", assignedTo);
		}
	}

	@Override
	public Class<ExecLinkeLinktRisksearchResponse> getResponseClass() {
		return ExecLinkeLinktRisksearchResponse.class;
	}

}
