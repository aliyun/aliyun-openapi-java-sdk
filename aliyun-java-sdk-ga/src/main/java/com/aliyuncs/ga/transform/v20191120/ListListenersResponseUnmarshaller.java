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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.ListListenersResponse;
import com.aliyuncs.ga.model.v20191120.ListListenersResponse.ListenersItem;
import com.aliyuncs.ga.model.v20191120.ListListenersResponse.ListenersItem.PortRangesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListListenersResponseUnmarshaller {

	public static ListListenersResponse unmarshall(ListListenersResponse listListenersResponse, UnmarshallerContext _ctx) {
		
		listListenersResponse.setRequestId(_ctx.stringValue("ListListenersResponse.RequestId"));
		listListenersResponse.setTotalCount(_ctx.integerValue("ListListenersResponse.TotalCount"));
		listListenersResponse.setPageNumber(_ctx.integerValue("ListListenersResponse.PageNumber"));
		listListenersResponse.setPageSize(_ctx.integerValue("ListListenersResponse.PageSize"));

		List<ListenersItem> listeners = new ArrayList<ListenersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListListenersResponse.Listeners.Length"); i++) {
			ListenersItem listenersItem = new ListenersItem();
			listenersItem.setListenerId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ListenerId"));
			listenersItem.setName(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].Name"));
			listenersItem.setDescription(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].Description"));
			listenersItem.setBizProtocol(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].Protocol"));
			listenersItem.setClientAffinity(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ClientAffinity"));
			listenersItem.setState(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].State"));
			listenersItem.setCreateTime(_ctx.longValue("ListListenersResponse.Listeners["+ i +"].CreateTime"));

			List<PortRangesItem> portRanges = new ArrayList<PortRangesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListListenersResponse.Listeners["+ i +"].PortRanges.Length"); j++) {
				PortRangesItem portRangesItem = new PortRangesItem();
				portRangesItem.setFromPort(_ctx.integerValue("ListListenersResponse.Listeners["+ i +"].PortRanges["+ j +"].FromPort"));
				portRangesItem.setToPort(_ctx.integerValue("ListListenersResponse.Listeners["+ i +"].PortRanges["+ j +"].ToPort"));

				portRanges.add(portRangesItem);
			}
			listenersItem.setPortRanges(portRanges);

			listeners.add(listenersItem);
		}
		listListenersResponse.setListeners(listeners);
	 
	 	return listListenersResponse;
	}
}