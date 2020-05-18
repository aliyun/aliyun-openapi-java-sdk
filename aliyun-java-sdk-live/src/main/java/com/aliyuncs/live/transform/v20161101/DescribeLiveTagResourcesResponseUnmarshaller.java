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

import com.aliyuncs.live.model.v20161101.DescribeLiveTagResourcesResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveTagResourcesResponse.TagResource;
import com.aliyuncs.live.model.v20161101.DescribeLiveTagResourcesResponse.TagResource.TagItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveTagResourcesResponseUnmarshaller {

	public static DescribeLiveTagResourcesResponse unmarshall(DescribeLiveTagResourcesResponse describeLiveTagResourcesResponse, UnmarshallerContext _ctx) {
		
		describeLiveTagResourcesResponse.setRequestId(_ctx.stringValue("DescribeLiveTagResourcesResponse.RequestId"));

		List<TagResource> tagResources = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveTagResourcesResponse.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setResourceId(_ctx.stringValue("DescribeLiveTagResourcesResponse.TagResources["+ i +"].ResourceId"));

			List<TagItem> tag = new ArrayList<TagItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveTagResourcesResponse.TagResources["+ i +"].Tag.Length"); j++) {
				TagItem tagItem = new TagItem();
				tagItem.setKey(_ctx.stringValue("DescribeLiveTagResourcesResponse.TagResources["+ i +"].Tag["+ j +"].Key"));
				tagItem.setValue(_ctx.stringValue("DescribeLiveTagResourcesResponse.TagResources["+ i +"].Tag["+ j +"].Value"));

				tag.add(tagItem);
			}
			tagResource.setTag(tag);

			tagResources.add(tagResource);
		}
		describeLiveTagResourcesResponse.setTagResources(tagResources);
	 
	 	return describeLiveTagResourcesResponse;
	}
}