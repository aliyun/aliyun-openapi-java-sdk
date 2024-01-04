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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.TransferRepositoryResponse;
import com.aliyuncs.devops.model.v20210625.TransferRepositoryResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransferRepositoryResponseUnmarshaller {

	public static TransferRepositoryResponse unmarshall(TransferRepositoryResponse transferRepositoryResponse, UnmarshallerContext _ctx) {
		
		transferRepositoryResponse.setRequestId(_ctx.stringValue("TransferRepositoryResponse.requestId"));
		transferRepositoryResponse.setErrorCode(_ctx.stringValue("TransferRepositoryResponse.errorCode"));
		transferRepositoryResponse.setErrorMessage(_ctx.stringValue("TransferRepositoryResponse.errorMessage"));
		transferRepositoryResponse.setSuccess(_ctx.booleanValue("TransferRepositoryResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("TransferRepositoryResponse.result.id"));
		result.setPath(_ctx.stringValue("TransferRepositoryResponse.result.path"));
		result.setName(_ctx.stringValue("TransferRepositoryResponse.result.name"));
		result.setDescription(_ctx.stringValue("TransferRepositoryResponse.result.description"));
		result.setPathWithNamespace(_ctx.stringValue("TransferRepositoryResponse.result.pathWithNamespace"));
		result.setNameWithNamespace(_ctx.stringValue("TransferRepositoryResponse.result.nameWithNamespace"));
		result.setVisibilityLevel(_ctx.integerValue("TransferRepositoryResponse.result.visibilityLevel"));
		result.setLastActivityAt(_ctx.stringValue("TransferRepositoryResponse.result.lastActivityAt"));
		result.setStarCount(_ctx.longValue("TransferRepositoryResponse.result.starCount"));
		result.setWebUrl(_ctx.stringValue("TransferRepositoryResponse.result.webUrl"));
		result.setStarred(_ctx.booleanValue("TransferRepositoryResponse.result.starred"));
		result.setNamespaceId(_ctx.longValue("TransferRepositoryResponse.result.namespaceId"));
		result.setAccessLevel(_ctx.integerValue("TransferRepositoryResponse.result.accessLevel"));
		result.setDemoProject(_ctx.booleanValue("TransferRepositoryResponse.result.demoProject"));
		result.setCreatedAt(_ctx.stringValue("TransferRepositoryResponse.result.createdAt"));
		result.setUpdatedAt(_ctx.stringValue("TransferRepositoryResponse.result.updatedAt"));
		result.setArchived(_ctx.booleanValue("TransferRepositoryResponse.result.archived"));
		result.setCreatorId(_ctx.longValue("TransferRepositoryResponse.result.creatorId"));
		result.setEncrypted(_ctx.booleanValue("TransferRepositoryResponse.result.encrypted"));
		transferRepositoryResponse.setResult(result);
	 
	 	return transferRepositoryResponse;
	}
}