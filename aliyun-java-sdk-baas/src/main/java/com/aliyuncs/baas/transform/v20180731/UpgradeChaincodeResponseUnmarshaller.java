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

import com.aliyuncs.baas.model.v20180731.UpgradeChaincodeResponse;
import com.aliyuncs.baas.model.v20180731.UpgradeChaincodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpgradeChaincodeResponseUnmarshaller {

	public static UpgradeChaincodeResponse unmarshall(UpgradeChaincodeResponse upgradeChaincodeResponse, UnmarshallerContext context) {
		
		upgradeChaincodeResponse.setRequestId(context.stringValue("UpgradeChaincodeResponse.RequestId"));
		upgradeChaincodeResponse.setSuccess(context.booleanValue("UpgradeChaincodeResponse.Success"));
		upgradeChaincodeResponse.setErrorCode(context.integerValue("UpgradeChaincodeResponse.ErrorCode"));

		Result result = new Result();
		result.setName(context.stringValue("UpgradeChaincodeResponse.Result.Name"));
		result.setVersion(context.stringValue("UpgradeChaincodeResponse.Result.Version"));
		result.setInput(context.stringValue("UpgradeChaincodeResponse.Result.Input"));
		result.setType(context.integerValue("UpgradeChaincodeResponse.Result.Type"));
		result.setState(context.stringValue("UpgradeChaincodeResponse.Result.State"));
		result.setPath(context.stringValue("UpgradeChaincodeResponse.Result.Path"));
		result.setChaincodeId(context.stringValue("UpgradeChaincodeResponse.Result.ChaincodeId"));
		result.setInstall(context.booleanValue("UpgradeChaincodeResponse.Result.Install"));
		result.setMessage(context.stringValue("UpgradeChaincodeResponse.Result.Message"));
		result.setCreateTime(context.stringValue("UpgradeChaincodeResponse.Result.CreateTime"));
		result.setDeployTime(context.stringValue("UpgradeChaincodeResponse.Result.DeployTime"));
		result.setChannelName(context.stringValue("UpgradeChaincodeResponse.Result.ChannelName"));
		result.setEndorsePolicy(context.stringValue("UpgradeChaincodeResponse.Result.EndorsePolicy"));
		result.setConsortiumId(context.stringValue("UpgradeChaincodeResponse.Result.ConsortiumId"));
		result.setProviderId(context.stringValue("UpgradeChaincodeResponse.Result.ProviderId"));
		result.setProviderName(context.stringValue("UpgradeChaincodeResponse.Result.ProviderName"));
		upgradeChaincodeResponse.setResult(result);
	 
	 	return upgradeChaincodeResponse;
	}
}