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

import com.aliyuncs.sofa.model.v20190815.SetLinkeBahamutTenantcodeconfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetLinkeBahamutTenantcodeconfigResponseUnmarshaller {

	public static SetLinkeBahamutTenantcodeconfigResponse unmarshall(SetLinkeBahamutTenantcodeconfigResponse setLinkeBahamutTenantcodeconfigResponse, UnmarshallerContext _ctx) {
		
		setLinkeBahamutTenantcodeconfigResponse.setRequestId(_ctx.stringValue("SetLinkeBahamutTenantcodeconfigResponse.RequestId"));
		setLinkeBahamutTenantcodeconfigResponse.setResultCode(_ctx.stringValue("SetLinkeBahamutTenantcodeconfigResponse.ResultCode"));
		setLinkeBahamutTenantcodeconfigResponse.setResultMessage(_ctx.stringValue("SetLinkeBahamutTenantcodeconfigResponse.ResultMessage"));
		setLinkeBahamutTenantcodeconfigResponse.setErrorMessage(_ctx.stringValue("SetLinkeBahamutTenantcodeconfigResponse.ErrorMessage"));
		setLinkeBahamutTenantcodeconfigResponse.setMessage(_ctx.stringValue("SetLinkeBahamutTenantcodeconfigResponse.Message"));
		setLinkeBahamutTenantcodeconfigResponse.setResult(_ctx.booleanValue("SetLinkeBahamutTenantcodeconfigResponse.Result"));
		setLinkeBahamutTenantcodeconfigResponse.setSuccess(_ctx.booleanValue("SetLinkeBahamutTenantcodeconfigResponse.Success"));
	 
	 	return setLinkeBahamutTenantcodeconfigResponse;
	}
}