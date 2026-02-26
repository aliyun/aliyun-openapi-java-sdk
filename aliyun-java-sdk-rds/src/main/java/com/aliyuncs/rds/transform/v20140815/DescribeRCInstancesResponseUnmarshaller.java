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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCInstancesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstancesResponse.RCInstancesItem;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstancesResponse.RCInstancesItem.Tag;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstancesResponse.RCInstancesItem.TagResource;
import com.aliyuncs.rds.model.v20140815.DescribeRCInstancesResponse.RCInstancesItem.VpcAttributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCInstancesResponseUnmarshaller {

	public static DescribeRCInstancesResponse unmarshall(DescribeRCInstancesResponse describeRCInstancesResponse, UnmarshallerContext _ctx) {
		
		describeRCInstancesResponse.setRequestId(_ctx.stringValue("DescribeRCInstancesResponse.RequestId"));
		describeRCInstancesResponse.setPageNumber(_ctx.integerValue("DescribeRCInstancesResponse.PageNumber"));
		describeRCInstancesResponse.setPageSize(_ctx.integerValue("DescribeRCInstancesResponse.PageSize"));
		describeRCInstancesResponse.setTotalCount(_ctx.integerValue("DescribeRCInstancesResponse.TotalCount"));

		List<RCInstancesItem> rCInstances = new ArrayList<RCInstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCInstancesResponse.RCInstances.Length"); i++) {
			RCInstancesItem rCInstancesItem = new RCInstancesItem();
			rCInstancesItem.setHostIp(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].HostIp"));
			rCInstancesItem.setHostName(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].HostName"));
			rCInstancesItem.setClusterName(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].ClusterName"));
			rCInstancesItem.setDbType(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].DbType"));
			rCInstancesItem.setStatus(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].Status"));
			rCInstancesItem.setRegionId(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].RegionId"));
			rCInstancesItem.setVpcId(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].VpcId"));
			rCInstancesItem.setInstanceId(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].InstanceId"));
			rCInstancesItem.setDescription(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].Description"));
			rCInstancesItem.setGmtCreated(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].GmtCreated"));
			rCInstancesItem.setInstanceChargeType(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].InstanceChargeType"));
			rCInstancesItem.setCreateMode(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].CreateMode"));
			rCInstancesItem.setZoneId(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].ZoneId"));
			rCInstancesItem.setSpotStrategy(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].SpotStrategy"));
			rCInstancesItem.setPublicIp(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].PublicIp"));
			rCInstancesItem.setInstanceType(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].InstanceType"));
			rCInstancesItem.setInstanceTypeFamily(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].InstanceTypeFamily"));
			rCInstancesItem.setSecurityGroupId(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].SecurityGroupId"));
			rCInstancesItem.setCpu(_ctx.integerValue("DescribeRCInstancesResponse.RCInstances["+ i +"].Cpu"));
			rCInstancesItem.setMemory(_ctx.integerValue("DescribeRCInstancesResponse.RCInstances["+ i +"].Memory"));
			rCInstancesItem.setExpiredTime(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].ExpiredTime"));
			rCInstancesItem.setDeploymentSetId(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].DeploymentSetId"));
			rCInstancesItem.setImageId(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].ImageId"));
			rCInstancesItem.setNodeType(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].NodeType"));

			VpcAttributes vpcAttributes = new VpcAttributes();
			vpcAttributes.setNatIpAddress(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].VpcAttributes.NatIpAddress"));
			vpcAttributes.setVSwitchId(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].VpcAttributes.VSwitchId"));
			vpcAttributes.setVpcId(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].VpcAttributes.VpcId"));

			List<String> privateIpAddress = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCInstancesResponse.RCInstances["+ i +"].VpcAttributes.PrivateIpAddress.Length"); j++) {
				privateIpAddress.add(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].VpcAttributes.PrivateIpAddress["+ j +"]"));
			}
			vpcAttributes.setPrivateIpAddress(privateIpAddress);
			rCInstancesItem.setVpcAttributes(vpcAttributes);

			List<TagResource> tagResources = new ArrayList<TagResource>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCInstancesResponse.RCInstances["+ i +"].TagResources.Length"); j++) {
				TagResource tagResource = new TagResource();
				tagResource.setResourceId(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].TagResources["+ j +"].ResourceId"));
				tagResource.setResourceType(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].TagResources["+ j +"].ResourceType"));
				tagResource.setTagKey(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].TagResources["+ j +"].TagKey"));
				tagResource.setTagValue(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].TagResources["+ j +"].TagValue"));

				tagResources.add(tagResource);
			}
			rCInstancesItem.setTagResources(tagResources);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCInstancesResponse.RCInstances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setResourceId(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].Tags["+ j +"].ResourceId"));
				tag.setResourceType(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].Tags["+ j +"].ResourceType"));
				tag.setTagKey(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeRCInstancesResponse.RCInstances["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			rCInstancesItem.setTags(tags);

			rCInstances.add(rCInstancesItem);
		}
		describeRCInstancesResponse.setRCInstances(rCInstances);
	 
	 	return describeRCInstancesResponse;
	}
}