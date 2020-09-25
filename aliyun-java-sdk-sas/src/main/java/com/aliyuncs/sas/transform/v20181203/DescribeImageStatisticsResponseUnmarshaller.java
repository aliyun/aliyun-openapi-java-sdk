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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeImageStatisticsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageStatisticsResponseUnmarshaller {

	public static DescribeImageStatisticsResponse unmarshall(DescribeImageStatisticsResponse describeImageStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeImageStatisticsResponse.setRequestId(_ctx.stringValue("DescribeImageStatisticsResponse.RequestId"));
		describeImageStatisticsResponse.setInstanceCount(_ctx.integerValue("DescribeImageStatisticsResponse.InstanceCount"));
		describeImageStatisticsResponse.setRiskInstanceCount(_ctx.integerValue("DescribeImageStatisticsResponse.RiskInstanceCount"));
	 
	 	return describeImageStatisticsResponse;
	}
}