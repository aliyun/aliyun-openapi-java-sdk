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
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProcessStatsCompositionResponse.Data;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProcessStatsCompositionResponse.Data.AllProcessListItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProcessStatsCompositionResponse.Data.SessionStatistics;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProcessStatsCompositionResponse.Data.SessionStatistics.DataBaseStatisticsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProcessStatsCompositionResponse.Data.SessionStatistics.SourceStatisticsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeProcessStatsCompositionResponse.Data.SessionStatistics.UserStatisticsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProcessStatsCompositionResponseUnmarshaller {

	public static DescribeProcessStatsCompositionResponse unmarshall(DescribeProcessStatsCompositionResponse describeProcessStatsCompositionResponse, UnmarshallerContext _ctx) {
		
		describeProcessStatsCompositionResponse.setRequestId(_ctx.stringValue("DescribeProcessStatsCompositionResponse.RequestId"));

		Data data = new Data();
		data.setTotalSessionCount(_ctx.integerValue("DescribeProcessStatsCompositionResponse.Data.TotalSessionCount"));
		data.setActiveSessionCount(_ctx.integerValue("DescribeProcessStatsCompositionResponse.Data.ActiveSessionCount"));
		data.setIdleSessionCount(_ctx.integerValue("DescribeProcessStatsCompositionResponse.Data.IdleSessionCount"));
		data.setObVersion(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.ObVersion"));

		SessionStatistics sessionStatistics = new SessionStatistics();

		List<UserStatisticsItem> userStatistics = new ArrayList<UserStatisticsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.UserStatistics.Length"); i++) {
			UserStatisticsItem userStatisticsItem = new UserStatisticsItem();
			userStatisticsItem.setMetricValue(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.UserStatistics["+ i +"].MetricValue"));
			userStatisticsItem.setActiveCount(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.UserStatistics["+ i +"].ActiveCount"));
			userStatisticsItem.setTotalCount(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.UserStatistics["+ i +"].TotalCount"));
			userStatisticsItem.setType(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.UserStatistics["+ i +"].Type"));

			userStatistics.add(userStatisticsItem);
		}
		sessionStatistics.setUserStatistics(userStatistics);

		List<SourceStatisticsItem> sourceStatistics = new ArrayList<SourceStatisticsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.SourceStatistics.Length"); i++) {
			SourceStatisticsItem sourceStatisticsItem = new SourceStatisticsItem();
			sourceStatisticsItem.setMetricValue(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.SourceStatistics["+ i +"].MetricValue"));
			sourceStatisticsItem.setActiveCount(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.SourceStatistics["+ i +"].ActiveCount"));
			sourceStatisticsItem.setTotalCount(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.SourceStatistics["+ i +"].TotalCount"));
			sourceStatisticsItem.setType(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.SourceStatistics["+ i +"].Type"));

			sourceStatistics.add(sourceStatisticsItem);
		}
		sessionStatistics.setSourceStatistics(sourceStatistics);

		List<DataBaseStatisticsItem> dataBaseStatistics = new ArrayList<DataBaseStatisticsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.DataBaseStatistics.Length"); i++) {
			DataBaseStatisticsItem dataBaseStatisticsItem = new DataBaseStatisticsItem();
			dataBaseStatisticsItem.setMetricValue(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.DataBaseStatistics["+ i +"].MetricValue"));
			dataBaseStatisticsItem.setActiveCount(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.DataBaseStatistics["+ i +"].ActiveCount"));
			dataBaseStatisticsItem.setTotalCount(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.DataBaseStatistics["+ i +"].TotalCount"));
			dataBaseStatisticsItem.setType(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.SessionStatistics.DataBaseStatistics["+ i +"].Type"));

			dataBaseStatistics.add(dataBaseStatisticsItem);
		}
		sessionStatistics.setDataBaseStatistics(dataBaseStatistics);
		data.setSessionStatistics(sessionStatistics);

		List<AllProcessListItem> allProcessList = new ArrayList<AllProcessListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList.Length"); i++) {
			AllProcessListItem allProcessListItem = new AllProcessListItem();
			allProcessListItem.setSqlText(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].SqlText"));
			allProcessListItem.setTenantId(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].TenantId"));
			allProcessListItem.setDatabase(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].Database"));
			allProcessListItem.setUser(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].User"));
			allProcessListItem.setExecuteTime(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].ExecuteTime"));
			allProcessListItem.setCpuTime(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].CpuTime"));
			allProcessListItem.setServerIp(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].ServerIp"));
			allProcessListItem.setClientIp(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].ClientIp"));
			allProcessListItem.setSessionId(_ctx.longValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].SessionId"));
			allProcessListItem.setProxySessId(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].ProxySessId"));
			allProcessListItem.setCommand(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].Command"));
			allProcessListItem.setStatus(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].Status"));
			allProcessListItem.setSqlId(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].SqlId"));
			allProcessListItem.setTraceId(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].TraceId"));
			allProcessListItem.setPlanId(_ctx.stringValue("DescribeProcessStatsCompositionResponse.Data.AllProcessList["+ i +"].PlanId"));

			allProcessList.add(allProcessListItem);
		}
		data.setAllProcessList(allProcessList);
		describeProcessStatsCompositionResponse.setData(data);
	 
	 	return describeProcessStatsCompositionResponse;
	}
}