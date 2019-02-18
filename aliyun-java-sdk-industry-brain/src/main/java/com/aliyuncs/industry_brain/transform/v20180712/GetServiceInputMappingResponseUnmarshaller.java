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

package com.aliyuncs.industry_brain.transform.v20180712;

import com.aliyuncs.industry_brain.model.v20180712.GetServiceInputMappingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceInputMappingResponseUnmarshaller {

	public static GetServiceInputMappingResponse unmarshall(GetServiceInputMappingResponse getServiceInputMappingResponse, UnmarshallerContext context) {
		
		getServiceInputMappingResponse.setRequestId(context.stringValue("GetServiceInputMappingResponse.RequestId"));
		getServiceInputMappingResponse.setData(context.stringValue("GetServiceInputMappingResponse.Data"));
		getServiceInputMappingResponse.setCode(context.stringValue("GetServiceInputMappingResponse.Code"));
		getServiceInputMappingResponse.setMessage(context.stringValue("GetServiceInputMappingResponse.Message"));
	 
	 	return getServiceInputMappingResponse;
	}
}