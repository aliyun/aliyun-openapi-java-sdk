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

import com.aliyuncs.baas.model.v20181221.UpgradeFabricChaincodeResponse;
import com.aliyuncs.baas.model.v20181221.UpgradeFabricChaincodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeFabricChaincodeResponseUnmarshaller {

	public static UpgradeFabricChaincodeResponse unmarshall(UpgradeFabricChaincodeResponse upgradeFabricChaincodeResponse, UnmarshallerContext _ctx) {
		
		upgradeFabricChaincodeResponse.setRequestId(_ctx.stringValue("UpgradeFabricChaincodeResponse.RequestId"));
		upgradeFabricChaincodeResponse.setSuccess(_ctx.booleanValue("UpgradeFabricChaincodeResponse.Success"));
		upgradeFabricChaincodeResponse.setErrorCode(_ctx.integerValue("UpgradeFabricChaincodeResponse.ErrorCode"));

		Result result = new Result();
		result.setChaincodeName(_ctx.stringValue("UpgradeFabricChaincodeResponse.Result.ChaincodeName"));
		result.setChaincodeVersion(_ctx.stringValue("UpgradeFabricChaincodeResponse.Result.ChaincodeVersion"));
		result.setInput(_ctx.stringValue("UpgradeFabricChaincodeResponse.Result.Input"));
		result.setType(_ctx.integerValue("UpgradeFabricChaincodeResponse.Result.Type"));
		result.setState(_ctx.stringValue("UpgradeFabricChaincodeResponse.Result.State"));
		result.setPath(_ctx.stringValue("UpgradeFabricChaincodeResponse.Result.Path"));
		result.setChaincodeId(_ctx.stringValue("UpgradeFabricChaincodeResponse.Result.ChaincodeId"));
		result.setInstall(_ctx.booleanValue("UpgradeFabricChaincodeResponse.Result.Install"));
		result.setMessage(_ctx.stringValue("UpgradeFabricChaincodeResponse.Result.Message"));
		result.setCreateTime(_ctx.stringValue("UpgradeFabricChaincodeResponse.Result.CreateTime"));
		result.setDeployTime(_ctx.stringValue("UpgradeFabricChaincodeResponse.Result.DeployTime"));
		result.setChannelName(_ctx.stringValue("UpgradeFabricChaincodeResponse.Result.ChannelName"));
		result.setEndorsePolicy(_ctx.stringValue("UpgradeFabricChaincodeResponse.Result.EndorsePolicy"));
		result.setConsortiumId(_ctx.stringValue("UpgradeFabricChaincodeResponse.Result.ConsortiumId"));
		result.setProviderId(_ctx.stringValue("UpgradeFabricChaincodeResponse.Result.ProviderId"));
		result.setProviderName(_ctx.stringValue("UpgradeFabricChaincodeResponse.Result.ProviderName"));
		upgradeFabricChaincodeResponse.setResult(result);
	 
	 	return upgradeFabricChaincodeResponse;
	}
}