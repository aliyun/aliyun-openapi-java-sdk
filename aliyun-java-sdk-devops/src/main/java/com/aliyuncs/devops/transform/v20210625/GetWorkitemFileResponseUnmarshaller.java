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

import com.aliyuncs.devops.model.v20210625.GetWorkitemFileResponse;
import com.aliyuncs.devops.model.v20210625.GetWorkitemFileResponse.WorkitemFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkitemFileResponseUnmarshaller {

	public static GetWorkitemFileResponse unmarshall(GetWorkitemFileResponse getWorkitemFileResponse, UnmarshallerContext _ctx) {
		
		getWorkitemFileResponse.setRequestId(_ctx.stringValue("GetWorkitemFileResponse.requestId"));
		getWorkitemFileResponse.setErrorMsg(_ctx.stringValue("GetWorkitemFileResponse.errorMsg"));
		getWorkitemFileResponse.setErrorCode(_ctx.stringValue("GetWorkitemFileResponse.errorCode"));
		getWorkitemFileResponse.setSuccess(_ctx.stringValue("GetWorkitemFileResponse.success"));

		WorkitemFile workitemFile = new WorkitemFile();
		workitemFile.setId(_ctx.stringValue("GetWorkitemFileResponse.workitemFile.id"));
		workitemFile.setName(_ctx.stringValue("GetWorkitemFileResponse.workitemFile.name"));
		workitemFile.setSuffix(_ctx.stringValue("GetWorkitemFileResponse.workitemFile.suffix"));
		workitemFile.setSize(_ctx.integerValue("GetWorkitemFileResponse.workitemFile.size"));
		workitemFile.setUrl(_ctx.stringValue("GetWorkitemFileResponse.workitemFile.url"));
		getWorkitemFileResponse.setWorkitemFile(workitemFile);
	 
	 	return getWorkitemFileResponse;
	}
}