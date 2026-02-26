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

package com.aliyuncs.advisor_share.transform.v20180608;

import com.aliyuncs.advisor_share.model.v20180608.DescribeHistoryCheckStatisticsResponse;
import com.aliyuncs.advisor_share.model.v20180608.DescribeHistoryCheckStatisticsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHistoryCheckStatisticsResponseUnmarshaller {

	public static DescribeHistoryCheckStatisticsResponse unmarshall(DescribeHistoryCheckStatisticsResponse describeHistoryCheckStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeHistoryCheckStatisticsResponse.setRequestId(_ctx.stringValue("DescribeHistoryCheckStatisticsResponse.RequestId"));

		Data data = new Data();
		data.setNotrepair(_ctx.longValue("DescribeHistoryCheckStatisticsResponse.Data.Notrepair"));
		data.setTotal(_ctx.longValue("DescribeHistoryCheckStatisticsResponse.Data.Total"));
		data.setRepair(_ctx.longValue("DescribeHistoryCheckStatisticsResponse.Data.Repair"));
		describeHistoryCheckStatisticsResponse.setData(data);
	 
	 	return describeHistoryCheckStatisticsResponse;
	}
}