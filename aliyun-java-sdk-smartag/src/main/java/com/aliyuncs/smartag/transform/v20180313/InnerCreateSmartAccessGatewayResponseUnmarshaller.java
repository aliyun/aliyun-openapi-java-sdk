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

import com.aliyuncs.smartag.model.v20180313.InnerCreateSmartAccessGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerCreateSmartAccessGatewayResponseUnmarshaller {

	public static InnerCreateSmartAccessGatewayResponse unmarshall(InnerCreateSmartAccessGatewayResponse innerCreateSmartAccessGatewayResponse, UnmarshallerContext context) {
		
		innerCreateSmartAccessGatewayResponse.setRequestId(context.stringValue("InnerCreateSmartAccessGatewayResponse.RequestId"));
		innerCreateSmartAccessGatewayResponse.setCloudBoxId(context.stringValue("InnerCreateSmartAccessGatewayResponse.CloudBoxId"));
		innerCreateSmartAccessGatewayResponse.setName(context.stringValue("InnerCreateSmartAccessGatewayResponse.Name"));
		innerCreateSmartAccessGatewayResponse.setLocation(context.stringValue("InnerCreateSmartAccessGatewayResponse.Location"));
		innerCreateSmartAccessGatewayResponse.setCity(context.stringValue("InnerCreateSmartAccessGatewayResponse.City"));
		innerCreateSmartAccessGatewayResponse.setBandWidthSpec(context.stringValue("InnerCreateSmartAccessGatewayResponse.BandWidthSpec"));
		innerCreateSmartAccessGatewayResponse.setCidrBlock(context.stringValue("InnerCreateSmartAccessGatewayResponse.CidrBlock"));
		innerCreateSmartAccessGatewayResponse.setAssociatedCcnId(context.stringValue("InnerCreateSmartAccessGatewayResponse.AssociatedCcnId"));
		innerCreateSmartAccessGatewayResponse.setDescription(context.stringValue("InnerCreateSmartAccessGatewayResponse.Description"));
	 
	 	return innerCreateSmartAccessGatewayResponse;
	}
}