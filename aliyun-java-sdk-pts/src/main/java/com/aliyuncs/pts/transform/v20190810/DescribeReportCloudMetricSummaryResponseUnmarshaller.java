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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.DescribeReportCloudMetricSummaryResponse;
import com.aliyuncs.pts.model.v20190810.DescribeReportCloudMetricSummaryResponse.EcsPerformanceView;
import com.aliyuncs.pts.model.v20190810.DescribeReportCloudMetricSummaryResponse.GroupInfo;
import com.aliyuncs.pts.model.v20190810.DescribeReportCloudMetricSummaryResponse.GroupInfo.InstanceAndPort;
import com.aliyuncs.pts.model.v20190810.DescribeReportCloudMetricSummaryResponse.RdsPerformanceView;
import com.aliyuncs.pts.model.v20190810.DescribeReportCloudMetricSummaryResponse.SlbPerformanceView;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReportCloudMetricSummaryResponseUnmarshaller {

	public static DescribeReportCloudMetricSummaryResponse unmarshall(DescribeReportCloudMetricSummaryResponse describeReportCloudMetricSummaryResponse, UnmarshallerContext _ctx) {
		
		describeReportCloudMetricSummaryResponse.setRequestId(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.RequestId"));
		describeReportCloudMetricSummaryResponse.setCode(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.Code"));
		describeReportCloudMetricSummaryResponse.setMessage(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.Message"));
		describeReportCloudMetricSummaryResponse.setHttpStatusCode(_ctx.integerValue("DescribeReportCloudMetricSummaryResponse.HttpStatusCode"));
		describeReportCloudMetricSummaryResponse.setSuccess(_ctx.booleanValue("DescribeReportCloudMetricSummaryResponse.Success"));
		describeReportCloudMetricSummaryResponse.setGroupPerformanceList(_ctx.mapValue("DescribeReportCloudMetricSummaryResponse.GroupPerformanceList"));

		List<SlbPerformanceView> slbPerformanceViewList = new ArrayList<SlbPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReportCloudMetricSummaryResponse.SlbPerformanceViewList.Length"); i++) {
			SlbPerformanceView slbPerformanceView = new SlbPerformanceView();
			slbPerformanceView.setAddress(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.SlbPerformanceViewList["+ i +"].Address"));
			slbPerformanceView.setInstanceId(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.SlbPerformanceViewList["+ i +"].InstanceId"));
			slbPerformanceView.setListenPort(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.SlbPerformanceViewList["+ i +"].ListenPort"));
			slbPerformanceView.setMetricMap(_ctx.mapValue("DescribeReportCloudMetricSummaryResponse.SlbPerformanceViewList["+ i +"].MetricMap"));

			slbPerformanceViewList.add(slbPerformanceView);
		}
		describeReportCloudMetricSummaryResponse.setSlbPerformanceViewList(slbPerformanceViewList);

		List<RdsPerformanceView> rdsPerformanceViewList = new ArrayList<RdsPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList.Length"); i++) {
			RdsPerformanceView rdsPerformanceView = new RdsPerformanceView();
			rdsPerformanceView.setInstanceId(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList["+ i +"].InstanceId"));
			rdsPerformanceView.setInstanceName(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList["+ i +"].InstanceName"));
			rdsPerformanceView.setConnection(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList["+ i +"].Connection"));
			rdsPerformanceView.setIopsValue(_ctx.integerValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList["+ i +"].IopsValue"));
			rdsPerformanceView.setCpu(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList["+ i +"].Cpu"));
			rdsPerformanceView.setDiskValue(_ctx.integerValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList["+ i +"].DiskValue"));
			rdsPerformanceView.setIops(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList["+ i +"].Iops"));
			rdsPerformanceView.setMemoryValue(_ctx.integerValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList["+ i +"].MemoryValue"));
			rdsPerformanceView.setCpuValue(_ctx.integerValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList["+ i +"].CpuValue"));
			rdsPerformanceView.setRt(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList["+ i +"].Rt"));
			rdsPerformanceView.setDisk(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList["+ i +"].Disk"));
			rdsPerformanceView.setRtValue(_ctx.integerValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList["+ i +"].RtValue"));
			rdsPerformanceView.setMemory(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList["+ i +"].Memory"));
			rdsPerformanceView.setConnectionValue(_ctx.integerValue("DescribeReportCloudMetricSummaryResponse.RdsPerformanceViewList["+ i +"].ConnectionValue"));

			rdsPerformanceViewList.add(rdsPerformanceView);
		}
		describeReportCloudMetricSummaryResponse.setRdsPerformanceViewList(rdsPerformanceViewList);

		List<EcsPerformanceView> ecsPerformanceViewList = new ArrayList<EcsPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReportCloudMetricSummaryResponse.EcsPerformanceViewList.Length"); i++) {
			EcsPerformanceView ecsPerformanceView = new EcsPerformanceView();
			ecsPerformanceView.setInstanceId(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.EcsPerformanceViewList["+ i +"].InstanceId"));
			ecsPerformanceView.setInstanceName(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.EcsPerformanceViewList["+ i +"].InstanceName"));
			ecsPerformanceView.setCpu(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.EcsPerformanceViewList["+ i +"].Cpu"));
			ecsPerformanceView.setLoad(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.EcsPerformanceViewList["+ i +"].Load"));
			ecsPerformanceView.setMemoryValue(_ctx.integerValue("DescribeReportCloudMetricSummaryResponse.EcsPerformanceViewList["+ i +"].MemoryValue"));
			ecsPerformanceView.setCpuValue(_ctx.integerValue("DescribeReportCloudMetricSummaryResponse.EcsPerformanceViewList["+ i +"].CpuValue"));
			ecsPerformanceView.setLoadValue(_ctx.integerValue("DescribeReportCloudMetricSummaryResponse.EcsPerformanceViewList["+ i +"].LoadValue"));
			ecsPerformanceView.setCpuCore(_ctx.integerValue("DescribeReportCloudMetricSummaryResponse.EcsPerformanceViewList["+ i +"].CpuCore"));
			ecsPerformanceView.setMemory(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.EcsPerformanceViewList["+ i +"].Memory"));

			ecsPerformanceViewList.add(ecsPerformanceView);
		}
		describeReportCloudMetricSummaryResponse.setEcsPerformanceViewList(ecsPerformanceViewList);

		List<GroupInfo> groupInfoList = new ArrayList<GroupInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReportCloudMetricSummaryResponse.GroupInfoList.Length"); i++) {
			GroupInfo groupInfo = new GroupInfo();
			groupInfo.setType(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.GroupInfoList["+ i +"].Type"));
			groupInfo.setGroupId(_ctx.integerValue("DescribeReportCloudMetricSummaryResponse.GroupInfoList["+ i +"].GroupId"));
			groupInfo.setGroupName(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.GroupInfoList["+ i +"].GroupName"));

			List<InstanceAndPort> instanceAndPortList = new ArrayList<InstanceAndPort>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReportCloudMetricSummaryResponse.GroupInfoList["+ i +"].InstanceAndPortList.Length"); j++) {
				InstanceAndPort instanceAndPort = new InstanceAndPort();
				instanceAndPort.setAddress(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].Address"));
				instanceAndPort.setInstanceId(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].InstanceId"));
				instanceAndPort.setAddressPort(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].AddressPort"));
				instanceAndPort.setInstanceName(_ctx.stringValue("DescribeReportCloudMetricSummaryResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].InstanceName"));

				instanceAndPortList.add(instanceAndPort);
			}
			groupInfo.setInstanceAndPortList(instanceAndPortList);

			groupInfoList.add(groupInfo);
		}
		describeReportCloudMetricSummaryResponse.setGroupInfoList(groupInfoList);
	 
	 	return describeReportCloudMetricSummaryResponse;
	}
}