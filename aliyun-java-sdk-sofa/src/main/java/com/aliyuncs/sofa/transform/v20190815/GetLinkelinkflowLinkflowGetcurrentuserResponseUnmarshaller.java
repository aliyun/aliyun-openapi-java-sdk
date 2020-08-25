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

import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowGetcurrentuserResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkelinkflowLinkflowGetcurrentuserResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkelinkflowLinkflowGetcurrentuserResponseUnmarshaller {

	public static GetLinkelinkflowLinkflowGetcurrentuserResponse unmarshall(GetLinkelinkflowLinkflowGetcurrentuserResponse getLinkelinkflowLinkflowGetcurrentuserResponse, UnmarshallerContext _ctx) {
		
		getLinkelinkflowLinkflowGetcurrentuserResponse.setRequestId(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.RequestId"));
		getLinkelinkflowLinkflowGetcurrentuserResponse.setResultCode(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.ResultCode"));
		getLinkelinkflowLinkflowGetcurrentuserResponse.setResultMessage(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.ResultMessage"));
		getLinkelinkflowLinkflowGetcurrentuserResponse.setCurrent(_ctx.longValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Current"));
		getLinkelinkflowLinkflowGetcurrentuserResponse.setErrorCode(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.ErrorCode"));
		getLinkelinkflowLinkflowGetcurrentuserResponse.setErrorMsg(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.ErrorMsg"));
		getLinkelinkflowLinkflowGetcurrentuserResponse.setPageSize(_ctx.longValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.PageSize"));
		getLinkelinkflowLinkflowGetcurrentuserResponse.setResponseStatusCode(_ctx.longValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.ResponseStatusCode"));
		getLinkelinkflowLinkflowGetcurrentuserResponse.setSuccess(_ctx.booleanValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Success"));
		getLinkelinkflowLinkflowGetcurrentuserResponse.setTotal(_ctx.longValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Total"));

		Data data = new Data();
		data.setAccount(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Data.Account"));
		data.setAdmin(_ctx.booleanValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Data.Admin"));
		data.setDisplayName(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Data.DisplayName"));
		data.setEmail(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Data.Email"));
		data.setEmpId(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Data.EmpId"));
		data.setFirstName(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Data.FirstName"));
		data.setId(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Data.Id"));
		data.setIsPictureSet(_ctx.booleanValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Data.IsPictureSet"));
		data.setLastName(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Data.LastName"));
		data.setName(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Data.Name"));
		data.setNick(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Data.Nick"));
		data.setPassword(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Data.Password"));
		data.setTenantId(_ctx.stringValue("GetLinkelinkflowLinkflowGetcurrentuserResponse.Data.TenantId"));
		getLinkelinkflowLinkflowGetcurrentuserResponse.setData(data);
	 
	 	return getLinkelinkflowLinkflowGetcurrentuserResponse;
	}
}