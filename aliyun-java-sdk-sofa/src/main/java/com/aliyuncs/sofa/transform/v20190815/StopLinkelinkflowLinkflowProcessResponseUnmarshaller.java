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

import com.aliyuncs.sofa.model.v20190815.StopLinkelinkflowLinkflowProcessResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopLinkelinkflowLinkflowProcessResponseUnmarshaller {

	public static StopLinkelinkflowLinkflowProcessResponse unmarshall(StopLinkelinkflowLinkflowProcessResponse stopLinkelinkflowLinkflowProcessResponse, UnmarshallerContext _ctx) {
		
		stopLinkelinkflowLinkflowProcessResponse.setRequestId(_ctx.stringValue("StopLinkelinkflowLinkflowProcessResponse.RequestId"));
		stopLinkelinkflowLinkflowProcessResponse.setResultCode(_ctx.stringValue("StopLinkelinkflowLinkflowProcessResponse.ResultCode"));
		stopLinkelinkflowLinkflowProcessResponse.setResultMessage(_ctx.stringValue("StopLinkelinkflowLinkflowProcessResponse.ResultMessage"));
		stopLinkelinkflowLinkflowProcessResponse.setCurrent(_ctx.longValue("StopLinkelinkflowLinkflowProcessResponse.Current"));
		stopLinkelinkflowLinkflowProcessResponse.setData(_ctx.stringValue("StopLinkelinkflowLinkflowProcessResponse.Data"));
		stopLinkelinkflowLinkflowProcessResponse.setErrorCode(_ctx.stringValue("StopLinkelinkflowLinkflowProcessResponse.ErrorCode"));
		stopLinkelinkflowLinkflowProcessResponse.setErrorMsg(_ctx.stringValue("StopLinkelinkflowLinkflowProcessResponse.ErrorMsg"));
		stopLinkelinkflowLinkflowProcessResponse.setPageSize(_ctx.longValue("StopLinkelinkflowLinkflowProcessResponse.PageSize"));
		stopLinkelinkflowLinkflowProcessResponse.setResponseStatusCode(_ctx.longValue("StopLinkelinkflowLinkflowProcessResponse.ResponseStatusCode"));
		stopLinkelinkflowLinkflowProcessResponse.setSuccess(_ctx.booleanValue("StopLinkelinkflowLinkflowProcessResponse.Success"));
		stopLinkelinkflowLinkflowProcessResponse.setTotal(_ctx.longValue("StopLinkelinkflowLinkflowProcessResponse.Total"));
	 
	 	return stopLinkelinkflowLinkflowProcessResponse;
	}
}