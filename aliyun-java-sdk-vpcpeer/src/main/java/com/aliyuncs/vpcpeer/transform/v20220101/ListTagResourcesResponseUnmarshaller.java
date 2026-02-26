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

package com.aliyuncs.vpcpeer.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpcpeer.model.v20220101.ListTagResourcesResponse;
import com.aliyuncs.vpcpeer.model.v20220101.ListTagResourcesResponse.TagResultModelList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagResourcesResponseUnmarshaller {

	public static ListTagResourcesResponse unmarshall(ListTagResourcesResponse listTagResourcesResponse, UnmarshallerContext _ctx) {
		
		listTagResourcesResponse.setRequestId(_ctx.stringValue("ListTagResourcesResponse.RequestId"));
		listTagResourcesResponse.setNextToken(_ctx.stringValue("ListTagResourcesResponse.NextToken"));
		listTagResourcesResponse.setMaxResults(_ctx.integerValue("ListTagResourcesResponse.MaxResults"));

		List<TagResultModelList> tagResources = new ArrayList<TagResultModelList>();
		for (int i = 0; i < _ctx.lengthValue("ListTagResourcesResponse.TagResources.Length"); i++) {
			TagResultModelList tagResultModelList = new TagResultModelList();
			tagResultModelList.setResourceId(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].ResourceId"));
			tagResultModelList.setResourceType(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].ResourceType"));
			tagResultModelList.setRegionNo(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].RegionNo"));
			tagResultModelList.setTagKey(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].TagKey"));
			tagResultModelList.setTagValue(_ctx.stringValue("ListTagResourcesResponse.TagResources["+ i +"].TagValue"));

			tagResources.add(tagResultModelList);
		}
		listTagResourcesResponse.setTagResources(tagResources);
	 
	 	return listTagResourcesResponse;
	}
}