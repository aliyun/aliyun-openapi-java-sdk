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

import com.aliyuncs.baas.model.v20181221.CreateAntChainContractProjectResponse;
import com.aliyuncs.baas.model.v20181221.CreateAntChainContractProjectResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAntChainContractProjectResponseUnmarshaller {

	public static CreateAntChainContractProjectResponse unmarshall(CreateAntChainContractProjectResponse createAntChainContractProjectResponse, UnmarshallerContext _ctx) {
		
		createAntChainContractProjectResponse.setRequestId(_ctx.stringValue("CreateAntChainContractProjectResponse.RequestId"));

		Result result = new Result();
		result.setProjectId(_ctx.stringValue("CreateAntChainContractProjectResponse.Result.ProjectId"));
		result.setConsortiumId(_ctx.stringValue("CreateAntChainContractProjectResponse.Result.ConsortiumId"));
		result.setProjectName(_ctx.stringValue("CreateAntChainContractProjectResponse.Result.ProjectName"));
		result.setProjectVersion(_ctx.stringValue("CreateAntChainContractProjectResponse.Result.ProjectVersion"));
		result.setProjectDescription(_ctx.stringValue("CreateAntChainContractProjectResponse.Result.ProjectDescription"));
		result.setCreateTime(_ctx.longValue("CreateAntChainContractProjectResponse.Result.CreateTime"));
		result.setUpdateTime(_ctx.longValue("CreateAntChainContractProjectResponse.Result.UpdateTime"));
		createAntChainContractProjectResponse.setResult(result);
	 
	 	return createAntChainContractProjectResponse;
	}
}