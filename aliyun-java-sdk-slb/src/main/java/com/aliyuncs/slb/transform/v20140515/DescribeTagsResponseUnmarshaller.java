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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeTagsResponse;
import com.aliyuncs.slb.model.v20140515.DescribeTagsResponse.TagSet;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagsResponseUnmarshaller {

	public static DescribeTagsResponse unmarshall(DescribeTagsResponse describeTagsResponse, UnmarshallerContext context) {
		
		describeTagsResponse.setRequestId(context.stringValue("DescribeTagsResponse.RequestId"));
		describeTagsResponse.setPageSize(context.integerValue("DescribeTagsResponse.PageSize"));
		describeTagsResponse.setPageNumber(context.integerValue("DescribeTagsResponse.PageNumber"));
		describeTagsResponse.setTotalCount(context.integerValue("DescribeTagsResponse.TotalCount"));

		List<TagSet> tagSets = new ArrayList<TagSet>();
		for (int i = 0; i < context.lengthValue("DescribeTagsResponse.TagSets.Length"); i++) {
			TagSet tagSet = new TagSet();
			tagSet.setTagKey(context.stringValue("DescribeTagsResponse.TagSets["+ i +"].TagKey"));
			tagSet.setTagValue(context.stringValue("DescribeTagsResponse.TagSets["+ i +"].TagValue"));
			tagSet.setInstanceCount(context.integerValue("DescribeTagsResponse.TagSets["+ i +"].InstanceCount"));

			tagSets.add(tagSet);
		}
		describeTagsResponse.setTagSets(tagSets);
	 
	 	return describeTagsResponse;
	}
}