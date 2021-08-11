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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeInstanceIdsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeInstanceIdsResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceIdsResponseUnmarshaller {

	public static DescribeInstanceIdsResponse unmarshall(DescribeInstanceIdsResponse describeInstanceIdsResponse, UnmarshallerContext _ctx) {
		
		describeInstanceIdsResponse.setRequestId(_ctx.stringValue("DescribeInstanceIdsResponse.RequestId"));

		List<Instance> instanceIds = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceIdsResponse.InstanceIds.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("DescribeInstanceIdsResponse.InstanceIds["+ i +"].InstanceId"));
			instance.setRemark(_ctx.stringValue("DescribeInstanceIdsResponse.InstanceIds["+ i +"].Remark"));
			instance.setEdition(_ctx.integerValue("DescribeInstanceIdsResponse.InstanceIds["+ i +"].Edition"));
			instance.setIpVersion(_ctx.stringValue("DescribeInstanceIdsResponse.InstanceIds["+ i +"].IpVersion"));
			instance.setIpMode(_ctx.stringValue("DescribeInstanceIdsResponse.InstanceIds["+ i +"].IpMode"));

			instanceIds.add(instance);
		}
		describeInstanceIdsResponse.setInstanceIds(instanceIds);
	 
	 	return describeInstanceIdsResponse;
	}
}