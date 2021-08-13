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

import com.aliyuncs.smartag.model.v20180313.CreateSmartAccessGatewaySoftwareResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSmartAccessGatewaySoftwareResponseUnmarshaller {

	public static CreateSmartAccessGatewaySoftwareResponse unmarshall(CreateSmartAccessGatewaySoftwareResponse createSmartAccessGatewaySoftwareResponse, UnmarshallerContext _ctx) {
		
		createSmartAccessGatewaySoftwareResponse.setRequestId(_ctx.stringValue("CreateSmartAccessGatewaySoftwareResponse.RequestId"));
		createSmartAccessGatewaySoftwareResponse.setOrderId(_ctx.stringValue("CreateSmartAccessGatewaySoftwareResponse.OrderId"));
		createSmartAccessGatewaySoftwareResponse.setSmartAGId(_ctx.stringValue("CreateSmartAccessGatewaySoftwareResponse.SmartAGId"));
		createSmartAccessGatewaySoftwareResponse.setResourceGroupId(_ctx.stringValue("CreateSmartAccessGatewaySoftwareResponse.ResourceGroupId"));
	 
	 	return createSmartAccessGatewaySoftwareResponse;
	}
}