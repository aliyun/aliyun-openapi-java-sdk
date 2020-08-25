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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutPaasupdateappsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutPaasupdateappsResponseUnmarshaller {

	public static UpdateLinkeBahamutPaasupdateappsResponse unmarshall(UpdateLinkeBahamutPaasupdateappsResponse updateLinkeBahamutPaasupdateappsResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutPaasupdateappsResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutPaasupdateappsResponse.RequestId"));
		updateLinkeBahamutPaasupdateappsResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutPaasupdateappsResponse.ResultCode"));
		updateLinkeBahamutPaasupdateappsResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutPaasupdateappsResponse.ResultMessage"));
		updateLinkeBahamutPaasupdateappsResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutPaasupdateappsResponse.ErrorMessage"));
		updateLinkeBahamutPaasupdateappsResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutPaasupdateappsResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutPaasupdateappsResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutPaasupdateappsResponse.Message"));
		updateLinkeBahamutPaasupdateappsResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutPaasupdateappsResponse.ResponseStatusCode"));
		updateLinkeBahamutPaasupdateappsResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutPaasupdateappsResponse.Success"));
	 
	 	return updateLinkeBahamutPaasupdateappsResponse;
	}
}