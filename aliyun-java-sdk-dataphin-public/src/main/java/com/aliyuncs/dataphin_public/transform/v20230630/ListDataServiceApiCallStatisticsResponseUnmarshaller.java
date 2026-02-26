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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceApiCallStatisticsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceApiCallStatisticsResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceApiCallStatisticsResponse.PageResult.CallStatistics;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataServiceApiCallStatisticsResponseUnmarshaller {

	public static ListDataServiceApiCallStatisticsResponse unmarshall(ListDataServiceApiCallStatisticsResponse listDataServiceApiCallStatisticsResponse, UnmarshallerContext _ctx) {
		
		listDataServiceApiCallStatisticsResponse.setRequestId(_ctx.stringValue("ListDataServiceApiCallStatisticsResponse.RequestId"));
		listDataServiceApiCallStatisticsResponse.setSuccess(_ctx.booleanValue("ListDataServiceApiCallStatisticsResponse.Success"));
		listDataServiceApiCallStatisticsResponse.setHttpStatusCode(_ctx.integerValue("ListDataServiceApiCallStatisticsResponse.HttpStatusCode"));
		listDataServiceApiCallStatisticsResponse.setCode(_ctx.stringValue("ListDataServiceApiCallStatisticsResponse.Code"));
		listDataServiceApiCallStatisticsResponse.setMessage(_ctx.stringValue("ListDataServiceApiCallStatisticsResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.integerValue("ListDataServiceApiCallStatisticsResponse.PageResult.TotalCount"));

		List<CallStatistics> callStatisticsList = new ArrayList<CallStatistics>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList.Length"); i++) {
			CallStatistics callStatistics = new CallStatistics();
			callStatistics.setApiName(_ctx.stringValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].ApiName"));
			callStatistics.setProjectName(_ctx.stringValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].ProjectName"));
			callStatistics.setProjectId(_ctx.integerValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].ProjectId"));
			callStatistics.setCreator(_ctx.stringValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].Creator"));
			callStatistics.setErrorCount(_ctx.stringValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].ErrorCount"));
			callStatistics.setAuthorizedAppCount(_ctx.integerValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].AuthorizedAppCount"));
			callStatistics.setSqlId(_ctx.integerValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].SqlId"));
			callStatistics.setOfflineRate(_ctx.stringValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].OfflineRate"));
			callStatistics.setLastCallTime(_ctx.stringValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].LastCallTime"));
			callStatistics.setCallCount(_ctx.longValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].CallCount"));
			callStatistics.setAvgResponseTime(_ctx.doubleValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].AvgResponseTime"));
			callStatistics.setApiId(_ctx.longValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].ApiId"));
			callStatistics.setErrorRate(_ctx.stringValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].ErrorRate"));

			List<String> appNameList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].AppNameList.Length"); j++) {
				appNameList.add(_ctx.stringValue("ListDataServiceApiCallStatisticsResponse.PageResult.CallStatisticsList["+ i +"].AppNameList["+ j +"]"));
			}
			callStatistics.setAppNameList(appNameList);

			callStatisticsList.add(callStatistics);
		}
		pageResult.setCallStatisticsList(callStatisticsList);
		listDataServiceApiCallStatisticsResponse.setPageResult(pageResult);
	 
	 	return listDataServiceApiCallStatisticsResponse;
	}
}