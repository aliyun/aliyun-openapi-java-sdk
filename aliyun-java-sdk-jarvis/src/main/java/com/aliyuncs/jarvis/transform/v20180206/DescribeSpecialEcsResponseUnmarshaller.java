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

package com.aliyuncs.jarvis.transform.v20180206;

import com.aliyuncs.jarvis.model.v20180206.DescribeSpecialEcsResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeSpecialEcsResponse.EcsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSpecialEcsResponseUnmarshaller {

	public static DescribeSpecialEcsResponse unmarshall(DescribeSpecialEcsResponse describeSpecialEcsResponse, UnmarshallerContext context) {
		
		describeSpecialEcsResponse.setRequestId(context.stringValue("DescribeSpecialEcsResponse.RequestId"));
		describeSpecialEcsResponse.setEcsFound(context.booleanValue("DescribeSpecialEcsResponse.EcsFound"));
		describeSpecialEcsResponse.setModule(context.stringValue("DescribeSpecialEcsResponse.module"));

		EcsInfo ecsInfo = new EcsInfo();
		ecsInfo.setInstanceId(context.stringValue("DescribeSpecialEcsResponse.EcsInfo.InstanceId"));
		ecsInfo.setInstanceName(context.stringValue("DescribeSpecialEcsResponse.EcsInfo.InstanceName"));
		ecsInfo.setIP(context.stringValue("DescribeSpecialEcsResponse.EcsInfo.IP"));
		ecsInfo.setRegion(context.stringValue("DescribeSpecialEcsResponse.EcsInfo.Region"));
		ecsInfo.setItemSign(context.stringValue("DescribeSpecialEcsResponse.EcsInfo.ItemSign"));
		describeSpecialEcsResponse.setEcsInfo(ecsInfo);
	 
	 	return describeSpecialEcsResponse;
	}
}