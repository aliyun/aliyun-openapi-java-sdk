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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutIterationtemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutIterationtemplateResponseUnmarshaller {

	public static UpdateLinkeBahamutIterationtemplateResponse unmarshall(UpdateLinkeBahamutIterationtemplateResponse updateLinkeBahamutIterationtemplateResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutIterationtemplateResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutIterationtemplateResponse.RequestId"));
		updateLinkeBahamutIterationtemplateResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutIterationtemplateResponse.ResultCode"));
		updateLinkeBahamutIterationtemplateResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutIterationtemplateResponse.ResultMessage"));
		updateLinkeBahamutIterationtemplateResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutIterationtemplateResponse.ErrorMessage"));
		updateLinkeBahamutIterationtemplateResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutIterationtemplateResponse.Message"));
		updateLinkeBahamutIterationtemplateResponse.setResult(_ctx.booleanValue("UpdateLinkeBahamutIterationtemplateResponse.Result"));
		updateLinkeBahamutIterationtemplateResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutIterationtemplateResponse.Success"));
	 
	 	return updateLinkeBahamutIterationtemplateResponse;
	}
}