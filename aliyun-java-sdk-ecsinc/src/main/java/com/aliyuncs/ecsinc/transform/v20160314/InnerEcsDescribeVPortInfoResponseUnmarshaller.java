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

package com.aliyuncs.ecsinc.transform.v20160314;

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsDescribeVPortInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsDescribeVPortInfoResponseUnmarshaller {

	public static InnerEcsDescribeVPortInfoResponse unmarshall(InnerEcsDescribeVPortInfoResponse innerEcsDescribeVPortInfoResponse, UnmarshallerContext context) {
		
		innerEcsDescribeVPortInfoResponse.setRequestId(context.stringValue("InnerEcsDescribeVPortInfoResponse.RequestId"));
		innerEcsDescribeVPortInfoResponse.setVPortName(context.stringValue("InnerEcsDescribeVPortInfoResponse.VPortName"));
		innerEcsDescribeVPortInfoResponse.setInstanceId(context.stringValue("InnerEcsDescribeVPortInfoResponse.InstanceId"));
		innerEcsDescribeVPortInfoResponse.setEniType(context.stringValue("InnerEcsDescribeVPortInfoResponse.EniType"));
		innerEcsDescribeVPortInfoResponse.setVpcId(context.stringValue("InnerEcsDescribeVPortInfoResponse.VpcId"));
		innerEcsDescribeVPortInfoResponse.setVSwitchId(context.stringValue("InnerEcsDescribeVPortInfoResponse.VSwitchId"));
		innerEcsDescribeVPortInfoResponse.setEniStatus(context.stringValue("InnerEcsDescribeVPortInfoResponse.EniStatus"));
		innerEcsDescribeVPortInfoResponse.setEniNetworkType(context.stringValue("InnerEcsDescribeVPortInfoResponse.EniNetworkType"));
	 
	 	return innerEcsDescribeVPortInfoResponse;
	}
}