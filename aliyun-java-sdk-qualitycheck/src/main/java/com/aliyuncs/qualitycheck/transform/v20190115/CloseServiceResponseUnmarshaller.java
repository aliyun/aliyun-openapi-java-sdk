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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.CloseServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloseServiceResponseUnmarshaller {

	public static CloseServiceResponse unmarshall(CloseServiceResponse closeServiceResponse, UnmarshallerContext context) {
		
		closeServiceResponse.setRequestId(context.stringValue("CloseServiceResponse.RequestId"));
		closeServiceResponse.setSuccess(context.booleanValue("CloseServiceResponse.Success"));
		closeServiceResponse.setCode(context.stringValue("CloseServiceResponse.Code"));
		closeServiceResponse.setMessage(context.stringValue("CloseServiceResponse.Message"));
	 
	 	return closeServiceResponse;
	}
}