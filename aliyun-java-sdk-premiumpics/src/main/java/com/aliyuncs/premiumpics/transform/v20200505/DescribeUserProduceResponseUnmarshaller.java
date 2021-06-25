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

package com.aliyuncs.premiumpics.transform.v20200505;

import com.aliyuncs.premiumpics.model.v20200505.DescribeUserProduceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserProduceResponseUnmarshaller {

	public static DescribeUserProduceResponse unmarshall(DescribeUserProduceResponse describeUserProduceResponse, UnmarshallerContext _ctx) {
		
		describeUserProduceResponse.setRequestId(_ctx.stringValue("DescribeUserProduceResponse.RequestId"));
		describeUserProduceResponse.setBizId(_ctx.stringValue("DescribeUserProduceResponse.BizId"));
		describeUserProduceResponse.setBizType(_ctx.stringValue("DescribeUserProduceResponse.BizType"));
		describeUserProduceResponse.setErrorCode(_ctx.stringValue("DescribeUserProduceResponse.ErrorCode"));
		describeUserProduceResponse.setErrorMsg(_ctx.stringValue("DescribeUserProduceResponse.ErrorMsg"));
		describeUserProduceResponse.setExtInfo(_ctx.stringValue("DescribeUserProduceResponse.ExtInfo"));
		describeUserProduceResponse.setIntentionBizId(_ctx.stringValue("DescribeUserProduceResponse.IntentionBizId"));
		describeUserProduceResponse.setOrderId(_ctx.stringValue("DescribeUserProduceResponse.OrderId"));
		describeUserProduceResponse.setOrderPrice(_ctx.stringValue("DescribeUserProduceResponse.OrderPrice"));
		describeUserProduceResponse.setPartnerCode(_ctx.stringValue("DescribeUserProduceResponse.PartnerCode"));
		describeUserProduceResponse.setSolutionBizId(_ctx.stringValue("DescribeUserProduceResponse.SolutionBizId"));
		describeUserProduceResponse.setStatus(_ctx.integerValue("DescribeUserProduceResponse.Status"));
		describeUserProduceResponse.setSuccess(_ctx.booleanValue("DescribeUserProduceResponse.Success"));
		describeUserProduceResponse.setUserId(_ctx.stringValue("DescribeUserProduceResponse.UserId"));
		describeUserProduceResponse.setStartTime(_ctx.stringValue("DescribeUserProduceResponse.StartTime"));
		describeUserProduceResponse.setEndTime(_ctx.stringValue("DescribeUserProduceResponse.EndTime"));
		describeUserProduceResponse.setOrderInstanceId(_ctx.stringValue("DescribeUserProduceResponse.OrderInstanceId"));
	 
	 	return describeUserProduceResponse;
	}
}