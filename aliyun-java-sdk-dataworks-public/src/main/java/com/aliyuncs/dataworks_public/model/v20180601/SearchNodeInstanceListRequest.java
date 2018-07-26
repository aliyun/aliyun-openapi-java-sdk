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

package com.aliyuncs.dataworks_public.model.v20180601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SearchNodeInstanceListRequest extends RpcAcsRequest<SearchNodeInstanceListResponse> {
	
	public SearchNodeInstanceListRequest() {
		super("dataworks-public", "2018-06-01", "SearchNodeInstanceList");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private String projectName;

	private Long dagId;

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public Long getDagId() {
		return this.dagId;
	}

	public void setDagId(Long dagId) {
		this.dagId = dagId;
		if(dagId != null){
			putQueryParameter("DagId", dagId.toString());
		}
	}

	@Override
	public Class<SearchNodeInstanceListResponse> getResponseClass() {
		return SearchNodeInstanceListResponse.class;
	}

}
