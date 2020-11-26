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

package com.aliyuncs.codeup.transform.v20200414;

import com.aliyuncs.codeup.model.v20200414.DeleteRepositoryTagResponse;
import com.aliyuncs.codeup.model.v20200414.DeleteRepositoryTagResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRepositoryTagResponseUnmarshaller {

	public static DeleteRepositoryTagResponse unmarshall(DeleteRepositoryTagResponse deleteRepositoryTagResponse, UnmarshallerContext _ctx) {
		
		deleteRepositoryTagResponse.setRequestId(_ctx.stringValue("DeleteRepositoryTagResponse.RequestId"));
		deleteRepositoryTagResponse.setErrorCode(_ctx.stringValue("DeleteRepositoryTagResponse.ErrorCode"));
		deleteRepositoryTagResponse.setSuccess(_ctx.booleanValue("DeleteRepositoryTagResponse.Success"));
		deleteRepositoryTagResponse.setErrorMessage(_ctx.stringValue("DeleteRepositoryTagResponse.ErrorMessage"));

		Result result = new Result();
		result.setTagName(_ctx.stringValue("DeleteRepositoryTagResponse.Result.TagName"));
		deleteRepositoryTagResponse.setResult(result);
	 
	 	return deleteRepositoryTagResponse;
	}
}