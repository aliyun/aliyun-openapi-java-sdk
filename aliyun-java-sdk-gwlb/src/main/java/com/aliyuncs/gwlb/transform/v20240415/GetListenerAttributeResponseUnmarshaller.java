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

import com.aliyuncs.gwlb.model.v20240415.GetListenerAttributeResponse;
import com.aliyuncs.gwlb.model.v20240415.GetListenerAttributeResponse.TagModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetListenerAttributeResponseUnmarshaller {

	public static GetListenerAttributeResponse unmarshall(GetListenerAttributeResponse getListenerAttributeResponse, UnmarshallerContext _ctx) {
		
		getListenerAttributeResponse.setRequestId(_ctx.stringValue("GetListenerAttributeResponse.RequestId"));
		getListenerAttributeResponse.setListenerDescription(_ctx.stringValue("GetListenerAttributeResponse.ListenerDescription"));
		getListenerAttributeResponse.setListenerId(_ctx.stringValue("GetListenerAttributeResponse.ListenerId"));
		getListenerAttributeResponse.setListenerStatus(_ctx.stringValue("GetListenerAttributeResponse.ListenerStatus"));
		getListenerAttributeResponse.setLoadBalancerId(_ctx.stringValue("GetListenerAttributeResponse.LoadBalancerId"));
		getListenerAttributeResponse.setRegionId(_ctx.stringValue("GetListenerAttributeResponse.RegionId"));
		getListenerAttributeResponse.setServerGroupId(_ctx.stringValue("GetListenerAttributeResponse.ServerGroupId"));

		List<TagModel> tags = new ArrayList<TagModel>();
		for (int i = 0; i < _ctx.lengthValue("GetListenerAttributeResponse.Tags.Length"); i++) {
			TagModel tagModel = new TagModel();
			tagModel.setKey(_ctx.stringValue("GetListenerAttributeResponse.Tags["+ i +"].Key"));
			tagModel.setValue(_ctx.stringValue("GetListenerAttributeResponse.Tags["+ i +"].Value"));

			tags.add(tagModel);
		}
		getListenerAttributeResponse.setTags(tags);
	 
	 	return getListenerAttributeResponse;
	}
}