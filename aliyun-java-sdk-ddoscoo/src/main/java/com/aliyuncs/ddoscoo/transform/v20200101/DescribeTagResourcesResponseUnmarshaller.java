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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeTagResourcesResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeTagResourcesResponse.TagResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagResourcesResponseUnmarshaller {

	public static DescribeTagResourcesResponse unmarshall(DescribeTagResourcesResponse describeTagResourcesResponse, UnmarshallerContext _ctx) {
		
		describeTagResourcesResponse.setRequestId(_ctx.stringValue("DescribeTagResourcesResponse.RequestId"));
		describeTagResourcesResponse.setNextToken(_ctx.stringValue("DescribeTagResourcesResponse.NextToken"));

		List<TagResource> tagResources = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagResourcesResponse.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setResourceType(_ctx.stringValue("DescribeTagResourcesResponse.TagResources["+ i +"].ResourceType"));
			tagResource.setResourceId(_ctx.stringValue("DescribeTagResourcesResponse.TagResources["+ i +"].ResourceId"));
			tagResource.setTagKey(_ctx.stringValue("DescribeTagResourcesResponse.TagResources["+ i +"].TagKey"));
			tagResource.setTagValue(_ctx.stringValue("DescribeTagResourcesResponse.TagResources["+ i +"].TagValue"));

			tagResources.add(tagResource);
		}
		describeTagResourcesResponse.setTagResources(tagResources);
	 
	 	return describeTagResourcesResponse;
	}
}