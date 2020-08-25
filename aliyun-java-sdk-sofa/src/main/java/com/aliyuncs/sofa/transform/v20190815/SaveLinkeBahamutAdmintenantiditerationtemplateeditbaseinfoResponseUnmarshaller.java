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

import com.aliyuncs.sofa.model.v20190815.SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponseUnmarshaller {

	public static SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse unmarshall(SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse saveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse, UnmarshallerContext _ctx) {
		
		saveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.setRequestId(_ctx.stringValue("SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.RequestId"));
		saveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.setResultCode(_ctx.stringValue("SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.ResultCode"));
		saveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.setResultMessage(_ctx.stringValue("SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.ResultMessage"));
		saveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.setErrorMessage(_ctx.stringValue("SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.ErrorMessage"));
		saveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.setErrorMsgParamsMap(_ctx.stringValue("SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.ErrorMsgParamsMap"));
		saveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.setMessage(_ctx.stringValue("SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.Message"));
		saveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.setResponseStatusCode(_ctx.longValue("SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.ResponseStatusCode"));
		saveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.setResult(_ctx.booleanValue("SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.Result"));
		saveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.setSuccess(_ctx.booleanValue("SaveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse.Success"));
	 
	 	return saveLinkeBahamutAdmintenantiditerationtemplateeditbaseinfoResponse;
	}
}