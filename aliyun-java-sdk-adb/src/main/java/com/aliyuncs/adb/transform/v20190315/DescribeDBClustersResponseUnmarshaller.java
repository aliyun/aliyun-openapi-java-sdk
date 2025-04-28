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

import com.aliyuncs.adb.model.v20190315.DescribeDBClustersResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBClustersResponse.DBCluster;
import com.aliyuncs.adb.model.v20190315.DescribeDBClustersResponse.DBCluster.Tag;
import com.aliyuncs.adb.model.v20190315.DescribeDBClustersResponse.DBCluster.TaskInfo;
import com.aliyuncs.adb.model.v20190315.DescribeDBClustersResponse.DBCluster.TaskInfo.StepListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClustersResponseUnmarshaller {

	public static DescribeDBClustersResponse unmarshall(DescribeDBClustersResponse describeDBClustersResponse, UnmarshallerContext _ctx) {
		
		describeDBClustersResponse.setRequestId(_ctx.stringValue("DescribeDBClustersResponse.RequestId"));
		describeDBClustersResponse.setTotalCount(_ctx.integerValue("DescribeDBClustersResponse.TotalCount"));
		describeDBClustersResponse.setPageSize(_ctx.integerValue("DescribeDBClustersResponse.PageSize"));
		describeDBClustersResponse.setPageNumber(_ctx.integerValue("DescribeDBClustersResponse.PageNumber"));

		List<DBCluster> items = new ArrayList<DBCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClustersResponse.Items.Length"); i++) {
			DBCluster dBCluster = new DBCluster();
			dBCluster.setDtsJobId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DtsJobId"));
			dBCluster.setDBNodeCount(_ctx.longValue("DescribeDBClustersResponse.Items["+ i +"].DBNodeCount"));
			dBCluster.setExpired(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Expired"));
			dBCluster.setCreateTime(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].CreateTime"));
			dBCluster.setPayType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].PayType"));
			dBCluster.setDiskType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DiskType"));
			dBCluster.setMode(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Mode"));
			dBCluster.setPort(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Port"));
			dBCluster.setLockMode(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].LockMode"));
			dBCluster.setStorageResource(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].StorageResource"));
			dBCluster.setExecutorCount(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].ExecutorCount"));
			dBCluster.setDBClusterId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterId"));
			dBCluster.setConnectionString(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].ConnectionString"));
			dBCluster.setRdsInstanceId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].RdsInstanceId"));
			dBCluster.setDBClusterType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterType"));
			dBCluster.setCommodityCode(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].CommodityCode"));
			dBCluster.setExpireTime(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].ExpireTime"));
			dBCluster.setDBNodeStorage(_ctx.longValue("DescribeDBClustersResponse.Items["+ i +"].DBNodeStorage"));
			dBCluster.setDBNodeClass(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodeClass"));
			dBCluster.setLockReason(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].LockReason"));
			dBCluster.setVPCId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].VPCId"));
			dBCluster.setRegionId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].RegionId"));
			dBCluster.setComputeResource(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].ComputeResource"));
			dBCluster.setElasticIOResource(_ctx.integerValue("DescribeDBClustersResponse.Items["+ i +"].ElasticIOResource"));
			dBCluster.setVSwitchId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].VSwitchId"));
			dBCluster.setDBVersion(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBVersion"));
			dBCluster.setVPCCloudInstanceId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].VPCCloudInstanceId"));
			dBCluster.setDBClusterStatus(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterStatus"));
			dBCluster.setResourceGroupId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].ResourceGroupId"));
			dBCluster.setDBClusterNetworkType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterNetworkType"));
			dBCluster.setDBClusterDescription(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterDescription"));
			dBCluster.setZoneId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].ZoneId"));
			dBCluster.setCategory(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Category"));
			dBCluster.setEngine(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Engine"));
			dBCluster.setInnerIp(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].InnerIp"));
			dBCluster.setInnerPort(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].InnerPort"));
			dBCluster.setProductVersion(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].ProductVersion"));

			TaskInfo taskInfo = new TaskInfo();
			taskInfo.setName(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].TaskInfo.Name"));
			taskInfo.setStatus(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].TaskInfo.Status"));
			taskInfo.setProgress(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].TaskInfo.Progress"));

			List<StepListItem> stepList = new ArrayList<StepListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClustersResponse.Items["+ i +"].TaskInfo.StepList.Length"); j++) {
				StepListItem stepListItem = new StepListItem();
				stepListItem.setStepName(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].TaskInfo.StepList["+ j +"].StepName"));
				stepListItem.setStepDesc(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].TaskInfo.StepList["+ j +"].StepDesc"));
				stepListItem.setStepStatus(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].TaskInfo.StepList["+ j +"].StepStatus"));
				stepListItem.setStepProgress(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].TaskInfo.StepList["+ j +"].StepProgress"));
				stepListItem.setStartTime(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].TaskInfo.StepList["+ j +"].StartTime"));
				stepListItem.setEndTime(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].TaskInfo.StepList["+ j +"].EndTime"));

				stepList.add(stepListItem);
			}
			taskInfo.setStepList(stepList);
			dBCluster.setTaskInfo(taskInfo);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClustersResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBCluster.setTags(tags);

			items.add(dBCluster);
		}
		describeDBClustersResponse.setItems(items);
	 
	 	return describeDBClustersResponse;
	}
}