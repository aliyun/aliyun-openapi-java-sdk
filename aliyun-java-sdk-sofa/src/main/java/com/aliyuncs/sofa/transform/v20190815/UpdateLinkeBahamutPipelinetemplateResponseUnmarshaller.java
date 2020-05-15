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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutPipelinetemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutPipelinetemplateResponseUnmarshaller {

	public static UpdateLinkeBahamutPipelinetemplateResponse unmarshall(UpdateLinkeBahamutPipelinetemplateResponse updateLinkeBahamutPipelinetemplateResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutPipelinetemplateResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutPipelinetemplateResponse.RequestId"));
		updateLinkeBahamutPipelinetemplateResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutPipelinetemplateResponse.ResultCode"));
		updateLinkeBahamutPipelinetemplateResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutPipelinetemplateResponse.ResultMessage"));
		updateLinkeBahamutPipelinetemplateResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutPipelinetemplateResponse.ErrorMessage"));
		updateLinkeBahamutPipelinetemplateResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutPipelinetemplateResponse.Message"));
		updateLinkeBahamutPipelinetemplateResponse.setResult(_ctx.stringValue("UpdateLinkeBahamutPipelinetemplateResponse.Result"));
		updateLinkeBahamutPipelinetemplateResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutPipelinetemplateResponse.Success"));
	 
	 	return updateLinkeBahamutPipelinetemplateResponse;
	}
}