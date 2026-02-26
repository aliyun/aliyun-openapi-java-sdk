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

package com.aliyuncs.linkcard.transform.v20210520;

import com.aliyuncs.linkcard.model.v20210520.UpdateAutoRechargeSwitchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAutoRechargeSwitchResponseUnmarshaller {

	public static UpdateAutoRechargeSwitchResponse unmarshall(UpdateAutoRechargeSwitchResponse updateAutoRechargeSwitchResponse, UnmarshallerContext _ctx) {
		
		updateAutoRechargeSwitchResponse.setRequestId(_ctx.stringValue("UpdateAutoRechargeSwitchResponse.RequestId"));
		updateAutoRechargeSwitchResponse.setData(_ctx.booleanValue("UpdateAutoRechargeSwitchResponse.Data"));
		updateAutoRechargeSwitchResponse.setErrorMessage(_ctx.stringValue("UpdateAutoRechargeSwitchResponse.ErrorMessage"));
		updateAutoRechargeSwitchResponse.setSuccess(_ctx.booleanValue("UpdateAutoRechargeSwitchResponse.Success"));
		updateAutoRechargeSwitchResponse.setLocalizedMessage(_ctx.stringValue("UpdateAutoRechargeSwitchResponse.LocalizedMessage"));
		updateAutoRechargeSwitchResponse.setCode(_ctx.stringValue("UpdateAutoRechargeSwitchResponse.Code"));
	 
	 	return updateAutoRechargeSwitchResponse;
	}
}