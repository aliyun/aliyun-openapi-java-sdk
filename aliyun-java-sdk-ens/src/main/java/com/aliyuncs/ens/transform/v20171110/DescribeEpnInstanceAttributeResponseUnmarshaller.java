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

import com.aliyuncs.ens.model.v20171110.DescribeEpnInstanceAttributeResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEpnInstanceAttributeResponse.ConfVersionsItem;
import com.aliyuncs.ens.model.v20171110.DescribeEpnInstanceAttributeResponse.EPNInstance;
import com.aliyuncs.ens.model.v20171110.DescribeEpnInstanceAttributeResponse.EPNInstance1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEpnInstanceAttributeResponseUnmarshaller {

	public static DescribeEpnInstanceAttributeResponse unmarshall(DescribeEpnInstanceAttributeResponse describeEpnInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeEpnInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.RequestId"));
		describeEpnInstanceAttributeResponse.setNetworkingModel(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.NetworkingModel"));
		describeEpnInstanceAttributeResponse.setEPNInstanceId(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.EPNInstanceId"));
		describeEpnInstanceAttributeResponse.setEPNInstanceName(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.EPNInstanceName"));

		List<EPNInstance> instances = new ArrayList<EPNInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEpnInstanceAttributeResponse.Instances.Length"); i++) {
			EPNInstance ePNInstance = new EPNInstance();
			ePNInstance.setStatus(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.Instances["+ i +"].Status"));
			ePNInstance.setPublicIpAddress(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.Instances["+ i +"].PublicIpAddress"));
			ePNInstance.setInstanceName(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.Instances["+ i +"].InstanceName"));
			ePNInstance.setPrivateIpAddress(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.Instances["+ i +"].PrivateIpAddress"));
			ePNInstance.setInstanceId(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.Instances["+ i +"].InstanceId"));
			ePNInstance.setIsp(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.Instances["+ i +"].Isp"));
			ePNInstance.setEnsRegionId(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.Instances["+ i +"].EnsRegionId"));

			instances.add(ePNInstance);
		}
		describeEpnInstanceAttributeResponse.setInstances(instances);

		List<EPNInstance1> vSwitches = new ArrayList<EPNInstance1>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEpnInstanceAttributeResponse.VSwitches.Length"); i++) {
			EPNInstance1 ePNInstance1 = new EPNInstance1();
			ePNInstance1.setVSwitchId(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.VSwitches["+ i +"].VSwitchId"));
			ePNInstance1.setCidrBlock(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.VSwitches["+ i +"].CidrBlock"));
			ePNInstance1.setVSwitchName(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.VSwitches["+ i +"].VSwitchName"));
			ePNInstance1.setEnsRegionId(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.VSwitches["+ i +"].EnsRegionId"));

			vSwitches.add(ePNInstance1);
		}
		describeEpnInstanceAttributeResponse.setVSwitches(vSwitches);

		List<ConfVersionsItem> confVersions = new ArrayList<ConfVersionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEpnInstanceAttributeResponse.ConfVersions.Length"); i++) {
			ConfVersionsItem confVersionsItem = new ConfVersionsItem();
			confVersionsItem.setConfVersion(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.ConfVersions["+ i +"].ConfVersion"));
			confVersionsItem.setEnsRegionId(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.ConfVersions["+ i +"].EnsRegionId"));

			confVersions.add(confVersionsItem);
		}
		describeEpnInstanceAttributeResponse.setConfVersions(confVersions);
	 
	 	return describeEpnInstanceAttributeResponse;
	}
}