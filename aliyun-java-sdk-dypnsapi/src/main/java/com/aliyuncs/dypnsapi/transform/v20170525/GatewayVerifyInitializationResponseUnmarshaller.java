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

package com.aliyuncs.dypnsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dypnsapi.model.v20170525.GatewayVerifyInitializationResponse;
import com.aliyuncs.dypnsapi.model.v20170525.GatewayVerifyInitializationResponse.VendorConfigDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GatewayVerifyInitializationResponseUnmarshaller {

	public static GatewayVerifyInitializationResponse unmarshall(GatewayVerifyInitializationResponse gatewayVerifyInitializationResponse, UnmarshallerContext context) {
		
		gatewayVerifyInitializationResponse.setRequestId(context.stringValue("GatewayVerifyInitializationResponse.RequestId"));
		gatewayVerifyInitializationResponse.setCode(context.stringValue("GatewayVerifyInitializationResponse.Code"));
		gatewayVerifyInitializationResponse.setMessage(context.stringValue("GatewayVerifyInitializationResponse.Message"));

		List<VendorConfigDTO> vendorConfigDTOs = new ArrayList<VendorConfigDTO>();
		for (int i = 0; i < context.lengthValue("GatewayVerifyInitializationResponse.VendorConfigDTOs.Length"); i++) {
			VendorConfigDTO vendorConfigDTO = new VendorConfigDTO();
			vendorConfigDTO.setVendorKey(context.stringValue("GatewayVerifyInitializationResponse.VendorConfigDTOs["+ i +"].VendorKey"));
			vendorConfigDTO.setVendorAccessId(context.stringValue("GatewayVerifyInitializationResponse.VendorConfigDTOs["+ i +"].VendorAccessId"));
			vendorConfigDTO.setVendorAccessSecret(context.stringValue("GatewayVerifyInitializationResponse.VendorConfigDTOs["+ i +"].VendorAccessSecret"));

			vendorConfigDTOs.add(vendorConfigDTO);
		}
		gatewayVerifyInitializationResponse.setVendorConfigDTOs(vendorConfigDTOs);
	 
	 	return gatewayVerifyInitializationResponse;
	}
}