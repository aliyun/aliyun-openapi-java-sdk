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

import com.aliyuncs.live.model.v20161101.ListLiveRealtimeLogDeliveryDomainsResponse;
import com.aliyuncs.live.model.v20161101.ListLiveRealtimeLogDeliveryDomainsResponse.Domains;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLiveRealtimeLogDeliveryDomainsResponseUnmarshaller {

	public static ListLiveRealtimeLogDeliveryDomainsResponse unmarshall(ListLiveRealtimeLogDeliveryDomainsResponse listLiveRealtimeLogDeliveryDomainsResponse, UnmarshallerContext _ctx) {
		
		listLiveRealtimeLogDeliveryDomainsResponse.setRequestId(_ctx.stringValue("ListLiveRealtimeLogDeliveryDomainsResponse.RequestId"));

		List<Domains> content = new ArrayList<Domains>();
		for (int i = 0; i < _ctx.lengthValue("ListLiveRealtimeLogDeliveryDomainsResponse.Content.Length"); i++) {
			Domains domains = new Domains();
			domains.setDomainName(_ctx.stringValue("ListLiveRealtimeLogDeliveryDomainsResponse.Content["+ i +"].DomainName"));
			domains.setStatus(_ctx.stringValue("ListLiveRealtimeLogDeliveryDomainsResponse.Content["+ i +"].Status"));

			content.add(domains);
		}
		listLiveRealtimeLogDeliveryDomainsResponse.setContent(content);
	 
	 	return listLiveRealtimeLogDeliveryDomainsResponse;
	}
}