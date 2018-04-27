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

package com.aliyuncs.hsm.transform.v20180111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hsm.model.v20180111.DescribeInstancesResponse;
import com.aliyuncs.hsm.model.v20180111.DescribeInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancesResponseUnmarshaller {

	public static DescribeInstancesResponse unmarshall(DescribeInstancesResponse describeInstancesResponse, UnmarshallerContext context) {
		
		describeInstancesResponse.setRequestId(context.stringValue("DescribeInstancesResponse.RequestId"));
		describeInstancesResponse.setTotalCount(context.integerValue("DescribeInstancesResponse.TotalCount"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < context.lengthValue("DescribeInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setRegionId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setZoneId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].ZoneId"));
			instance.setHsmStatus(context.integerValue("DescribeInstancesResponse.Instances["+ i +"].HsmStatus"));
			instance.setHsmOem(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].HsmOem"));
			instance.setHsmDeviceType(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].HsmDeviceType"));
			instance.setVpcId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].VpcId"));
			instance.setVswitchId(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].VswitchId"));
			instance.setIp(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].Ip"));
			instance.setRemark(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].Remark"));
			instance.setExpiredTime(context.longValue("DescribeInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instance.setCreateTime(context.longValue("DescribeInstancesResponse.Instances["+ i +"].CreateTime"));

			List<String> whiteList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeInstancesResponse.Instances["+ i +"].WhiteList.Length"); j++) {
				whiteList.add(context.stringValue("DescribeInstancesResponse.Instances["+ i +"].WhiteList["+ j +"]"));
			}
			instance.setWhiteList(whiteList);

			instances.add(instance);
		}
		describeInstancesResponse.setInstances(instances);
	 
	 	return describeInstancesResponse;
	}
}