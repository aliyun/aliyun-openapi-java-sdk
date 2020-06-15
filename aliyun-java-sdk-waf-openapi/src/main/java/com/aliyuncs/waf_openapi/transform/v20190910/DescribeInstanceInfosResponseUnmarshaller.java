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

package com.aliyuncs.waf_openapi.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.waf_openapi.model.v20190910.DescribeInstanceInfosResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeInstanceInfosResponse.InstanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceInfosResponseUnmarshaller {

	public static DescribeInstanceInfosResponse unmarshall(DescribeInstanceInfosResponse describeInstanceInfosResponse, UnmarshallerContext _ctx) {
		
		describeInstanceInfosResponse.setRequestId(_ctx.stringValue("DescribeInstanceInfosResponse.RequestId"));

		List<InstanceInfo> instanceInfos = new ArrayList<InstanceInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceInfosResponse.InstanceInfos.Length"); i++) {
			InstanceInfo instanceInfo = new InstanceInfo();
			instanceInfo.setInDebt(_ctx.integerValue("DescribeInstanceInfosResponse.InstanceInfos["+ i +"].InDebt"));
			instanceInfo.setInstanceId(_ctx.stringValue("DescribeInstanceInfosResponse.InstanceInfos["+ i +"].InstanceId"));
			instanceInfo.setPayType(_ctx.integerValue("DescribeInstanceInfosResponse.InstanceInfos["+ i +"].PayType"));
			instanceInfo.setEndDate(_ctx.longValue("DescribeInstanceInfosResponse.InstanceInfos["+ i +"].EndDate"));
			instanceInfo.setRemainDay(_ctx.integerValue("DescribeInstanceInfosResponse.InstanceInfos["+ i +"].RemainDay"));
			instanceInfo.setRegion(_ctx.stringValue("DescribeInstanceInfosResponse.InstanceInfos["+ i +"].Region"));
			instanceInfo.setTrial(_ctx.integerValue("DescribeInstanceInfosResponse.InstanceInfos["+ i +"].Trial"));
			instanceInfo.setStatus(_ctx.integerValue("DescribeInstanceInfosResponse.InstanceInfos["+ i +"].Status"));
			instanceInfo.setSubscriptionType(_ctx.stringValue("DescribeInstanceInfosResponse.InstanceInfos["+ i +"].SubscriptionType"));

			instanceInfos.add(instanceInfo);
		}
		describeInstanceInfosResponse.setInstanceInfos(instanceInfos);
	 
	 	return describeInstanceInfosResponse;
	}
}