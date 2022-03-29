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

package com.aliyuncs.cro.transform.v20200102;

import com.aliyuncs.cro.model.v20200102.GetWatermarkAppInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWatermarkAppInfoResponseUnmarshaller {

	public static GetWatermarkAppInfoResponse unmarshall(GetWatermarkAppInfoResponse getWatermarkAppInfoResponse, UnmarshallerContext _ctx) {
		
		getWatermarkAppInfoResponse.setRequestId(_ctx.stringValue("GetWatermarkAppInfoResponse.RequestId"));
		getWatermarkAppInfoResponse.setDomain(_ctx.stringValue("GetWatermarkAppInfoResponse.Domain"));
		getWatermarkAppInfoResponse.setErrorMsg(_ctx.stringValue("GetWatermarkAppInfoResponse.ErrorMsg"));
		getWatermarkAppInfoResponse.setErrorCode(_ctx.stringValue("GetWatermarkAppInfoResponse.ErrorCode"));
		getWatermarkAppInfoResponse.setSuccess(_ctx.booleanValue("GetWatermarkAppInfoResponse.Success"));
	 
	 	return getWatermarkAppInfoResponse;
	}
}