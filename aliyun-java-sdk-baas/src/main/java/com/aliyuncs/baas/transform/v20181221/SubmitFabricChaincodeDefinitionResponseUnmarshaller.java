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

import com.aliyuncs.baas.model.v20181221.SubmitFabricChaincodeDefinitionResponse;
import com.aliyuncs.baas.model.v20181221.SubmitFabricChaincodeDefinitionResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitFabricChaincodeDefinitionResponseUnmarshaller {

	public static SubmitFabricChaincodeDefinitionResponse unmarshall(SubmitFabricChaincodeDefinitionResponse submitFabricChaincodeDefinitionResponse, UnmarshallerContext _ctx) {
		
		submitFabricChaincodeDefinitionResponse.setRequestId(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.RequestId"));
		submitFabricChaincodeDefinitionResponse.setMessage(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Message"));
		submitFabricChaincodeDefinitionResponse.setSuccess(_ctx.booleanValue("SubmitFabricChaincodeDefinitionResponse.Success"));
		submitFabricChaincodeDefinitionResponse.setErrorCode(_ctx.integerValue("SubmitFabricChaincodeDefinitionResponse.ErrorCode"));

		Result result = new Result();
		result.setName(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.Name"));
		result.setVersion(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.Version"));
		result.setInput(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.Input"));
		result.setType(_ctx.integerValue("SubmitFabricChaincodeDefinitionResponse.Result.Type"));
		result.setState(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.State"));
		result.setPath(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.Path"));
		result.setChaincodeId(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.ChaincodeId"));
		result.setInstall(_ctx.booleanValue("SubmitFabricChaincodeDefinitionResponse.Result.Install"));
		result.setMessage(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.Message"));
		result.setCreateTime(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.CreateTime"));
		result.setDeployTime(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.DeployTime"));
		result.setChannelName(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.ChannelName"));
		result.setEndorsePolicy(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.EndorsePolicy"));
		result.setConsortiumId(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.ConsortiumId"));
		result.setProviderId(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.ProviderId"));
		result.setProviderName(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.ProviderName"));
		result.setChannelId(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.ChannelId"));
		result.setManagement(_ctx.booleanValue("SubmitFabricChaincodeDefinitionResponse.Result.Management"));
		result.setChaincodePackageId(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.ChaincodePackageId"));
		result.setInitRequired(_ctx.booleanValue("SubmitFabricChaincodeDefinitionResponse.Result.InitRequired"));
		result.setChaincodeDefinitionId(_ctx.stringValue("SubmitFabricChaincodeDefinitionResponse.Result.ChaincodeDefinitionId"));
		submitFabricChaincodeDefinitionResponse.setResult(result);
	 
	 	return submitFabricChaincodeDefinitionResponse;
	}
}