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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutArchdomainsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutArchdomainsResponseUnmarshaller {

	public static DeleteLinkeBahamutArchdomainsResponse unmarshall(DeleteLinkeBahamutArchdomainsResponse deleteLinkeBahamutArchdomainsResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutArchdomainsResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutArchdomainsResponse.RequestId"));
		deleteLinkeBahamutArchdomainsResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutArchdomainsResponse.ResultCode"));
		deleteLinkeBahamutArchdomainsResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutArchdomainsResponse.ResultMessage"));
		deleteLinkeBahamutArchdomainsResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutArchdomainsResponse.ErrorMessage"));
		deleteLinkeBahamutArchdomainsResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutArchdomainsResponse.Message"));
		deleteLinkeBahamutArchdomainsResponse.setResult(_ctx.booleanValue("DeleteLinkeBahamutArchdomainsResponse.Result"));
		deleteLinkeBahamutArchdomainsResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutArchdomainsResponse.Success"));
	 
	 	return deleteLinkeBahamutArchdomainsResponse;
	}
}