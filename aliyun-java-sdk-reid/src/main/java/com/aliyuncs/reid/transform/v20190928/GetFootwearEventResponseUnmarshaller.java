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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid.model.v20190928.GetFootwearEventResponse;
import com.aliyuncs.reid.model.v20190928.GetFootwearEventResponse.FootwearEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFootwearEventResponseUnmarshaller {

	public static GetFootwearEventResponse unmarshall(GetFootwearEventResponse getFootwearEventResponse, UnmarshallerContext _ctx) {
		
		getFootwearEventResponse.setRequestId(_ctx.stringValue("GetFootwearEventResponse.RequestId"));
		getFootwearEventResponse.setErrorCode(_ctx.stringValue("GetFootwearEventResponse.ErrorCode"));
		getFootwearEventResponse.setErrorMessage(_ctx.stringValue("GetFootwearEventResponse.ErrorMessage"));
		getFootwearEventResponse.setMessage(_ctx.stringValue("GetFootwearEventResponse.Message"));
		getFootwearEventResponse.setCode(_ctx.stringValue("GetFootwearEventResponse.Code"));
		getFootwearEventResponse.setDynamicCode(_ctx.stringValue("GetFootwearEventResponse.DynamicCode"));
		getFootwearEventResponse.setSuccess(_ctx.booleanValue("GetFootwearEventResponse.Success"));
		getFootwearEventResponse.setDynamicMessage(_ctx.stringValue("GetFootwearEventResponse.DynamicMessage"));

		List<FootwearEvent> footwearEventList = new ArrayList<FootwearEvent>();
		for (int i = 0; i < _ctx.lengthValue("GetFootwearEventResponse.FootwearEventList.Length"); i++) {
			FootwearEvent footwearEvent = new FootwearEvent();
			footwearEvent.setPositionNumber(_ctx.stringValue("GetFootwearEventResponse.FootwearEventList["+ i +"].PositionNumber"));
			footwearEvent.setTryOnEventCount(_ctx.integerValue("GetFootwearEventResponse.FootwearEventList["+ i +"].TryOnEventCount"));
			footwearEvent.setSkuId(_ctx.stringValue("GetFootwearEventResponse.FootwearEventList["+ i +"].SkuId"));
			footwearEvent.setStoreId(_ctx.longValue("GetFootwearEventResponse.FootwearEventList["+ i +"].StoreId"));
			footwearEvent.setTakeEventCount(_ctx.integerValue("GetFootwearEventResponse.FootwearEventList["+ i +"].TakeEventCount"));
			footwearEvent.setDate(_ctx.stringValue("GetFootwearEventResponse.FootwearEventList["+ i +"].Date"));

			footwearEventList.add(footwearEvent);
		}
		getFootwearEventResponse.setFootwearEventList(footwearEventList);
	 
	 	return getFootwearEventResponse;
	}
}