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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetWorkitemCommentListRequest extends RoaAcsRequest<GetWorkitemCommentListResponse> {
	   

	private String organizationId;

	private String workitemId;
	public GetWorkitemCommentListRequest() {
		super("devops", "2021-06-25", "GetWorkitemCommentList");
		setUriPattern("/organization/[organizationId]/workitems/[workitemId]/commentList");
		setMethod(MethodType.GET);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public String getWorkitemId() {
		return this.workitemId;
	}

	public void setWorkitemId(String workitemId) {
		this.workitemId = workitemId;
		if(workitemId != null){
			putPathParameter("workitemId", workitemId);
		}
	}

	@Override
	public Class<GetWorkitemCommentListResponse> getResponseClass() {
		return GetWorkitemCommentListResponse.class;
	}

}
