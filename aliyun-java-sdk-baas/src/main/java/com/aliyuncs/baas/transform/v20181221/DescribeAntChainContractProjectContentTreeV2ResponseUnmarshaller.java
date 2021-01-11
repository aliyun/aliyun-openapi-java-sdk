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

import com.aliyuncs.baas.model.v20181221.DescribeAntChainContractProjectContentTreeV2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntChainContractProjectContentTreeV2ResponseUnmarshaller {

	public static DescribeAntChainContractProjectContentTreeV2Response unmarshall(DescribeAntChainContractProjectContentTreeV2Response describeAntChainContractProjectContentTreeV2Response, UnmarshallerContext _ctx) {
		
		describeAntChainContractProjectContentTreeV2Response.setRequestId(_ctx.stringValue("DescribeAntChainContractProjectContentTreeV2Response.RequestId"));
		describeAntChainContractProjectContentTreeV2Response.setResult(_ctx.stringValue("DescribeAntChainContractProjectContentTreeV2Response.Result"));
		describeAntChainContractProjectContentTreeV2Response.setResultCode(_ctx.stringValue("DescribeAntChainContractProjectContentTreeV2Response.ResultCode"));
		describeAntChainContractProjectContentTreeV2Response.setResultMessage(_ctx.stringValue("DescribeAntChainContractProjectContentTreeV2Response.ResultMessage"));
		describeAntChainContractProjectContentTreeV2Response.setSuccess(_ctx.booleanValue("DescribeAntChainContractProjectContentTreeV2Response.Success"));
		describeAntChainContractProjectContentTreeV2Response.setHttpStatusCode(_ctx.stringValue("DescribeAntChainContractProjectContentTreeV2Response.HttpStatusCode"));
		describeAntChainContractProjectContentTreeV2Response.setCode(_ctx.stringValue("DescribeAntChainContractProjectContentTreeV2Response.Code"));
		describeAntChainContractProjectContentTreeV2Response.setMessage(_ctx.stringValue("DescribeAntChainContractProjectContentTreeV2Response.Message"));
	 
	 	return describeAntChainContractProjectContentTreeV2Response;
	}
}