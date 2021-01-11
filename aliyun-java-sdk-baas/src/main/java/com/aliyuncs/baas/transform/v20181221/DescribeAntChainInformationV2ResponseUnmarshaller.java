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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainInformationV2Response;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainInformationV2Response.Result;
import com.aliyuncs.baas.model.v20181221.DescribeAntChainInformationV2Response.Result.NodeInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainInformationV2ResponseUnmarshaller {

	public static DescribeAntChainInformationV2Response unmarshall(DescribeAntChainInformationV2Response describeAntChainInformationV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainInformationV2Response.setRequestId(_ctx.stringValue("DescribeAntChainInformationV2Response.RequestId"));
		describeAntChainInformationV2Response.setResultCode(_ctx.stringValue("DescribeAntChainInformationV2Response.ResultCode"));
		describeAntChainInformationV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainInformationV2Response.ResultMessage"));
		describeAntChainInformationV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainInformationV2Response.Success"));
		describeAntChainInformationV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainInformationV2Response.HttpStatusCode"));
		describeAntChainInformationV2Response.setCode(_ctx.stringValue("DescribeAntChainInformationV2Response.Code"));
		describeAntChainInformationV2Response.setMessage(_ctx.stringValue("DescribeAntChainInformationV2Response.Message"));

		Result result = new Result();
		result.setNodeNumber(_ctx.integerValue("DescribeAntChainInformationV2Response.Result.NodeNumber"));
		result.setBlockHeight(_ctx.integerValue("DescribeAntChainInformationV2Response.Result.BlockHeight"));
		result.setTransactionSum(_ctx.integerValue("DescribeAntChainInformationV2Response.Result.TransactionSum"));
		result.setCreateTime(_ctx.longValue("DescribeAntChainInformationV2Response.Result.CreateTime"));
		result.setAbnormalNodes(_ctx.integerValue("DescribeAntChainInformationV2Response.Result.AbnormalNodes"));
		result.setVersion(_ctx.stringValue("DescribeAntChainInformationV2Response.Result.Version"));
		result.setIsRole(_ctx.booleanValue("DescribeAntChainInformationV2Response.Result.IsRole"));
		result.setNormal(_ctx.booleanValue("DescribeAntChainInformationV2Response.Result.Normal"));
		result.setAntChainId(_ctx.stringValue("DescribeAntChainInformationV2Response.Result.AntChainId"));

		List<NodeInfosItem> nodeInfos = new ArrayList<NodeInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainInformationV2Response.Result.NodeInfos.Length"); i++) {
			NodeInfosItem nodeInfosItem = new NodeInfosItem();
			nodeInfosItem.setNodeName(_ctx.stringValue("DescribeAntChainInformationV2Response.Result.NodeInfos["+ i +"].NodeName"));
			nodeInfosItem.setStatus(_ctx.booleanValue("DescribeAntChainInformationV2Response.Result.NodeInfos["+ i +"].Status"));
			nodeInfosItem.setVersion(_ctx.stringValue("DescribeAntChainInformationV2Response.Result.NodeInfos["+ i +"].Version"));
			nodeInfosItem.setBlockHeight(_ctx.longValue("DescribeAntChainInformationV2Response.Result.NodeInfos["+ i +"].BlockHeight"));

			nodeInfos.add(nodeInfosItem);
		}
		result.setNodeInfos(nodeInfos);
		describeAntChainInformationV2Response.setResult(result);
	 
	 	return describeAntChainInformationV2Response;
	}
}