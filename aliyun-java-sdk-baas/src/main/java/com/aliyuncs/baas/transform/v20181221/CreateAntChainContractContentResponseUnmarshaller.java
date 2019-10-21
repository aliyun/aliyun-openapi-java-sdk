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

import com.aliyuncs.baas.model.v20181221.CreateAntChainContractContentResponse;
import com.aliyuncs.baas.model.v20181221.CreateAntChainContractContentResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAntChainContractContentResponseUnmarshaller {

	public static CreateAntChainContractContentResponse unmarshall(CreateAntChainContractContentResponse createAntChainContractContentResponse, UnmarshallerContext _ctx) {
		
		createAntChainContractContentResponse.setRequestId(_ctx.stringValue("CreateAntChainContractContentResponse.RequestId"));

		Result result = new Result();
		result.setContentId(_ctx.stringValue("CreateAntChainContractContentResponse.Result.ContentId"));
		result.setProjectId(_ctx.stringValue("CreateAntChainContractContentResponse.Result.ProjectId"));
		result.setIsDirectory(_ctx.booleanValue("CreateAntChainContractContentResponse.Result.IsDirectory"));
		result.setContent(_ctx.stringValue("CreateAntChainContractContentResponse.Result.Content"));
		result.setCreateTime(_ctx.stringValue("CreateAntChainContractContentResponse.Result.CreateTime"));
		result.setUpdateTime(_ctx.stringValue("CreateAntChainContractContentResponse.Result.UpdateTime"));
		result.setParentContentId(_ctx.stringValue("CreateAntChainContractContentResponse.Result.ParentContentId"));
		result.setContentName(_ctx.stringValue("CreateAntChainContractContentResponse.Result.ContentName"));
		createAntChainContractContentResponse.setResult(result);
	 
	 	return createAntChainContractContentResponse;
	}
}