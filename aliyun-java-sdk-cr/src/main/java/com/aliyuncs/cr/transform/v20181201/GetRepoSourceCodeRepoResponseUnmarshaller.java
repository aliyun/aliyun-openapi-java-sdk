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

import com.aliyuncs.cr.model.v20181201.GetRepoSourceCodeRepoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepoSourceCodeRepoResponseUnmarshaller {

	public static GetRepoSourceCodeRepoResponse unmarshall(GetRepoSourceCodeRepoResponse getRepoSourceCodeRepoResponse, UnmarshallerContext _ctx) {
		
		getRepoSourceCodeRepoResponse.setRequestId(_ctx.stringValue("GetRepoSourceCodeRepoResponse.RequestId"));
		getRepoSourceCodeRepoResponse.setCodeRepoType(_ctx.stringValue("GetRepoSourceCodeRepoResponse.CodeRepoType"));
		getRepoSourceCodeRepoResponse.setRepoId(_ctx.stringValue("GetRepoSourceCodeRepoResponse.RepoId"));
		getRepoSourceCodeRepoResponse.setCodeRepoNamespaceName(_ctx.stringValue("GetRepoSourceCodeRepoResponse.CodeRepoNamespaceName"));
		getRepoSourceCodeRepoResponse.setOverseaBuild(_ctx.stringValue("GetRepoSourceCodeRepoResponse.OverseaBuild"));
		getRepoSourceCodeRepoResponse.setCode(_ctx.stringValue("GetRepoSourceCodeRepoResponse.Code"));
		getRepoSourceCodeRepoResponse.setCodeRepoName(_ctx.stringValue("GetRepoSourceCodeRepoResponse.CodeRepoName"));
		getRepoSourceCodeRepoResponse.setAutoBuild(_ctx.stringValue("GetRepoSourceCodeRepoResponse.AutoBuild"));
		getRepoSourceCodeRepoResponse.setIsSuccess(_ctx.booleanValue("GetRepoSourceCodeRepoResponse.IsSuccess"));
		getRepoSourceCodeRepoResponse.setDisableCacheBuild(_ctx.stringValue("GetRepoSourceCodeRepoResponse.DisableCacheBuild"));
		getRepoSourceCodeRepoResponse.setCodeRepoDomain(_ctx.stringValue("GetRepoSourceCodeRepoResponse.CodeRepoDomain"));
	 
	 	return getRepoSourceCodeRepoResponse;
	}
}