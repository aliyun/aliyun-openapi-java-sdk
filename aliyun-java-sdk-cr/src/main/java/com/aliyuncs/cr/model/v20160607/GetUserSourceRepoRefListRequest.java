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

package com.aliyuncs.cr.model.v20160607;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetUserSourceRepoRefListRequest extends RoaAcsRequest<GetUserSourceRepoRefListResponse> {
	
	public GetUserSourceRepoRefListRequest() {
		super("cr", "2016-06-07", "GetUserSourceRepoRefList", "cr");
		setUriPattern("/users/sourceAccount/[SourceAccountId]/repos/[SourceRepoNamespace]/[SourceRepoName]/refs");
		setMethod(MethodType.GET);
	}

	private Long sourceAccountId;

	private String sourceRepoName;

	private String sourceRepoNamespace;

	public Long getSourceAccountId() {
		return this.sourceAccountId;
	}

	public void setSourceAccountId(Long sourceAccountId) {
		this.sourceAccountId = sourceAccountId;
		if(sourceAccountId != null){
			putPathParameter("SourceAccountId", sourceAccountId.toString());
		}
	}

	public String getSourceRepoName() {
		return this.sourceRepoName;
	}

	public void setSourceRepoName(String sourceRepoName) {
		this.sourceRepoName = sourceRepoName;
		if(sourceRepoName != null){
			putPathParameter("SourceRepoName", sourceRepoName);
		}
	}

	public String getSourceRepoNamespace() {
		return this.sourceRepoNamespace;
	}

	public void setSourceRepoNamespace(String sourceRepoNamespace) {
		this.sourceRepoNamespace = sourceRepoNamespace;
		if(sourceRepoNamespace != null){
			putPathParameter("SourceRepoNamespace", sourceRepoNamespace);
		}
	}

	@Override
	public Class<GetUserSourceRepoRefListResponse> getResponseClass() {
		return GetUserSourceRepoRefListResponse.class;
	}

}
