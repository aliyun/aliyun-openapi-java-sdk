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

import com.aliyuncs.ecs.model.v20160314.DescribeDiskReplicaPairsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeDiskReplicaPairsResponse.DiskReplicaPair;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiskReplicaPairsResponseUnmarshaller {

	public static DescribeDiskReplicaPairsResponse unmarshall(DescribeDiskReplicaPairsResponse describeDiskReplicaPairsResponse, UnmarshallerContext _ctx) {
		
		describeDiskReplicaPairsResponse.setRequestId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.RequestId"));
		describeDiskReplicaPairsResponse.setNextToken(_ctx.stringValue("DescribeDiskReplicaPairsResponse.NextToken"));

		List<DiskReplicaPair> diskReplicaPairs = new ArrayList<DiskReplicaPair>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiskReplicaPairsResponse.DiskReplicaPairs.Length"); i++) {
			DiskReplicaPair diskReplicaPair = new DiskReplicaPair();
			diskReplicaPair.setStatus(_ctx.stringValue("DescribeDiskReplicaPairsResponse.DiskReplicaPairs["+ i +"].Status"));
			diskReplicaPair.setReplicaPairId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.DiskReplicaPairs["+ i +"].ReplicaPairId"));
			diskReplicaPair.setAsyncCycle(_ctx.integerValue("DescribeDiskReplicaPairsResponse.DiskReplicaPairs["+ i +"].AsyncCycle"));
			diskReplicaPair.setTotalCopiedSize(_ctx.longValue("DescribeDiskReplicaPairsResponse.DiskReplicaPairs["+ i +"].TotalCopiedSize"));
			diskReplicaPair.setHealthStatus(_ctx.stringValue("DescribeDiskReplicaPairsResponse.DiskReplicaPairs["+ i +"].HealthStatus"));
			diskReplicaPair.setDestinationDiskId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.DiskReplicaPairs["+ i +"].DestinationDiskId"));
			diskReplicaPair.setSourceDiskId(_ctx.stringValue("DescribeDiskReplicaPairsResponse.DiskReplicaPairs["+ i +"].SourceDiskId"));
			diskReplicaPair.setBandwidth(_ctx.integerValue("DescribeDiskReplicaPairsResponse.DiskReplicaPairs["+ i +"].Bandwidth"));
			diskReplicaPair.setDescription(_ctx.stringValue("DescribeDiskReplicaPairsResponse.DiskReplicaPairs["+ i +"].Description"));
			diskReplicaPair.setDestinationRegion(_ctx.stringValue("DescribeDiskReplicaPairsResponse.DiskReplicaPairs["+ i +"].DestinationRegion"));
			diskReplicaPair.setPairName(_ctx.stringValue("DescribeDiskReplicaPairsResponse.DiskReplicaPairs["+ i +"].PairName"));
			diskReplicaPair.setSourceRegion(_ctx.stringValue("DescribeDiskReplicaPairsResponse.DiskReplicaPairs["+ i +"].SourceRegion"));
			diskReplicaPair.setRpoTime(_ctx.stringValue("DescribeDiskReplicaPairsResponse.DiskReplicaPairs["+ i +"].RpoTime"));

			diskReplicaPairs.add(diskReplicaPair);
		}
		describeDiskReplicaPairsResponse.setDiskReplicaPairs(diskReplicaPairs);
	 
	 	return describeDiskReplicaPairsResponse;
	}
}