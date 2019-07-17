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

package com.aliyuncs.dg.transform.v20190327;

import com.aliyuncs.dg.model.v20190327.DownloadGatewayProgramResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadGatewayProgramResponseUnmarshaller {

	public static DownloadGatewayProgramResponse unmarshall(DownloadGatewayProgramResponse downloadGatewayProgramResponse, UnmarshallerContext _ctx) {
		
		downloadGatewayProgramResponse.setRequestId(_ctx.stringValue("DownloadGatewayProgramResponse.RequestId"));
		downloadGatewayProgramResponse.setSuccess(_ctx.booleanValue("DownloadGatewayProgramResponse.Success"));
		downloadGatewayProgramResponse.setCode(_ctx.stringValue("DownloadGatewayProgramResponse.Code"));
		downloadGatewayProgramResponse.setErrorMsg(_ctx.stringValue("DownloadGatewayProgramResponse.ErrorMsg"));
		downloadGatewayProgramResponse.setData(_ctx.stringValue("DownloadGatewayProgramResponse.Data"));
	 
	 	return downloadGatewayProgramResponse;
	}
}