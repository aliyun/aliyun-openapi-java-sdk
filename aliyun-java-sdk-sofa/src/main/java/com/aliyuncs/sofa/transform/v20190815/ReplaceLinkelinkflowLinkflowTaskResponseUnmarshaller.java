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

import com.aliyuncs.sofa.model.v20190815.ReplaceLinkelinkflowLinkflowTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReplaceLinkelinkflowLinkflowTaskResponseUnmarshaller {

	public static ReplaceLinkelinkflowLinkflowTaskResponse unmarshall(ReplaceLinkelinkflowLinkflowTaskResponse replaceLinkelinkflowLinkflowTaskResponse, UnmarshallerContext _ctx) {
		
		replaceLinkelinkflowLinkflowTaskResponse.setRequestId(_ctx.stringValue("ReplaceLinkelinkflowLinkflowTaskResponse.RequestId"));
		replaceLinkelinkflowLinkflowTaskResponse.setResultCode(_ctx.stringValue("ReplaceLinkelinkflowLinkflowTaskResponse.ResultCode"));
		replaceLinkelinkflowLinkflowTaskResponse.setResultMessage(_ctx.stringValue("ReplaceLinkelinkflowLinkflowTaskResponse.ResultMessage"));
		replaceLinkelinkflowLinkflowTaskResponse.setCurrent(_ctx.longValue("ReplaceLinkelinkflowLinkflowTaskResponse.Current"));
		replaceLinkelinkflowLinkflowTaskResponse.setData(_ctx.booleanValue("ReplaceLinkelinkflowLinkflowTaskResponse.Data"));
		replaceLinkelinkflowLinkflowTaskResponse.setErrorCode(_ctx.stringValue("ReplaceLinkelinkflowLinkflowTaskResponse.ErrorCode"));
		replaceLinkelinkflowLinkflowTaskResponse.setErrorMsg(_ctx.stringValue("ReplaceLinkelinkflowLinkflowTaskResponse.ErrorMsg"));
		replaceLinkelinkflowLinkflowTaskResponse.setPageSize(_ctx.longValue("ReplaceLinkelinkflowLinkflowTaskResponse.PageSize"));
		replaceLinkelinkflowLinkflowTaskResponse.setResponseStatusCode(_ctx.longValue("ReplaceLinkelinkflowLinkflowTaskResponse.ResponseStatusCode"));
		replaceLinkelinkflowLinkflowTaskResponse.setSuccess(_ctx.booleanValue("ReplaceLinkelinkflowLinkflowTaskResponse.Success"));
		replaceLinkelinkflowLinkflowTaskResponse.setTotal(_ctx.longValue("ReplaceLinkelinkflowLinkflowTaskResponse.Total"));
	 
	 	return replaceLinkelinkflowLinkflowTaskResponse;
	}
}