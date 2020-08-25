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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.Paginator;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponseUnmarshaller {

	public static GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse unmarshall(GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse getLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.RequestId"));
		getLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.ResultCode"));
		getLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.ResultMessage"));
		getLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.ErrorMessage"));
		getLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.Message"));
		getLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.ResponseStatusCode"));
		getLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.setResult(_ctx.stringValue("GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.Result"));
		getLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.Success"));

		Paginator paginator = new Paginator();
		paginator.setItemCount(_ctx.longValue("GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.Paginator.ItemCount"));
		paginator.setPage(_ctx.longValue("GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.Paginator.Page"));
		paginator.setPageCount(_ctx.longValue("GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.Paginator.PageCount"));
		paginator.setPageSize(_ctx.longValue("GetLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.Paginator.PageSize"));
		getLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse.setPaginator(paginator);
	 
	 	return getLinkeBahamutIterationgetnewpipelineofgroupoftimelineResponse;
	}
}