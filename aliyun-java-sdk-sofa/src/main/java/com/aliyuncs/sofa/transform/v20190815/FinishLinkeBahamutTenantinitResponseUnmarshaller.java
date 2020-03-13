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

import com.aliyuncs.sofa.model.v20190815.FinishLinkeBahamutTenantinitResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class FinishLinkeBahamutTenantinitResponseUnmarshaller {

	public static FinishLinkeBahamutTenantinitResponse unmarshall(FinishLinkeBahamutTenantinitResponse finishLinkeBahamutTenantinitResponse, UnmarshallerContext _ctx) {
		
		finishLinkeBahamutTenantinitResponse.setRequestId(_ctx.stringValue("FinishLinkeBahamutTenantinitResponse.RequestId"));
		finishLinkeBahamutTenantinitResponse.setResultCode(_ctx.stringValue("FinishLinkeBahamutTenantinitResponse.ResultCode"));
		finishLinkeBahamutTenantinitResponse.setResultMessage(_ctx.stringValue("FinishLinkeBahamutTenantinitResponse.ResultMessage"));
		finishLinkeBahamutTenantinitResponse.setErrorMessage(_ctx.stringValue("FinishLinkeBahamutTenantinitResponse.ErrorMessage"));
		finishLinkeBahamutTenantinitResponse.setMessage(_ctx.stringValue("FinishLinkeBahamutTenantinitResponse.Message"));
		finishLinkeBahamutTenantinitResponse.setResult(_ctx.booleanValue("FinishLinkeBahamutTenantinitResponse.Result"));
		finishLinkeBahamutTenantinitResponse.setSuccess(_ctx.booleanValue("FinishLinkeBahamutTenantinitResponse.Success"));
	 
	 	return finishLinkeBahamutTenantinitResponse;
	}
}