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

import com.aliyuncs.sofa.model.v20190815.EnableLinkelinkflowLinkflowProcessResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableLinkelinkflowLinkflowProcessResponseUnmarshaller {

	public static EnableLinkelinkflowLinkflowProcessResponse unmarshall(EnableLinkelinkflowLinkflowProcessResponse enableLinkelinkflowLinkflowProcessResponse, UnmarshallerContext _ctx) {
		
		enableLinkelinkflowLinkflowProcessResponse.setRequestId(_ctx.stringValue("EnableLinkelinkflowLinkflowProcessResponse.RequestId"));
		enableLinkelinkflowLinkflowProcessResponse.setResultCode(_ctx.stringValue("EnableLinkelinkflowLinkflowProcessResponse.ResultCode"));
		enableLinkelinkflowLinkflowProcessResponse.setResultMessage(_ctx.stringValue("EnableLinkelinkflowLinkflowProcessResponse.ResultMessage"));
		enableLinkelinkflowLinkflowProcessResponse.setCurrent(_ctx.longValue("EnableLinkelinkflowLinkflowProcessResponse.Current"));
		enableLinkelinkflowLinkflowProcessResponse.setData(_ctx.stringValue("EnableLinkelinkflowLinkflowProcessResponse.Data"));
		enableLinkelinkflowLinkflowProcessResponse.setErrorCode(_ctx.stringValue("EnableLinkelinkflowLinkflowProcessResponse.ErrorCode"));
		enableLinkelinkflowLinkflowProcessResponse.setErrorMsg(_ctx.stringValue("EnableLinkelinkflowLinkflowProcessResponse.ErrorMsg"));
		enableLinkelinkflowLinkflowProcessResponse.setPageSize(_ctx.longValue("EnableLinkelinkflowLinkflowProcessResponse.PageSize"));
		enableLinkelinkflowLinkflowProcessResponse.setResponseStatusCode(_ctx.longValue("EnableLinkelinkflowLinkflowProcessResponse.ResponseStatusCode"));
		enableLinkelinkflowLinkflowProcessResponse.setSuccess(_ctx.booleanValue("EnableLinkelinkflowLinkflowProcessResponse.Success"));
		enableLinkelinkflowLinkflowProcessResponse.setTotal(_ctx.longValue("EnableLinkelinkflowLinkflowProcessResponse.Total"));
	 
	 	return enableLinkelinkflowLinkflowProcessResponse;
	}
}