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

import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowAppResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowAppResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkelinkflowLinkflowAppResponseUnmarshaller {

	public static GetLinkelinkflowLinkflowAppResponse unmarshall(GetLinkelinkflowLinkflowAppResponse getLinkelinkflowLinkflowAppResponse, UnmarshallerContext _ctx) {
		
		getLinkelinkflowLinkflowAppResponse.setRequestId(_ctx.stringValue("GetLinkelinkflowLinkflowAppResponse.RequestId"));
		getLinkelinkflowLinkflowAppResponse.setResultCode(_ctx.stringValue("GetLinkelinkflowLinkflowAppResponse.ResultCode"));
		getLinkelinkflowLinkflowAppResponse.setResultMessage(_ctx.stringValue("GetLinkelinkflowLinkflowAppResponse.ResultMessage"));
		getLinkelinkflowLinkflowAppResponse.setCurrent(_ctx.longValue("GetLinkelinkflowLinkflowAppResponse.Current"));
		getLinkelinkflowLinkflowAppResponse.setErrorCode(_ctx.stringValue("GetLinkelinkflowLinkflowAppResponse.ErrorCode"));
		getLinkelinkflowLinkflowAppResponse.setErrorMsg(_ctx.stringValue("GetLinkelinkflowLinkflowAppResponse.ErrorMsg"));
		getLinkelinkflowLinkflowAppResponse.setPageSize(_ctx.longValue("GetLinkelinkflowLinkflowAppResponse.PageSize"));
		getLinkelinkflowLinkflowAppResponse.setResponseStatusCode(_ctx.longValue("GetLinkelinkflowLinkflowAppResponse.ResponseStatusCode"));
		getLinkelinkflowLinkflowAppResponse.setSuccess(_ctx.booleanValue("GetLinkelinkflowLinkflowAppResponse.Success"));
		getLinkelinkflowLinkflowAppResponse.setTotal(_ctx.longValue("GetLinkelinkflowLinkflowAppResponse.Total"));

		Data data = new Data();
		data.setCnName(_ctx.stringValue("GetLinkelinkflowLinkflowAppResponse.Data.CnName"));
		data.setDescription(_ctx.stringValue("GetLinkelinkflowLinkflowAppResponse.Data.Description"));
		data.setLevel(_ctx.stringValue("GetLinkelinkflowLinkflowAppResponse.Data.Level"));
		data.setMembers(_ctx.stringValue("GetLinkelinkflowLinkflowAppResponse.Data.Members"));
		data.setName(_ctx.stringValue("GetLinkelinkflowLinkflowAppResponse.Data.Name"));
		data.setRepoUrl(_ctx.stringValue("GetLinkelinkflowLinkflowAppResponse.Data.RepoUrl"));
		data.setTenant(_ctx.stringValue("GetLinkelinkflowLinkflowAppResponse.Data.Tenant"));
		getLinkelinkflowLinkflowAppResponse.setData(data);
	 
	 	return getLinkelinkflowLinkflowAppResponse;
	}
}