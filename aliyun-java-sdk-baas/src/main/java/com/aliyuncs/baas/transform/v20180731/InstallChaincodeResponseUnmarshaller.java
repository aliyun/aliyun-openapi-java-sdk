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

import com.aliyuncs.baas.model.v20180731.InstallChaincodeResponse;
import com.aliyuncs.baas.model.v20180731.InstallChaincodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class InstallChaincodeResponseUnmarshaller {

	public static InstallChaincodeResponse unmarshall(InstallChaincodeResponse installChaincodeResponse, UnmarshallerContext context) {
		
		installChaincodeResponse.setRequestId(context.stringValue("InstallChaincodeResponse.RequestId"));
		installChaincodeResponse.setSuccess(context.booleanValue("InstallChaincodeResponse.Success"));
		installChaincodeResponse.setErrorCode(context.integerValue("InstallChaincodeResponse.ErrorCode"));

		Result result = new Result();
		result.setName(context.stringValue("InstallChaincodeResponse.Result.Name"));
		result.setVersion(context.stringValue("InstallChaincodeResponse.Result.Version"));
		result.setInput(context.stringValue("InstallChaincodeResponse.Result.Input"));
		result.setType(context.integerValue("InstallChaincodeResponse.Result.Type"));
		result.setState(context.stringValue("InstallChaincodeResponse.Result.State"));
		result.setPath(context.stringValue("InstallChaincodeResponse.Result.Path"));
		result.setChaincodeId(context.stringValue("InstallChaincodeResponse.Result.ChaincodeId"));
		result.setInstall(context.booleanValue("InstallChaincodeResponse.Result.Install"));
		result.setMessage(context.stringValue("InstallChaincodeResponse.Result.Message"));
		result.setCreateTime(context.stringValue("InstallChaincodeResponse.Result.CreateTime"));
		result.setDeployTime(context.stringValue("InstallChaincodeResponse.Result.DeployTime"));
		result.setChannelName(context.stringValue("InstallChaincodeResponse.Result.ChannelName"));
		result.setEndorsePolicy(context.stringValue("InstallChaincodeResponse.Result.EndorsePolicy"));
		result.setConsortiumId(context.stringValue("InstallChaincodeResponse.Result.ConsortiumId"));
		result.setProviderId(context.stringValue("InstallChaincodeResponse.Result.ProviderId"));
		result.setProviderName(context.stringValue("InstallChaincodeResponse.Result.ProviderName"));
		installChaincodeResponse.setResult(result);
	 
	 	return installChaincodeResponse;
	}
}