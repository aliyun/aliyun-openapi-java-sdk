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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListVodRealtimeLogDeliveryInfosResponse;
import com.aliyuncs.vod.model.v20170321.ListVodRealtimeLogDeliveryInfosResponse.RealtimeLogDeliveryInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVodRealtimeLogDeliveryInfosResponseUnmarshaller {

	public static ListVodRealtimeLogDeliveryInfosResponse unmarshall(ListVodRealtimeLogDeliveryInfosResponse listVodRealtimeLogDeliveryInfosResponse, UnmarshallerContext _ctx) {
		
		listVodRealtimeLogDeliveryInfosResponse.setRequestId(_ctx.stringValue("ListVodRealtimeLogDeliveryInfosResponse.RequestId"));

		List<RealtimeLogDeliveryInfos> content = new ArrayList<RealtimeLogDeliveryInfos>();
		for (int i = 0; i < _ctx.lengthValue("ListVodRealtimeLogDeliveryInfosResponse.Content.Length"); i++) {
			RealtimeLogDeliveryInfos realtimeLogDeliveryInfos = new RealtimeLogDeliveryInfos();
			realtimeLogDeliveryInfos.setProject(_ctx.stringValue("ListVodRealtimeLogDeliveryInfosResponse.Content["+ i +"].Project"));
			realtimeLogDeliveryInfos.setLogstore(_ctx.stringValue("ListVodRealtimeLogDeliveryInfosResponse.Content["+ i +"].Logstore"));
			realtimeLogDeliveryInfos.setRegion(_ctx.stringValue("ListVodRealtimeLogDeliveryInfosResponse.Content["+ i +"].Region"));

			content.add(realtimeLogDeliveryInfos);
		}
		listVodRealtimeLogDeliveryInfosResponse.setContent(content);
	 
	 	return listVodRealtimeLogDeliveryInfosResponse;
	}
}