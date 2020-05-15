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

import com.aliyuncs.sas.model.v20181203.DescribeAllRegionsStatisticsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAllRegionsStatisticsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAllRegionsStatisticsResponseUnmarshaller {

	public static DescribeAllRegionsStatisticsResponse unmarshall(DescribeAllRegionsStatisticsResponse describeAllRegionsStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeAllRegionsStatisticsResponse.setRequestId(_ctx.stringValue("DescribeAllRegionsStatisticsResponse.RequestId"));

		Data data = new Data();
		data.setAccount(_ctx.integerValue("DescribeAllRegionsStatisticsResponse.Data.Account"));
		data.setHealth(_ctx.integerValue("DescribeAllRegionsStatisticsResponse.Data.Health"));
		data.setTrojan(_ctx.integerValue("DescribeAllRegionsStatisticsResponse.Data.Trojan"));
		data.setSuspicious(_ctx.integerValue("DescribeAllRegionsStatisticsResponse.Data.Suspicious"));
		data.setVul(_ctx.integerValue("DescribeAllRegionsStatisticsResponse.Data.Vul"));
		data.setNewSuspicious(_ctx.integerValue("DescribeAllRegionsStatisticsResponse.Data.NewSuspicious"));
		describeAllRegionsStatisticsResponse.setData(data);
	 
	 	return describeAllRegionsStatisticsResponse;
	}
}