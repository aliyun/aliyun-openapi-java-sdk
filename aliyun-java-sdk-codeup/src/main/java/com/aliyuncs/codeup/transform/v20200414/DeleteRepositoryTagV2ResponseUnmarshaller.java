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

import com.aliyuncs.codeup.model.v20200414.DeleteRepositoryTagV2Response;
import com.aliyuncs.codeup.model.v20200414.DeleteRepositoryTagV2Response.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRepositoryTagV2ResponseUnmarshaller {

	public static DeleteRepositoryTagV2Response unmarshall(DeleteRepositoryTagV2Response deleteRepositoryTagV2Response, UnmarshallerContext _ctx) {
		
		deleteRepositoryTagV2Response.setRequestId(_ctx.stringValue("DeleteRepositoryTagV2Response.RequestId"));
		deleteRepositoryTagV2Response.setErrorCode(_ctx.stringValue("DeleteRepositoryTagV2Response.ErrorCode"));
		deleteRepositoryTagV2Response.setErrorMessage(_ctx.stringValue("DeleteRepositoryTagV2Response.ErrorMessage"));
		deleteRepositoryTagV2Response.setSuccess(_ctx.booleanValue("DeleteRepositoryTagV2Response.Success"));

		Result result = new Result();
		result.setTagName(_ctx.stringValue("DeleteRepositoryTagV2Response.Result.TagName"));
		deleteRepositoryTagV2Response.setResult(result);
	 
	 	return deleteRepositoryTagV2Response;
	}
}