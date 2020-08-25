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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse unmarshall(QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.RequestId"));
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.ResultCode"));
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.ResultMessage"));
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setColor(_ctx.stringValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.Color"));
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setCreatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.CreatedAt"));
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setDescription(_ctx.stringValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.Description"));
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setGroupId(_ctx.longValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.GroupId"));
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setId(_ctx.longValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.Id"));
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setName(_ctx.stringValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.Name"));
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setProjectId(_ctx.longValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.ProjectId"));
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setSourceType(_ctx.stringValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.SourceType"));
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setTemplate(_ctx.booleanValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.Template"));
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setTenantId(_ctx.longValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.TenantId"));
		queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.setUpdatedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse.UpdatedAt"));
	 
	 	return queryLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse;
	}
}