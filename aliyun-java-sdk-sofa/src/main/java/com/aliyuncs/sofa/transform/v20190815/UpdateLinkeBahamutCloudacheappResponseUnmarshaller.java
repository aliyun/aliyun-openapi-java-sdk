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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutCloudacheappResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutCloudacheappResponseUnmarshaller {

	public static UpdateLinkeBahamutCloudacheappResponse unmarshall(UpdateLinkeBahamutCloudacheappResponse updateLinkeBahamutCloudacheappResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutCloudacheappResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutCloudacheappResponse.RequestId"));
		updateLinkeBahamutCloudacheappResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutCloudacheappResponse.ResultCode"));
		updateLinkeBahamutCloudacheappResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutCloudacheappResponse.ResultMessage"));
		updateLinkeBahamutCloudacheappResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutCloudacheappResponse.ErrorMessage"));
		updateLinkeBahamutCloudacheappResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutCloudacheappResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutCloudacheappResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutCloudacheappResponse.Message"));
		updateLinkeBahamutCloudacheappResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutCloudacheappResponse.ResponseStatusCode"));
		updateLinkeBahamutCloudacheappResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutCloudacheappResponse.Success"));
	 
	 	return updateLinkeBahamutCloudacheappResponse;
	}
}