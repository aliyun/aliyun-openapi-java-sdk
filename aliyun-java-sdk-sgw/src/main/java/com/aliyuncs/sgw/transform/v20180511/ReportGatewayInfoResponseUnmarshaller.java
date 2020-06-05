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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.ReportGatewayInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReportGatewayInfoResponseUnmarshaller {

	public static ReportGatewayInfoResponse unmarshall(ReportGatewayInfoResponse reportGatewayInfoResponse, UnmarshallerContext _ctx) {
		
		reportGatewayInfoResponse.setRequestId(_ctx.stringValue("ReportGatewayInfoResponse.RequestId"));
		reportGatewayInfoResponse.setSuccess(_ctx.booleanValue("ReportGatewayInfoResponse.Success"));
		reportGatewayInfoResponse.setCode(_ctx.stringValue("ReportGatewayInfoResponse.Code"));
		reportGatewayInfoResponse.setMessage(_ctx.stringValue("ReportGatewayInfoResponse.Message"));
	 
	 	return reportGatewayInfoResponse;
	}
}