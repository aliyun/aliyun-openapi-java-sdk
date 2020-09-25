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

import com.aliyuncs.sas.model.v20181203.DescribeContainerStatisticsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeContainerStatisticsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContainerStatisticsResponseUnmarshaller {

	public static DescribeContainerStatisticsResponse unmarshall(DescribeContainerStatisticsResponse describeContainerStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeContainerStatisticsResponse.setRequestId(_ctx.stringValue("DescribeContainerStatisticsResponse.RequestId"));

		Data data = new Data();
		data.setTotalAlarmCount(_ctx.integerValue("DescribeContainerStatisticsResponse.Data.TotalAlarmCount"));
		data.setRemindAlarmCount(_ctx.integerValue("DescribeContainerStatisticsResponse.Data.RemindAlarmCount"));
		data.setSuspiciousAlarmCount(_ctx.integerValue("DescribeContainerStatisticsResponse.Data.SuspiciousAlarmCount"));
		data.setSeriousAlarmCount(_ctx.integerValue("DescribeContainerStatisticsResponse.Data.SeriousAlarmCount"));
		data.setTotalNode(_ctx.integerValue("DescribeContainerStatisticsResponse.Data.TotalNode"));
		data.setHasRiskNode(_ctx.integerValue("DescribeContainerStatisticsResponse.Data.hasRiskNode"));
		describeContainerStatisticsResponse.setData(data);
	 
	 	return describeContainerStatisticsResponse;
	}
}