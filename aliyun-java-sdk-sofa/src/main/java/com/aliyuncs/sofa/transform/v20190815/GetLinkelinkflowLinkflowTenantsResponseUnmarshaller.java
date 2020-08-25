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

import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowTenantsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowTenantsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkelinkflowLinkflowTenantsResponseUnmarshaller {

	public static GetLinkelinkflowLinkflowTenantsResponse unmarshall(GetLinkelinkflowLinkflowTenantsResponse getLinkelinkflowLinkflowTenantsResponse, UnmarshallerContext _ctx) {
		
		getLinkelinkflowLinkflowTenantsResponse.setRequestId(_ctx.stringValue("GetLinkelinkflowLinkflowTenantsResponse.RequestId"));
		getLinkelinkflowLinkflowTenantsResponse.setResultCode(_ctx.stringValue("GetLinkelinkflowLinkflowTenantsResponse.ResultCode"));
		getLinkelinkflowLinkflowTenantsResponse.setResultMessage(_ctx.stringValue("GetLinkelinkflowLinkflowTenantsResponse.ResultMessage"));
		getLinkelinkflowLinkflowTenantsResponse.setCurrent(_ctx.longValue("GetLinkelinkflowLinkflowTenantsResponse.Current"));
		getLinkelinkflowLinkflowTenantsResponse.setErrorCode(_ctx.stringValue("GetLinkelinkflowLinkflowTenantsResponse.ErrorCode"));
		getLinkelinkflowLinkflowTenantsResponse.setErrorMsg(_ctx.stringValue("GetLinkelinkflowLinkflowTenantsResponse.ErrorMsg"));
		getLinkelinkflowLinkflowTenantsResponse.setPageSize(_ctx.longValue("GetLinkelinkflowLinkflowTenantsResponse.PageSize"));
		getLinkelinkflowLinkflowTenantsResponse.setResponseStatusCode(_ctx.longValue("GetLinkelinkflowLinkflowTenantsResponse.ResponseStatusCode"));
		getLinkelinkflowLinkflowTenantsResponse.setSuccess(_ctx.booleanValue("GetLinkelinkflowLinkflowTenantsResponse.Success"));
		getLinkelinkflowLinkflowTenantsResponse.setTotal(_ctx.longValue("GetLinkelinkflowLinkflowTenantsResponse.Total"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("GetLinkelinkflowLinkflowTenantsResponse.Data.CreateTime"));
		data.setCustomer(_ctx.stringValue("GetLinkelinkflowLinkflowTenantsResponse.Data.Customer"));
		data.setDescription(_ctx.stringValue("GetLinkelinkflowLinkflowTenantsResponse.Data.Description"));
		data.setEnable(_ctx.booleanValue("GetLinkelinkflowLinkflowTenantsResponse.Data.Enable"));
		data.setId(_ctx.stringValue("GetLinkelinkflowLinkflowTenantsResponse.Data.Id"));
		data.setName(_ctx.stringValue("GetLinkelinkflowLinkflowTenantsResponse.Data.Name"));
		data.setOrigin(_ctx.stringValue("GetLinkelinkflowLinkflowTenantsResponse.Data.Origin"));
		data.setPriority(_ctx.longValue("GetLinkelinkflowLinkflowTenantsResponse.Data.Priority"));
		data.setSiteId(_ctx.stringValue("GetLinkelinkflowLinkflowTenantsResponse.Data.SiteId"));
		data.setUpdateTime(_ctx.stringValue("GetLinkelinkflowLinkflowTenantsResponse.Data.UpdateTime"));
		getLinkelinkflowLinkflowTenantsResponse.setData(data);
	 
	 	return getLinkelinkflowLinkflowTenantsResponse;
	}
}