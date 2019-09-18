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

import com.aliyuncs.live.model.v20161101.ListLiveRealtimeLogDeliveryResponse;
import com.aliyuncs.live.model.v20161101.ListLiveRealtimeLogDeliveryResponse.RealtimeLogDeliveryInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLiveRealtimeLogDeliveryResponseUnmarshaller {

	public static ListLiveRealtimeLogDeliveryResponse unmarshall(ListLiveRealtimeLogDeliveryResponse listLiveRealtimeLogDeliveryResponse, UnmarshallerContext _ctx) {
		
		listLiveRealtimeLogDeliveryResponse.setRequestId(_ctx.stringValue("ListLiveRealtimeLogDeliveryResponse.RequestId"));

		List<RealtimeLogDeliveryInfo> content = new ArrayList<RealtimeLogDeliveryInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListLiveRealtimeLogDeliveryResponse.Content.Length"); i++) {
			RealtimeLogDeliveryInfo realtimeLogDeliveryInfo = new RealtimeLogDeliveryInfo();
			realtimeLogDeliveryInfo.setProject(_ctx.stringValue("ListLiveRealtimeLogDeliveryResponse.Content["+ i +"].Project"));
			realtimeLogDeliveryInfo.setLogstore(_ctx.stringValue("ListLiveRealtimeLogDeliveryResponse.Content["+ i +"].Logstore"));
			realtimeLogDeliveryInfo.setRegion(_ctx.stringValue("ListLiveRealtimeLogDeliveryResponse.Content["+ i +"].Region"));
			realtimeLogDeliveryInfo.setDomainName(_ctx.stringValue("ListLiveRealtimeLogDeliveryResponse.Content["+ i +"].DomainName"));
			realtimeLogDeliveryInfo.setDmId(_ctx.integerValue("ListLiveRealtimeLogDeliveryResponse.Content["+ i +"].DmId"));
			realtimeLogDeliveryInfo.setStatus(_ctx.stringValue("ListLiveRealtimeLogDeliveryResponse.Content["+ i +"].Status"));

			content.add(realtimeLogDeliveryInfo);
		}
		listLiveRealtimeLogDeliveryResponse.setContent(content);
	 
	 	return listLiveRealtimeLogDeliveryResponse;
	}
}