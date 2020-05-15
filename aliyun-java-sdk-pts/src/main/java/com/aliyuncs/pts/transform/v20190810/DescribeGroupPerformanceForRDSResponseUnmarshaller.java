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

import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForRDSResponse;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForRDSResponse.EcsPerformanceView;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForRDSResponse.GroupInfo;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForRDSResponse.GroupInfo.InstanceAndPort;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForRDSResponse.RdsPerformanceView;
import com.aliyuncs.pts.model.v20190810.DescribeGroupPerformanceForRDSResponse.SlbPerformanceView;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupPerformanceForRDSResponseUnmarshaller {

	public static DescribeGroupPerformanceForRDSResponse unmarshall(DescribeGroupPerformanceForRDSResponse describeGroupPerformanceForRDSResponse, UnmarshallerContext _ctx) {
		
		describeGroupPerformanceForRDSResponse.setRequestId(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.RequestId"));
		describeGroupPerformanceForRDSResponse.setCode(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.Code"));
		describeGroupPerformanceForRDSResponse.setMessage(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.Message"));
		describeGroupPerformanceForRDSResponse.setHttpStatusCode(_ctx.integerValue("DescribeGroupPerformanceForRDSResponse.HttpStatusCode"));
		describeGroupPerformanceForRDSResponse.setSuccess(_ctx.booleanValue("DescribeGroupPerformanceForRDSResponse.Success"));
		describeGroupPerformanceForRDSResponse.setGroupPerformanceList(_ctx.mapValue("DescribeGroupPerformanceForRDSResponse.GroupPerformanceList"));

		List<SlbPerformanceView> slbPerformanceViewList = new ArrayList<SlbPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceForRDSResponse.SlbPerformanceViewList.Length"); i++) {
			SlbPerformanceView slbPerformanceView = new SlbPerformanceView();
			slbPerformanceView.setAddress(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.SlbPerformanceViewList["+ i +"].Address"));
			slbPerformanceView.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.SlbPerformanceViewList["+ i +"].InstanceId"));
			slbPerformanceView.setListenPort(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.SlbPerformanceViewList["+ i +"].ListenPort"));
			slbPerformanceView.setMetricMap(_ctx.mapValue("DescribeGroupPerformanceForRDSResponse.SlbPerformanceViewList["+ i +"].MetricMap"));

			slbPerformanceViewList.add(slbPerformanceView);
		}
		describeGroupPerformanceForRDSResponse.setSlbPerformanceViewList(slbPerformanceViewList);

		List<RdsPerformanceView> rdsPerformanceViewList = new ArrayList<RdsPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList.Length"); i++) {
			RdsPerformanceView rdsPerformanceView = new RdsPerformanceView();
			rdsPerformanceView.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList["+ i +"].InstanceId"));
			rdsPerformanceView.setInstanceName(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList["+ i +"].InstanceName"));
			rdsPerformanceView.setConnection(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList["+ i +"].Connection"));
			rdsPerformanceView.setIopsValue(_ctx.integerValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList["+ i +"].IopsValue"));
			rdsPerformanceView.setCpu(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList["+ i +"].Cpu"));
			rdsPerformanceView.setDiskValue(_ctx.integerValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList["+ i +"].DiskValue"));
			rdsPerformanceView.setIops(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList["+ i +"].Iops"));
			rdsPerformanceView.setMemoryValue(_ctx.integerValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList["+ i +"].MemoryValue"));
			rdsPerformanceView.setCpuValue(_ctx.integerValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList["+ i +"].CpuValue"));
			rdsPerformanceView.setRt(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList["+ i +"].Rt"));
			rdsPerformanceView.setDisk(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList["+ i +"].Disk"));
			rdsPerformanceView.setRtValue(_ctx.integerValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList["+ i +"].RtValue"));
			rdsPerformanceView.setMemory(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList["+ i +"].Memory"));
			rdsPerformanceView.setConnectionValue(_ctx.integerValue("DescribeGroupPerformanceForRDSResponse.RdsPerformanceViewList["+ i +"].ConnectionValue"));

			rdsPerformanceViewList.add(rdsPerformanceView);
		}
		describeGroupPerformanceForRDSResponse.setRdsPerformanceViewList(rdsPerformanceViewList);

		List<EcsPerformanceView> ecsPerformanceViewList = new ArrayList<EcsPerformanceView>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceForRDSResponse.EcsPerformanceViewList.Length"); i++) {
			EcsPerformanceView ecsPerformanceView = new EcsPerformanceView();
			ecsPerformanceView.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.EcsPerformanceViewList["+ i +"].InstanceId"));
			ecsPerformanceView.setInstanceName(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.EcsPerformanceViewList["+ i +"].InstanceName"));
			ecsPerformanceView.setCpu(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.EcsPerformanceViewList["+ i +"].Cpu"));
			ecsPerformanceView.setLoad(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.EcsPerformanceViewList["+ i +"].Load"));
			ecsPerformanceView.setMemoryValue(_ctx.integerValue("DescribeGroupPerformanceForRDSResponse.EcsPerformanceViewList["+ i +"].MemoryValue"));
			ecsPerformanceView.setCpuValue(_ctx.integerValue("DescribeGroupPerformanceForRDSResponse.EcsPerformanceViewList["+ i +"].CpuValue"));
			ecsPerformanceView.setLoadValue(_ctx.integerValue("DescribeGroupPerformanceForRDSResponse.EcsPerformanceViewList["+ i +"].LoadValue"));
			ecsPerformanceView.setCpuCore(_ctx.integerValue("DescribeGroupPerformanceForRDSResponse.EcsPerformanceViewList["+ i +"].CpuCore"));
			ecsPerformanceView.setMemory(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.EcsPerformanceViewList["+ i +"].Memory"));

			ecsPerformanceViewList.add(ecsPerformanceView);
		}
		describeGroupPerformanceForRDSResponse.setEcsPerformanceViewList(ecsPerformanceViewList);

		List<GroupInfo> groupInfoList = new ArrayList<GroupInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupPerformanceForRDSResponse.GroupInfoList.Length"); i++) {
			GroupInfo groupInfo = new GroupInfo();
			groupInfo.setType(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.GroupInfoList["+ i +"].Type"));
			groupInfo.setGroupId(_ctx.integerValue("DescribeGroupPerformanceForRDSResponse.GroupInfoList["+ i +"].GroupId"));
			groupInfo.setGroupName(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.GroupInfoList["+ i +"].GroupName"));

			List<InstanceAndPort> instanceAndPortList = new ArrayList<InstanceAndPort>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGroupPerformanceForRDSResponse.GroupInfoList["+ i +"].InstanceAndPortList.Length"); j++) {
				InstanceAndPort instanceAndPort = new InstanceAndPort();
				instanceAndPort.setAddress(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].Address"));
				instanceAndPort.setInstanceId(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].InstanceId"));
				instanceAndPort.setAddressPort(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].AddressPort"));
				instanceAndPort.setInstanceName(_ctx.stringValue("DescribeGroupPerformanceForRDSResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].InstanceName"));

				instanceAndPortList.add(instanceAndPort);
			}
			groupInfo.setInstanceAndPortList(instanceAndPortList);

			groupInfoList.add(groupInfo);
		}
		describeGroupPerformanceForRDSResponse.setGroupInfoList(groupInfoList);
	 
	 	return describeGroupPerformanceForRDSResponse;
	}
}