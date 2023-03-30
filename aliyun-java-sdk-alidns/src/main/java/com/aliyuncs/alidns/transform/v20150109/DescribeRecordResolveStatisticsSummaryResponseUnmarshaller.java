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

import com.aliyuncs.alidns.model.v20150109.DescribeRecordResolveStatisticsSummaryResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeRecordResolveStatisticsSummaryResponse.Statistic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecordResolveStatisticsSummaryResponseUnmarshaller {

	public static DescribeRecordResolveStatisticsSummaryResponse unmarshall(DescribeRecordResolveStatisticsSummaryResponse describeRecordResolveStatisticsSummaryResponse, UnmarshallerContext _ctx) {
		
		describeRecordResolveStatisticsSummaryResponse.setRequestId(_ctx.stringValue("DescribeRecordResolveStatisticsSummaryResponse.RequestId"));
		describeRecordResolveStatisticsSummaryResponse.setPageSize(_ctx.integerValue("DescribeRecordResolveStatisticsSummaryResponse.PageSize"));
		describeRecordResolveStatisticsSummaryResponse.setPageNumber(_ctx.integerValue("DescribeRecordResolveStatisticsSummaryResponse.PageNumber"));
		describeRecordResolveStatisticsSummaryResponse.setTotalPages(_ctx.integerValue("DescribeRecordResolveStatisticsSummaryResponse.TotalPages"));
		describeRecordResolveStatisticsSummaryResponse.setTotalItems(_ctx.integerValue("DescribeRecordResolveStatisticsSummaryResponse.TotalItems"));

		List<Statistic> statistics = new ArrayList<Statistic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecordResolveStatisticsSummaryResponse.Statistics.Length"); i++) {
			Statistic statistic = new Statistic();
			statistic.setDomainName(_ctx.stringValue("DescribeRecordResolveStatisticsSummaryResponse.Statistics["+ i +"].DomainName"));
			statistic.setCount(_ctx.stringValue("DescribeRecordResolveStatisticsSummaryResponse.Statistics["+ i +"].Count"));
			statistic.setDomainType(_ctx.stringValue("DescribeRecordResolveStatisticsSummaryResponse.Statistics["+ i +"].DomainType"));

			statistics.add(statistic);
		}
		describeRecordResolveStatisticsSummaryResponse.setStatistics(statistics);
	 
	 	return describeRecordResolveStatisticsSummaryResponse;
	}
}