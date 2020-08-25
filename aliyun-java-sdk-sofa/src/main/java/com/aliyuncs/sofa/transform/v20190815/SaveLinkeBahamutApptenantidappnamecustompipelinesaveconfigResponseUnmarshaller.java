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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponseUnmarshaller {

	public static SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse unmarshall(SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse saveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse, UnmarshallerContext _ctx) {
		
		saveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.setRequestId(_ctx.stringValue("SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.RequestId"));
		saveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.setResultCode(_ctx.stringValue("SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.ResultCode"));
		saveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.setResultMessage(_ctx.stringValue("SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.ResultMessage"));
		saveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.setErrorMessage(_ctx.stringValue("SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.ErrorMessage"));
		saveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.setErrorMsgParamsMap(_ctx.stringValue("SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.ErrorMsgParamsMap"));
		saveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.setMessage(_ctx.stringValue("SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.Message"));
		saveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.setResponseStatusCode(_ctx.longValue("SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.ResponseStatusCode"));
		saveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.setResult(_ctx.booleanValue("SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.Result"));
		saveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.setSuccess(_ctx.booleanValue("SaveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse.Success"));
	 
	 	return saveLinkeBahamutApptenantidappnamecustompipelinesaveconfigResponse;
	}
}