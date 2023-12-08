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

package com.aliyuncs.ddosdiversion.transform.v20230701;

import com.aliyuncs.ddosdiversion.model.v20230701.ConfigNetStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfigNetStatusResponseUnmarshaller {

	public static ConfigNetStatusResponse unmarshall(ConfigNetStatusResponse configNetStatusResponse, UnmarshallerContext _ctx) {
		
		configNetStatusResponse.setRequestId(_ctx.stringValue("ConfigNetStatusResponse.RequestId"));
		configNetStatusResponse.setCode(_ctx.longValue("ConfigNetStatusResponse.Code"));
		configNetStatusResponse.setMessage(_ctx.stringValue("ConfigNetStatusResponse.Message"));
	 
	 	return configNetStatusResponse;
	}
}