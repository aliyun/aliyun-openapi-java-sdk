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

package com.aliyuncs.baas.transform.v20181221;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20181221.DescribeAntChainTransactionStatisticsV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainTransactionStatisticsV2Response.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainTransactionStatisticsV2ResponseUnmarshaller {

	public static DescribeAntChainTransactionStatisticsV2Response unmarshall(DescribeAntChainTransactionStatisticsV2Response describeAntChainTransactionStatisticsV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainTransactionStatisticsV2Response.setRequestId(_ctx.stringValue("DescribeAntChainTransactionStatisticsV2Response.RequestId"));
		describeAntChainTransactionStatisticsV2Response.setResultCode(_ctx.stringValue("DescribeAntChainTransactionStatisticsV2Response.ResultCode"));
		describeAntChainTransactionStatisticsV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainTransactionStatisticsV2Response.ResultMessage"));
		describeAntChainTransactionStatisticsV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainTransactionStatisticsV2Response.Success"));
		describeAntChainTransactionStatisticsV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainTransactionStatisticsV2Response.HttpStatusCode"));
		describeAntChainTransactionStatisticsV2Response.setCode(_ctx.stringValue("DescribeAntChainTransactionStatisticsV2Response.Code"));
		describeAntChainTransactionStatisticsV2Response.setMessage(_ctx.stringValue("DescribeAntChainTransactionStatisticsV2Response.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainTransactionStatisticsV2Response.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAntChainId(_ctx.stringValue("DescribeAntChainTransactionStatisticsV2Response.Result["+ i +"].AntChainId"));
			resultItem.setDt(_ctx.longValue("DescribeAntChainTransactionStatisticsV2Response.Result["+ i +"].Dt"));
			resultItem.setTransCount(_ctx.longValue("DescribeAntChainTransactionStatisticsV2Response.Result["+ i +"].TransCount"));
			resultItem.setLastSumBlockHeight(_ctx.longValue("DescribeAntChainTransactionStatisticsV2Response.Result["+ i +"].LastSumBlockHeight"));
			resultItem.setCreatTime(_ctx.longValue("DescribeAntChainTransactionStatisticsV2Response.Result["+ i +"].CreatTime"));

			result.add(resultItem);
		}
		describeAntChainTransactionStatisticsV2Response.setResult(result);
	 
	 	return describeAntChainTransactionStatisticsV2Response;
	}
}