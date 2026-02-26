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

import com.aliyuncs.ens.model.v20171110.DescribeInstanceBootConfigurationResponse;
import com.aliyuncs.ens.model.v20171110.DescribeInstanceBootConfigurationResponse.Instances;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceBootConfigurationResponseUnmarshaller {

	public static DescribeInstanceBootConfigurationResponse unmarshall(DescribeInstanceBootConfigurationResponse describeInstanceBootConfigurationResponse, UnmarshallerContext _ctx) {
		
		describeInstanceBootConfigurationResponse.setRequestId(_ctx.stringValue("DescribeInstanceBootConfigurationResponse.RequestId"));

		Instances instances = new Instances();
		instances.setBootType(_ctx.stringValue("DescribeInstanceBootConfigurationResponse.Instances.BootType"));
		instances.setDiskSet(_ctx.stringValue("DescribeInstanceBootConfigurationResponse.Instances.DiskSet"));
		instances.setBootSet(_ctx.stringValue("DescribeInstanceBootConfigurationResponse.Instances.BootSet"));
		instances.setInstanceId(_ctx.stringValue("DescribeInstanceBootConfigurationResponse.Instances.InstanceId"));
		describeInstanceBootConfigurationResponse.setInstances(instances);
	 
	 	return describeInstanceBootConfigurationResponse;
	}
}