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

import com.aliyuncs.sas.model.v20181203.DescribeExposedStatisticsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExposedStatisticsResponseUnmarshaller {

	public static DescribeExposedStatisticsResponse unmarshall(DescribeExposedStatisticsResponse describeExposedStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeExposedStatisticsResponse.setRequestId(_ctx.stringValue("DescribeExposedStatisticsResponse.RequestId"));
		describeExposedStatisticsResponse.setExposedInstanceCount(_ctx.integerValue("DescribeExposedStatisticsResponse.ExposedInstanceCount"));
		describeExposedStatisticsResponse.setGatewayAssetCount(_ctx.integerValue("DescribeExposedStatisticsResponse.GatewayAssetCount"));
		describeExposedStatisticsResponse.setExposedIpCount(_ctx.integerValue("DescribeExposedStatisticsResponse.ExposedIpCount"));
		describeExposedStatisticsResponse.setExposedPortCount(_ctx.integerValue("DescribeExposedStatisticsResponse.ExposedPortCount"));
		describeExposedStatisticsResponse.setExposedComponentCount(_ctx.integerValue("DescribeExposedStatisticsResponse.ExposedComponentCount"));
		describeExposedStatisticsResponse.setExposedAsapVulCount(_ctx.integerValue("DescribeExposedStatisticsResponse.ExposedAsapVulCount"));
		describeExposedStatisticsResponse.setExposedLaterVulCount(_ctx.integerValue("DescribeExposedStatisticsResponse.ExposedLaterVulCount"));
		describeExposedStatisticsResponse.setExposedNntfVulCount(_ctx.integerValue("DescribeExposedStatisticsResponse.ExposedNntfVulCount"));
		describeExposedStatisticsResponse.setExposedWeekPasswordMachineCount(_ctx.integerValue("DescribeExposedStatisticsResponse.ExposedWeekPasswordMachineCount"));
	 
	 	return describeExposedStatisticsResponse;
	}
}