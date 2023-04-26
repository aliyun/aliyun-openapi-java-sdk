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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribePrivatePoolsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribePrivatePoolsResponse.PrivatePoolItem;
import com.aliyuncs.ecs.model.v20160314.DescribePrivatePoolsResponse.PrivatePoolItem.AllocatedResource;
import com.aliyuncs.ecs.model.v20160314.DescribePrivatePoolsResponse.PrivatePoolItem.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePrivatePoolsResponseUnmarshaller {

	public static DescribePrivatePoolsResponse unmarshall(DescribePrivatePoolsResponse describePrivatePoolsResponse, UnmarshallerContext _ctx) {
		
		describePrivatePoolsResponse.setRequestId(_ctx.stringValue("DescribePrivatePoolsResponse.RequestId"));
		describePrivatePoolsResponse.setNextToken(_ctx.stringValue("DescribePrivatePoolsResponse.NextToken"));
		describePrivatePoolsResponse.setTotalCount(_ctx.integerValue("DescribePrivatePoolsResponse.TotalCount"));
		describePrivatePoolsResponse.setMaxResults(_ctx.integerValue("DescribePrivatePoolsResponse.MaxResults"));

		List<PrivatePoolItem> privatePoolSet = new ArrayList<PrivatePoolItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePrivatePoolsResponse.PrivatePoolSet.Length"); i++) {
			PrivatePoolItem privatePoolItem = new PrivatePoolItem();
			privatePoolItem.setStatus(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].Status"));
			privatePoolItem.setPrivatePoolOptionsMatchCriteria(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].PrivatePoolOptionsMatchCriteria"));
			privatePoolItem.setPrivatePoolOptionsId(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].PrivatePoolOptionsId"));
			privatePoolItem.setUsedAssuranceTimes(_ctx.integerValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].UsedAssuranceTimes"));
			privatePoolItem.setLatestStartTime(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].LatestStartTime"));
			privatePoolItem.setPrivatePoolOptionsName(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].PrivatePoolOptionsName"));
			privatePoolItem.setPrivatePoolOptionsType(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].PrivatePoolOptionsType"));
			privatePoolItem.setRegionId(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].RegionId"));
			privatePoolItem.setEndTime(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].EndTime"));
			privatePoolItem.setStartTime(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].StartTime"));
			privatePoolItem.setDescription(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].Description"));
			privatePoolItem.setEndTimeType(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].EndTimeType"));
			privatePoolItem.setResourceGroupId(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].ResourceGroupId"));
			privatePoolItem.setPlatform(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].Platform"));
			privatePoolItem.setTotalAssuranceTimes(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].TotalAssuranceTimes"));
			privatePoolItem.setInstanceChargeType(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].InstanceChargeType"));
			privatePoolItem.setStartTimeType(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].StartTimeType"));

			List<AllocatedResource> allocatedResources = new ArrayList<AllocatedResource>();
			for (int j = 0; j < _ctx.lengthValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].AllocatedResources.Length"); j++) {
				AllocatedResource allocatedResource = new AllocatedResource();
				allocatedResource.setUsedAmount(_ctx.integerValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].AllocatedResources["+ j +"].UsedAmount"));
				allocatedResource.setTotalAmount(_ctx.integerValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].AllocatedResources["+ j +"].TotalAmount"));
				allocatedResource.setZoneId(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].AllocatedResources["+ j +"].zoneId"));
				allocatedResource.setInstanceType(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].AllocatedResources["+ j +"].InstanceType"));

				allocatedResources.add(allocatedResource);
			}
			privatePoolItem.setAllocatedResources(allocatedResources);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribePrivatePoolsResponse.PrivatePoolSet["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			privatePoolItem.setTags(tags);

			privatePoolSet.add(privatePoolItem);
		}
		describePrivatePoolsResponse.setPrivatePoolSet(privatePoolSet);
	 
	 	return describePrivatePoolsResponse;
	}
}