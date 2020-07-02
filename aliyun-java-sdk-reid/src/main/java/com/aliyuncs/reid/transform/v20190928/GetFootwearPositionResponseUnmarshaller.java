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

package com.aliyuncs.reid.transform.v20190928;

import com.aliyuncs.reid.model.v20190928.GetFootwearPositionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFootwearPositionResponseUnmarshaller {

	public static GetFootwearPositionResponse unmarshall(GetFootwearPositionResponse getFootwearPositionResponse, UnmarshallerContext _ctx) {
		
		getFootwearPositionResponse.setRequestId(_ctx.stringValue("GetFootwearPositionResponse.RequestId"));
		getFootwearPositionResponse.setErrorCode(_ctx.stringValue("GetFootwearPositionResponse.ErrorCode"));
		getFootwearPositionResponse.setErrorMessage(_ctx.stringValue("GetFootwearPositionResponse.ErrorMessage"));
		getFootwearPositionResponse.setMessage(_ctx.stringValue("GetFootwearPositionResponse.Message"));
		getFootwearPositionResponse.setStartTime(_ctx.longValue("GetFootwearPositionResponse.StartTime"));
		getFootwearPositionResponse.setCode(_ctx.stringValue("GetFootwearPositionResponse.Code"));
		getFootwearPositionResponse.setPositionNumber(_ctx.integerValue("GetFootwearPositionResponse.PositionNumber"));
		getFootwearPositionResponse.setDynamicCode(_ctx.stringValue("GetFootwearPositionResponse.DynamicCode"));
		getFootwearPositionResponse.setSkuId(_ctx.stringValue("GetFootwearPositionResponse.SkuId"));
		getFootwearPositionResponse.setSuccess(_ctx.booleanValue("GetFootwearPositionResponse.Success"));
		getFootwearPositionResponse.setStoreId(_ctx.longValue("GetFootwearPositionResponse.StoreId"));
		getFootwearPositionResponse.setDynamicMessage(_ctx.stringValue("GetFootwearPositionResponse.DynamicMessage"));
	 
	 	return getFootwearPositionResponse;
	}
}