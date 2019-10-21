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

import com.aliyuncs.baas.model.v20181221.InstallFabricChaincodeResponse;
import com.aliyuncs.baas.model.v20181221.InstallFabricChaincodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class InstallFabricChaincodeResponseUnmarshaller {

	public static InstallFabricChaincodeResponse unmarshall(InstallFabricChaincodeResponse installFabricChaincodeResponse, UnmarshallerContext _ctx) {
		
		installFabricChaincodeResponse.setRequestId(_ctx.stringValue("InstallFabricChaincodeResponse.RequestId"));
		installFabricChaincodeResponse.setSuccess(_ctx.booleanValue("InstallFabricChaincodeResponse.Success"));
		installFabricChaincodeResponse.setErrorCode(_ctx.integerValue("InstallFabricChaincodeResponse.ErrorCode"));

		Result result = new Result();
		result.setChaincodeName(_ctx.stringValue("InstallFabricChaincodeResponse.Result.ChaincodeName"));
		result.setChaincodeVersion(_ctx.stringValue("InstallFabricChaincodeResponse.Result.ChaincodeVersion"));
		result.setInput(_ctx.stringValue("InstallFabricChaincodeResponse.Result.Input"));
		result.setType(_ctx.integerValue("InstallFabricChaincodeResponse.Result.Type"));
		result.setState(_ctx.stringValue("InstallFabricChaincodeResponse.Result.State"));
		result.setPath(_ctx.stringValue("InstallFabricChaincodeResponse.Result.Path"));
		result.setChaincodeId(_ctx.stringValue("InstallFabricChaincodeResponse.Result.ChaincodeId"));
		result.setInstall(_ctx.booleanValue("InstallFabricChaincodeResponse.Result.Install"));
		result.setMessage(_ctx.stringValue("InstallFabricChaincodeResponse.Result.Message"));
		result.setCreateTime(_ctx.stringValue("InstallFabricChaincodeResponse.Result.CreateTime"));
		result.setDeployTime(_ctx.stringValue("InstallFabricChaincodeResponse.Result.DeployTime"));
		result.setChannelName(_ctx.stringValue("InstallFabricChaincodeResponse.Result.ChannelName"));
		result.setEndorsePolicy(_ctx.stringValue("InstallFabricChaincodeResponse.Result.EndorsePolicy"));
		result.setConsortiumId(_ctx.stringValue("InstallFabricChaincodeResponse.Result.ConsortiumId"));
		result.setProviderId(_ctx.stringValue("InstallFabricChaincodeResponse.Result.ProviderId"));
		result.setProviderName(_ctx.stringValue("InstallFabricChaincodeResponse.Result.ProviderName"));
		installFabricChaincodeResponse.setResult(result);
	 
	 	return installFabricChaincodeResponse;
	}
}