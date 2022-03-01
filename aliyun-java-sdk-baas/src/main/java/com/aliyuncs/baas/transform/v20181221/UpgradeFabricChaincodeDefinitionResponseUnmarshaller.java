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

import com.aliyuncs.baas.model.v20181221.UpgradeFabricChaincodeDefinitionResponse;
import com.aliyuncs.baas.model.v20181221.UpgradeFabricChaincodeDefinitionResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeFabricChaincodeDefinitionResponseUnmarshaller {

	public static UpgradeFabricChaincodeDefinitionResponse unmarshall(UpgradeFabricChaincodeDefinitionResponse upgradeFabricChaincodeDefinitionResponse, UnmarshallerContext _ctx) {
		
		upgradeFabricChaincodeDefinitionResponse.setRequestId(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.RequestId"));
		upgradeFabricChaincodeDefinitionResponse.setMessage(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Message"));
		upgradeFabricChaincodeDefinitionResponse.setSuccess(_ctx.booleanValue("UpgradeFabricChaincodeDefinitionResponse.Success"));
		upgradeFabricChaincodeDefinitionResponse.setErrorCode(_ctx.integerValue("UpgradeFabricChaincodeDefinitionResponse.ErrorCode"));

		Result result = new Result();
		result.setName(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.Name"));
		result.setVersion(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.Version"));
		result.setInput(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.Input"));
		result.setType(_ctx.integerValue("UpgradeFabricChaincodeDefinitionResponse.Result.Type"));
		result.setState(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.State"));
		result.setPath(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.Path"));
		result.setChaincodeId(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.ChaincodeId"));
		result.setInstall(_ctx.booleanValue("UpgradeFabricChaincodeDefinitionResponse.Result.Install"));
		result.setMessage(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.Message"));
		result.setCreateTime(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.CreateTime"));
		result.setDeployTime(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.DeployTime"));
		result.setChannelName(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.ChannelName"));
		result.setEndorsePolicy(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.EndorsePolicy"));
		result.setConsortiumId(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.ConsortiumId"));
		result.setProviderId(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.ProviderId"));
		result.setProviderName(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.ProviderName"));
		result.setChannelId(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.ChannelId"));
		result.setManagement(_ctx.booleanValue("UpgradeFabricChaincodeDefinitionResponse.Result.Management"));
		result.setChaincodePackageId(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.ChaincodePackageId"));
		result.setInitRequired(_ctx.booleanValue("UpgradeFabricChaincodeDefinitionResponse.Result.InitRequired"));
		result.setChaincodeDefinitionId(_ctx.stringValue("UpgradeFabricChaincodeDefinitionResponse.Result.ChaincodeDefinitionId"));
		upgradeFabricChaincodeDefinitionResponse.setResult(result);
	 
	 	return upgradeFabricChaincodeDefinitionResponse;
	}
}