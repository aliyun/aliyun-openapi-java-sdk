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

import com.aliyuncs.baas.model.v20181221.CreateAntChainAccountWithKeyPairAutoCreationResponse;
import com.aliyuncs.baas.model.v20181221.CreateAntChainAccountWithKeyPairAutoCreationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAntChainAccountWithKeyPairAutoCreationResponseUnmarshaller {

	public static CreateAntChainAccountWithKeyPairAutoCreationResponse unmarshall(CreateAntChainAccountWithKeyPairAutoCreationResponse createAntChainAccountWithKeyPairAutoCreationResponse, UnmarshallerContext _ctx) {
		
		createAntChainAccountWithKeyPairAutoCreationResponse.setRequestId(_ctx.stringValue("CreateAntChainAccountWithKeyPairAutoCreationResponse.RequestId"));

		Result result = new Result();
		result.setAccountPrivateKey(_ctx.stringValue("CreateAntChainAccountWithKeyPairAutoCreationResponse.Result.AccountPrivateKey"));
		result.setAccountPublicKey(_ctx.stringValue("CreateAntChainAccountWithKeyPairAutoCreationResponse.Result.AccountPublicKey"));
		result.setAccountRecoverPrivateKey(_ctx.stringValue("CreateAntChainAccountWithKeyPairAutoCreationResponse.Result.AccountRecoverPrivateKey"));
		result.setAccountRecoverPublicKey(_ctx.stringValue("CreateAntChainAccountWithKeyPairAutoCreationResponse.Result.AccountRecoverPublicKey"));
		result.setAntChainId(_ctx.stringValue("CreateAntChainAccountWithKeyPairAutoCreationResponse.Result.AntChainId"));
		result.setAccount(_ctx.stringValue("CreateAntChainAccountWithKeyPairAutoCreationResponse.Result.Account"));
		createAntChainAccountWithKeyPairAutoCreationResponse.setResult(result);
	 
	 	return createAntChainAccountWithKeyPairAutoCreationResponse;
	}
}