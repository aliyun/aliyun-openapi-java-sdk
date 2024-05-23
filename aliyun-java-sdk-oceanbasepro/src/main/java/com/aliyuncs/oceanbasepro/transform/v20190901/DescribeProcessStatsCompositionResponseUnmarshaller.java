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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProcessStatsCompositionResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProcessStatsCompositionResponse.DataItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProcessStatsCompositionResponse.DataItem.AllProcessListItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProcessStatsCompositionResponse.DataItem.SessionStatistics;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProcessStatsCompositionResponse.DataItem.SessionStatistics.DataBaseStatisticsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProcessStatsCompositionResponse.DataItem.SessionStatistics.SourceStatisticsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProcessStatsCompositionResponse.DataItem.SessionStatistics.UserStatisticsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProcessStatsCompositionResponseUnmarshaller {

	public static DescribeProcessStatsCompositionResponse unmarshall(DescribeProcessStatsCompositionResponse describeProcessStatsCompositionResponse, UnmarshallerContext _ctx) {
		
		describeProcessStatsCompositionResponse.setRequestId(_ctx.stringValue("DescribeProcessStatsCompositionResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProcessStatsCompositionResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTotalSessionCount(_ctx.integerValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].TotalSessionCount"));
			dataItem.setActiveSessionCount(_ctx.integerValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].ActiveSessionCount"));
			dataItem.setIdleSessionCount(_ctx.integerValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].IdleSessionCount"));
			dataItem.setObVersion(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].ObVersion"));

			SessionStatistics sessionStatistics = new SessionStatistics();

			List<UserStatisticsItem> userStatistics = new ArrayList<UserStatisticsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.UserStatistics.Length"); j++) {
				UserStatisticsItem userStatisticsItem = new UserStatisticsItem();
				userStatisticsItem.setMetricValue(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.UserStatistics["+ j +"].MetricValue"));
				userStatisticsItem.setActiveCount(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.UserStatistics["+ j +"].ActiveCount"));
				userStatisticsItem.setTotalCount(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.UserStatistics["+ j +"].TotalCount"));
				userStatisticsItem.setType(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.UserStatistics["+ j +"].Type"));

				userStatistics.add(userStatisticsItem);
			}
			sessionStatistics.setUserStatistics(userStatistics);

			List<SourceStatisticsItem> sourceStatistics = new ArrayList<SourceStatisticsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.SourceStatistics.Length"); j++) {
				SourceStatisticsItem sourceStatisticsItem = new SourceStatisticsItem();
				sourceStatisticsItem.setMetricValue(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.SourceStatistics["+ j +"].MetricValue"));
				sourceStatisticsItem.setActiveCount(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.SourceStatistics["+ j +"].ActiveCount"));
				sourceStatisticsItem.setTotalCount(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.SourceStatistics["+ j +"].TotalCount"));
				sourceStatisticsItem.setType(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.SourceStatistics["+ j +"].Type"));

				sourceStatistics.add(sourceStatisticsItem);
			}
			sessionStatistics.setSourceStatistics(sourceStatistics);

			List<DataBaseStatisticsItem> dataBaseStatistics = new ArrayList<DataBaseStatisticsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.DataBaseStatistics.Length"); j++) {
				DataBaseStatisticsItem dataBaseStatisticsItem = new DataBaseStatisticsItem();
				dataBaseStatisticsItem.setMetricValue(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.DataBaseStatistics["+ j +"].MetricValue"));
				dataBaseStatisticsItem.setActiveCount(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.DataBaseStatistics["+ j +"].ActiveCount"));
				dataBaseStatisticsItem.setTotalCount(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.DataBaseStatistics["+ j +"].TotalCount"));
				dataBaseStatisticsItem.setType(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].SessionStatistics.DataBaseStatistics["+ j +"].Type"));

				dataBaseStatistics.add(dataBaseStatisticsItem);
			}
			sessionStatistics.setDataBaseStatistics(dataBaseStatistics);
			dataItem.setSessionStatistics(sessionStatistics);

			List<AllProcessListItem> allProcessList = new ArrayList<AllProcessListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList.Length"); j++) {
				AllProcessListItem allProcessListItem = new AllProcessListItem();
				allProcessListItem.setSqlText(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].SqlText"));
				allProcessListItem.setTenantId(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].TenantId"));
				allProcessListItem.setDatabase(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].Database"));
				allProcessListItem.setUser(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].User"));
				allProcessListItem.setExecuteTime(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].ExecuteTime"));
				allProcessListItem.setCpuTime(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].CpuTime"));
				allProcessListItem.setServerIp(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].ServerIp"));
				allProcessListItem.setClientIp(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].ClientIp"));
				allProcessListItem.setSessionId(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].SessionId"));
				allProcessListItem.setProxySessId(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].ProxySessId"));
				allProcessListItem.setCommand(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].Command"));
				allProcessListItem.setStatus(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].Status"));
				allProcessListItem.setSqlId(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].SqlId"));
				allProcessListItem.setTraceId(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].TraceId"));
				allProcessListItem.setPlanId(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data["+ i +"].AllProcessList["+ j +"].PlanId"));

				allProcessList.add(allProcessListItem);
			}
			dataItem.setAllProcessList(allProcessList);

			data.add(dataItem);
		}
		describeProcessStatsCompositionResponse.setData(data);
	 
	 	return describeProcessStatsCompositionResponse;
	}
}