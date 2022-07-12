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

import com.aliyuncs.antiddos_public.model.v20170518.DescribeIpLocationServiceResponse;
import com.aliyuncs.antiddos_public.model.v20170518.DescribeIpLocationServiceResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpLocationServiceResponseUnmarshaller {

	public static DescribeIpLocationServiceResponse unmarshall(DescribeIpLocationServiceResponse describeIpLocationServiceResponse, UnmarshallerContext _ctx) {
		
		describeIpLocationServiceResponse.setRequestId(_ctx.stringValue("DescribeIpLocationServiceResponse.RequestId"));

		Instance instance = new Instance();
		instance.setInstanceId(_ctx.stringValue("DescribeIpLocationServiceResponse.Instance.InstanceId"));
		instance.setInstanceName(_ctx.stringValue("DescribeIpLocationServiceResponse.Instance.InstanceName"));
		instance.setInternetIp(_ctx.stringValue("DescribeIpLocationServiceResponse.Instance.InternetIp"));
		instance.setInstanceType(_ctx.stringValue("DescribeIpLocationServiceResponse.Instance.InstanceType"));
		instance.setRegion(_ctx.stringValue("DescribeIpLocationServiceResponse.Instance.Region"));
		describeIpLocationServiceResponse.setInstance(instance);
	 
	 	return describeIpLocationServiceResponse;
	}
}