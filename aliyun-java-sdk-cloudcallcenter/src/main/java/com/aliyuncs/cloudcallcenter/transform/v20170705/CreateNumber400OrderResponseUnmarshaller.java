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

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateNumber400OrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateNumber400OrderResponseUnmarshaller {

	public static CreateNumber400OrderResponse unmarshall(CreateNumber400OrderResponse createNumber400OrderResponse, UnmarshallerContext context) {
		
		createNumber400OrderResponse.setRequestId(context.stringValue("CreateNumber400OrderResponse.RequestId"));
		createNumber400OrderResponse.setSuccess(context.booleanValue("CreateNumber400OrderResponse.Success"));
		createNumber400OrderResponse.setCode(context.stringValue("CreateNumber400OrderResponse.Code"));
		createNumber400OrderResponse.setMessage(context.stringValue("CreateNumber400OrderResponse.Message"));
		createNumber400OrderResponse.setHttpStatusCode(context.integerValue("CreateNumber400OrderResponse.HttpStatusCode"));
		createNumber400OrderResponse.setOrderPayUrl(context.stringValue("CreateNumber400OrderResponse.OrderPayUrl"));
	 
	 	return createNumber400OrderResponse;
	}
}