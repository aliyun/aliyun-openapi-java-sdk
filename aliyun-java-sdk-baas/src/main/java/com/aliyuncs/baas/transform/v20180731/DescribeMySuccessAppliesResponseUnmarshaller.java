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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.DescribeMySuccessAppliesResponse;
import com.aliyuncs.baas.model.v20180731.DescribeMySuccessAppliesResponse.ResultItem;
import com.aliyuncs.baas.model.v20180731.DescribeMySuccessAppliesResponse.ResultItem.NodeInfoListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMySuccessAppliesResponseUnmarshaller {

	public static DescribeMySuccessAppliesResponse unmarshall(DescribeMySuccessAppliesResponse describeMySuccessAppliesResponse, UnmarshallerContext context) {
		
		describeMySuccessAppliesResponse.setRequestId(context.stringValue("DescribeMySuccessAppliesResponse.RequestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DescribeMySuccessAppliesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBizid(context.stringValue("DescribeMySuccessAppliesResponse.Result["+ i +"].Bizid"));
			resultItem.setNodeNumber(context.integerValue("DescribeMySuccessAppliesResponse.Result["+ i +"].NodeNumber"));
			resultItem.setBlockHeight(context.integerValue("DescribeMySuccessAppliesResponse.Result["+ i +"].BlockHeight"));
			resultItem.setTransactionSum(context.integerValue("DescribeMySuccessAppliesResponse.Result["+ i +"].TransactionSum"));
			resultItem.setCreateTime(context.longValue("DescribeMySuccessAppliesResponse.Result["+ i +"].CreateTime"));
			resultItem.setAbnormalNodes(context.integerValue("DescribeMySuccessAppliesResponse.Result["+ i +"].AbnormalNodes"));
			resultItem.setVersion(context.stringValue("DescribeMySuccessAppliesResponse.Result["+ i +"].Version"));
			resultItem.setIsRole(context.booleanValue("DescribeMySuccessAppliesResponse.Result["+ i +"].IsRole"));
			resultItem.setNormal(context.booleanValue("DescribeMySuccessAppliesResponse.Result["+ i +"].Normal"));
			resultItem.setName(context.stringValue("DescribeMySuccessAppliesResponse.Result["+ i +"].Name"));

			List<NodeInfoListItem> nodeInfoList = new ArrayList<NodeInfoListItem>();
			for (int j = 0; j < context.lengthValue("DescribeMySuccessAppliesResponse.Result["+ i +"].NodeInfoList.Length"); j++) {
				NodeInfoListItem nodeInfoListItem = new NodeInfoListItem();
				nodeInfoListItem.setNodeName(context.stringValue("DescribeMySuccessAppliesResponse.Result["+ i +"].NodeInfoList["+ j +"].NodeName"));
				nodeInfoListItem.setStatus(context.booleanValue("DescribeMySuccessAppliesResponse.Result["+ i +"].NodeInfoList["+ j +"].Status"));
				nodeInfoListItem.setVersion(context.stringValue("DescribeMySuccessAppliesResponse.Result["+ i +"].NodeInfoList["+ j +"].Version"));
				nodeInfoListItem.setBlockHeight(context.longValue("DescribeMySuccessAppliesResponse.Result["+ i +"].NodeInfoList["+ j +"].BlockHeight"));

				nodeInfoList.add(nodeInfoListItem);
			}
			resultItem.setNodeInfoList(nodeInfoList);

			result.add(resultItem);
		}
		describeMySuccessAppliesResponse.setResult(result);
	 
	 	return describeMySuccessAppliesResponse;
	}
}