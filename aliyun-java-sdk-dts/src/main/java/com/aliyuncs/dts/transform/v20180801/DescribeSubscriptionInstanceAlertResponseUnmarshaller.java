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

package com.aliyuncs.dts.transform.v20180801;

import com.aliyuncs.dts.model.v20180801.DescribeSubscriptionInstanceAlertResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSubscriptionInstanceAlertResponseUnmarshaller {

	public static DescribeSubscriptionInstanceAlertResponse unmarshall(DescribeSubscriptionInstanceAlertResponse describeSubscriptionInstanceAlertResponse, UnmarshallerContext _ctx) {
		
		describeSubscriptionInstanceAlertResponse.setRequestId(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.RequestId"));
		describeSubscriptionInstanceAlertResponse.setSubscriptionInstanceID(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.SubscriptionInstanceID"));
		describeSubscriptionInstanceAlertResponse.setSubscriptionInstanceName(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.SubscriptionInstanceName"));
		describeSubscriptionInstanceAlertResponse.setDelayAlertStatus(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.DelayAlertStatus"));
		describeSubscriptionInstanceAlertResponse.setDelayAlertPhone(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.DelayAlertPhone"));
		describeSubscriptionInstanceAlertResponse.setDelayOverSeconds(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.DelayOverSeconds"));
		describeSubscriptionInstanceAlertResponse.setErrorAlertStatus(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.ErrorAlertStatus"));
		describeSubscriptionInstanceAlertResponse.setErrorAlertPhone(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.ErrorAlertPhone"));
		describeSubscriptionInstanceAlertResponse.setSuccess(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.Success"));
		describeSubscriptionInstanceAlertResponse.setErrCode(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.ErrCode"));
		describeSubscriptionInstanceAlertResponse.setErrMessage(_ctx.stringValue("DescribeSubscriptionInstanceAlertResponse.ErrMessage"));
	 
	 	return describeSubscriptionInstanceAlertResponse;
	}
}