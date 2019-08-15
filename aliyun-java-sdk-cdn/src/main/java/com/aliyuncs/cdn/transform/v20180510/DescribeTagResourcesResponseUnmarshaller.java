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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeTagResourcesResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeTagResourcesResponse.TagResource;
import com.aliyuncs.cdn.model.v20180510.DescribeTagResourcesResponse.TagResource.TagItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagResourcesResponseUnmarshaller {

	public static DescribeTagResourcesResponse unmarshall(DescribeTagResourcesResponse describeTagResourcesResponse, UnmarshallerContext _ctx) {
		
		describeTagResourcesResponse.setRequestId(_ctx.stringValue("DescribeTagResourcesResponse.RequestId"));

		List<TagResource> tagResources = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagResourcesResponse.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setResourceId(_ctx.stringValue("DescribeTagResourcesResponse.TagResources["+ i +"].ResourceId"));

			List<TagItem> tag = new ArrayList<TagItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTagResourcesResponse.TagResources["+ i +"].Tag.Length"); j++) {
				TagItem tagItem = new TagItem();
				tagItem.setKey(_ctx.stringValue("DescribeTagResourcesResponse.TagResources["+ i +"].Tag["+ j +"].Key"));
				tagItem.setValue(_ctx.stringValue("DescribeTagResourcesResponse.TagResources["+ i +"].Tag["+ j +"].Value"));

				tag.add(tagItem);
			}
			tagResource.setTag(tag);

			tagResources.add(tagResource);
		}
		describeTagResourcesResponse.setTagResources(tagResources);
	 
	 	return describeTagResourcesResponse;
	}
}