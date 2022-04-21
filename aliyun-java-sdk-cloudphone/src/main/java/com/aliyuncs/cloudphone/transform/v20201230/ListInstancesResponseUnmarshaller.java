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

package com.aliyuncs.cloudphone.transform.v20201230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphone.model.v20201230.ListInstancesResponse;
import com.aliyuncs.cloudphone.model.v20201230.ListInstancesResponse.Instance;
import com.aliyuncs.cloudphone.model.v20201230.ListInstancesResponse.Instance.EipAddress;
import com.aliyuncs.cloudphone.model.v20201230.ListInstancesResponse.Instance.Tag;
import com.aliyuncs.cloudphone.model.v20201230.ListInstancesResponse.Instance.VpcAttributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setNextToken(_ctx.stringValue("ListInstancesResponse.NextToken"));
		listInstancesResponse.setTotalCount(_ctx.integerValue("ListInstancesResponse.TotalCount"));
		listInstancesResponse.setMaxResults(_ctx.integerValue("ListInstancesResponse.MaxResults"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Status"));
			instance.setCreationTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].CreationTime"));
			instance.setKeyPairName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].KeyPairName"));
			instance.setSecurityGroupId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].SecurityGroupId"));
			instance.setAutoRenew(_ctx.booleanValue("ListInstancesResponse.Instances["+ i +"].AutoRenew"));
			instance.setChargeType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ChargeType"));
			instance.setOsName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].OsName"));
			instance.setInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceType"));
			instance.setRegionId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setDescription(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Description"));
			instance.setExpiredTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instance.setInstanceName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setZoneId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setResolution(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Resolution"));
			instance.setImageId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ImageId"));
			instance.setOsNameEn(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].OsNameEn"));
			instance.setWebRtcToken(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].WebRtcToken"));

			VpcAttributes vpcAttributes = new VpcAttributes();
			vpcAttributes.setPrivateIpAddress(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].VpcAttributes.PrivateIpAddress"));
			vpcAttributes.setVSwitchId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].VpcAttributes.VSwitchId"));
			instance.setVpcAttributes(vpcAttributes);

			EipAddress eipAddress = new EipAddress();
			eipAddress.setInternetChargeType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].EipAddress.InternetChargeType"));
			eipAddress.setIpAddress(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].EipAddress.IpAddress"));
			eipAddress.setBandwidth(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].EipAddress.Bandwidth"));
			eipAddress.setAllocationId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].EipAddress.AllocationId"));
			instance.setEipAddress(eipAddress);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Instances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			instance.setTags(tags);

			instances.add(instance);
		}
		listInstancesResponse.setInstances(instances);
	 
	 	return listInstancesResponse;
	}
}