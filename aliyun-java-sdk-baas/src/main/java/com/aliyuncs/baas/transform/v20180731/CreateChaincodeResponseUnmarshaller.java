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

import com.aliyuncs.baas.model.v20180731.CreateChaincodeResponse;
import com.aliyuncs.baas.model.v20180731.CreateChaincodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateChaincodeResponseUnmarshaller {

	public static CreateChaincodeResponse unmarshall(CreateChaincodeResponse createChaincodeResponse, UnmarshallerContext context) {
		
		createChaincodeResponse.setRequestId(context.stringValue("CreateChaincodeResponse.RequestId"));
		createChaincodeResponse.setSuccess(context.booleanValue("CreateChaincodeResponse.Success"));
		createChaincodeResponse.setErrorCode(context.integerValue("CreateChaincodeResponse.ErrorCode"));

		Result result = new Result();
		result.setName(context.stringValue("CreateChaincodeResponse.Result.Name"));
		result.setVersion(context.stringValue("CreateChaincodeResponse.Result.Version"));
		result.setInput(context.stringValue("CreateChaincodeResponse.Result.Input"));
		result.setType(context.integerValue("CreateChaincodeResponse.Result.Type"));
		result.setState(context.stringValue("CreateChaincodeResponse.Result.State"));
		result.setPath(context.stringValue("CreateChaincodeResponse.Result.Path"));
		result.setChaincodeId(context.stringValue("CreateChaincodeResponse.Result.ChaincodeId"));
		result.setInstall(context.booleanValue("CreateChaincodeResponse.Result.Install"));
		result.setMessage(context.stringValue("CreateChaincodeResponse.Result.Message"));
		result.setCreateTime(context.stringValue("CreateChaincodeResponse.Result.CreateTime"));
		result.setDeployTime(context.stringValue("CreateChaincodeResponse.Result.DeployTime"));
		result.setChannelName(context.stringValue("CreateChaincodeResponse.Result.ChannelName"));
		result.setEndorsePolicy(context.stringValue("CreateChaincodeResponse.Result.EndorsePolicy"));
		result.setConsortiumId(context.stringValue("CreateChaincodeResponse.Result.ConsortiumId"));
		result.setProviderId(context.stringValue("CreateChaincodeResponse.Result.ProviderId"));
		result.setProviderName(context.stringValue("CreateChaincodeResponse.Result.ProviderName"));
		createChaincodeResponse.setResult(result);
	 
	 	return createChaincodeResponse;
	}
}