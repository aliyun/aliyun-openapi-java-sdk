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

import com.aliyuncs.baas.model.v20180731.SynchronizeChaincodeResponse;
import com.aliyuncs.baas.model.v20180731.SynchronizeChaincodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class SynchronizeChaincodeResponseUnmarshaller {

	public static SynchronizeChaincodeResponse unmarshall(SynchronizeChaincodeResponse synchronizeChaincodeResponse, UnmarshallerContext context) {
		
		synchronizeChaincodeResponse.setRequestId(context.stringValue("SynchronizeChaincodeResponse.RequestId"));
		synchronizeChaincodeResponse.setSuccess(context.booleanValue("SynchronizeChaincodeResponse.Success"));
		synchronizeChaincodeResponse.setErrorCode(context.integerValue("SynchronizeChaincodeResponse.ErrorCode"));

		Result result = new Result();
		result.setName(context.stringValue("SynchronizeChaincodeResponse.Result.Name"));
		result.setVersion(context.stringValue("SynchronizeChaincodeResponse.Result.Version"));
		result.setInput(context.stringValue("SynchronizeChaincodeResponse.Result.Input"));
		result.setType(context.integerValue("SynchronizeChaincodeResponse.Result.Type"));
		result.setState(context.stringValue("SynchronizeChaincodeResponse.Result.State"));
		result.setPath(context.stringValue("SynchronizeChaincodeResponse.Result.Path"));
		result.setChaincodeId(context.stringValue("SynchronizeChaincodeResponse.Result.ChaincodeId"));
		result.setInstall(context.booleanValue("SynchronizeChaincodeResponse.Result.Install"));
		result.setMessage(context.stringValue("SynchronizeChaincodeResponse.Result.Message"));
		result.setCreateTime(context.stringValue("SynchronizeChaincodeResponse.Result.CreateTime"));
		result.setDeployTime(context.stringValue("SynchronizeChaincodeResponse.Result.DeployTime"));
		result.setChannelName(context.stringValue("SynchronizeChaincodeResponse.Result.ChannelName"));
		result.setEndorsePolicy(context.stringValue("SynchronizeChaincodeResponse.Result.EndorsePolicy"));
		result.setConsortiumId(context.stringValue("SynchronizeChaincodeResponse.Result.ConsortiumId"));
		result.setProviderId(context.stringValue("SynchronizeChaincodeResponse.Result.ProviderId"));
		result.setProviderName(context.stringValue("SynchronizeChaincodeResponse.Result.ProviderName"));
		synchronizeChaincodeResponse.setResult(result);
	 
	 	return synchronizeChaincodeResponse;
	}
}