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

import com.aliyuncs.baas.model.v20181221.CreateFabricChaincodeResponse;
import com.aliyuncs.baas.model.v20181221.CreateFabricChaincodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFabricChaincodeResponseUnmarshaller {

	public static CreateFabricChaincodeResponse unmarshall(CreateFabricChaincodeResponse createFabricChaincodeResponse, UnmarshallerContext _ctx) {
		
		createFabricChaincodeResponse.setRequestId(_ctx.stringValue("CreateFabricChaincodeResponse.RequestId"));
		createFabricChaincodeResponse.setSuccess(_ctx.booleanValue("CreateFabricChaincodeResponse.Success"));
		createFabricChaincodeResponse.setErrorCode(_ctx.integerValue("CreateFabricChaincodeResponse.ErrorCode"));

		Result result = new Result();
		result.setChaincodeName(_ctx.stringValue("CreateFabricChaincodeResponse.Result.ChaincodeName"));
		result.setChaincodeVersion(_ctx.stringValue("CreateFabricChaincodeResponse.Result.ChaincodeVersion"));
		result.setInput(_ctx.stringValue("CreateFabricChaincodeResponse.Result.Input"));
		result.setType(_ctx.integerValue("CreateFabricChaincodeResponse.Result.Type"));
		result.setState(_ctx.stringValue("CreateFabricChaincodeResponse.Result.State"));
		result.setPath(_ctx.stringValue("CreateFabricChaincodeResponse.Result.Path"));
		result.setChaincodeId(_ctx.stringValue("CreateFabricChaincodeResponse.Result.ChaincodeId"));
		result.setInstall(_ctx.booleanValue("CreateFabricChaincodeResponse.Result.Install"));
		result.setMessage(_ctx.stringValue("CreateFabricChaincodeResponse.Result.Message"));
		result.setCreateTime(_ctx.stringValue("CreateFabricChaincodeResponse.Result.CreateTime"));
		result.setDeployTime(_ctx.stringValue("CreateFabricChaincodeResponse.Result.DeployTime"));
		result.setChannelName(_ctx.stringValue("CreateFabricChaincodeResponse.Result.ChannelName"));
		result.setEndorsePolicy(_ctx.stringValue("CreateFabricChaincodeResponse.Result.EndorsePolicy"));
		result.setConsortiumId(_ctx.stringValue("CreateFabricChaincodeResponse.Result.ConsortiumId"));
		result.setProviderId(_ctx.stringValue("CreateFabricChaincodeResponse.Result.ProviderId"));
		result.setProviderName(_ctx.stringValue("CreateFabricChaincodeResponse.Result.ProviderName"));
		createFabricChaincodeResponse.setResult(result);
	 
	 	return createFabricChaincodeResponse;
	}
}