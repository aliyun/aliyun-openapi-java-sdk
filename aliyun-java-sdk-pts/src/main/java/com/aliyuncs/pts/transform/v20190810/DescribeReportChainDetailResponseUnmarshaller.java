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

import com.aliyuncs.pts.model.v20190810.DescribeReportChainDetailResponse;
import com.aliyuncs.pts.model.v20190810.DescribeReportChainDetailResponse.Chain;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReportChainDetailResponseUnmarshaller {

	public static DescribeReportChainDetailResponse unmarshall(DescribeReportChainDetailResponse describeReportChainDetailResponse, UnmarshallerContext _ctx) {
		
		describeReportChainDetailResponse.setRequestId(_ctx.stringValue("DescribeReportChainDetailResponse.RequestId"));
		describeReportChainDetailResponse.setMessage(_ctx.stringValue("DescribeReportChainDetailResponse.Message"));
		describeReportChainDetailResponse.setHttpStatusCode(_ctx.integerValue("DescribeReportChainDetailResponse.HttpStatusCode"));
		describeReportChainDetailResponse.setSuccess(_ctx.booleanValue("DescribeReportChainDetailResponse.Success"));
		describeReportChainDetailResponse.setCode(_ctx.stringValue("DescribeReportChainDetailResponse.Code"));

		List<Chain> chainDetails = new ArrayList<Chain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReportChainDetailResponse.ChainDetails.Length"); i++) {
			Chain chain = new Chain();
			chain.setTotalFail(_ctx.longValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].TotalFail"));
			chain.setQpsFail(_ctx.floatValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].QpsFail"));
			chain.setTotal3XX(_ctx.longValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].Total3XX"));
			chain.setRealConcurrency(_ctx.floatValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].RealConcurrency"));
			chain.setTimePoint(_ctx.longValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].TimePoint"));
			chain.setMaxRt(_ctx.integerValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].MaxRt"));
			chain.setMinRt(_ctx.integerValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].MinRt"));
			chain.setTotalRequest(_ctx.longValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].TotalRequest"));
			chain.setQps2XX(_ctx.floatValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].Qps2XX"));
			chain.setTotal4XX(_ctx.longValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].Total4XX"));
			chain.setTotal5XX(_ctx.longValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].Total5XX"));
			chain.setQps4XX(_ctx.floatValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].Qps4XX"));
			chain.setRealQps(_ctx.floatValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].RealQps"));
			chain.setConfigQps(_ctx.integerValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].ConfigQps"));
			chain.setAverageRt(_ctx.integerValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].AverageRt"));
			chain.setBpsRequest(_ctx.longValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].BpsRequest"));
			chain.setChainId(_ctx.longValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].ChainId"));
			chain.setBpsResponse(_ctx.longValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].BpsResponse"));
			chain.setTotal2XX(_ctx.longValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].Total2XX"));
			chain.setQps5XX(_ctx.floatValue("DescribeReportChainDetailResponse.ChainDetails["+ i +"].Qps5XX"));

			chainDetails.add(chain);
		}
		describeReportChainDetailResponse.setChainDetails(chainDetails);
	 
	 	return describeReportChainDetailResponse;
	}
}