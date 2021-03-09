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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.LaunchAppraiseResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class LaunchAppraiseResponseUnmarshaller {

	public static LaunchAppraiseResponse unmarshall(LaunchAppraiseResponse launchAppraiseResponse, UnmarshallerContext _ctx) {
		
		launchAppraiseResponse.setRequestId(_ctx.stringValue("LaunchAppraiseResponse.RequestId"));
		launchAppraiseResponse.setSuccess(_ctx.booleanValue("LaunchAppraiseResponse.Success"));
		launchAppraiseResponse.setCode(_ctx.stringValue("LaunchAppraiseResponse.Code"));
		launchAppraiseResponse.setMessage(_ctx.stringValue("LaunchAppraiseResponse.Message"));
		launchAppraiseResponse.setHttpStatusCode(_ctx.integerValue("LaunchAppraiseResponse.HttpStatusCode"));
	 
	 	return launchAppraiseResponse;
	}
}