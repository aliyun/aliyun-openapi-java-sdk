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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainTransactionStatisticsResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainTransactionStatisticsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainTransactionStatisticsResponseUnmarshaller {

	public static DescribeAntChainTransactionStatisticsResponse unmarshall(DescribeAntChainTransactionStatisticsResponse describeAntChainTransactionStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeAntChainTransactionStatisticsResponse.setRequestId(_ctx.stringValue("DescribeAntChainTransactionStatisticsResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainTransactionStatisticsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAntChainId(_ctx.stringValue("DescribeAntChainTransactionStatisticsResponse.Result["+ i +"].AntChainId"));
			resultItem.setDt(_ctx.stringValue("DescribeAntChainTransactionStatisticsResponse.Result["+ i +"].Dt"));
			resultItem.setTransCount(_ctx.longValue("DescribeAntChainTransactionStatisticsResponse.Result["+ i +"].TransCount"));
			resultItem.setLastSumBlockHeight(_ctx.longValue("DescribeAntChainTransactionStatisticsResponse.Result["+ i +"].LastSumBlockHeight"));
			resultItem.setCreatTime(_ctx.longValue("DescribeAntChainTransactionStatisticsResponse.Result["+ i +"].CreatTime"));

			result.add(resultItem);
		}
		describeAntChainTransactionStatisticsResponse.setResult(result);
	 
	 	return describeAntChainTransactionStatisticsResponse;
	}
}