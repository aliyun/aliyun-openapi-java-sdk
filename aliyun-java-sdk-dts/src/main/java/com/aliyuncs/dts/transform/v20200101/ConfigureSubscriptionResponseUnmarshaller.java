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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.ConfigureSubscriptionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfigureSubscriptionResponseUnmarshaller {

	public static ConfigureSubscriptionResponse unmarshall(ConfigureSubscriptionResponse configureSubscriptionResponse, UnmarshallerContext _ctx) {
		
		configureSubscriptionResponse.setRequestId(_ctx.stringValue("ConfigureSubscriptionResponse.RequestId"));
		configureSubscriptionResponse.setErrCode(_ctx.stringValue("ConfigureSubscriptionResponse.ErrCode"));
		configureSubscriptionResponse.setErrMessage(_ctx.stringValue("ConfigureSubscriptionResponse.ErrMessage"));
		configureSubscriptionResponse.setSuccess(_ctx.stringValue("ConfigureSubscriptionResponse.Success"));
		configureSubscriptionResponse.setDtsJobId(_ctx.stringValue("ConfigureSubscriptionResponse.DtsJobId"));
		configureSubscriptionResponse.setDtsInstanceId(_ctx.stringValue("ConfigureSubscriptionResponse.DtsInstanceId"));
		configureSubscriptionResponse.setHttpStatusCode(_ctx.stringValue("ConfigureSubscriptionResponse.HttpStatusCode"));
	 
	 	return configureSubscriptionResponse;
	}
}