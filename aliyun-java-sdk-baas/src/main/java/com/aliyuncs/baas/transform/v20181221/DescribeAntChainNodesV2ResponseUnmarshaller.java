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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainNodesV2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainNodesV2ResponseUnmarshaller {

	public static DescribeAntChainNodesV2Response unmarshall(DescribeAntChainNodesV2Response describeAntChainNodesV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainNodesV2Response.setRequestId(_ctx.stringValue("DescribeAntChainNodesV2Response.RequestId"));
		describeAntChainNodesV2Response.setResultCode(_ctx.stringValue("DescribeAntChainNodesV2Response.ResultCode"));
		describeAntChainNodesV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainNodesV2Response.ResultMessage"));
		describeAntChainNodesV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainNodesV2Response.Success"));
		describeAntChainNodesV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainNodesV2Response.HttpStatusCode"));
		describeAntChainNodesV2Response.setCode(_ctx.stringValue("DescribeAntChainNodesV2Response.Code"));
		describeAntChainNodesV2Response.setMessage(_ctx.stringValue("DescribeAntChainNodesV2Response.Message"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntChainNodesV2Response.Result.Length"); i++) {
			result.add(_ctx.stringValue("DescribeAntChainNodesV2Response.Result["+ i +"]"));
		}
		describeAntChainNodesV2Response.setResult(result);
	 
	 	return describeAntChainNodesV2Response;
	}
}