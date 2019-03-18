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

package com.aliyuncs.afs.transform.v20180112;

import com.aliyuncs.afs.model.v20180112.DescribeOrderInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOrderInfoResponseUnmarshaller {

	public static DescribeOrderInfoResponse unmarshall(DescribeOrderInfoResponse describeOrderInfoResponse, UnmarshallerContext context) {
		
		describeOrderInfoResponse.setRequestId(context.stringValue("DescribeOrderInfoResponse.RequestId"));
		describeOrderInfoResponse.setBizCode(context.stringValue("DescribeOrderInfoResponse.BizCode"));
		describeOrderInfoResponse.setOrderLevel(context.stringValue("DescribeOrderInfoResponse.OrderLevel"));
		describeOrderInfoResponse.setNum(context.stringValue("DescribeOrderInfoResponse.Num"));
		describeOrderInfoResponse.setBeginDate(context.stringValue("DescribeOrderInfoResponse.BeginDate"));
		describeOrderInfoResponse.setEndDate(context.stringValue("DescribeOrderInfoResponse.EndDate"));
	 
	 	return describeOrderInfoResponse;
	}
}