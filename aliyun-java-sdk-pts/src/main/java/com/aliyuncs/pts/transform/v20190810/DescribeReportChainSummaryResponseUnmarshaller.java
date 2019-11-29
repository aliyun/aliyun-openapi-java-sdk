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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.DescribeReportChainSummaryResponse;
import com.aliyuncs.pts.model.v20190810.DescribeReportChainSummaryResponse.Chain;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReportChainSummaryResponseUnmarshaller {

	public static DescribeReportChainSummaryResponse unmarshall(DescribeReportChainSummaryResponse describeReportChainSummaryResponse, UnmarshallerContext _ctx) {
		
		describeReportChainSummaryResponse.setRequestId(_ctx.stringValue("DescribeReportChainSummaryResponse.RequestId"));
		describeReportChainSummaryResponse.setMessage(_ctx.stringValue("DescribeReportChainSummaryResponse.Message"));
		describeReportChainSummaryResponse.setHttpStatusCode(_ctx.integerValue("DescribeReportChainSummaryResponse.HttpStatusCode"));
		describeReportChainSummaryResponse.setCode(_ctx.stringValue("DescribeReportChainSummaryResponse.Code"));
		describeReportChainSummaryResponse.setSuccess(_ctx.booleanValue("DescribeReportChainSummaryResponse.Success"));

		List<Chain> chainSummary = new ArrayList<Chain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReportChainSummaryResponse.ChainSummary.Length"); i++) {
			Chain chain = new Chain();
			chain.setChainId(_ctx.longValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].ChainId"));
			chain.setAverageTps(_ctx.floatValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].AverageTps"));
			chain.setSucceedRequestRate(_ctx.floatValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].SucceedRequestRate"));
			chain.setHasCheckPoint(_ctx.booleanValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].HasCheckPoint"));
			chain.setChainName(_ctx.stringValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].ChainName"));
			chain.setTotalRequest(_ctx.longValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].TotalRequest"));
			chain.setCount5XX(_ctx.longValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].Count5XX"));
			chain.setRelationName(_ctx.stringValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].RelationName"));
			chain.setCount4XX(_ctx.longValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].Count4XX"));
			chain.setCountTimeout(_ctx.longValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].CountTimeout"));
			chain.setSeg75Rt(_ctx.longValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].Seg75Rt"));
			chain.setFailedBusinessCount(_ctx.longValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].FailedBusinessCount"));
			chain.setFailedRequestCount(_ctx.longValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].FailedRequestCount"));
			chain.setSeg90Rt(_ctx.longValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].Seg90Rt"));
			chain.setMaxRt(_ctx.integerValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].MaxRt"));
			chain.setMinRt(_ctx.integerValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].MinRt"));
			chain.setCount3XX(_ctx.longValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].Count3XX"));
			chain.setAverageRt(_ctx.floatValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].AverageRt"));
			chain.setRelationId(_ctx.longValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].RelationId"));
			chain.setSucceedBusinessRate(_ctx.floatValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].SucceedBusinessRate"));
			chain.setSeg50Rt(_ctx.integerValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].Seg50Rt"));
			chain.setSeg99Rt(_ctx.integerValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].Seg99Rt"));
			chain.setAverageConcurrency(_ctx.floatValue("DescribeReportChainSummaryResponse.ChainSummary["+ i +"].AverageConcurrency"));

			chainSummary.add(chain);
		}
		describeReportChainSummaryResponse.setChainSummary(chainSummary);
	 
	 	return describeReportChainSummaryResponse;
	}
}