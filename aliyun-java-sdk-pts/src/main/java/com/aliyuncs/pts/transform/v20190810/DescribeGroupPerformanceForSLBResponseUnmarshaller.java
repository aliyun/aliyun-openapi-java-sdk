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

import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForSLBResponse;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForSLBResponse.EcsPerformanceView;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForSLBResponse.GroupInfo;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForSLBResponse.GroupInfo.InstanceAndPort;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForSLBResponse.RdsPerformanceView;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForSLBResponse.SlbPerformanceView;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupPerformanceForSLBResponseUnmarshaller {

	public static DescribeGroupPerformanceForSLBResponse unmarshall(DescribeGroupPerformanceForSLBResponse describeGroupPerformanceForSLBResponse, UnmarshallerContext _ctx) {
		
		describeGroupPerformanceForSLBResponse.setRequestId(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.RequestId"));
		describeGroupPerformanceForSLBResponse.setCode(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.Code"));
		describeGroupPerformanceForSLBResponse.setMessage(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.Message"));
		describeGroupPerformanceForSLBResponse.setHttpStatusCode(_ctx.integerValue("DescribeGroupPerformanceForSLBResponse.HttpStatusCode"));
		describeGroupPerformanceForSLBResponse.setSuccess(_ctx.booleanValue("DescribeGroupPerformanceForSLBResponse.Success"));
		describeGroupPerformanceForSLBResponse.setGroupPerformanceList(_ctx.mapValue("DescribeGroupPerformanceForSLBResponse.GroupPerformanceList"));

		List<SlbPerformanceView> slbPerformanceViewList = new ArrayList<SlbPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceForSLBResponse.SlbPerformanceViewList.Length"); i++) {
			SlbPerformanceView slbPerformanceView = new SlbPerformanceView();
			slbPerformanceView.setAddress(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.SlbPerformanceViewList["+ i +"].Address"));
			slbPerformanceView.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.SlbPerformanceViewList["+ i +"].InstanceId"));
			slbPerformanceView.setListenPort(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.SlbPerformanceViewList["+ i +"].ListenPort"));
			slbPerformanceView.setMetricMap(_ctx.mapValue("DescribeGroupPerformanceForSLBResponse.SlbPerformanceViewList["+ i +"].MetricMap"));

			slbPerformanceViewList.add(slbPerformanceView);
		}
		describeGroupPerformanceForSLBResponse.setSlbPerformanceViewList(slbPerformanceViewList);

		List<RdsPerformanceView> rdsPerformanceViewList = new ArrayList<RdsPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList.Length"); i++) {
			RdsPerformanceView rdsPerformanceView = new RdsPerformanceView();
			rdsPerformanceView.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList["+ i +"].InstanceId"));
			rdsPerformanceView.setInstanceName(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList["+ i +"].InstanceName"));
			rdsPerformanceView.setConnection(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList["+ i +"].Connection"));
			rdsPerformanceView.setIopsValue(_ctx.integerValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList["+ i +"].IopsValue"));
			rdsPerformanceView.setCpu(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList["+ i +"].Cpu"));
			rdsPerformanceView.setDiskValue(_ctx.integerValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList["+ i +"].DiskValue"));
			rdsPerformanceView.setIops(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList["+ i +"].Iops"));
			rdsPerformanceView.setMemoryValue(_ctx.integerValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList["+ i +"].MemoryValue"));
			rdsPerformanceView.setCpuValue(_ctx.integerValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList["+ i +"].CpuValue"));
			rdsPerformanceView.setRt(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList["+ i +"].Rt"));
			rdsPerformanceView.setDisk(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList["+ i +"].Disk"));
			rdsPerformanceView.setRtValue(_ctx.integerValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList["+ i +"].RtValue"));
			rdsPerformanceView.setMemory(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList["+ i +"].Memory"));
			rdsPerformanceView.setConnectionValue(_ctx.integerValue("DescribeGroupPerformanceForSLBResponse.RdsPerformanceViewList["+ i +"].ConnectionValue"));

			rdsPerformanceViewList.add(rdsPerformanceView);
		}
		describeGroupPerformanceForSLBResponse.setRdsPerformanceViewList(rdsPerformanceViewList);

		List<EcsPerformanceView> ecsPerformanceViewList = new ArrayList<EcsPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceForSLBResponse.EcsPerformanceViewList.Length"); i++) {
			EcsPerformanceView ecsPerformanceView = new EcsPerformanceView();
			ecsPerformanceView.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.EcsPerformanceViewList["+ i +"].InstanceId"));
			ecsPerformanceView.setInstanceName(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.EcsPerformanceViewList["+ i +"].InstanceName"));
			ecsPerformanceView.setCpu(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.EcsPerformanceViewList["+ i +"].Cpu"));
			ecsPerformanceView.setLoad(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.EcsPerformanceViewList["+ i +"].Load"));
			ecsPerformanceView.setMemoryValue(_ctx.integerValue("DescribeGroupPerformanceForSLBResponse.EcsPerformanceViewList["+ i +"].MemoryValue"));
			ecsPerformanceView.setCpuValue(_ctx.integerValue("DescribeGroupPerformanceForSLBResponse.EcsPerformanceViewList["+ i +"].CpuValue"));
			ecsPerformanceView.setLoadValue(_ctx.integerValue("DescribeGroupPerformanceForSLBResponse.EcsPerformanceViewList["+ i +"].LoadValue"));
			ecsPerformanceView.setCpuCore(_ctx.integerValue("DescribeGroupPerformanceForSLBResponse.EcsPerformanceViewList["+ i +"].CpuCore"));
			ecsPerformanceView.setMemory(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.EcsPerformanceViewList["+ i +"].Memory"));

			ecsPerformanceViewList.add(ecsPerformanceView);
		}
		describeGroupPerformanceForSLBResponse.setEcsPerformanceViewList(ecsPerformanceViewList);

		List<GroupInfo> groupInfoList = new ArrayList<GroupInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceForSLBResponse.GroupInfoList.Length"); i++) {
			GroupInfo groupInfo = new GroupInfo();
			groupInfo.setType(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.GroupInfoList["+ i +"].Type"));
			groupInfo.setGroupId(_ctx.integerValue("DescribeGroupPerformanceForSLBResponse.GroupInfoList["+ i +"].GroupId"));
			groupInfo.setGroupName(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.GroupInfoList["+ i +"].GroupName"));

			List<InstanceAndPort> instanceAndPortList = new ArrayList<InstanceAndPort>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGroupPerformanceForSLBResponse.GroupInfoList["+ i +"].InstanceAndPortList.Length"); j++) {
				InstanceAndPort instanceAndPort = new InstanceAndPort();
				instanceAndPort.setAddress(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].Address"));
				instanceAndPort.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].InstanceId"));
				instanceAndPort.setAddressPort(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].AddressPort"));
				instanceAndPort.setInstanceName(_ctx.stringValue("DescribeGroupPerformanceForSLBResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].InstanceName"));

				instanceAndPortList.add(instanceAndPort);
			}
			groupInfo.setInstanceAndPortList(instanceAndPortList);

			groupInfoList.add(groupInfo);
		}
		describeGroupPerformanceForSLBResponse.setGroupInfoList(groupInfoList);
	 
	 	return describeGroupPerformanceForSLBResponse;
	}
}