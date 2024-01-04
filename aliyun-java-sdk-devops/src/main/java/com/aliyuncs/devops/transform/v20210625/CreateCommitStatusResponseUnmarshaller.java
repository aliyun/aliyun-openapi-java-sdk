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

import com.aliyuncs.devops.model.v20210625.CreateCommitStatusResponse;
import com.aliyuncs.devops.model.v20210625.CreateCommitStatusResponse.Result;
import com.aliyuncs.devops.model.v20210625.CreateCommitStatusResponse.Result.Creator;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCommitStatusResponseUnmarshaller {

	public static CreateCommitStatusResponse unmarshall(CreateCommitStatusResponse createCommitStatusResponse, UnmarshallerContext _ctx) {
		
		createCommitStatusResponse.setRequestId(_ctx.stringValue("CreateCommitStatusResponse.requestId"));
		createCommitStatusResponse.setSuccess(_ctx.booleanValue("CreateCommitStatusResponse.success"));
		createCommitStatusResponse.setErrorCode(_ctx.stringValue("CreateCommitStatusResponse.errorCode"));
		createCommitStatusResponse.setErrorMessage(_ctx.stringValue("CreateCommitStatusResponse.errorMessage"));

		Result result = new Result();
		result.setId(_ctx.longValue("CreateCommitStatusResponse.result.id"));
		result.setSha(_ctx.stringValue("CreateCommitStatusResponse.result.sha"));
		result.setContext(_ctx.stringValue("CreateCommitStatusResponse.result.context"));
		result.setState(_ctx.stringValue("CreateCommitStatusResponse.result.state"));
		result.setTargetUrl(_ctx.stringValue("CreateCommitStatusResponse.result.targetUrl"));
		result.setDescription(_ctx.stringValue("CreateCommitStatusResponse.result.description"));

		Creator creator = new Creator();
		creator.setAliyunPk(_ctx.longValue("CreateCommitStatusResponse.result.creator.aliyunPk"));
		creator.setLogin(_ctx.stringValue("CreateCommitStatusResponse.result.creator.login"));
		creator.setAvatarUrl(_ctx.stringValue("CreateCommitStatusResponse.result.creator.avatarUrl"));
		creator.setType(_ctx.stringValue("CreateCommitStatusResponse.result.creator.type"));
		result.setCreator(creator);
		createCommitStatusResponse.setResult(result);
	 
	 	return createCommitStatusResponse;
	}
}