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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeRecordStatisticsSummaryResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeRecordStatisticsSummaryResponse.Statistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordStatisticsSummaryResponseUnmarshaller {

	public static DescribeRecordStatisticsSummaryResponse unmarshall(DescribeRecordStatisticsSummaryResponse describeRecordStatisticsSummaryResponse, UnmarshallerContext _ctx) {
		
		describeRecordStatisticsSummaryResponse.setRequestId(_ctx.stringValue("DescribeRecordStatisticsSummaryResponse.RequestId"));
		describeRecordStatisticsSummaryResponse.setTotalItems(_ctx.integerValue("DescribeRecordStatisticsSummaryResponse.TotalItems"));
		describeRecordStatisticsSummaryResponse.setTotalPages(_ctx.integerValue("DescribeRecordStatisticsSummaryResponse.TotalPages"));
		describeRecordStatisticsSummaryResponse.setPageSize(_ctx.integerValue("DescribeRecordStatisticsSummaryResponse.PageSize"));
		describeRecordStatisticsSummaryResponse.setPageNumber(_ctx.integerValue("DescribeRecordStatisticsSummaryResponse.PageNumber"));

		List<Statistic> statistics = new ArrayList<Statistic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecordStatisticsSummaryResponse.Statistics.Length"); i++) {
			Statistic statistic = new Statistic();
			statistic.setSubDomain(_ctx.stringValue("DescribeRecordStatisticsSummaryResponse.Statistics["+ i +"].SubDomain"));
			statistic.setCount(_ctx.longValue("DescribeRecordStatisticsSummaryResponse.Statistics["+ i +"].Count"));

			statistics.add(statistic);
		}
		describeRecordStatisticsSummaryResponse.setStatistics(statistics);
	 
	 	return describeRecordStatisticsSummaryResponse;
	}
}