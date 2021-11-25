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

package com.aliyuncs.unimkt.transform.v20190724;

import com.aliyuncs.unimkt.model.v20190724.GetDeviceShortChainUrlResponse;
import com.aliyuncs.unimkt.model.v20190724.GetDeviceShortChainUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceShortChainUrlResponseUnmarshaller {

	public static GetDeviceShortChainUrlResponse unmarshall(GetDeviceShortChainUrlResponse getDeviceShortChainUrlResponse, UnmarshallerContext _ctx) {
		
		getDeviceShortChainUrlResponse.setRequestId(_ctx.stringValue("GetDeviceShortChainUrlResponse.RequestId"));
		getDeviceShortChainUrlResponse.setStatus(_ctx.booleanValue("GetDeviceShortChainUrlResponse.Status"));
		getDeviceShortChainUrlResponse.setErrorMessage(_ctx.stringValue("GetDeviceShortChainUrlResponse.ErrorMessage"));
		getDeviceShortChainUrlResponse.setErrorCode(_ctx.stringValue("GetDeviceShortChainUrlResponse.ErrorCode"));

		Data data = new Data();
		data.setShortImgUrl(_ctx.stringValue("GetDeviceShortChainUrlResponse.Data.ShortImgUrl"));
		data.setShortUrl(_ctx.stringValue("GetDeviceShortChainUrlResponse.Data.ShortUrl"));
		getDeviceShortChainUrlResponse.setData(data);
	 
	 	return getDeviceShortChainUrlResponse;
	}
}