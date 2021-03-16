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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsListHbmInstancesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListHbmInstancesResponse.HbmInstance;
import com.aliyuncs.ecsops.model.v20160401.OpsListHbmInstancesResponse.HbmInstance.NetworkAttribute;
import com.aliyuncs.ecsops.model.v20160401.OpsListHbmInstancesResponse.HbmInstance.NetworkAttribute.EipAttribute;
import com.aliyuncs.ecsops.model.v20160401.OpsListHbmInstancesResponse.HbmInstance.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListHbmInstancesResponseUnmarshaller {

	public static OpsListHbmInstancesResponse unmarshall(OpsListHbmInstancesResponse opsListHbmInstancesResponse, UnmarshallerContext _ctx) {
		
		opsListHbmInstancesResponse.setRequestId(_ctx.stringValue("OpsListHbmInstancesResponse.RequestId"));
		opsListHbmInstancesResponse.setTotalCount(_ctx.integerValue("OpsListHbmInstancesResponse.TotalCount"));
		opsListHbmInstancesResponse.setPageSize(_ctx.integerValue("OpsListHbmInstancesResponse.PageSize"));
		opsListHbmInstancesResponse.setPageNumber(_ctx.integerValue("OpsListHbmInstancesResponse.PageNumber"));

		List<HbmInstance> hbmInstances = new ArrayList<HbmInstance>();
		for (int i = 0; i < _ctx.lengthValue("OpsListHbmInstancesResponse.HbmInstances.Length"); i++) {
			HbmInstance hbmInstance = new HbmInstance();
			hbmInstance.setRegionId(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].RegionId"));
			hbmInstance.setZoneId(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].ZoneId"));
			hbmInstance.setHbmInstanceId(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].HbmInstanceId"));
			hbmInstance.setHbmInstanceName(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].HbmInstanceName"));
			hbmInstance.setStatus(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].Status"));
			hbmInstance.setBootMode(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].BootMode"));
			hbmInstance.setCreationTime(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].CreationTime"));
			hbmInstance.setCpu(_ctx.integerValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].Cpu"));
			hbmInstance.setMemory(_ctx.integerValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].Memory"));
			hbmInstance.setHostName(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].HostName"));
			hbmInstance.setResourceGroupId(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].ResourceGroupId"));

			NetworkAttribute networkAttribute = new NetworkAttribute();
			networkAttribute.setVpcId(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].NetworkAttribute.VpcId"));
			networkAttribute.setVSwitchId(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].NetworkAttribute.VSwitchId"));

			List<String> securityGroupIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].NetworkAttribute.SecurityGroupIds.Length"); j++) {
				securityGroupIds.add(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].NetworkAttribute.SecurityGroupIds["+ j +"]"));
			}
			networkAttribute.setSecurityGroupIds(securityGroupIds);

			List<String> privateIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].NetworkAttribute.PrivateIpAddress.Length"); j++) {
				privateIpAddress.add(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].NetworkAttribute.PrivateIpAddress["+ j +"]"));
			}
			networkAttribute.setPrivateIpAddress(privateIpAddress);

			List<String> privateIpv6Address = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].NetworkAttribute.PrivateIpv6Address.Length"); j++) {
				privateIpv6Address.add(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].NetworkAttribute.PrivateIpv6Address["+ j +"]"));
			}
			networkAttribute.setPrivateIpv6Address(privateIpv6Address);

			EipAttribute eipAttribute = new EipAttribute();
			eipAttribute.setAllocationId(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].NetworkAttribute.EipAttribute.AllocationId"));
			networkAttribute.setEipAttribute(eipAttribute);
			hbmInstance.setNetworkAttribute(networkAttribute);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("OpsListHbmInstancesResponse.HbmInstances["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			hbmInstance.setTags(tags);

			hbmInstances.add(hbmInstance);
		}
		opsListHbmInstancesResponse.setHbmInstances(hbmInstances);
	 
	 	return opsListHbmInstancesResponse;
	}
}