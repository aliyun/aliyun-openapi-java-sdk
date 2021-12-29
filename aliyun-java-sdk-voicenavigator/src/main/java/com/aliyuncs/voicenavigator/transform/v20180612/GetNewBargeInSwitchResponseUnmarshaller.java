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

package com.aliyuncs.voicenavigator.transform.v20180612;

import com.aliyuncs.voicenavigator.model.v20180612.GetNewBargeInSwitchResponse;
import com.aliyuncs.voicenavigator.model.v20180612.GetNewBargeInSwitchResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNewBargeInSwitchResponseUnmarshaller {

	public static GetNewBargeInSwitchResponse unmarshall(GetNewBargeInSwitchResponse getNewBargeInSwitchResponse, UnmarshallerContext _ctx) {
		
		getNewBargeInSwitchResponse.setRequestId(_ctx.stringValue("GetNewBargeInSwitchResponse.RequestId"));
		getNewBargeInSwitchResponse.setSuccess(_ctx.booleanValue("GetNewBargeInSwitchResponse.Success"));
		getNewBargeInSwitchResponse.setHttpStatusCode(_ctx.integerValue("GetNewBargeInSwitchResponse.HttpStatusCode"));
		getNewBargeInSwitchResponse.setCode(_ctx.stringValue("GetNewBargeInSwitchResponse.Code"));
		getNewBargeInSwitchResponse.setErrorMsg(_ctx.stringValue("GetNewBargeInSwitchResponse.ErrorMsg"));

		Data data = new Data();
		data.setEnable(_ctx.booleanValue("GetNewBargeInSwitchResponse.Data.Enable"));
		getNewBargeInSwitchResponse.setData(data);
	 
	 	return getNewBargeInSwitchResponse;
	}
}