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

import com.aliyuncs.baas.model.v20181221.SynchronizeFabricChaincodeResponse;
import com.aliyuncs.baas.model.v20181221.SynchronizeFabricChaincodeResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class SynchronizeFabricChaincodeResponseUnmarshaller {

	public static SynchronizeFabricChaincodeResponse unmarshall(SynchronizeFabricChaincodeResponse synchronizeFabricChaincodeResponse, UnmarshallerContext _ctx) {
		
		synchronizeFabricChaincodeResponse.setRequestId(_ctx.stringValue("SynchronizeFabricChaincodeResponse.RequestId"));
		synchronizeFabricChaincodeResponse.setSuccess(_ctx.booleanValue("SynchronizeFabricChaincodeResponse.Success"));
		synchronizeFabricChaincodeResponse.setErrorCode(_ctx.integerValue("SynchronizeFabricChaincodeResponse.ErrorCode"));

		Result result = new Result();
		result.setType(_ctx.integerValue("SynchronizeFabricChaincodeResponse.Result.Type"));
		result.setEndorsePolicy(_ctx.stringValue("SynchronizeFabricChaincodeResponse.Result.EndorsePolicy"));
		result.setState(_ctx.stringValue("SynchronizeFabricChaincodeResponse.Result.State"));
		result.setCreateTime(_ctx.stringValue("SynchronizeFabricChaincodeResponse.Result.CreateTime"));
		result.setChaincodeId(_ctx.stringValue("SynchronizeFabricChaincodeResponse.Result.ChaincodeId"));
		result.setProviderName(_ctx.stringValue("SynchronizeFabricChaincodeResponse.Result.ProviderName"));
		result.setMessage(_ctx.stringValue("SynchronizeFabricChaincodeResponse.Result.Message"));
		result.setChaincodeName(_ctx.stringValue("SynchronizeFabricChaincodeResponse.Result.ChaincodeName"));
		result.setInput(_ctx.stringValue("SynchronizeFabricChaincodeResponse.Result.Input"));
		result.setInstall(_ctx.booleanValue("SynchronizeFabricChaincodeResponse.Result.Install"));
		result.setProviderId(_ctx.stringValue("SynchronizeFabricChaincodeResponse.Result.ProviderId"));
		result.setDeployTime(_ctx.stringValue("SynchronizeFabricChaincodeResponse.Result.DeployTime"));
		result.setChaincodeVersion(_ctx.stringValue("SynchronizeFabricChaincodeResponse.Result.ChaincodeVersion"));
		result.setConsortiumId(_ctx.stringValue("SynchronizeFabricChaincodeResponse.Result.ConsortiumId"));
		result.setChannelName(_ctx.stringValue("SynchronizeFabricChaincodeResponse.Result.ChannelName"));
		result.setPath(_ctx.stringValue("SynchronizeFabricChaincodeResponse.Result.Path"));
		synchronizeFabricChaincodeResponse.setResult(result);
	 
	 	return synchronizeFabricChaincodeResponse;
	}
}