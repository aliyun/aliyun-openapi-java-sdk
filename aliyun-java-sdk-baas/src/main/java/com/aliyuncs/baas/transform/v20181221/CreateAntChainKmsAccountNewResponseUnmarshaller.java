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

import com.aliyuncs.baas.model.v20181221.CreateAntChainKmsAccountNewResponse;
import com.aliyuncs.baas.model.v20181221.CreateAntChainKmsAccountNewResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAntChainKmsAccountNewResponseUnmarshaller {

	public static CreateAntChainKmsAccountNewResponse unmarshall(CreateAntChainKmsAccountNewResponse createAntChainKmsAccountNewResponse, UnmarshallerContext _ctx) {
		
		createAntChainKmsAccountNewResponse.setRequestId(_ctx.stringValue("CreateAntChainKmsAccountNewResponse.RequestId"));
		createAntChainKmsAccountNewResponse.setHttpStatusCode(_ctx.stringValue("CreateAntChainKmsAccountNewResponse.HttpStatusCode"));
		createAntChainKmsAccountNewResponse.setSuccess(_ctx.booleanValue("CreateAntChainKmsAccountNewResponse.Success"));
		createAntChainKmsAccountNewResponse.setResultMessage(_ctx.stringValue("CreateAntChainKmsAccountNewResponse.ResultMessage"));
		createAntChainKmsAccountNewResponse.setCode(_ctx.stringValue("CreateAntChainKmsAccountNewResponse.Code"));
		createAntChainKmsAccountNewResponse.setMessage(_ctx.stringValue("CreateAntChainKmsAccountNewResponse.Message"));
		createAntChainKmsAccountNewResponse.setResultCode(_ctx.stringValue("CreateAntChainKmsAccountNewResponse.ResultCode"));

		Result result = new Result();
		result.setPubKey(_ctx.stringValue("CreateAntChainKmsAccountNewResponse.Result.PubKey"));
		result.setMyKmsKeyId(_ctx.stringValue("CreateAntChainKmsAccountNewResponse.Result.MyKmsKeyId"));
		createAntChainKmsAccountNewResponse.setResult(result);
	 
	 	return createAntChainKmsAccountNewResponse;
	}
}