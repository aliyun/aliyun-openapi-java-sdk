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

package com.aliyuncs.eflo.transform.v20220530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.ListNodeInfosForPodResponse;
import com.aliyuncs.eflo.model.v20220530.ListNodeInfosForPodResponse.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodeInfosForPodResponseUnmarshaller {

	public static ListNodeInfosForPodResponse unmarshall(ListNodeInfosForPodResponse listNodeInfosForPodResponse, UnmarshallerContext _ctx) {
		
		listNodeInfosForPodResponse.setRequestId(_ctx.stringValue("ListNodeInfosForPodResponse.RequestId"));
		listNodeInfosForPodResponse.setCode(_ctx.integerValue("ListNodeInfosForPodResponse.Code"));
		listNodeInfosForPodResponse.setMessage(_ctx.stringValue("ListNodeInfosForPodResponse.Message"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListNodeInfosForPodResponse.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setRegionId(_ctx.stringValue("ListNodeInfosForPodResponse.Content["+ i +"].RegionId"));
			contentItem.setZoneId(_ctx.stringValue("ListNodeInfosForPodResponse.Content["+ i +"].ZoneId"));
			contentItem.setClusterId(_ctx.stringValue("ListNodeInfosForPodResponse.Content["+ i +"].ClusterId"));
			contentItem.setVpcId(_ctx.stringValue("ListNodeInfosForPodResponse.Content["+ i +"].VpcId"));
			contentItem.setNodeId(_ctx.stringValue("ListNodeInfosForPodResponse.Content["+ i +"].NodeId"));
			contentItem.setLeniQuota(_ctx.integerValue("ListNodeInfosForPodResponse.Content["+ i +"].LeniQuota"));
			contentItem.setLniSipQuota(_ctx.integerValue("ListNodeInfosForPodResponse.Content["+ i +"].LniSipQuota"));

			List<String> vSwitches = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListNodeInfosForPodResponse.Content["+ i +"].VSwitches.Length"); j++) {
				vSwitches.add(_ctx.stringValue("ListNodeInfosForPodResponse.Content["+ i +"].VSwitches["+ j +"]"));
			}
			contentItem.setVSwitches(vSwitches);

			content.add(contentItem);
		}
		listNodeInfosForPodResponse.setContent(content);
	 
	 	return listNodeInfosForPodResponse;
	}
}