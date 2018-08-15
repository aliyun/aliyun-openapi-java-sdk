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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeTagsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeTagsResponse.Tag;
import com.aliyuncs.ecs.model.v20140526.DescribeTagsResponse.Tag.ResourceTypeCount;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagsResponseUnmarshaller {

	public static DescribeTagsResponse unmarshall(DescribeTagsResponse describeTagsResponse, UnmarshallerContext context) {
		
		describeTagsResponse.setRequestId(context.stringValue("DescribeTagsResponse.RequestId"));
		describeTagsResponse.setPageSize(context.integerValue("DescribeTagsResponse.PageSize"));
		describeTagsResponse.setPageNumber(context.integerValue("DescribeTagsResponse.PageNumber"));
		describeTagsResponse.setTotalCount(context.integerValue("DescribeTagsResponse.TotalCount"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("DescribeTagsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(context.stringValue("DescribeTagsResponse.Tags["+ i +"].TagKey"));
			tag.setTagValue(context.stringValue("DescribeTagsResponse.Tags["+ i +"].TagValue"));

			ResourceTypeCount resourceTypeCount = new ResourceTypeCount();
			resourceTypeCount.setInstance(context.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Instance"));
			resourceTypeCount.setDisk(context.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Disk"));
			resourceTypeCount.setVolume(context.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Volume"));
			resourceTypeCount.setImage(context.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Image"));
			resourceTypeCount.setSnapshot(context.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Snapshot"));
			resourceTypeCount.setSecuritygroup(context.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Securitygroup"));
			resourceTypeCount.setLaunchTemplate(context.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.LaunchTemplate"));
			resourceTypeCount.setEni(context.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Eni"));
			resourceTypeCount.setDdh(context.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Ddh"));
			resourceTypeCount.setKeyPair(context.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.KeyPair"));
			tag.setResourceTypeCount(resourceTypeCount);

			tags.add(tag);
		}
		describeTagsResponse.setTags(tags);
	 
	 	return describeTagsResponse;
	}
}