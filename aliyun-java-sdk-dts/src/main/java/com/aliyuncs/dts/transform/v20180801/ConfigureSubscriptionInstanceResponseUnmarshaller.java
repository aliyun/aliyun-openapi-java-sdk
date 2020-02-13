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

package com.aliyuncs.dts.transform.v20180801;

import com.aliyuncs.dts.model.v20180801.ConfigureSubscriptionInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfigureSubscriptionInstanceResponseUnmarshaller {

	public static ConfigureSubscriptionInstanceResponse unmarshall(ConfigureSubscriptionInstanceResponse configureSubscriptionInstanceResponse, UnmarshallerContext _ctx) {
		
		configureSubscriptionInstanceResponse.setRequestId(_ctx.stringValue("ConfigureSubscriptionInstanceResponse.RequestId"));
		configureSubscriptionInstanceResponse.setSuccess(_ctx.stringValue("ConfigureSubscriptionInstanceResponse.Success"));
		configureSubscriptionInstanceResponse.setErrCode(_ctx.stringValue("ConfigureSubscriptionInstanceResponse.ErrCode"));
		configureSubscriptionInstanceResponse.setErrMessage(_ctx.stringValue("ConfigureSubscriptionInstanceResponse.ErrMessage"));
	 
	 	return configureSubscriptionInstanceResponse;
	}
}