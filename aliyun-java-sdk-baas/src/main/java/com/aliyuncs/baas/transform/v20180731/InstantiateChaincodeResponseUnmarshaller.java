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

import com.aliyuncs.baas.model.v20180731.InstantiateChaincodeResponse;
import com.aliyuncs.baas.model.v20180731.InstantiateChaincodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class InstantiateChaincodeResponseUnmarshaller {

	public static InstantiateChaincodeResponse unmarshall(InstantiateChaincodeResponse instantiateChaincodeResponse, UnmarshallerContext context) {
		
		instantiateChaincodeResponse.setRequestId(context.stringValue("InstantiateChaincodeResponse.RequestId"));
		instantiateChaincodeResponse.setSuccess(context.booleanValue("InstantiateChaincodeResponse.Success"));
		instantiateChaincodeResponse.setErrorCode(context.integerValue("InstantiateChaincodeResponse.ErrorCode"));

		Result result = new Result();
		result.setName(context.stringValue("InstantiateChaincodeResponse.Result.Name"));
		result.setVersion(context.stringValue("InstantiateChaincodeResponse.Result.Version"));
		result.setInput(context.stringValue("InstantiateChaincodeResponse.Result.Input"));
		result.setType(context.integerValue("InstantiateChaincodeResponse.Result.Type"));
		result.setState(context.stringValue("InstantiateChaincodeResponse.Result.State"));
		result.setPath(context.stringValue("InstantiateChaincodeResponse.Result.Path"));
		result.setChaincodeId(context.stringValue("InstantiateChaincodeResponse.Result.ChaincodeId"));
		result.setInstall(context.booleanValue("InstantiateChaincodeResponse.Result.Install"));
		result.setMessage(context.stringValue("InstantiateChaincodeResponse.Result.Message"));
		result.setCreateTime(context.stringValue("InstantiateChaincodeResponse.Result.CreateTime"));
		result.setDeployTime(context.stringValue("InstantiateChaincodeResponse.Result.DeployTime"));
		result.setChannelName(context.stringValue("InstantiateChaincodeResponse.Result.ChannelName"));
		result.setEndorsePolicy(context.stringValue("InstantiateChaincodeResponse.Result.EndorsePolicy"));
		result.setConsortiumId(context.stringValue("InstantiateChaincodeResponse.Result.ConsortiumId"));
		result.setProviderId(context.stringValue("InstantiateChaincodeResponse.Result.ProviderId"));
		result.setProviderName(context.stringValue("InstantiateChaincodeResponse.Result.ProviderName"));
		instantiateChaincodeResponse.setResult(result);
	 
	 	return instantiateChaincodeResponse;
	}
}