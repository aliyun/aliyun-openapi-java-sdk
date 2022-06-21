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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.ListLiveRealtimeLogDeliveryInfosResponse;
import com.aliyuncs.live.model.v20161101.ListLiveRealtimeLogDeliveryInfosResponse.RealtimeLogDeliveryInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLiveRealtimeLogDeliveryInfosResponseUnmarshaller {

	public static ListLiveRealtimeLogDeliveryInfosResponse unmarshall(ListLiveRealtimeLogDeliveryInfosResponse listLiveRealtimeLogDeliveryInfosResponse, UnmarshallerContext _ctx) {
		
		listLiveRealtimeLogDeliveryInfosResponse.setRequestId(_ctx.stringValue("ListLiveRealtimeLogDeliveryInfosResponse.RequestId"));

		List<RealtimeLogDeliveryInfos> content = new ArrayList<RealtimeLogDeliveryInfos>();
		for (int i = 0; i < _ctx.lengthValue("ListLiveRealtimeLogDeliveryInfosResponse.Content.Length"); i++) {
			RealtimeLogDeliveryInfos realtimeLogDeliveryInfos = new RealtimeLogDeliveryInfos();
			realtimeLogDeliveryInfos.setProject(_ctx.stringValue("ListLiveRealtimeLogDeliveryInfosResponse.Content["+ i +"].Project"));
			realtimeLogDeliveryInfos.setLogstore(_ctx.stringValue("ListLiveRealtimeLogDeliveryInfosResponse.Content["+ i +"].Logstore"));
			realtimeLogDeliveryInfos.setRegion(_ctx.stringValue("ListLiveRealtimeLogDeliveryInfosResponse.Content["+ i +"].Region"));

			content.add(realtimeLogDeliveryInfos);
		}
		listLiveRealtimeLogDeliveryInfosResponse.setContent(content);
	 
	 	return listLiveRealtimeLogDeliveryInfosResponse;
	}
}