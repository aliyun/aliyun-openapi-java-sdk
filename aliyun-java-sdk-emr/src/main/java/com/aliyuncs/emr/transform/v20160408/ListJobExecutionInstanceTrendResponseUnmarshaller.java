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

import com.aliyuncs.emr.model.v20160408.ListJobExecutionInstanceTrendResponse;
import com.aliyuncs.emr.model.v20160408.ListJobExecutionInstanceTrendResponse.Trend;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobExecutionInstanceTrendResponseUnmarshaller {

	public static ListJobExecutionInstanceTrendResponse unmarshall(ListJobExecutionInstanceTrendResponse listJobExecutionInstanceTrendResponse, UnmarshallerContext context) {
		
		listJobExecutionInstanceTrendResponse.setRequestId(context.stringValue("ListJobExecutionInstanceTrendResponse.RequestId"));

		List<Trend> trends = new ArrayList<Trend>();
		for (int i = 0; i < context.lengthValue("ListJobExecutionInstanceTrendResponse.Trends.Length"); i++) {
			Trend trend = new Trend();
			trend.setDay(context.stringValue("ListJobExecutionInstanceTrendResponse.Trends["+ i +"].Day"));
			trend.setCount(context.integerValue("ListJobExecutionInstanceTrendResponse.Trends["+ i +"].Count"));
			trend.setStatus(context.stringValue("ListJobExecutionInstanceTrendResponse.Trends["+ i +"].Status"));

			trends.add(trend);
		}
		listJobExecutionInstanceTrendResponse.setTrends(trends);
	 
	 	return listJobExecutionInstanceTrendResponse;
	}
}