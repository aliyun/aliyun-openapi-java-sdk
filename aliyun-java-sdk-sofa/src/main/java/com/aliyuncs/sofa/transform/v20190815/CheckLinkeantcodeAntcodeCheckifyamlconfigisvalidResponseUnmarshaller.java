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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponseUnmarshaller {

	public static CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse unmarshall(CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse checkLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse, UnmarshallerContext _ctx) {
		
		checkLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.setRequestId(_ctx.stringValue("CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.RequestId"));
		checkLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.setResultCode(_ctx.stringValue("CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.ResultCode"));
		checkLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.setResultMessage(_ctx.stringValue("CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.ResultMessage"));
		checkLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.ResponseStatusCode"));
		checkLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.setSolution(_ctx.stringValue("CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.Solution"));
		checkLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.setSyntaxError(_ctx.booleanValue("CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.SyntaxError"));
		checkLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.setSyntaxErrorInfo(_ctx.stringValue("CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.SyntaxErrorInfo"));
		checkLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.setUnSupportPluginError(_ctx.stringValue("CheckLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse.UnSupportPluginError"));
	 
	 	return checkLinkeantcodeAntcodeCheckifyamlconfigisvalidResponse;
	}
}