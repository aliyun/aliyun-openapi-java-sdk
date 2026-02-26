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

package com.aliyuncs.dyplsapi.transform.v20170525;

import com.aliyuncs.dyplsapi.model.v20170525.ConfigXResponse;
import com.aliyuncs.dyplsapi.model.v20170525.ConfigXResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfigXResponseUnmarshaller {

	public static ConfigXResponse unmarshall(ConfigXResponse configXResponse, UnmarshallerContext _ctx) {
		
		configXResponse.setRequestId(_ctx.stringValue("ConfigXResponse.RequestId"));
		configXResponse.setAccessDeniedDetail(_ctx.stringValue("ConfigXResponse.AccessDeniedDetail"));
		configXResponse.setMessage(_ctx.stringValue("ConfigXResponse.Message"));
		configXResponse.setCode(_ctx.stringValue("ConfigXResponse.Code"));
		configXResponse.setSuccess(_ctx.booleanValue("ConfigXResponse.Success"));

		Data data = new Data();
		data.setMessage(_ctx.stringValue("ConfigXResponse.Data.Message"));
		data.setCode(_ctx.stringValue("ConfigXResponse.Data.Code"));
		data.setSuccess(_ctx.booleanValue("ConfigXResponse.Data.Success"));
		configXResponse.setData(data);
	 
	 	return configXResponse;
	}
}