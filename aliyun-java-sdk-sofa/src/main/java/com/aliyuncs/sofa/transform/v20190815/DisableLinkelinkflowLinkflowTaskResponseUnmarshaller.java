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

import com.aliyuncs.sofa.model.v20190815.DisableLinkelinkflowLinkflowTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableLinkelinkflowLinkflowTaskResponseUnmarshaller {

	public static DisableLinkelinkflowLinkflowTaskResponse unmarshall(DisableLinkelinkflowLinkflowTaskResponse disableLinkelinkflowLinkflowTaskResponse, UnmarshallerContext _ctx) {
		
		disableLinkelinkflowLinkflowTaskResponse.setRequestId(_ctx.stringValue("DisableLinkelinkflowLinkflowTaskResponse.RequestId"));
		disableLinkelinkflowLinkflowTaskResponse.setResultCode(_ctx.stringValue("DisableLinkelinkflowLinkflowTaskResponse.ResultCode"));
		disableLinkelinkflowLinkflowTaskResponse.setResultMessage(_ctx.stringValue("DisableLinkelinkflowLinkflowTaskResponse.ResultMessage"));
		disableLinkelinkflowLinkflowTaskResponse.setCurrent(_ctx.longValue("DisableLinkelinkflowLinkflowTaskResponse.Current"));
		disableLinkelinkflowLinkflowTaskResponse.setData(_ctx.booleanValue("DisableLinkelinkflowLinkflowTaskResponse.Data"));
		disableLinkelinkflowLinkflowTaskResponse.setErrorCode(_ctx.stringValue("DisableLinkelinkflowLinkflowTaskResponse.ErrorCode"));
		disableLinkelinkflowLinkflowTaskResponse.setErrorMsg(_ctx.stringValue("DisableLinkelinkflowLinkflowTaskResponse.ErrorMsg"));
		disableLinkelinkflowLinkflowTaskResponse.setPageSize(_ctx.longValue("DisableLinkelinkflowLinkflowTaskResponse.PageSize"));
		disableLinkelinkflowLinkflowTaskResponse.setResponseStatusCode(_ctx.longValue("DisableLinkelinkflowLinkflowTaskResponse.ResponseStatusCode"));
		disableLinkelinkflowLinkflowTaskResponse.setSuccess(_ctx.booleanValue("DisableLinkelinkflowLinkflowTaskResponse.Success"));
		disableLinkelinkflowLinkflowTaskResponse.setTotal(_ctx.longValue("DisableLinkelinkflowLinkflowTaskResponse.Total"));
	 
	 	return disableLinkelinkflowLinkflowTaskResponse;
	}
}