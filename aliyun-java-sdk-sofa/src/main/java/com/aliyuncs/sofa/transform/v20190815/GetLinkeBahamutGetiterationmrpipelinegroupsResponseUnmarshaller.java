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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutGetiterationmrpipelinegroupsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutGetiterationmrpipelinegroupsResponse.Paginator;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutGetiterationmrpipelinegroupsResponseUnmarshaller {

	public static GetLinkeBahamutGetiterationmrpipelinegroupsResponse unmarshall(GetLinkeBahamutGetiterationmrpipelinegroupsResponse getLinkeBahamutGetiterationmrpipelinegroupsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutGetiterationmrpipelinegroupsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutGetiterationmrpipelinegroupsResponse.RequestId"));
		getLinkeBahamutGetiterationmrpipelinegroupsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutGetiterationmrpipelinegroupsResponse.ResultCode"));
		getLinkeBahamutGetiterationmrpipelinegroupsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutGetiterationmrpipelinegroupsResponse.ResultMessage"));
		getLinkeBahamutGetiterationmrpipelinegroupsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutGetiterationmrpipelinegroupsResponse.ErrorMessage"));
		getLinkeBahamutGetiterationmrpipelinegroupsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutGetiterationmrpipelinegroupsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutGetiterationmrpipelinegroupsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutGetiterationmrpipelinegroupsResponse.Message"));
		getLinkeBahamutGetiterationmrpipelinegroupsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutGetiterationmrpipelinegroupsResponse.ResponseStatusCode"));
		getLinkeBahamutGetiterationmrpipelinegroupsResponse.setResult(_ctx.stringValue("GetLinkeBahamutGetiterationmrpipelinegroupsResponse.Result"));
		getLinkeBahamutGetiterationmrpipelinegroupsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutGetiterationmrpipelinegroupsResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutGetiterationmrpipelinegroupsResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutGetiterationmrpipelinegroupsResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutGetiterationmrpipelinegroupsResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutGetiterationmrpipelinegroupsResponse.Paginator.PageSize"));
		getLinkeBahamutGetiterationmrpipelinegroupsResponse.setPaginator(paginator);
	 
	 	return getLinkeBahamutGetiterationmrpipelinegroupsResponse;
	}
}