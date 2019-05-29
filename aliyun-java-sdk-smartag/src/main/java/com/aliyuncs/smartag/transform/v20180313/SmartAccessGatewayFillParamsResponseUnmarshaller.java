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

package com.aliyuncs.smartag.transform.v20180313;

import com.aliyuncs.smartag.model.v20180313.SmartAccessGatewayFillParamsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SmartAccessGatewayFillParamsResponseUnmarshaller {

	public static SmartAccessGatewayFillParamsResponse unmarshall(SmartAccessGatewayFillParamsResponse smartAccessGatewayFillParamsResponse, UnmarshallerContext context) {
		
		smartAccessGatewayFillParamsResponse.setRequestId(context.stringValue("SmartAccessGatewayFillParamsResponse.RequestId"));
		smartAccessGatewayFillParamsResponse.setData(context.stringValue("SmartAccessGatewayFillParamsResponse.data"));
		smartAccessGatewayFillParamsResponse.setCode(context.stringValue("SmartAccessGatewayFillParamsResponse.code"));
		smartAccessGatewayFillParamsResponse.setSuccess(context.booleanValue("SmartAccessGatewayFillParamsResponse.success"));
		smartAccessGatewayFillParamsResponse.setMessage(context.stringValue("SmartAccessGatewayFillParamsResponse.message"));
	 
	 	return smartAccessGatewayFillParamsResponse;
	}
}