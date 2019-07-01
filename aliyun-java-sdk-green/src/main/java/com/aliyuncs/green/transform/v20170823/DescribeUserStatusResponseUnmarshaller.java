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

package com.aliyuncs.green.transform.v20170823;

import com.aliyuncs.green.model.v20170823.DescribeUserStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserStatusResponseUnmarshaller {

	public static DescribeUserStatusResponse unmarshall(DescribeUserStatusResponse describeUserStatusResponse, UnmarshallerContext context) {
		
		describeUserStatusResponse.setRequestId(context.stringValue("DescribeUserStatusResponse.RequestId"));
		describeUserStatusResponse.setBuyed(context.booleanValue("DescribeUserStatusResponse.Buyed"));
		describeUserStatusResponse.setInDept(context.booleanValue("DescribeUserStatusResponse.InDept"));
		describeUserStatusResponse.setOpenApiUsed(context.booleanValue("DescribeUserStatusResponse.OpenApiUsed"));
		describeUserStatusResponse.setOpenApiBeginTime(context.stringValue("DescribeUserStatusResponse.OpenApiBeginTime"));
		describeUserStatusResponse.setOssCheckStatus(context.stringValue("DescribeUserStatusResponse.OssCheckStatus"));
		describeUserStatusResponse.setOssVideoSizeLimit(context.integerValue("DescribeUserStatusResponse.OssVideoSizeLimit"));
	 
	 	return describeUserStatusResponse;
	}
}