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

import com.aliyuncs.baas.model.v20181221.ApproveFabricChaincodeDefinitionResponse;
import com.aliyuncs.baas.model.v20181221.ApproveFabricChaincodeDefinitionResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApproveFabricChaincodeDefinitionResponseUnmarshaller {

	public static ApproveFabricChaincodeDefinitionResponse unmarshall(ApproveFabricChaincodeDefinitionResponse approveFabricChaincodeDefinitionResponse, UnmarshallerContext _ctx) {
		
		approveFabricChaincodeDefinitionResponse.setRequestId(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.RequestId"));
		approveFabricChaincodeDefinitionResponse.setMessage(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Message"));
		approveFabricChaincodeDefinitionResponse.setSuccess(_ctx.booleanValue("ApproveFabricChaincodeDefinitionResponse.Success"));
		approveFabricChaincodeDefinitionResponse.setErrorCode(_ctx.integerValue("ApproveFabricChaincodeDefinitionResponse.ErrorCode"));

		Result result = new Result();
		result.setName(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.Name"));
		result.setVersion(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.Version"));
		result.setInput(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.Input"));
		result.setType(_ctx.integerValue("ApproveFabricChaincodeDefinitionResponse.Result.Type"));
		result.setState(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.State"));
		result.setPath(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.Path"));
		result.setChaincodeId(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.ChaincodeId"));
		result.setInstall(_ctx.booleanValue("ApproveFabricChaincodeDefinitionResponse.Result.Install"));
		result.setMessage(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.Message"));
		result.setCreateTime(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.CreateTime"));
		result.setDeployTime(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.DeployTime"));
		result.setChannelName(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.ChannelName"));
		result.setEndorsePolicy(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.EndorsePolicy"));
		result.setConsortiumId(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.ConsortiumId"));
		result.setProviderId(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.ProviderId"));
		result.setProviderName(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.ProviderName"));
		result.setChannelId(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.ChannelId"));
		result.setManagement(_ctx.booleanValue("ApproveFabricChaincodeDefinitionResponse.Result.Management"));
		result.setChaincodePackageId(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.ChaincodePackageId"));
		result.setInitRequired(_ctx.booleanValue("ApproveFabricChaincodeDefinitionResponse.Result.InitRequired"));
		result.setChaincodeDefinitionId(_ctx.stringValue("ApproveFabricChaincodeDefinitionResponse.Result.ChaincodeDefinitionId"));
		approveFabricChaincodeDefinitionResponse.setResult(result);
	 
	 	return approveFabricChaincodeDefinitionResponse;
	}
}