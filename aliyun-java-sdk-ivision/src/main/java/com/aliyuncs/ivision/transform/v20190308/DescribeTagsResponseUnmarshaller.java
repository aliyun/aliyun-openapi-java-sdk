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

package com.aliyuncs.ivision.transform.v20190308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivision.model.v20190308.DescribeTagsResponse;
import com.aliyuncs.ivision.model.v20190308.DescribeTagsResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagsResponseUnmarshaller {

	public static DescribeTagsResponse unmarshall(DescribeTagsResponse describeTagsResponse, UnmarshallerContext context) {
		
		describeTagsResponse.setRequestId(context.stringValue("DescribeTagsResponse.RequestId"));
		describeTagsResponse.setTotalNum(context.longValue("DescribeTagsResponse.TotalNum"));
		describeTagsResponse.setCurrentPage(context.longValue("DescribeTagsResponse.CurrentPage"));
		describeTagsResponse.setPageSize(context.longValue("DescribeTagsResponse.PageSize"));
		describeTagsResponse.setNextPageToken(context.stringValue("DescribeTagsResponse.NextPageToken"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("DescribeTagsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setProjectId(context.stringValue("DescribeTagsResponse.Tags["+ i +"].ProjectId"));
			tag.setTagId(context.stringValue("DescribeTagsResponse.Tags["+ i +"].TagId"));
			tag.setTagName(context.stringValue("DescribeTagsResponse.Tags["+ i +"].TagName"));
			tag.setDescription(context.stringValue("DescribeTagsResponse.Tags["+ i +"].Description"));
			tag.setCount(context.integerValue("DescribeTagsResponse.Tags["+ i +"].Count"));
			tag.setCreationTime(context.stringValue("DescribeTagsResponse.Tags["+ i +"].CreationTime"));

			tags.add(tag);
		}
		describeTagsResponse.setTags(tags);
	 
	 	return describeTagsResponse;
	}
}