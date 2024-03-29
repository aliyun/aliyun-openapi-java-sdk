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

import com.aliyuncs.devops.model.v20210625.GetFileBlobsResponse;
import com.aliyuncs.devops.model.v20210625.GetFileBlobsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFileBlobsResponseUnmarshaller {

	public static GetFileBlobsResponse unmarshall(GetFileBlobsResponse getFileBlobsResponse, UnmarshallerContext _ctx) {
		
		getFileBlobsResponse.setRequestId(_ctx.stringValue("GetFileBlobsResponse.requestId"));
		getFileBlobsResponse.setErrorMessage(_ctx.stringValue("GetFileBlobsResponse.errorMessage"));
		getFileBlobsResponse.setErrorCode(_ctx.stringValue("GetFileBlobsResponse.errorCode"));
		getFileBlobsResponse.setSuccess(_ctx.booleanValue("GetFileBlobsResponse.success"));

		Result result = new Result();
		result.setContent(_ctx.stringValue("GetFileBlobsResponse.result.content"));
		result.setTotalLines(_ctx.integerValue("GetFileBlobsResponse.result.totalLines"));
		result.setSize(_ctx.longValue("GetFileBlobsResponse.result.size"));
		getFileBlobsResponse.setResult(result);
	 
	 	return getFileBlobsResponse;
	}
}