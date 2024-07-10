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

package com.aliyuncs.mseap.transform.v20210118;

import com.aliyuncs.mseap.model.v20210118.GetRedisValueResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRedisValueResponseUnmarshaller {

	public static GetRedisValueResponse unmarshall(GetRedisValueResponse getRedisValueResponse, UnmarshallerContext _ctx) {
		
		getRedisValueResponse.setRequestId(_ctx.stringValue("GetRedisValueResponse.RequestId"));
		getRedisValueResponse.setAllowRetry(_ctx.booleanValue("GetRedisValueResponse.AllowRetry"));
		getRedisValueResponse.setErrorMsg(_ctx.stringValue("GetRedisValueResponse.ErrorMsg"));
		getRedisValueResponse.setHttpStatusCode(_ctx.integerValue("GetRedisValueResponse.HttpStatusCode"));
		getRedisValueResponse.setDynamicCode(_ctx.stringValue("GetRedisValueResponse.DynamicCode"));
		getRedisValueResponse.setErrorCode(_ctx.stringValue("GetRedisValueResponse.ErrorCode"));
		getRedisValueResponse.setDynamicMessage(_ctx.stringValue("GetRedisValueResponse.DynamicMessage"));
		getRedisValueResponse.setModule(_ctx.stringValue("GetRedisValueResponse.Module"));
		getRedisValueResponse.setSuccess(_ctx.booleanValue("GetRedisValueResponse.Success"));
		getRedisValueResponse.setAppName(_ctx.stringValue("GetRedisValueResponse.AppName"));
	 
	 	return getRedisValueResponse;
	}
}