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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.DescribeInstanceIpRelationsResponse;
import com.aliyuncs.swas.model.v20170810.DescribeInstanceIpRelationsResponse.Instances;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceIpRelationsResponseUnmarshaller {

	public static DescribeInstanceIpRelationsResponse unmarshall(DescribeInstanceIpRelationsResponse describeInstanceIpRelationsResponse, UnmarshallerContext _ctx) {
		
		describeInstanceIpRelationsResponse.setRequestId(_ctx.stringValue("DescribeInstanceIpRelationsResponse.RequestId"));
		describeInstanceIpRelationsResponse.setCode(_ctx.stringValue("DescribeInstanceIpRelationsResponse.Code"));
		describeInstanceIpRelationsResponse.setSuccess(_ctx.booleanValue("DescribeInstanceIpRelationsResponse.Success"));
		describeInstanceIpRelationsResponse.setCount(_ctx.longValue("DescribeInstanceIpRelationsResponse.Count"));

		List<Instances> data = new ArrayList<Instances>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceIpRelationsResponse.Data.Length"); i++) {
			Instances instances = new Instances();
			instances.setInstanceName(_ctx.stringValue("DescribeInstanceIpRelationsResponse.Data["+ i +"].InstanceName"));
			instances.setInstanceId(_ctx.stringValue("DescribeInstanceIpRelationsResponse.Data["+ i +"].InstanceId"));
			instances.setUserId(_ctx.longValue("DescribeInstanceIpRelationsResponse.Data["+ i +"].UserId"));
			instances.setIp(_ctx.stringValue("DescribeInstanceIpRelationsResponse.Data["+ i +"].Ip"));
			instances.setInstanceType(_ctx.stringValue("DescribeInstanceIpRelationsResponse.Data["+ i +"].InstanceType"));
			instances.setCreateTime(_ctx.longValue("DescribeInstanceIpRelationsResponse.Data["+ i +"].CreateTime"));

			data.add(instances);
		}
		describeInstanceIpRelationsResponse.setData(data);
	 
	 	return describeInstanceIpRelationsResponse;
	}
}