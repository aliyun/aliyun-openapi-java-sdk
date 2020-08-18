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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneClusterResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneClusterResponse.MultiZoneInstanceModel;
import com.aliyuncs.hbase.model.v20190101.DescribeMultiZoneClusterResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMultiZoneClusterResponseUnmarshaller {

	public static DescribeMultiZoneClusterResponse unmarshall(DescribeMultiZoneClusterResponse describeMultiZoneClusterResponse, UnmarshallerContext _ctx) {
		
		describeMultiZoneClusterResponse.setRequestId(_ctx.stringValue("DescribeMultiZoneClusterResponse.RequestId"));
		describeMultiZoneClusterResponse.setAutoRenewal(_ctx.booleanValue("DescribeMultiZoneClusterResponse.AutoRenewal"));
		describeMultiZoneClusterResponse.setClusterId(_ctx.stringValue("DescribeMultiZoneClusterResponse.ClusterId"));
		describeMultiZoneClusterResponse.setClusterName(_ctx.stringValue("DescribeMultiZoneClusterResponse.ClusterName"));
		describeMultiZoneClusterResponse.setCreatedTime(_ctx.stringValue("DescribeMultiZoneClusterResponse.CreatedTime"));
		describeMultiZoneClusterResponse.setCreatedTimeUTC(_ctx.stringValue("DescribeMultiZoneClusterResponse.CreatedTimeUTC"));
		describeMultiZoneClusterResponse.setDuration(_ctx.integerValue("DescribeMultiZoneClusterResponse.Duration"));
		describeMultiZoneClusterResponse.setEngine(_ctx.stringValue("DescribeMultiZoneClusterResponse.Engine"));
		describeMultiZoneClusterResponse.setExpireTime(_ctx.stringValue("DescribeMultiZoneClusterResponse.ExpireTime"));
		describeMultiZoneClusterResponse.setExpireTimeUTC(_ctx.stringValue("DescribeMultiZoneClusterResponse.ExpireTimeUTC"));
		describeMultiZoneClusterResponse.setInstanceId(_ctx.stringValue("DescribeMultiZoneClusterResponse.InstanceId"));
		describeMultiZoneClusterResponse.setInstanceName(_ctx.stringValue("DescribeMultiZoneClusterResponse.InstanceName"));
		describeMultiZoneClusterResponse.setIsDeletionProtection(_ctx.booleanValue("DescribeMultiZoneClusterResponse.IsDeletionProtection"));
		describeMultiZoneClusterResponse.setMaintainEndTime(_ctx.stringValue("DescribeMultiZoneClusterResponse.MaintainEndTime"));
		describeMultiZoneClusterResponse.setMaintainStartTime(_ctx.stringValue("DescribeMultiZoneClusterResponse.MaintainStartTime"));
		describeMultiZoneClusterResponse.setMajorVersion(_ctx.stringValue("DescribeMultiZoneClusterResponse.MajorVersion"));
		describeMultiZoneClusterResponse.setMasterDiskSize(_ctx.integerValue("DescribeMultiZoneClusterResponse.MasterDiskSize"));
		describeMultiZoneClusterResponse.setMasterDiskType(_ctx.stringValue("DescribeMultiZoneClusterResponse.MasterDiskType"));
		describeMultiZoneClusterResponse.setMasterInstanceType(_ctx.stringValue("DescribeMultiZoneClusterResponse.MasterInstanceType"));
		describeMultiZoneClusterResponse.setMasterNodeCount(_ctx.integerValue("DescribeMultiZoneClusterResponse.MasterNodeCount"));
		describeMultiZoneClusterResponse.setCoreDiskCount(_ctx.stringValue("DescribeMultiZoneClusterResponse.CoreDiskCount"));
		describeMultiZoneClusterResponse.setCoreDiskSize(_ctx.integerValue("DescribeMultiZoneClusterResponse.CoreDiskSize"));
		describeMultiZoneClusterResponse.setCoreDiskType(_ctx.stringValue("DescribeMultiZoneClusterResponse.CoreDiskType"));
		describeMultiZoneClusterResponse.setCoreInstanceType(_ctx.stringValue("DescribeMultiZoneClusterResponse.CoreInstanceType"));
		describeMultiZoneClusterResponse.setCoreNodeCount(_ctx.integerValue("DescribeMultiZoneClusterResponse.CoreNodeCount"));
		describeMultiZoneClusterResponse.setLogDiskCount(_ctx.stringValue("DescribeMultiZoneClusterResponse.LogDiskCount"));
		describeMultiZoneClusterResponse.setLogDiskSize(_ctx.integerValue("DescribeMultiZoneClusterResponse.LogDiskSize"));
		describeMultiZoneClusterResponse.setLogDiskType(_ctx.stringValue("DescribeMultiZoneClusterResponse.LogDiskType"));
		describeMultiZoneClusterResponse.setLogInstanceType(_ctx.stringValue("DescribeMultiZoneClusterResponse.LogInstanceType"));
		describeMultiZoneClusterResponse.setLogNodeCount(_ctx.integerValue("DescribeMultiZoneClusterResponse.LogNodeCount"));
		describeMultiZoneClusterResponse.setModuleId(_ctx.integerValue("DescribeMultiZoneClusterResponse.ModuleId"));
		describeMultiZoneClusterResponse.setModuleStackVersion(_ctx.stringValue("DescribeMultiZoneClusterResponse.ModuleStackVersion"));
		describeMultiZoneClusterResponse.setNetworkType(_ctx.stringValue("DescribeMultiZoneClusterResponse.NetworkType"));
		describeMultiZoneClusterResponse.setParentId(_ctx.stringValue("DescribeMultiZoneClusterResponse.ParentId"));
		describeMultiZoneClusterResponse.setPayType(_ctx.stringValue("DescribeMultiZoneClusterResponse.PayType"));
		describeMultiZoneClusterResponse.setRegionId(_ctx.stringValue("DescribeMultiZoneClusterResponse.RegionId"));
		describeMultiZoneClusterResponse.setStatus(_ctx.stringValue("DescribeMultiZoneClusterResponse.Status"));
		describeMultiZoneClusterResponse.setMultiZoneCombination(_ctx.stringValue("DescribeMultiZoneClusterResponse.MultiZoneCombination"));
		describeMultiZoneClusterResponse.setPrimaryZoneId(_ctx.stringValue("DescribeMultiZoneClusterResponse.PrimaryZoneId"));
		describeMultiZoneClusterResponse.setPrimaryVSwitchIds(_ctx.stringValue("DescribeMultiZoneClusterResponse.PrimaryVSwitchIds"));
		describeMultiZoneClusterResponse.setStandbyZoneId(_ctx.stringValue("DescribeMultiZoneClusterResponse.StandbyZoneId"));
		describeMultiZoneClusterResponse.setStandbyVSwitchIds(_ctx.stringValue("DescribeMultiZoneClusterResponse.StandbyVSwitchIds"));
		describeMultiZoneClusterResponse.setArbiterZoneId(_ctx.stringValue("DescribeMultiZoneClusterResponse.ArbiterZoneId"));
		describeMultiZoneClusterResponse.setArbiterVSwitchIds(_ctx.stringValue("DescribeMultiZoneClusterResponse.ArbiterVSwitchIds"));
		describeMultiZoneClusterResponse.setVpcId(_ctx.stringValue("DescribeMultiZoneClusterResponse.VpcId"));

		List<MultiZoneInstanceModel> multiZoneInstanceModels = new ArrayList<MultiZoneInstanceModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMultiZoneClusterResponse.MultiZoneInstanceModels.Length"); i++) {
			MultiZoneInstanceModel multiZoneInstanceModel = new MultiZoneInstanceModel();
			multiZoneInstanceModel.setInsName(_ctx.stringValue("DescribeMultiZoneClusterResponse.MultiZoneInstanceModels["+ i +"].InsName"));
			multiZoneInstanceModel.setIsLatestVersion(_ctx.booleanValue("DescribeMultiZoneClusterResponse.MultiZoneInstanceModels["+ i +"].IsLatestVersion"));
			multiZoneInstanceModel.setMinorVersion(_ctx.stringValue("DescribeMultiZoneClusterResponse.MultiZoneInstanceModels["+ i +"].MinorVersion"));
			multiZoneInstanceModel.setStatus(_ctx.stringValue("DescribeMultiZoneClusterResponse.MultiZoneInstanceModels["+ i +"].Status"));
			multiZoneInstanceModel.setRole(_ctx.stringValue("DescribeMultiZoneClusterResponse.MultiZoneInstanceModels["+ i +"].Role"));

			multiZoneInstanceModels.add(multiZoneInstanceModel);
		}
		describeMultiZoneClusterResponse.setMultiZoneInstanceModels(multiZoneInstanceModels);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMultiZoneClusterResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeMultiZoneClusterResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeMultiZoneClusterResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		describeMultiZoneClusterResponse.setTags(tags);
	 
	 	return describeMultiZoneClusterResponse;
	}
}