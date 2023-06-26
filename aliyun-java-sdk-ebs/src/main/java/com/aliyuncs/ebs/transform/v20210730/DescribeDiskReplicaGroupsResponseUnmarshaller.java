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

package com.aliyuncs.ebs.transform.v20210730;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ebs.model.v20210730.DescribeDiskReplicaGroupsResponse;
import com.aliyuncs.ebs.model.v20210730.DescribeDiskReplicaGroupsResponse.ReplicaGroup;
import com.aliyuncs.ebs.model.v20210730.DescribeDiskReplicaGroupsResponse.ReplicaGroup.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiskReplicaGroupsResponseUnmarshaller {

	public static DescribeDiskReplicaGroupsResponse unmarshall(DescribeDiskReplicaGroupsResponse describeDiskReplicaGroupsResponse, UnmarshallerContext _ctx) {
		
		describeDiskReplicaGroupsResponse.setRequestId(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.RequestId"));
		describeDiskReplicaGroupsResponse.setNextToken(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.NextToken"));
		describeDiskReplicaGroupsResponse.setPageNumber(_ctx.integerValue("DescribeDiskReplicaGroupsResponse.PageNumber"));
		describeDiskReplicaGroupsResponse.setPageSize(_ctx.integerValue("DescribeDiskReplicaGroupsResponse.PageSize"));
		describeDiskReplicaGroupsResponse.setTotalCount(_ctx.longValue("DescribeDiskReplicaGroupsResponse.TotalCount"));

		List<ReplicaGroup> replicaGroups = new ArrayList<ReplicaGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups.Length"); i++) {
			ReplicaGroup replicaGroup = new ReplicaGroup();
			replicaGroup.setReplicaGroupId(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].ReplicaGroupId"));
			replicaGroup.setSourceRegionId(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].SourceRegionId"));
			replicaGroup.setSourceZoneId(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].SourceZoneId"));
			replicaGroup.setDestinationRegionId(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].DestinationRegionId"));
			replicaGroup.setDestinationZoneId(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].DestinationZoneId"));
			replicaGroup.setGroupName(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].GroupName"));
			replicaGroup.setDescription(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].Description"));
			replicaGroup.setStatus(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].Status"));
			replicaGroup.setRPO(_ctx.longValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].RPO"));
			replicaGroup.setLastRecoverPoint(_ctx.longValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].LastRecoverPoint"));
			replicaGroup.setSite(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].Site"));
			replicaGroup.setPairNumber(_ctx.longValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].PairNumber"));
			replicaGroup.setPrimaryRegion(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].PrimaryRegion"));
			replicaGroup.setStandbyRegion(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].StandbyRegion"));
			replicaGroup.setPrimaryZone(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].PrimaryZone"));
			replicaGroup.setStandbyZone(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].StandbyZone"));
			replicaGroup.setBandwidth(_ctx.longValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].Bandwidth"));
			replicaGroup.setResourceGroupId(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].ResourceGroupId"));
			replicaGroup.setSourceCloudId(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].SourceCloudId"));
			replicaGroup.setDestinationCloudId(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].DestinationCloudId"));
			replicaGroup.setPrimaryCloudId(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].PrimaryCloudId"));
			replicaGroup.setStandbyCloudId(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].StandbyCloudId"));
			replicaGroup.setPrimaryUid(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].PrimaryUid"));
			replicaGroup.setStandbyUid(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].StandbyUid"));

			List<String> pairIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].PairIds.Length"); j++) {
				pairIds.add(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].PairIds["+ j +"]"));
			}
			replicaGroup.setPairIds(pairIds);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeDiskReplicaGroupsResponse.ReplicaGroups["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			replicaGroup.setTags(tags);

			replicaGroups.add(replicaGroup);
		}
		describeDiskReplicaGroupsResponse.setReplicaGroups(replicaGroups);
	 
	 	return describeDiskReplicaGroupsResponse;
	}
}