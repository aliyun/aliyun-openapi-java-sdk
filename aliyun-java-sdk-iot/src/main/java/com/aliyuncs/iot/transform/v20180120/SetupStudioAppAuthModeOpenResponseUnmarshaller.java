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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.SetupStudioAppAuthModeOpenResponse;
import com.aliyuncs.iot.model.v20180120.SetupStudioAppAuthModeOpenResponse.Data;
import com.aliyuncs.iot.model.v20180120.SetupStudioAppAuthModeOpenResponse.Data.TokenInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetupStudioAppAuthModeOpenResponseUnmarshaller {

	public static SetupStudioAppAuthModeOpenResponse unmarshall(SetupStudioAppAuthModeOpenResponse setupStudioAppAuthModeOpenResponse, UnmarshallerContext _ctx) {
		
		setupStudioAppAuthModeOpenResponse.setRequestId(_ctx.stringValue("SetupStudioAppAuthModeOpenResponse.RequestId"));
		setupStudioAppAuthModeOpenResponse.setSuccess(_ctx.booleanValue("SetupStudioAppAuthModeOpenResponse.Success"));
		setupStudioAppAuthModeOpenResponse.setCode(_ctx.stringValue("SetupStudioAppAuthModeOpenResponse.Code"));
		setupStudioAppAuthModeOpenResponse.setErrorMessage(_ctx.stringValue("SetupStudioAppAuthModeOpenResponse.ErrorMessage"));

		Data data = new Data();
		data.setAuthMode(_ctx.integerValue("SetupStudioAppAuthModeOpenResponse.Data.AuthMode"));

		TokenInfo tokenInfo = new TokenInfo();
		tokenInfo.setIsEnable(_ctx.stringValue("SetupStudioAppAuthModeOpenResponse.Data.TokenInfo.IsEnable"));
		tokenInfo.setType(_ctx.stringValue("SetupStudioAppAuthModeOpenResponse.Data.TokenInfo.Type"));
		tokenInfo.setBizType(_ctx.stringValue("SetupStudioAppAuthModeOpenResponse.Data.TokenInfo.BizType"));
		tokenInfo.setToken(_ctx.stringValue("SetupStudioAppAuthModeOpenResponse.Data.TokenInfo.Token"));
		tokenInfo.setBizId(_ctx.stringValue("SetupStudioAppAuthModeOpenResponse.Data.TokenInfo.BizId"));
		data.setTokenInfo(tokenInfo);
		setupStudioAppAuthModeOpenResponse.setData(data);
	 
	 	return setupStudioAppAuthModeOpenResponse;
	}
}