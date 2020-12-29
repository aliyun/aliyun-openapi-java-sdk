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

package com.aliyuncs.vpc.transform.v20160428;

import com.aliyuncs.vpc.model.v20160428.AssociateVpnGatewayWithCertificateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssociateVpnGatewayWithCertificateResponseUnmarshaller {

	public static AssociateVpnGatewayWithCertificateResponse unmarshall(AssociateVpnGatewayWithCertificateResponse associateVpnGatewayWithCertificateResponse, UnmarshallerContext _ctx) {
		
		associateVpnGatewayWithCertificateResponse.setRequestId(_ctx.stringValue("AssociateVpnGatewayWithCertificateResponse.RequestId"));
	 
	 	return associateVpnGatewayWithCertificateResponse;
	}
}