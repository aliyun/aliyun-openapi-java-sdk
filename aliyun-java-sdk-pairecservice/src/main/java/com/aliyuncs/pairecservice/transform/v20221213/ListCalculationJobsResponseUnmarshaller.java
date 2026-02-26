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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.ListCalculationJobsResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListCalculationJobsResponse.CalculationJobsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCalculationJobsResponseUnmarshaller {

	public static ListCalculationJobsResponse unmarshall(ListCalculationJobsResponse listCalculationJobsResponse, UnmarshallerContext _ctx) {
		
		listCalculationJobsResponse.setRequestId(_ctx.stringValue("ListCalculationJobsResponse.RequestId"));
		listCalculationJobsResponse.setTotalCount(_ctx.longValue("ListCalculationJobsResponse.TotalCount"));

		List<CalculationJobsItem> calculationJobs = new ArrayList<CalculationJobsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCalculationJobsResponse.CalculationJobs.Length"); i++) {
			CalculationJobsItem calculationJobsItem = new CalculationJobsItem();
			calculationJobsItem.setCalculationJobId(_ctx.stringValue("ListCalculationJobsResponse.CalculationJobs["+ i +"].CalculationJobId"));
			calculationJobsItem.setABMetricName(_ctx.stringValue("ListCalculationJobsResponse.CalculationJobs["+ i +"].ABMetricName"));
			calculationJobsItem.setStatus(_ctx.stringValue("ListCalculationJobsResponse.CalculationJobs["+ i +"].Status"));
			calculationJobsItem.setConfig(_ctx.stringValue("ListCalculationJobsResponse.CalculationJobs["+ i +"].Config"));
			calculationJobsItem.setGmtRanTime(_ctx.stringValue("ListCalculationJobsResponse.CalculationJobs["+ i +"].GmtRanTime"));
			calculationJobsItem.setBizDate(_ctx.stringValue("ListCalculationJobsResponse.CalculationJobs["+ i +"].BizDate"));
			calculationJobsItem.setJobSource(_ctx.stringValue("ListCalculationJobsResponse.CalculationJobs["+ i +"].JobSource"));

			List<String> jobMessage = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListCalculationJobsResponse.CalculationJobs["+ i +"].JobMessage.Length"); j++) {
				jobMessage.add(_ctx.stringValue("ListCalculationJobsResponse.CalculationJobs["+ i +"].JobMessage["+ j +"]"));
			}
			calculationJobsItem.setJobMessage(jobMessage);

			calculationJobs.add(calculationJobsItem);
		}
		listCalculationJobsResponse.setCalculationJobs(calculationJobs);
	 
	 	return listCalculationJobsResponse;
	}
}