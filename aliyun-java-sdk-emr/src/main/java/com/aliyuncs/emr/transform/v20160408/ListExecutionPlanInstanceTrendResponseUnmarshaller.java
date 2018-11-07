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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListExecutionPlanInstanceTrendResponse;
import com.aliyuncs.emr.model.v20160408.ListExecutionPlanInstanceTrendResponse.Trend;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExecutionPlanInstanceTrendResponseUnmarshaller {

	public static ListExecutionPlanInstanceTrendResponse unmarshall(ListExecutionPlanInstanceTrendResponse listExecutionPlanInstanceTrendResponse, UnmarshallerContext context) {
		
		listExecutionPlanInstanceTrendResponse.setRequestId(context.stringValue("ListExecutionPlanInstanceTrendResponse.RequestId"));

		List<Trend> trends = new ArrayList<Trend>();
		for (int i = 0; i < context.lengthValue("ListExecutionPlanInstanceTrendResponse.Trends.Length"); i++) {
			Trend trend = new Trend();
			trend.setDay(context.stringValue("ListExecutionPlanInstanceTrendResponse.Trends["+ i +"].Day"));
			trend.setCount(context.integerValue("ListExecutionPlanInstanceTrendResponse.Trends["+ i +"].Count"));
			trend.setStatus(context.stringValue("ListExecutionPlanInstanceTrendResponse.Trends["+ i +"].Status"));

			trends.add(trend);
		}
		listExecutionPlanInstanceTrendResponse.setTrends(trends);
	 
	 	return listExecutionPlanInstanceTrendResponse;
	}
}