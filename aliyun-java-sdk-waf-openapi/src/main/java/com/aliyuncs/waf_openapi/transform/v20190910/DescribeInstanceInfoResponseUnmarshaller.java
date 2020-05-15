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

import com.aliyuncs.waf_openapi.model.v20190910.DescribeInstanceInfoResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeInstanceInfoResponse.InstanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceInfoResponseUnmarshaller {

	public static DescribeInstanceInfoResponse unmarshall(DescribeInstanceInfoResponse describeInstanceInfoResponse, UnmarshallerContext _ctx) {
		
		describeInstanceInfoResponse.setRequestId(_ctx.stringValue("DescribeInstanceInfoResponse.RequestId"));

		InstanceInfo instanceInfo = new InstanceInfo();
		instanceInfo.setInDebt(_ctx.integerValue("DescribeInstanceInfoResponse.InstanceInfo.InDebt"));
		instanceInfo.setInstanceId(_ctx.stringValue("DescribeInstanceInfoResponse.InstanceInfo.InstanceId"));
		instanceInfo.setPayType(_ctx.integerValue("DescribeInstanceInfoResponse.InstanceInfo.PayType"));
		instanceInfo.setEndDate(_ctx.longValue("DescribeInstanceInfoResponse.InstanceInfo.EndDate"));
		instanceInfo.setRemainDay(_ctx.integerValue("DescribeInstanceInfoResponse.InstanceInfo.RemainDay"));
		instanceInfo.setRegion(_ctx.stringValue("DescribeInstanceInfoResponse.InstanceInfo.Region"));
		instanceInfo.setTrial(_ctx.integerValue("DescribeInstanceInfoResponse.InstanceInfo.Trial"));
		instanceInfo.setStatus(_ctx.integerValue("DescribeInstanceInfoResponse.InstanceInfo.Status"));
		instanceInfo.setSubscriptionType(_ctx.stringValue("DescribeInstanceInfoResponse.InstanceInfo.SubscriptionType"));
		describeInstanceInfoResponse.setInstanceInfo(instanceInfo);
	 
	 	return describeInstanceInfoResponse;
	}
}