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

import com.aliyuncs.ens.model.v20171110.DescribeInstanceSpecResponse;
import com.aliyuncs.ens.model.v20171110.DescribeInstanceSpecResponse.InstanceSpec;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceSpecResponseUnmarshaller {

	public static DescribeInstanceSpecResponse unmarshall(DescribeInstanceSpecResponse describeInstanceSpecResponse, UnmarshallerContext _ctx) {
		
		describeInstanceSpecResponse.setRequestId(_ctx.stringValue("DescribeInstanceSpecResponse.RequestId"));
		describeInstanceSpecResponse.setBandwidthLimit(_ctx.integerValue("DescribeInstanceSpecResponse.BandwidthLimit"));
		describeInstanceSpecResponse.setCode(_ctx.integerValue("DescribeInstanceSpecResponse.Code"));
		describeInstanceSpecResponse.setDataDiskMaxSize(_ctx.integerValue("DescribeInstanceSpecResponse.DataDiskMaxSize"));
		describeInstanceSpecResponse.setDataDiskMinSize(_ctx.integerValue("DescribeInstanceSpecResponse.DataDiskMinSize"));
		describeInstanceSpecResponse.setSystemDiskMaxSize(_ctx.integerValue("DescribeInstanceSpecResponse.SystemDiskMaxSize"));

		List<InstanceSpec> instanceSpecs = new ArrayList<InstanceSpec>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceSpecResponse.InstanceSpecs.Length"); i++) {
			InstanceSpec instanceSpec = new InstanceSpec();
			instanceSpec.setCore(_ctx.stringValue("DescribeInstanceSpecResponse.InstanceSpecs["+ i +"].Core"));
			instanceSpec.setDisplayName(_ctx.stringValue("DescribeInstanceSpecResponse.InstanceSpecs["+ i +"].DisplayName"));
			instanceSpec.setInstanceType(_ctx.stringValue("DescribeInstanceSpecResponse.InstanceSpecs["+ i +"].InstanceType"));
			instanceSpec.setMemory(_ctx.stringValue("DescribeInstanceSpecResponse.InstanceSpecs["+ i +"].Memory"));

			instanceSpecs.add(instanceSpec);
		}
		describeInstanceSpecResponse.setInstanceSpecs(instanceSpecs);
	 
	 	return describeInstanceSpecResponse;
	}
}