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

package com.aliyuncs.linkwan.transform.v20181230;

import com.aliyuncs.linkwan.model.v20181230.GetGatewayTransferPacketsDownloadUrlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatewayTransferPacketsDownloadUrlResponseUnmarshaller {

	public static GetGatewayTransferPacketsDownloadUrlResponse unmarshall(GetGatewayTransferPacketsDownloadUrlResponse getGatewayTransferPacketsDownloadUrlResponse, UnmarshallerContext context) {
		
		getGatewayTransferPacketsDownloadUrlResponse.setRequestId(context.stringValue("GetGatewayTransferPacketsDownloadUrlResponse.RequestId"));
		getGatewayTransferPacketsDownloadUrlResponse.setSuccess(context.booleanValue("GetGatewayTransferPacketsDownloadUrlResponse.Success"));
		getGatewayTransferPacketsDownloadUrlResponse.setData(context.stringValue("GetGatewayTransferPacketsDownloadUrlResponse.Data"));
	 
	 	return getGatewayTransferPacketsDownloadUrlResponse;
	}
}