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

import com.aliyuncs.baas.model.v20180731.DescribeBlockchainInfoResponse;
import com.aliyuncs.baas.model.v20180731.DescribeBlockchainInfoResponse.Result;
import com.aliyuncs.baas.model.v20180731.DescribeBlockchainInfoResponse.Result.NodeInfoListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBlockchainInfoResponseUnmarshaller {

	public static DescribeBlockchainInfoResponse unmarshall(DescribeBlockchainInfoResponse describeBlockchainInfoResponse, UnmarshallerContext context) {
		
		describeBlockchainInfoResponse.setRequestId(context.stringValue("DescribeBlockchainInfoResponse.RequestId"));

		Result result = new Result();
		result.setBizid(context.stringValue("DescribeBlockchainInfoResponse.Result.Bizid"));
		result.setNodeNumber(context.integerValue("DescribeBlockchainInfoResponse.Result.NodeNumber"));
		result.setBlockHeight(context.integerValue("DescribeBlockchainInfoResponse.Result.BlockHeight"));
		result.setTransactionSum(context.integerValue("DescribeBlockchainInfoResponse.Result.TransactionSum"));
		result.setCreateTime(context.longValue("DescribeBlockchainInfoResponse.Result.CreateTime"));
		result.setAbnormalNodes(context.integerValue("DescribeBlockchainInfoResponse.Result.AbnormalNodes"));
		result.setVersion(context.stringValue("DescribeBlockchainInfoResponse.Result.Version"));
		result.setIsRole(context.booleanValue("DescribeBlockchainInfoResponse.Result.IsRole"));
		result.setNormal(context.booleanValue("DescribeBlockchainInfoResponse.Result.Normal"));

		List<NodeInfoListItem> nodeInfoList = new ArrayList<NodeInfoListItem>();
		for (int i = 0; i < context.lengthValue("DescribeBlockchainInfoResponse.Result.NodeInfoList.Length"); i++) {
			NodeInfoListItem nodeInfoListItem = new NodeInfoListItem();
			nodeInfoListItem.setNodeName(context.stringValue("DescribeBlockchainInfoResponse.Result.NodeInfoList["+ i +"].NodeName"));
			nodeInfoListItem.setStatus(context.booleanValue("DescribeBlockchainInfoResponse.Result.NodeInfoList["+ i +"].Status"));
			nodeInfoListItem.setVersion(context.stringValue("DescribeBlockchainInfoResponse.Result.NodeInfoList["+ i +"].Version"));
			nodeInfoListItem.setBlockHeight(context.longValue("DescribeBlockchainInfoResponse.Result.NodeInfoList["+ i +"].BlockHeight"));

			nodeInfoList.add(nodeInfoListItem);
		}
		result.setNodeInfoList(nodeInfoList);
		describeBlockchainInfoResponse.setResult(result);
	 
	 	return describeBlockchainInfoResponse;
	}
}