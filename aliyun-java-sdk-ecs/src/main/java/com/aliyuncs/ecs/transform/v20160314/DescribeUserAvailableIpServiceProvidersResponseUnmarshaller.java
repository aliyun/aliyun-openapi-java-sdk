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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeUserAvailableIpServiceProvidersResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeUserAvailableIpServiceProvidersResponse.IpServiceProvider;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserAvailableIpServiceProvidersResponseUnmarshaller {

	public static DescribeUserAvailableIpServiceProvidersResponse unmarshall(DescribeUserAvailableIpServiceProvidersResponse describeUserAvailableIpServiceProvidersResponse, UnmarshallerContext _ctx) {
		
		describeUserAvailableIpServiceProvidersResponse.setRequestId(_ctx.stringValue("DescribeUserAvailableIpServiceProvidersResponse.RequestId"));

		List<IpServiceProvider> ipServiceProviders = new ArrayList<IpServiceProvider>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserAvailableIpServiceProvidersResponse.IpServiceProviders.Length"); i++) {
			IpServiceProvider ipServiceProvider = new IpServiceProvider();
			ipServiceProvider.setName(_ctx.stringValue("DescribeUserAvailableIpServiceProvidersResponse.IpServiceProviders["+ i +"].Name"));

			ipServiceProviders.add(ipServiceProvider);
		}
		describeUserAvailableIpServiceProvidersResponse.setIpServiceProviders(ipServiceProviders);
	 
	 	return describeUserAvailableIpServiceProvidersResponse;
	}
}