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

package com.aliyuncs.gwlb.transform.v20240415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gwlb.model.v20240415.ListListenersResponse;
import com.aliyuncs.gwlb.model.v20240415.ListListenersResponse.Listener;
import com.aliyuncs.gwlb.model.v20240415.ListListenersResponse.Listener.TagModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListListenersResponseUnmarshaller {

	public static ListListenersResponse unmarshall(ListListenersResponse listListenersResponse, UnmarshallerContext _ctx) {
		
		listListenersResponse.setRequestId(_ctx.stringValue("ListListenersResponse.RequestId"));
		listListenersResponse.setMaxResults(_ctx.integerValue("ListListenersResponse.MaxResults"));
		listListenersResponse.setNextToken(_ctx.stringValue("ListListenersResponse.NextToken"));
		listListenersResponse.setTotalCount(_ctx.integerValue("ListListenersResponse.TotalCount"));

		List<Listener> listeners = new ArrayList<Listener>();
		for (int i = 0; i < _ctx.lengthValue("ListListenersResponse.Listeners.Length"); i++) {
			Listener listener = new Listener();
			listener.setListenerDescription(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ListenerDescription"));
			listener.setListenerId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ListenerId"));
			listener.setListenerStatus(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ListenerStatus"));
			listener.setLoadBalancerId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].LoadBalancerId"));
			listener.setServerGroupId(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].ServerGroupId"));

			List<TagModel> tags = new ArrayList<TagModel>();
			for (int j = 0; j < _ctx.lengthValue("ListListenersResponse.Listeners["+ i +"].Tags.Length"); j++) {
				TagModel tagModel = new TagModel();
				tagModel.setKey(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].Tags["+ j +"].Key"));
				tagModel.setValue(_ctx.stringValue("ListListenersResponse.Listeners["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagModel);
			}
			listener.setTags(tags);

			listeners.add(listener);
		}
		listListenersResponse.setListeners(listeners);
	 
	 	return listListenersResponse;
	}
}