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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeDBClusterAttributeResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterAttributeResponse.DBCluster;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterAttributeResponse.DBCluster.Tag;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterAttributeResponse.DBCluster.TaskInfo;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterAttributeResponse.DBCluster.TaskInfo.StepListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterAttributeResponseUnmarshaller {

	public static DescribeDBClusterAttributeResponse unmarshall(DescribeDBClusterAttributeResponse describeDBClusterAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBClusterAttributeResponse.RequestId"));

		List<DBCluster> items = new ArrayList<DBCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterAttributeResponse.Items.Length"); i++) {
			DBCluster dBCluster = new DBCluster();
			dBCluster.setCreationTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].CreationTime"));
			dBCluster.setEnableSpark(_ctx.booleanValue("DescribeDBClusterAttributeResponse.Items["+ i +"].EnableSpark"));
			dBCluster.setDtsJobId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DtsJobId"));
			dBCluster.setDBNodeCount(_ctx.longValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBNodeCount"));
			dBCluster.setExpired(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Expired"));
			dBCluster.setMaintainTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].MaintainTime"));
			dBCluster.setPayType(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].PayType"));
			dBCluster.setDiskType(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DiskType"));
			dBCluster.setMode(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Mode"));
			dBCluster.setPort(_ctx.integerValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Port"));
			dBCluster.setLockMode(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].LockMode"));
			dBCluster.setEngineVersion(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].EngineVersion"));
			dBCluster.setEnableAirflow(_ctx.booleanValue("DescribeDBClusterAttributeResponse.Items["+ i +"].EnableAirflow"));
			dBCluster.setExecutorCount(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ExecutorCount"));
			dBCluster.setStorageResource(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].StorageResource"));
			dBCluster.setDBClusterId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterId"));
			dBCluster.setConnectionString(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ConnectionString"));
			dBCluster.setRdsInstanceId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].RdsInstanceId"));
			dBCluster.setDBClusterType(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterType"));
			dBCluster.setCommodityCode(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].CommodityCode"));
			dBCluster.setExpireTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ExpireTime"));
			dBCluster.setDBNodeStorage(_ctx.longValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBNodeStorage"));
			dBCluster.setDBNodeClass(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBNodeClass"));
			dBCluster.setLockReason(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].LockReason"));
			dBCluster.setVPCId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].VPCId"));
			dBCluster.setComputeResource(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ComputeResource"));
			dBCluster.setRegionId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].RegionId"));
			dBCluster.setElasticIOResource(_ctx.integerValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ElasticIOResource"));
			dBCluster.setVSwitchId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].VSwitchId"));
			dBCluster.setDBVersion(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBVersion"));
			dBCluster.setVPCCloudInstanceId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].VPCCloudInstanceId"));
			dBCluster.setDBClusterStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterStatus"));
			dBCluster.setResourceGroupId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ResourceGroupId"));
			dBCluster.setDBClusterNetworkType(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterNetworkType"));
			dBCluster.setDBClusterDescription(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DBClusterDescription"));
			dBCluster.setUserENIStatus(_ctx.booleanValue("DescribeDBClusterAttributeResponse.Items["+ i +"].UserENIStatus"));
			dBCluster.setZoneId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ZoneId"));
			dBCluster.setCategory(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Category"));
			dBCluster.setEngine(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Engine"));
			dBCluster.setKmsId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].KmsId"));
			dBCluster.setInnerIp(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].InnerIp"));
			dBCluster.setInnerPort(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].InnerPort"));
			dBCluster.setDiskPerformanceLevel(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DiskPerformanceLevel"));
			dBCluster.setElasticIOResourceSize(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ElasticIOResourceSize"));
			dBCluster.setDiskEncryption(_ctx.booleanValue("DescribeDBClusterAttributeResponse.Items["+ i +"].DiskEncryption"));
			dBCluster.setProductVersion(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ProductVersion"));
			dBCluster.setSecondaryZoneId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].SecondaryZoneId"));
			dBCluster.setSecondaryVSwitchId(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].SecondaryVSwitchId"));
			dBCluster.setReservedNodeSize(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ReservedNodeSize"));
			dBCluster.setReservedNodeCount(_ctx.integerValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ReservedNodeCount"));
			dBCluster.setProductForm(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].ProductForm"));

			TaskInfo taskInfo = new TaskInfo();
			taskInfo.setName(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].TaskInfo.Name"));
			taskInfo.setStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].TaskInfo.Status"));
			taskInfo.setProgress(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].TaskInfo.Progress"));

			List<StepListItem> stepList = new ArrayList<StepListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterAttributeResponse.Items["+ i +"].TaskInfo.StepList.Length"); j++) {
				StepListItem stepListItem = new StepListItem();
				stepListItem.setStepName(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].TaskInfo.StepList["+ j +"].StepName"));
				stepListItem.setStepDesc(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].TaskInfo.StepList["+ j +"].StepDesc"));
				stepListItem.setStepStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].TaskInfo.StepList["+ j +"].StepStatus"));
				stepListItem.setStepProgress(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].TaskInfo.StepList["+ j +"].StepProgress"));
				stepListItem.setStartTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].TaskInfo.StepList["+ j +"].StartTime"));
				stepListItem.setEndTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].TaskInfo.StepList["+ j +"].EndTime"));

				stepList.add(stepListItem);
			}
			taskInfo.setStepList(stepList);
			dBCluster.setTaskInfo(taskInfo);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBClusterAttributeResponse.Items["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBCluster.setTags(tags);

			items.add(dBCluster);
		}
		describeDBClusterAttributeResponse.setItems(items);
	 
	 	return describeDBClusterAttributeResponse;
	}
}