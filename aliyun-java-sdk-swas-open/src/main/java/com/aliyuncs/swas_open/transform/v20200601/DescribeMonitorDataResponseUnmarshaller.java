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

package com.aliyuncs.swas_open.transform.v20200601;

import com.aliyuncs.swas_open.model.v20200601.DescribeMonitorDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorDataResponseUnmarshaller {

	public static DescribeMonitorDataResponse unmarshall(DescribeMonitorDataResponse describeMonitorDataResponse, UnmarshallerContext _ctx) {
		
		describeMonitorDataResponse.setRequestId(_ctx.stringValue("DescribeMonitorDataResponse.RequestId"));
		describeMonitorDataResponse.setDatapoints(_ctx.stringValue("DescribeMonitorDataResponse.Datapoints"));
		describeMonitorDataResponse.setPeriod(_ctx.stringValue("DescribeMonitorDataResponse.Period"));
		describeMonitorDataResponse.setNextToken(_ctx.stringValue("DescribeMonitorDataResponse.NextToken"));
	 
	 	return describeMonitorDataResponse;
	}
}