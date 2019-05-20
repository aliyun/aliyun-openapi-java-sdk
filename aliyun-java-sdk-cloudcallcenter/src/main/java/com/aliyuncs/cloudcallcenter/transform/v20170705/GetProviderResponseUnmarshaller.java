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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetProviderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProviderResponseUnmarshaller {

	public static GetProviderResponse unmarshall(GetProviderResponse getProviderResponse, UnmarshallerContext context) {
		
		getProviderResponse.setRequestId(context.stringValue("GetProviderResponse.RequestId"));
		getProviderResponse.setSuccess(context.booleanValue("GetProviderResponse.Success"));
		getProviderResponse.setCode(context.stringValue("GetProviderResponse.Code"));
		getProviderResponse.setMessage(context.stringValue("GetProviderResponse.Message"));
		getProviderResponse.setHttpStatusCode(context.integerValue("GetProviderResponse.HttpStatusCode"));
		getProviderResponse.setProvider(context.stringValue("GetProviderResponse.Provider"));
	 
	 	return getProviderResponse;
	}
}