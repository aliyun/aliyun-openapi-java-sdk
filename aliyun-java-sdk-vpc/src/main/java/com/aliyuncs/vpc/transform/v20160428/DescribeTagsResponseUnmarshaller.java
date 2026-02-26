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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeTagsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeTagsResponse.TagResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagsResponseUnmarshaller {

	public static DescribeTagsResponse unmarshall(DescribeTagsResponse describeTagsResponse, UnmarshallerContext _ctx) {
		
		describeTagsResponse.setRequestId(_ctx.stringValue("DescribeTagsResponse.RequestId"));
		describeTagsResponse.setNextToken(_ctx.stringValue("DescribeTagsResponse.NextToken"));

		List<TagResource> tagResources = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagsResponse.TagResources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setTagValue(_ctx.stringValue("DescribeTagsResponse.TagResources["+ i +"].TagValue"));
			tagResource.setTagKey(_ctx.stringValue("DescribeTagsResponse.TagResources["+ i +"].TagKey"));

			tagResources.add(tagResource);
		}
		describeTagsResponse.setTagResources(tagResources);
	 
	 	return describeTagsResponse;
	}
}