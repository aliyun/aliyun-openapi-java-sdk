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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.GetCheckRiskStatisticsResponse;
import com.aliyuncs.sas.model.v20181203.GetCheckRiskStatisticsResponse.DataItem;
import com.aliyuncs.sas.model.v20181203.GetCheckRiskStatisticsResponse.DataItem.SubStatistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCheckRiskStatisticsResponseUnmarshaller {

	public static GetCheckRiskStatisticsResponse unmarshall(GetCheckRiskStatisticsResponse getCheckRiskStatisticsResponse, UnmarshallerContext _ctx) {
		
		getCheckRiskStatisticsResponse.setRequestId(_ctx.stringValue("GetCheckRiskStatisticsResponse.RequestId"));
		getCheckRiskStatisticsResponse.setCount(_ctx.integerValue("GetCheckRiskStatisticsResponse.Count"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckRiskStatisticsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSceneName(_ctx.stringValue("GetCheckRiskStatisticsResponse.Data["+ i +"].SceneName"));
			dataItem.setLowWarningCount(_ctx.integerValue("GetCheckRiskStatisticsResponse.Data["+ i +"].LowWarningCount"));
			dataItem.setMediumWarningCount(_ctx.integerValue("GetCheckRiskStatisticsResponse.Data["+ i +"].MediumWarningCount"));
			dataItem.setHighWarningCount(_ctx.integerValue("GetCheckRiskStatisticsResponse.Data["+ i +"].HighWarningCount"));
			dataItem.setTotalCount(_ctx.integerValue("GetCheckRiskStatisticsResponse.Data["+ i +"].TotalCount"));
			dataItem.setPassCount(_ctx.integerValue("GetCheckRiskStatisticsResponse.Data["+ i +"].PassCount"));

			List<SubStatistic> subStatistics = new ArrayList<SubStatistic>();
			for (int j = 0; j < _ctx.lengthValue("GetCheckRiskStatisticsResponse.Data["+ i +"].SubStatistics.Length"); j++) {
				SubStatistic subStatistic = new SubStatistic();
				subStatistic.setTypeName(_ctx.stringValue("GetCheckRiskStatisticsResponse.Data["+ i +"].SubStatistics["+ j +"].TypeName"));
				subStatistic.setAlias(_ctx.stringValue("GetCheckRiskStatisticsResponse.Data["+ i +"].SubStatistics["+ j +"].Alias"));
				subStatistic.setLowWarningCount(_ctx.integerValue("GetCheckRiskStatisticsResponse.Data["+ i +"].SubStatistics["+ j +"].LowWarningCount"));
				subStatistic.setMediumWarningCount(_ctx.integerValue("GetCheckRiskStatisticsResponse.Data["+ i +"].SubStatistics["+ j +"].MediumWarningCount"));
				subStatistic.setHighWarningCount(_ctx.integerValue("GetCheckRiskStatisticsResponse.Data["+ i +"].SubStatistics["+ j +"].HighWarningCount"));
				subStatistic.setTotalCount(_ctx.integerValue("GetCheckRiskStatisticsResponse.Data["+ i +"].SubStatistics["+ j +"].TotalCount"));
				subStatistic.setPassCount(_ctx.integerValue("GetCheckRiskStatisticsResponse.Data["+ i +"].SubStatistics["+ j +"].PassCount"));

				subStatistics.add(subStatistic);
			}
			dataItem.setSubStatistics(subStatistics);

			data.add(dataItem);
		}
		getCheckRiskStatisticsResponse.setData(data);
	 
	 	return getCheckRiskStatisticsResponse;
	}
}