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
		describeEpnInstanceAttributeResponse.setEPNInstanceId(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.EPNInstanceId"));
		describeEpnInstanceAttributeResponse.setEPNInstanceName(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.EPNInstanceName"));
		describeEpnInstanceAttributeResponse.setNetworkingModel(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.NetworkingModel"));

		List<EPNInstance> vSwitches = new ArrayList<EPNInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEpnInstanceAttributeResponse.VSwitches.Length"); i++) {
			EPNInstance ePNInstance = new EPNInstance();
			ePNInstance.setVSwitchId(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.VSwitches["+ i +"].VSwitchId"));
			ePNInstance.setEnsRegionId(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.VSwitches["+ i +"].EnsRegionId"));
			ePNInstance.setCidrBlock(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.VSwitches["+ i +"].CidrBlock"));
			ePNInstance.setVSwitchName(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.VSwitches["+ i +"].VSwitchName"));

			vSwitches.add(ePNInstance);
		}
		describeEpnInstanceAttributeResponse.setVSwitches(vSwitches);

		List<EPNInstance1> instances = new ArrayList<EPNInstance1>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEpnInstanceAttributeResponse.Instances.Length"); i++) {
			EPNInstance1 ePNInstance1 = new EPNInstance1();
			ePNInstance1.setInstanceId(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.Instances["+ i +"].InstanceId"));
			ePNInstance1.setPublicIpAddress(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.Instances["+ i +"].PublicIpAddress"));
			ePNInstance1.setEnsRegionId(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.Instances["+ i +"].EnsRegionId"));
			ePNInstance1.setIsp(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.Instances["+ i +"].Isp"));
			ePNInstance1.setInstanceName(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.Instances["+ i +"].InstanceName"));
			ePNInstance1.setPrivateIpAddress(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.Instances["+ i +"].PrivateIpAddress"));
			ePNInstance1.setStatus(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.Instances["+ i +"].Status"));

			instances.add(ePNInstance1);
		}
		describeEpnInstanceAttributeResponse.setInstances(instances);

		List<ConfVersionsItem> confVersions = new ArrayList<ConfVersionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEpnInstanceAttributeResponse.ConfVersions.Length"); i++) {
			ConfVersionsItem confVersionsItem = new ConfVersionsItem();
			confVersionsItem.setEnsRegionId(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.ConfVersions["+ i +"].EnsRegionId"));
			confVersionsItem.setConfVersion(_ctx.stringValue("DescribeEpnInstanceAttributeResponse.ConfVersions["+ i +"].ConfVersion"));

			confVersions.add(confVersionsItem);
		}
		describeEpnInstanceAttributeResponse.setConfVersions(confVersions);
	 
	 	return describeEpnInstanceAttributeResponse;
	}
}