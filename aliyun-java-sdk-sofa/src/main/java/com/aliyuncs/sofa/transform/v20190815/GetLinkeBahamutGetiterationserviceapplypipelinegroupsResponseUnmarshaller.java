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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.Paginator;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponseUnmarshaller {

	public static GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse unmarshall(GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse getLinkeBahamutGetiterationserviceapplypipelinegroupsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.RequestId"));
		getLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.ResultCode"));
		getLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.ResultMessage"));
		getLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.ErrorMessage"));
		getLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.Message"));
		getLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.ResponseStatusCode"));
		getLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.setResult(_ctx.stringValue("GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.Result"));
		getLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.Paginator.PageSize"));
		getLinkeBahamutGetiterationserviceapplypipelinegroupsResponse.setPaginator(paginator);
	 
	 	return getLinkeBahamutGetiterationserviceapplypipelinegroupsResponse;
	}
}