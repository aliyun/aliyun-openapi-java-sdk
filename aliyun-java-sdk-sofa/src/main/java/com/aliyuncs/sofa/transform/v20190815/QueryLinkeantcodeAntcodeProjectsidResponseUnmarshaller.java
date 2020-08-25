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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeProjectsidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeProjectsidResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeProjectsidResponse unmarshall(QueryLinkeantcodeAntcodeProjectsidResponse queryLinkeantcodeAntcodeProjectsidResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeProjectsidResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidResponse.RequestId"));
		queryLinkeantcodeAntcodeProjectsidResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidResponse.ResultCode"));
		queryLinkeantcodeAntcodeProjectsidResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidResponse.ResultMessage"));
		queryLinkeantcodeAntcodeProjectsidResponse.setDescription(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidResponse.Description"));
		queryLinkeantcodeAntcodeProjectsidResponse.setHttpUrlToRepo(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidResponse.HttpUrlToRepo"));
		queryLinkeantcodeAntcodeProjectsidResponse.setId(_ctx.longValue("QueryLinkeantcodeAntcodeProjectsidResponse.Id"));
		queryLinkeantcodeAntcodeProjectsidResponse.setLastActivityAt(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidResponse.LastActivityAt"));
		queryLinkeantcodeAntcodeProjectsidResponse.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidResponse.Name"));
		queryLinkeantcodeAntcodeProjectsidResponse.setNameWithNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidResponse.NameWithNamespace"));
		queryLinkeantcodeAntcodeProjectsidResponse.setPath(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidResponse.Path"));
		queryLinkeantcodeAntcodeProjectsidResponse.setPathWithNamespace(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidResponse.PathWithNamespace"));
		queryLinkeantcodeAntcodeProjectsidResponse.setRepositorySize(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidResponse.RepositorySize"));
		queryLinkeantcodeAntcodeProjectsidResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeProjectsidResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeProjectsidResponse.setSshUrlToRepo(_ctx.stringValue("QueryLinkeantcodeAntcodeProjectsidResponse.SshUrlToRepo"));
		queryLinkeantcodeAntcodeProjectsidResponse.setVisibilityLevel(_ctx.longValue("QueryLinkeantcodeAntcodeProjectsidResponse.VisibilityLevel"));
	 
	 	return queryLinkeantcodeAntcodeProjectsidResponse;
	}
}