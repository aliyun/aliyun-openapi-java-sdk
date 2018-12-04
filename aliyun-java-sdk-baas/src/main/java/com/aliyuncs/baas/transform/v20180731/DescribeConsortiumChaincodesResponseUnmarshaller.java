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

import com.aliyuncs.baas.model.v20180731.DescribeConsortiumChaincodesResponse;
import com.aliyuncs.baas.model.v20180731.DescribeConsortiumChaincodesResponse.ChaincodeVO;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConsortiumChaincodesResponseUnmarshaller {

	public static DescribeConsortiumChaincodesResponse unmarshall(DescribeConsortiumChaincodesResponse describeConsortiumChaincodesResponse, UnmarshallerContext context) {
		
		describeConsortiumChaincodesResponse.setRequestId(context.stringValue("DescribeConsortiumChaincodesResponse.RequestId"));
		describeConsortiumChaincodesResponse.setSuccess(context.booleanValue("DescribeConsortiumChaincodesResponse.Success"));
		describeConsortiumChaincodesResponse.setErrorCode(context.integerValue("DescribeConsortiumChaincodesResponse.ErrorCode"));

		List<ChaincodeVO> result = new ArrayList<ChaincodeVO>();
		for (int i = 0; i < context.lengthValue("DescribeConsortiumChaincodesResponse.Result.Length"); i++) {
			ChaincodeVO chaincodeVO = new ChaincodeVO();
			chaincodeVO.setName(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].Name"));
			chaincodeVO.setVersion(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].Version"));
			chaincodeVO.setInput(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].Input"));
			chaincodeVO.setType(context.integerValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].Type"));
			chaincodeVO.setState(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].State"));
			chaincodeVO.setPath(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].Path"));
			chaincodeVO.setChaincodeId(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].ChaincodeId"));
			chaincodeVO.setInstall(context.booleanValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].Install"));
			chaincodeVO.setMessage(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].Message"));
			chaincodeVO.setCreateTime(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].CreateTime"));
			chaincodeVO.setDeployTime(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].DeployTime"));
			chaincodeVO.setChannelName(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].ChannelName"));
			chaincodeVO.setEndorsePolicy(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].EndorsePolicy"));
			chaincodeVO.setConsortiumId(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].ConsortiumId"));
			chaincodeVO.setProviderId(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].ProviderId"));
			chaincodeVO.setProviderName(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].ProviderName"));
			chaincodeVO.setChannelId(context.stringValue("DescribeConsortiumChaincodesResponse.Result["+ i +"].ChannelId"));

			result.add(chaincodeVO);
		}
		describeConsortiumChaincodesResponse.setResult(result);
	 
	 	return describeConsortiumChaincodesResponse;
	}
}