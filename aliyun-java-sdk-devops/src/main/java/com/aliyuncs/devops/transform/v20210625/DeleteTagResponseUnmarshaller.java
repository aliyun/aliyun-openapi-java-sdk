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

import com.aliyuncs.devops.model.v20210625.DeleteTagResponse;
import com.aliyuncs.devops.model.v20210625.DeleteTagResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTagResponseUnmarshaller {

	public static DeleteTagResponse unmarshall(DeleteTagResponse deleteTagResponse, UnmarshallerContext _ctx) {
		
		deleteTagResponse.setRequestId(_ctx.stringValue("DeleteTagResponse.requestId"));
		deleteTagResponse.setErrorMessage(_ctx.stringValue("DeleteTagResponse.errorMessage"));
		deleteTagResponse.setErrorCode(_ctx.stringValue("DeleteTagResponse.errorCode"));
		deleteTagResponse.setSuccess(_ctx.booleanValue("DeleteTagResponse.success"));

		Result result = new Result();
		result.setTagName(_ctx.stringValue("DeleteTagResponse.result.tagName"));
		deleteTagResponse.setResult(result);
	 
	 	return deleteTagResponse;
	}
}