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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAnomalySQLListResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeAnomalySQLListResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAnomalySQLListResponseUnmarshaller {

	public static DescribeAnomalySQLListResponse unmarshall(DescribeAnomalySQLListResponse describeAnomalySQLListResponse, UnmarshallerContext _ctx) {
		
		describeAnomalySQLListResponse.setRequestId(_ctx.stringValue("DescribeAnomalySQLListResponse.RequestId"));
		describeAnomalySQLListResponse.setTotalCount(_ctx.longValue("DescribeAnomalySQLListResponse.TotalCount"));

		List<Data> anomalySQLList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAnomalySQLListResponse.AnomalySQLList.Length"); i++) {
			Data data = new Data();
			data.setKey(_ctx.longValue("DescribeAnomalySQLListResponse.AnomalySQLList["+ i +"].Key"));
			data.setDiagnosisRule(_ctx.stringValue("DescribeAnomalySQLListResponse.AnomalySQLList["+ i +"].DiagnosisRule"));
			data.setSQLText(_ctx.stringValue("DescribeAnomalySQLListResponse.AnomalySQLList["+ i +"].SQLText"));
			data.setSuggestion(_ctx.stringValue("DescribeAnomalySQLListResponse.AnomalySQLList["+ i +"].Suggestion"));
			data.setDbName(_ctx.stringValue("DescribeAnomalySQLListResponse.AnomalySQLList["+ i +"].DbName"));
			data.setRequestTimeUTCString(_ctx.stringValue("DescribeAnomalySQLListResponse.AnomalySQLList["+ i +"].RequestTimeUTCString"));
			data.setCpuTime(_ctx.floatValue("DescribeAnomalySQLListResponse.AnomalySQLList["+ i +"].CpuTime"));
			data.setSQLId(_ctx.stringValue("DescribeAnomalySQLListResponse.AnomalySQLList["+ i +"].SQLId"));
			data.setDiagnosis(_ctx.stringValue("DescribeAnomalySQLListResponse.AnomalySQLList["+ i +"].Diagnosis"));
			data.setRequestTime(_ctx.floatValue("DescribeAnomalySQLListResponse.AnomalySQLList["+ i +"].RequestTime"));
			data.setExecutions(_ctx.longValue("DescribeAnomalySQLListResponse.AnomalySQLList["+ i +"].Executions"));
			data.setUserName(_ctx.stringValue("DescribeAnomalySQLListResponse.AnomalySQLList["+ i +"].UserName"));

			anomalySQLList.add(data);
		}
		describeAnomalySQLListResponse.setAnomalySQLList(anomalySQLList);
	 
	 	return describeAnomalySQLListResponse;
	}
}