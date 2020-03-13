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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutAppResponseUnmarshaller {

	public static DeleteLinkeBahamutAppResponse unmarshall(DeleteLinkeBahamutAppResponse deleteLinkeBahamutAppResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutAppResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutAppResponse.RequestId"));
		deleteLinkeBahamutAppResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutAppResponse.ResultCode"));
		deleteLinkeBahamutAppResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutAppResponse.ResultMessage"));
		deleteLinkeBahamutAppResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutAppResponse.ErrorMessage"));
		deleteLinkeBahamutAppResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutAppResponse.Message"));
		deleteLinkeBahamutAppResponse.setResult(_ctx.booleanValue("DeleteLinkeBahamutAppResponse.Result"));
		deleteLinkeBahamutAppResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutAppResponse.Success"));
	 
	 	return deleteLinkeBahamutAppResponse;
	}
}