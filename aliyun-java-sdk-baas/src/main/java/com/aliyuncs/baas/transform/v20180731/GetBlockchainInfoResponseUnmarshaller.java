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

import com.aliyuncs.baas.model.v20180731.GetBlockchainInfoResponse;
import com.aliyuncs.baas.model.v20180731.GetBlockchainInfoResponse.Result;
import com.aliyuncs.baas.model.v20180731.GetBlockchainInfoResponse.Result.NodeInfoListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBlockchainInfoResponseUnmarshaller {

	public static GetBlockchainInfoResponse unmarshall(GetBlockchainInfoResponse getBlockchainInfoResponse, UnmarshallerContext context) {
		
		getBlockchainInfoResponse.setRequestId(context.stringValue("GetBlockchainInfoResponse.RequestId"));

		Result result = new Result();
		result.setBizid(context.stringValue("GetBlockchainInfoResponse.Result.Bizid"));
		result.setNodeNumber(context.integerValue("GetBlockchainInfoResponse.Result.NodeNumber"));
		result.setBlockHeight(context.integerValue("GetBlockchainInfoResponse.Result.BlockHeight"));
		result.setTransactionSum(context.integerValue("GetBlockchainInfoResponse.Result.TransactionSum"));
		result.setCreateTime(context.longValue("GetBlockchainInfoResponse.Result.CreateTime"));
		result.setAbnormalNodes(context.integerValue("GetBlockchainInfoResponse.Result.AbnormalNodes"));
		result.setVersion(context.stringValue("GetBlockchainInfoResponse.Result.Version"));
		result.setIsRole(context.booleanValue("GetBlockchainInfoResponse.Result.IsRole"));
		result.setNormal(context.booleanValue("GetBlockchainInfoResponse.Result.Normal"));

		List<NodeInfoListItem> nodeInfoList = new ArrayList<NodeInfoListItem>();
		for (int i = 0; i < context.lengthValue("GetBlockchainInfoResponse.Result.NodeInfoList.Length"); i++) {
			NodeInfoListItem nodeInfoListItem = new NodeInfoListItem();
			nodeInfoListItem.setNodeName(context.stringValue("GetBlockchainInfoResponse.Result.NodeInfoList["+ i +"].NodeName"));
			nodeInfoListItem.setStatus(context.booleanValue("GetBlockchainInfoResponse.Result.NodeInfoList["+ i +"].Status"));
			nodeInfoListItem.setVersion(context.stringValue("GetBlockchainInfoResponse.Result.NodeInfoList["+ i +"].Version"));
			nodeInfoListItem.setBlockHeight(context.longValue("GetBlockchainInfoResponse.Result.NodeInfoList["+ i +"].BlockHeight"));

			nodeInfoList.add(nodeInfoListItem);
		}
		result.setNodeInfoList(nodeInfoList);
		getBlockchainInfoResponse.setResult(result);
	 
	 	return getBlockchainInfoResponse;
	}
}