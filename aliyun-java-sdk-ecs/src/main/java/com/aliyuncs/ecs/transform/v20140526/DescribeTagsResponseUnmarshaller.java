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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagsResponseUnmarshaller {

	public static DescribeTagsResponse unmarshall(DescribeTagsResponse describeTagsResponse, UnmarshallerContext _ctx) {
		
		describeTagsResponse.setRequestId(_ctx.stringValue("DescribeTagsResponse.RequestId"));
		describeTagsResponse.setPageSize(_ctx.integerValue("DescribeTagsResponse.PageSize"));
		describeTagsResponse.setPageNumber(_ctx.integerValue("DescribeTagsResponse.PageNumber"));
		describeTagsResponse.setTotalCount(_ctx.integerValue("DescribeTagsResponse.TotalCount"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagValue(_ctx.stringValue("DescribeTagsResponse.Tags["+ i +"].TagValue"));
			tag.setTagKey(_ctx.stringValue("DescribeTagsResponse.Tags["+ i +"].TagKey"));

			ResourceTypeCount resourceTypeCount = new ResourceTypeCount();
			resourceTypeCount.setInstance(_ctx.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Instance"));
			resourceTypeCount.setImage(_ctx.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Image"));
			resourceTypeCount.setDdh(_ctx.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Ddh"));
			resourceTypeCount.setSnapshotPolicy(_ctx.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.SnapshotPolicy"));
			resourceTypeCount.setSecuritygroup(_ctx.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Securitygroup"));
			resourceTypeCount.setSnapshot(_ctx.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Snapshot"));
			resourceTypeCount.setReservedInstance(_ctx.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.ReservedInstance"));
			resourceTypeCount.setLaunchTemplate(_ctx.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.LaunchTemplate"));
			resourceTypeCount.setEni(_ctx.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Eni"));
			resourceTypeCount.setDisk(_ctx.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Disk"));
			resourceTypeCount.setKeyPair(_ctx.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.KeyPair"));
			resourceTypeCount.setVolume(_ctx.integerValue("DescribeTagsResponse.Tags["+ i +"].ResourceTypeCount.Volume"));
			tag.setResourceTypeCount(resourceTypeCount);

			tags.add(tag);
		}
		describeTagsResponse.setTags(tags);
	 
	 	return describeTagsResponse;
	}
}