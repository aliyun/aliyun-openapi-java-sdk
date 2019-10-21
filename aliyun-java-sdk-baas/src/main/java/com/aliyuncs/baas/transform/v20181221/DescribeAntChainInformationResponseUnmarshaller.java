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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainInformationResponse;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainInformationResponse.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainInformationResponse.Result.NodeInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainInformationResponseUnmarshaller {

	public static DescribeAntChainInformationResponse unmarshall(DescribeAntChainInformationResponse describeAntChainInformationResponse, UnmarshallerContext _ctx) {
		
		describeAntChainInformationResponse.setRequestId(_ctx.stringValue("DescribeAntChainInformationResponse.RequestId"));

		Result result = new Result();
		result.setNodeNumber(_ctx.integerValue("DescribeAntChainInformationResponse.Result.NodeNumber"));
		result.setBlockHeight(_ctx.integerValue("DescribeAntChainInformationResponse.Result.BlockHeight"));
		result.setTransactionSum(_ctx.integerValue("DescribeAntChainInformationResponse.Result.TransactionSum"));
		result.setCreateTime(_ctx.longValue("DescribeAntChainInformationResponse.Result.CreateTime"));
		result.setAbnormalNodes(_ctx.integerValue("DescribeAntChainInformationResponse.Result.AbnormalNodes"));
		result.setVersion(_ctx.stringValue("DescribeAntChainInformationResponse.Result.Version"));
		result.setNormal(_ctx.booleanValue("DescribeAntChainInformationResponse.Result.Normal"));
		result.setAntChainId(_ctx.stringValue("DescribeAntChainInformationResponse.Result.AntChainId"));

		List<NodeInfosItem> nodeInfos = new ArrayList<NodeInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainInformationResponse.Result.NodeInfos.Length"); i++) {
			NodeInfosItem nodeInfosItem = new NodeInfosItem();
			nodeInfosItem.setNodeName(_ctx.stringValue("DescribeAntChainInformationResponse.Result.NodeInfos["+ i +"].NodeName"));
			nodeInfosItem.setStatus(_ctx.booleanValue("DescribeAntChainInformationResponse.Result.NodeInfos["+ i +"].Status"));
			nodeInfosItem.setVersion(_ctx.stringValue("DescribeAntChainInformationResponse.Result.NodeInfos["+ i +"].Version"));
			nodeInfosItem.setBlockHeight(_ctx.longValue("DescribeAntChainInformationResponse.Result.NodeInfos["+ i +"].BlockHeight"));

			nodeInfos.add(nodeInfosItem);
		}
		result.setNodeInfos(nodeInfos);
		describeAntChainInformationResponse.setResult(result);
	 
	 	return describeAntChainInformationResponse;
	}
}