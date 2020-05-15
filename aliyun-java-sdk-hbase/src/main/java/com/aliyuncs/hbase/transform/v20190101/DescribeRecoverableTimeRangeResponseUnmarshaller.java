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

package com.aliyuncs.hbase.transform.v20190101;

import com.aliyuncs.hbase.model.v20190101.DescribeRecoverableTimeRangeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecoverableTimeRangeResponseUnmarshaller {

	public static DescribeRecoverableTimeRangeResponse unmarshall(DescribeRecoverableTimeRangeResponse describeRecoverableTimeRangeResponse, UnmarshallerContext _ctx) {
		
		describeRecoverableTimeRangeResponse.setRequestId(_ctx.stringValue("DescribeRecoverableTimeRangeResponse.RequestId"));
		describeRecoverableTimeRangeResponse.setTimeBegin(_ctx.stringValue("DescribeRecoverableTimeRangeResponse.TimeBegin"));
		describeRecoverableTimeRangeResponse.setTimeEnd(_ctx.stringValue("DescribeRecoverableTimeRangeResponse.TimeEnd"));
	 
	 	return describeRecoverableTimeRangeResponse;
	}
}