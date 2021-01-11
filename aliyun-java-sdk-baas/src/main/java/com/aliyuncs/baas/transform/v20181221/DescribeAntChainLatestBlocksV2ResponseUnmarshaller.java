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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainLatestBlocksV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainLatestBlocksV2Response.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainLatestBlocksV2ResponseUnmarshaller {

	public static DescribeAntChainLatestBlocksV2Response unmarshall(DescribeAntChainLatestBlocksV2Response describeAntChainLatestBlocksV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainLatestBlocksV2Response.setRequestId(_ctx.stringValue("DescribeAntChainLatestBlocksV2Response.RequestId"));
		describeAntChainLatestBlocksV2Response.setResultCode(_ctx.stringValue("DescribeAntChainLatestBlocksV2Response.ResultCode"));
		describeAntChainLatestBlocksV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainLatestBlocksV2Response.ResultMessage"));
		describeAntChainLatestBlocksV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainLatestBlocksV2Response.Success"));
		describeAntChainLatestBlocksV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainLatestBlocksV2Response.HttpStatusCode"));
		describeAntChainLatestBlocksV2Response.setCode(_ctx.stringValue("DescribeAntChainLatestBlocksV2Response.Code"));
		describeAntChainLatestBlocksV2Response.setMessage(_ctx.stringValue("DescribeAntChainLatestBlocksV2Response.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainLatestBlocksV2Response.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAlias(_ctx.stringValue("DescribeAntChainLatestBlocksV2Response.Result["+ i +"].Alias"));
			resultItem.setBizData(_ctx.stringValue("DescribeAntChainLatestBlocksV2Response.Result["+ i +"].BizData"));
			resultItem.setBlockHash(_ctx.stringValue("DescribeAntChainLatestBlocksV2Response.Result["+ i +"].BlockHash"));
			resultItem.setCreateTime(_ctx.longValue("DescribeAntChainLatestBlocksV2Response.Result["+ i +"].CreateTime"));
			resultItem.setHeight(_ctx.longValue("DescribeAntChainLatestBlocksV2Response.Result["+ i +"].Height"));
			resultItem.setPreviousHash(_ctx.stringValue("DescribeAntChainLatestBlocksV2Response.Result["+ i +"].PreviousHash"));
			resultItem.setRootTxHash(_ctx.stringValue("DescribeAntChainLatestBlocksV2Response.Result["+ i +"].RootTxHash"));
			resultItem.setSize(_ctx.longValue("DescribeAntChainLatestBlocksV2Response.Result["+ i +"].Size"));
			resultItem.setTransactionSize(_ctx.longValue("DescribeAntChainLatestBlocksV2Response.Result["+ i +"].TransactionSize"));
			resultItem.setVersion(_ctx.longValue("DescribeAntChainLatestBlocksV2Response.Result["+ i +"].Version"));

			result.add(resultItem);
		}
		describeAntChainLatestBlocksV2Response.setResult(result);
	 
	 	return describeAntChainLatestBlocksV2Response;
	}
}