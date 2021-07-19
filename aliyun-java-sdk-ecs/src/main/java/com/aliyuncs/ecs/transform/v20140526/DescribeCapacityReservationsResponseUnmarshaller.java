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

import com.aliyuncs.ecs.model.v20140526.DescribeCapacityReservationsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeCapacityReservationsResponse.CapacityReservationItem;
import com.aliyuncs.ecs.model.v20140526.DescribeCapacityReservationsResponse.CapacityReservationItem.AllocatedResource;
import com.aliyuncs.ecs.model.v20140526.DescribeCapacityReservationsResponse.CapacityReservationItem.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCapacityReservationsResponseUnmarshaller {

	public static DescribeCapacityReservationsResponse unmarshall(DescribeCapacityReservationsResponse describeCapacityReservationsResponse, UnmarshallerContext _ctx) {
		
		describeCapacityReservationsResponse.setRequestId(_ctx.stringValue("DescribeCapacityReservationsResponse.RequestId"));
		describeCapacityReservationsResponse.setNextToken(_ctx.stringValue("DescribeCapacityReservationsResponse.NextToken"));
		describeCapacityReservationsResponse.setTotalCount(_ctx.integerValue("DescribeCapacityReservationsResponse.TotalCount"));
		describeCapacityReservationsResponse.setMaxResults(_ctx.integerValue("DescribeCapacityReservationsResponse.MaxResults"));

		List<CapacityReservationItem> capacityReservationSet = new ArrayList<CapacityReservationItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCapacityReservationsResponse.CapacityReservationSet.Length"); i++) {
			CapacityReservationItem capacityReservationItem = new CapacityReservationItem();
			capacityReservationItem.setStatus(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].Status"));
			capacityReservationItem.setTimeSlot(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].TimeSlot"));
			capacityReservationItem.setPrivatePoolOptionsMatchCriteria(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].PrivatePoolOptionsMatchCriteria"));
			capacityReservationItem.setPrivatePoolOptionsId(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].PrivatePoolOptionsId"));
			capacityReservationItem.setPrivatePoolOptionsName(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].PrivatePoolOptionsName"));
			capacityReservationItem.setRegionId(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].RegionId"));
			capacityReservationItem.setInstanceChargeType(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].InstanceChargeType"));
			capacityReservationItem.setEndTime(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].EndTime"));
			capacityReservationItem.setStartTime(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].StartTime"));
			capacityReservationItem.setDescription(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].Description"));
			capacityReservationItem.setEndTimeType(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].EndTimeType"));
			capacityReservationItem.setResourceGroupId(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].ResourceGroupId"));
			capacityReservationItem.setPlatform(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].Platform"));

			List<AllocatedResource> allocatedResources = new ArrayList<AllocatedResource>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].AllocatedResources.Length"); j++) {
				AllocatedResource allocatedResource = new AllocatedResource();
				allocatedResource.setUsedAmount(_ctx.integerValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].AllocatedResources["+ j +"].UsedAmount"));
				allocatedResource.setTotalAmount(_ctx.integerValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].AllocatedResources["+ j +"].TotalAmount"));
				allocatedResource.setZoneId(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].AllocatedResources["+ j +"].zoneId"));
				allocatedResource.setInstanceType(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].AllocatedResources["+ j +"].InstanceType"));

				allocatedResources.add(allocatedResource);
			}
			capacityReservationItem.setAllocatedResources(allocatedResources);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeCapacityReservationsResponse.CapacityReservationSet["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			capacityReservationItem.setTags(tags);

			capacityReservationSet.add(capacityReservationItem);
		}
		describeCapacityReservationsResponse.setCapacityReservationSet(capacityReservationSet);
	 
	 	return describeCapacityReservationsResponse;
	}
}