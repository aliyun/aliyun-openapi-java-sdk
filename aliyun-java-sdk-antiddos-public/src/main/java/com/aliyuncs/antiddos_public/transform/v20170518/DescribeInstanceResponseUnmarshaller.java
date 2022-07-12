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

package com.aliyuncs.antiddos_public.transform.v20170518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.antiddos_public.model.v20170518.DescribeInstanceResponse;
import com.aliyuncs.antiddos_public.model.v20170518.DescribeInstanceResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceResponseUnmarshaller {

	public static DescribeInstanceResponse unmarshall(DescribeInstanceResponse describeInstanceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceResponse.setRequestId(_ctx.stringValue("DescribeInstanceResponse.RequestId"));
		describeInstanceResponse.setTotal(_ctx.integerValue("DescribeInstanceResponse.Total"));

		List<Instance> instanceList = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.InstanceList.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceIp(_ctx.stringValue("DescribeInstanceResponse.InstanceList["+ i +"].InstanceIp"));
			instance.setIsBgppack(_ctx.booleanValue("DescribeInstanceResponse.InstanceList["+ i +"].IsBgppack"));
			instance.setIpVersion(_ctx.stringValue("DescribeInstanceResponse.InstanceList["+ i +"].IpVersion"));
			instance.setElasticThreshold(_ctx.integerValue("DescribeInstanceResponse.InstanceList["+ i +"].ElasticThreshold"));
			instance.setBlackholeThreshold(_ctx.integerValue("DescribeInstanceResponse.InstanceList["+ i +"].BlackholeThreshold"));
			instance.setDefenseBpsThreshold(_ctx.integerValue("DescribeInstanceResponse.InstanceList["+ i +"].DefenseBpsThreshold"));
			instance.setInstanceName(_ctx.stringValue("DescribeInstanceResponse.InstanceList["+ i +"].InstanceName"));
			instance.setInstanceStatus(_ctx.stringValue("DescribeInstanceResponse.InstanceList["+ i +"].InstanceStatus"));
			instance.setDefensePpsThreshold(_ctx.integerValue("DescribeInstanceResponse.InstanceList["+ i +"].DefensePpsThreshold"));
			instance.setInstanceId(_ctx.stringValue("DescribeInstanceResponse.InstanceList["+ i +"].InstanceId"));
			instance.setInstanceType(_ctx.stringValue("DescribeInstanceResponse.InstanceList["+ i +"].InstanceType"));

			instanceList.add(instance);
		}
		describeInstanceResponse.setInstanceList(instanceList);
	 
	 	return describeInstanceResponse;
	}
}