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

import com.aliyuncs.sofa.model.v20190815.FinishLinkelinkflowLinkflowTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class FinishLinkelinkflowLinkflowTaskResponseUnmarshaller {

	public static FinishLinkelinkflowLinkflowTaskResponse unmarshall(FinishLinkelinkflowLinkflowTaskResponse finishLinkelinkflowLinkflowTaskResponse, UnmarshallerContext _ctx) {
		
		finishLinkelinkflowLinkflowTaskResponse.setRequestId(_ctx.stringValue("FinishLinkelinkflowLinkflowTaskResponse.RequestId"));
		finishLinkelinkflowLinkflowTaskResponse.setResultCode(_ctx.stringValue("FinishLinkelinkflowLinkflowTaskResponse.ResultCode"));
		finishLinkelinkflowLinkflowTaskResponse.setResultMessage(_ctx.stringValue("FinishLinkelinkflowLinkflowTaskResponse.ResultMessage"));
		finishLinkelinkflowLinkflowTaskResponse.setCurrent(_ctx.longValue("FinishLinkelinkflowLinkflowTaskResponse.Current"));
		finishLinkelinkflowLinkflowTaskResponse.setData(_ctx.booleanValue("FinishLinkelinkflowLinkflowTaskResponse.Data"));
		finishLinkelinkflowLinkflowTaskResponse.setErrorCode(_ctx.stringValue("FinishLinkelinkflowLinkflowTaskResponse.ErrorCode"));
		finishLinkelinkflowLinkflowTaskResponse.setErrorMsg(_ctx.stringValue("FinishLinkelinkflowLinkflowTaskResponse.ErrorMsg"));
		finishLinkelinkflowLinkflowTaskResponse.setPageSize(_ctx.longValue("FinishLinkelinkflowLinkflowTaskResponse.PageSize"));
		finishLinkelinkflowLinkflowTaskResponse.setResponseStatusCode(_ctx.longValue("FinishLinkelinkflowLinkflowTaskResponse.ResponseStatusCode"));
		finishLinkelinkflowLinkflowTaskResponse.setSuccess(_ctx.booleanValue("FinishLinkelinkflowLinkflowTaskResponse.Success"));
		finishLinkelinkflowLinkflowTaskResponse.setTotal(_ctx.longValue("FinishLinkelinkflowLinkflowTaskResponse.Total"));
	 
	 	return finishLinkelinkflowLinkflowTaskResponse;
	}
}