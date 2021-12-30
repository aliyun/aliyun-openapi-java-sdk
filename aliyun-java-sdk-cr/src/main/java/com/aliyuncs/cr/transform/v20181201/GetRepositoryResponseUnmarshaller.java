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

package com.aliyuncs.cr.transform.v20181201;

import com.aliyuncs.cr.model.v20181201.GetRepositoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepositoryResponseUnmarshaller {

	public static GetRepositoryResponse unmarshall(GetRepositoryResponse getRepositoryResponse, UnmarshallerContext _ctx) {
		
		getRepositoryResponse.setRequestId(_ctx.stringValue("GetRepositoryResponse.RequestId"));
		getRepositoryResponse.setSummary(_ctx.stringValue("GetRepositoryResponse.Summary"));
		getRepositoryResponse.setCreateTime(_ctx.longValue("GetRepositoryResponse.CreateTime"));
		getRepositoryResponse.setIsSuccess(_ctx.booleanValue("GetRepositoryResponse.IsSuccess"));
		getRepositoryResponse.setInstanceId(_ctx.stringValue("GetRepositoryResponse.InstanceId"));
		getRepositoryResponse.setRepoStatus(_ctx.stringValue("GetRepositoryResponse.RepoStatus"));
		getRepositoryResponse.setRepoType(_ctx.stringValue("GetRepositoryResponse.RepoType"));
		getRepositoryResponse.setRepoBuildType(_ctx.stringValue("GetRepositoryResponse.RepoBuildType"));
		getRepositoryResponse.setModifiedTime(_ctx.longValue("GetRepositoryResponse.ModifiedTime"));
		getRepositoryResponse.setRepoId(_ctx.stringValue("GetRepositoryResponse.RepoId"));
		getRepositoryResponse.setCode(_ctx.stringValue("GetRepositoryResponse.Code"));
		getRepositoryResponse.setRepoNamespaceName(_ctx.stringValue("GetRepositoryResponse.RepoNamespaceName"));
		getRepositoryResponse.setTagImmutability(_ctx.booleanValue("GetRepositoryResponse.TagImmutability"));
		getRepositoryResponse.setRepoName(_ctx.stringValue("GetRepositoryResponse.RepoName"));
		getRepositoryResponse.setDetail(_ctx.stringValue("GetRepositoryResponse.Detail"));
	 
	 	return getRepositoryResponse;
	}
}