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

import com.aliyuncs.ebs.model.v20210730.DescribeDiskReplicaPairsResponse;
import com.aliyuncs.ebs.model.v20210730.DescribeDiskReplicaPairsResponse.ReplicaPair;
import com.aliyuncs.ebs.model.v20210730.DescribeDiskReplicaPairsResponse.ReplicaPair.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiskReplicaPairsResponseUnmarshaller {

	public static DescribeDiskReplicaPairsResponse unmarshall(DescribeDiskReplicaPairsResponse describeDiskReplicaPairsResponse, UnmarshallerContext _ctx) {
		
		describeDiskReplicaPairsResponse.setRequestId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.RequestId"));
		describeDiskReplicaPairsResponse.setNextToken(_ctx.stringValue("DescribeDiskReplicaPairsResponse.NextToken"));
		describeDiskReplicaPairsResponse.setPageNumber(_ctx.integerValue("DescribeDiskReplicaPairsResponse.PageNumber"));
		describeDiskReplicaPairsResponse.setPageSize(_ctx.integerValue("DescribeDiskReplicaPairsResponse.PageSize"));
		describeDiskReplicaPairsResponse.setTotalCount(_ctx.longValue("DescribeDiskReplicaPairsResponse.TotalCount"));

		List<ReplicaPair> replicaPairs = new ArrayList<ReplicaPair>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiskReplicaPairsResponse.ReplicaPairs.Length"); i++) {
			ReplicaPair replicaPair = new ReplicaPair();
			replicaPair.setReplicaPairId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].ReplicaPairId"));
			replicaPair.setSourceRegion(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].SourceRegion"));
			replicaPair.setSourceZoneId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].SourceZoneId"));
			replicaPair.setSourceDiskId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].SourceDiskId"));
			replicaPair.setDestinationRegion(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].DestinationRegion"));
			replicaPair.setDestinationZoneId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].DestinationZoneId"));
			replicaPair.setDestinationDiskId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].DestinationDiskId"));
			replicaPair.setPairName(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].PairName"));
			replicaPair.setDescription(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].Description"));
			replicaPair.setStatus(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].Status"));
			replicaPair.setRPO(_ctx.longValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].RPO"));
			replicaPair.setBandwidth(_ctx.longValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].Bandwidth"));
			replicaPair.setStatusMessage(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].StatusMessage"));
			replicaPair.setLastRecoverPoint(_ctx.longValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].LastRecoverPoint"));
			replicaPair.setReplicaGroupId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].ReplicaGroupId"));
			replicaPair.setCreateTime(_ctx.longValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].CreateTime"));
			replicaPair.setReplicaGroupName(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].ReplicaGroupName"));
			replicaPair.setSite(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].Site"));
			replicaPair.setPrimaryRegion(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].PrimaryRegion"));
			replicaPair.setStandbyRegion(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].StandbyRegion"));
			replicaPair.setPrimaryZone(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].PrimaryZone"));
			replicaPair.setStandbyZone(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].StandbyZone"));
			replicaPair.setChargeType(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].ChargeType"));
			replicaPair.setExpiredTime(_ctx.longValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].ExpiredTime"));
			replicaPair.setSourceCloudId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].SourceCloudId"));
			replicaPair.setDestinationCloudId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].DestinationCloudId"));
			replicaPair.setPrimaryCloudId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].PrimaryCloudId"));
			replicaPair.setStandbyCloudId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].StandbyCloudId"));
			replicaPair.setPrimaryUid(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].PrimaryUid"));
			replicaPair.setStandbyUid(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].StandbyUid"));
			replicaPair.setResourceGroupId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].ResourceGroupId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeDiskReplicaPairsResponse.ReplicaPairs["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			replicaPair.setTags(tags);

			replicaPairs.add(replicaPair);
		}
		describeDiskReplicaPairsResponse.setReplicaPairs(replicaPairs);
	 
	 	return describeDiskReplicaPairsResponse;
	}
}