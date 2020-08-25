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

import com.aliyuncs.sofa.model.v20190815.QueryLinkelinkflowLinkflowCurrenttenantResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkelinkflowLinkflowCurrenttenantResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkelinkflowLinkflowCurrenttenantResponseUnmarshaller {

	public static QueryLinkelinkflowLinkflowCurrenttenantResponse unmarshall(QueryLinkelinkflowLinkflowCurrenttenantResponse queryLinkelinkflowLinkflowCurrenttenantResponse, UnmarshallerContext _ctx) {
		
		queryLinkelinkflowLinkflowCurrenttenantResponse.setRequestId(_ctx.stringValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.RequestId"));
		queryLinkelinkflowLinkflowCurrenttenantResponse.setResultCode(_ctx.stringValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.ResultCode"));
		queryLinkelinkflowLinkflowCurrenttenantResponse.setResultMessage(_ctx.stringValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.ResultMessage"));
		queryLinkelinkflowLinkflowCurrenttenantResponse.setCurrent(_ctx.longValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.Current"));
		queryLinkelinkflowLinkflowCurrenttenantResponse.setErrorCode(_ctx.stringValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.ErrorCode"));
		queryLinkelinkflowLinkflowCurrenttenantResponse.setErrorMsg(_ctx.stringValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.ErrorMsg"));
		queryLinkelinkflowLinkflowCurrenttenantResponse.setPageSize(_ctx.longValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.PageSize"));
		queryLinkelinkflowLinkflowCurrenttenantResponse.setResponseStatusCode(_ctx.longValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.ResponseStatusCode"));
		queryLinkelinkflowLinkflowCurrenttenantResponse.setSuccess(_ctx.booleanValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.Success"));
		queryLinkelinkflowLinkflowCurrenttenantResponse.setTotal(_ctx.longValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.Total"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.Data.CreateTime"));
		data.setCustomer(_ctx.stringValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.Data.Customer"));
		data.setDescription(_ctx.stringValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.Data.Description"));
		data.setEnable(_ctx.booleanValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.Data.Enable"));
		data.setId(_ctx.stringValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.Data.Id"));
		data.setName(_ctx.stringValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.Data.Name"));
		data.setOrigin(_ctx.stringValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.Data.Origin"));
		data.setPriority(_ctx.longValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.Data.Priority"));
		data.setSiteId(_ctx.stringValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.Data.SiteId"));
		data.setUpdateTime(_ctx.stringValue("QueryLinkelinkflowLinkflowCurrenttenantResponse.Data.UpdateTime"));
		queryLinkelinkflowLinkflowCurrenttenantResponse.setData(data);
	 
	 	return queryLinkelinkflowLinkflowCurrenttenantResponse;
	}
}