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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeInstancesResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeInstancesResponse.InstanceAttribute;
import com.aliyuncs.cloudapi.model.v20160714.DescribeInstancesResponse.InstanceAttribute.SpecAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext _ctx) {
		
		describeInstancesResponse.setRequestId(_ctx.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setPageNumber(_ctx.integerValue("DescribeInstancesResponse.PageNumber"));
		describeInstancesResponse.setPageSize(_ctx.integerValue("DescribeInstancesResponse.PageSize"));
		describeInstancesResponse.setTotalCount(_ctx.integerValue("DescribeInstancesResponse.TotalCount"));

		List<InstanceAttribute> instances = new ArrayList<InstanceAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			InstanceAttribute instanceAttribute = new InstanceAttribute();
			instanceAttribute.setStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].Status"));
			instanceAttribute.setVpcSlbIntranetEnable(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].VpcSlbIntranetEnable"));
			instanceAttribute.setClassicEgressAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ClassicEgressAddress"));
			instanceAttribute.setZoneLocalName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ZoneLocalName"));
			instanceAttribute.setVipTypeList(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VipTypeList"));
			instanceAttribute.setUserVpcId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].UserVpcId"));
			instanceAttribute.setVpcIntranetEnable(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].VpcIntranetEnable"));
			instanceAttribute.setVpcOwnerId(_ctx.longValue("DescribeInstancesResponse.Instances["+ i +"].VpcOwnerId"));
			instanceAttribute.setInstanceId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			instanceAttribute.setInstanceRpsLimit(_ctx.integerValue("DescribeInstancesResponse.Instances["+ i +"].InstanceRpsLimit"));
			instanceAttribute.setInstanceType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceType"));
			instanceAttribute.setRegionId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].RegionId"));
			instanceAttribute.setInstanceSpec(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceSpec"));
			instanceAttribute.setInstanceChargeType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceChargeType"));
			instanceAttribute.setHttpsPolicies(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].HttpsPolicies"));
			instanceAttribute.setVpcEgressAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcEgressAddress"));
			instanceAttribute.setEgressIpv6Enable(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].EgressIpv6Enable"));
			instanceAttribute.setExpiredTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instanceAttribute.setInstanceName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceName"));
			instanceAttribute.setZoneId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].ZoneId"));
			instanceAttribute.setSupportIpv6(_ctx.booleanValue("DescribeInstancesResponse.Instances["+ i +"].SupportIpv6"));
			instanceAttribute.setInternetEgressAddress(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InternetEgressAddress"));
			instanceAttribute.setCreatedTime(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].CreatedTime"));
			instanceAttribute.setUserVswitchId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].UserVswitchId"));
			instanceAttribute.setAclName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].AclName"));
			instanceAttribute.setAclType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].AclType"));
			instanceAttribute.setAclStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].AclStatus"));
			instanceAttribute.setAclId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].AclId"));
			instanceAttribute.setIntranetSegments(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].IntranetSegments"));
			instanceAttribute.setIPV6AclName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].IPV6AclName"));
			instanceAttribute.setIPV6AclId(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].IPV6AclId"));
			instanceAttribute.setIPV6AclType(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].IPV6AclType"));
			instanceAttribute.setIPV6AclStatus(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].IPV6AclStatus"));

			List<SpecAttribute> instanceSpecAttributes = new ArrayList<SpecAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstancesResponse.Instances["+ i +"].InstanceSpecAttributes.Length"); j++) {
				SpecAttribute specAttribute = new SpecAttribute();
				specAttribute.setValue(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceSpecAttributes["+ j +"].Value"));
				specAttribute.setLocalName(_ctx.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceSpecAttributes["+ j +"].LocalName"));

				instanceSpecAttributes.add(specAttribute);
			}
			instanceAttribute.setInstanceSpecAttributes(instanceSpecAttributes);

			instances.add(instanceAttribute);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}