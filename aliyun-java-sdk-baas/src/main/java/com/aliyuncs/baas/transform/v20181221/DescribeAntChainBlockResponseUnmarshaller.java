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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainBlockResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainBlockResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainBlockResponseUnmarshaller {

	public static DescribeAntChainBlockResponse unmarshall(DescribeAntChainBlockResponse describeAntChainBlockResponse, UnmarshallerContext _ctx) {
		
		describeAntChainBlockResponse.setRequestId(_ctx.stringValue("DescribeAntChainBlockResponse.RequestId"));

		Result result = new Result();
		result.setBlockHash(_ctx.stringValue("DescribeAntChainBlockResponse.Result.BlockHash"));
		result.setRootTxHash(_ctx.stringValue("DescribeAntChainBlockResponse.Result.RootTxHash"));
		result.setHeight(_ctx.integerValue("DescribeAntChainBlockResponse.Result.Height"));
		result.setPreviousHash(_ctx.stringValue("DescribeAntChainBlockResponse.Result.PreviousHash"));
		result.setCreateTime(_ctx.longValue("DescribeAntChainBlockResponse.Result.CreateTime"));
		result.setTransactionSize(_ctx.integerValue("DescribeAntChainBlockResponse.Result.TransactionSize"));
		result.setTransSummaryList(_ctx.stringValue("DescribeAntChainBlockResponse.Result.TransSummaryList"));
		result.setVersion(_ctx.longValue("DescribeAntChainBlockResponse.Result.Version"));
		result.setAntChainId(_ctx.stringValue("DescribeAntChainBlockResponse.Result.AntChainId"));
		describeAntChainBlockResponse.setResult(result);
	 
	 	return describeAntChainBlockResponse;
	}
}