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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponseUnmarshaller {

	public static DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse unmarshall(DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse deleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.RequestId"));
		deleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.ResultCode"));
		deleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.ResultMessage"));
		deleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.ErrorMessage"));
		deleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.Message"));
		deleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.ResponseStatusCode"));
		deleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.setResult(_ctx.booleanValue("DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.Result"));
		deleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse.Success"));
	 
	 	return deleteLinkeBahamutApptenantidappnamecustompipelinedeleteidResponse;
	}
}