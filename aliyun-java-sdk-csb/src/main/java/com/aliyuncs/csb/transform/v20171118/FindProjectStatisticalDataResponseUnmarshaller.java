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

package com.aliyuncs.csb.transform.v20171118;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csb.model.v20171118.FindProjectStatisticalDataResponse;
import com.aliyuncs.csb.model.v20171118.FindProjectStatisticalDataResponse.Data;
import com.aliyuncs.csb.model.v20171118.FindProjectStatisticalDataResponse.Data.ServiceStatisticData;
import com.aliyuncs.csb.model.v20171118.FindProjectStatisticalDataResponse.Data.ServiceStatisticData.ProjectInfoData;
import com.aliyuncs.csb.model.v20171118.FindProjectStatisticalDataResponse.Data.ServiceStatisticData.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindProjectStatisticalDataResponseUnmarshaller {

	public static FindProjectStatisticalDataResponse unmarshall(FindProjectStatisticalDataResponse findProjectStatisticalDataResponse, UnmarshallerContext _ctx) {
		
		findProjectStatisticalDataResponse.setRequestId(_ctx.stringValue("FindProjectStatisticalDataResponse.RequestId"));
		findProjectStatisticalDataResponse.setCode(_ctx.integerValue("FindProjectStatisticalDataResponse.Code"));
		findProjectStatisticalDataResponse.setMessage(_ctx.stringValue("FindProjectStatisticalDataResponse.Message"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("FindProjectStatisticalDataResponse.Data.CurrentPage"));
		data.setPageNumber(_ctx.integerValue("FindProjectStatisticalDataResponse.Data.PageNumber"));
		data.setTotal(_ctx.longValue("FindProjectStatisticalDataResponse.Data.Total"));

		List<ServiceStatisticData> monitorStatisticData = new ArrayList<ServiceStatisticData>();
		for (int i = 0; i < _ctx.lengthValue("FindProjectStatisticalDataResponse.Data.MonitorStatisticData.Length"); i++) {
			ServiceStatisticData serviceStatisticData = new ServiceStatisticData();
			serviceStatisticData.setAvgRt(_ctx.floatValue("FindProjectStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].AvgRt"));
			serviceStatisticData.setMaxRt(_ctx.floatValue("FindProjectStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].MaxRt"));
			serviceStatisticData.setMinRt(_ctx.floatValue("FindProjectStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].MinRt"));

			Total total = new Total();
			total.setTotal(_ctx.longValue("FindProjectStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].Total.Total"));
			total.setErrorNum(_ctx.longValue("FindProjectStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].Total.ErrorNum"));
			serviceStatisticData.setTotal(total);

			ProjectInfoData projectInfoData = new ProjectInfoData();
			projectInfoData.setProjectName(_ctx.stringValue("FindProjectStatisticalDataResponse.Data.MonitorStatisticData["+ i +"].ProjectInfoData.ProjectName"));
			serviceStatisticData.setProjectInfoData(projectInfoData);

			monitorStatisticData.add(serviceStatisticData);
		}
		data.setMonitorStatisticData(monitorStatisticData);
		findProjectStatisticalDataResponse.setData(data);
	 
	 	return findProjectStatisticalDataResponse;
	}
}