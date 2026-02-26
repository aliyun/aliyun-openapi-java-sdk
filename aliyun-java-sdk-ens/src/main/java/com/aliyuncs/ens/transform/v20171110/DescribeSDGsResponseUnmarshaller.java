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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeSDGsResponse;
import com.aliyuncs.ens.model.v20171110.DescribeSDGsResponse.SDGsItem;
import com.aliyuncs.ens.model.v20171110.DescribeSDGsResponse.SDGsItem.AvaliableRegionIdsItem;
import com.aliyuncs.ens.model.v20171110.DescribeSDGsResponse.SDGsItem.DeployedInstanceIdsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSDGsResponseUnmarshaller {

	public static DescribeSDGsResponse unmarshall(DescribeSDGsResponse describeSDGsResponse, UnmarshallerContext _ctx) {
		
		describeSDGsResponse.setRequestId(_ctx.stringValue("DescribeSDGsResponse.RequestId"));

		List<SDGsItem> sDGs = new ArrayList<SDGsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSDGsResponse.SDGs.Length"); i++) {
			SDGsItem sDGsItem = new SDGsItem();
			sDGsItem.setCreationInstanceId(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].CreationInstanceId"));
			sDGsItem.setCreationRegionId(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].CreationRegionId"));
			sDGsItem.setCreationTime(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].CreationTime"));
			sDGsItem.setDescription(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].Description"));
			sDGsItem.setParentSDGId(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].ParentSDGId"));
			sDGsItem.setSDGId(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].SDGId"));
			sDGsItem.setSize(_ctx.longValue("DescribeSDGsResponse.SDGs["+ i +"].Size"));
			sDGsItem.setStatus(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].Status"));
			sDGsItem.setUpdateTime(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].UpdateTime"));

			List<AvaliableRegionIdsItem> avaliableRegionIds = new ArrayList<AvaliableRegionIdsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSDGsResponse.SDGs["+ i +"].AvaliableRegionIds.Length"); j++) {
				AvaliableRegionIdsItem avaliableRegionIdsItem = new AvaliableRegionIdsItem();
				avaliableRegionIdsItem.setCreationTime(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].AvaliableRegionIds["+ j +"].CreationTime"));
				avaliableRegionIdsItem.setRegionId(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].AvaliableRegionIds["+ j +"].RegionId"));
				avaliableRegionIdsItem.setSnapshotId(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].AvaliableRegionIds["+ j +"].SnapshotId"));
				avaliableRegionIdsItem.setStatus(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].AvaliableRegionIds["+ j +"].Status"));

				avaliableRegionIds.add(avaliableRegionIdsItem);
			}
			sDGsItem.setAvaliableRegionIds(avaliableRegionIds);

			List<DeployedInstanceIdsItem> deployedInstanceIds = new ArrayList<DeployedInstanceIdsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSDGsResponse.SDGs["+ i +"].DeployedInstanceIds.Length"); j++) {
				DeployedInstanceIdsItem deployedInstanceIdsItem = new DeployedInstanceIdsItem();
				deployedInstanceIdsItem.setCreationTime(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].DeployedInstanceIds["+ j +"].CreationTime"));
				deployedInstanceIdsItem.setInstanceId(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].DeployedInstanceIds["+ j +"].InstanceId"));
				deployedInstanceIdsItem.setStatus(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].DeployedInstanceIds["+ j +"].Status"));
				deployedInstanceIdsItem.setDeploymentType(_ctx.stringValue("DescribeSDGsResponse.SDGs["+ i +"].DeployedInstanceIds["+ j +"].DeploymentType"));

				deployedInstanceIds.add(deployedInstanceIdsItem);
			}
			sDGsItem.setDeployedInstanceIds(deployedInstanceIds);

			sDGs.add(sDGsItem);
		}
		describeSDGsResponse.setSDGs(sDGs);
	 
	 	return describeSDGsResponse;
	}
}