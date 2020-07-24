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

import com.aliyuncs.codeup.model.v20200414.GetFileBlobsResponse;
import com.aliyuncs.codeup.model.v20200414.GetFileBlobsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFileBlobsResponseUnmarshaller {

	public static GetFileBlobsResponse unmarshall(GetFileBlobsResponse getFileBlobsResponse, UnmarshallerContext _ctx) {
		
		getFileBlobsResponse.setRequestId(_ctx.stringValue("GetFileBlobsResponse.RequestId"));
		getFileBlobsResponse.setErrorCode(_ctx.stringValue("GetFileBlobsResponse.ErrorCode"));
		getFileBlobsResponse.setSuccess(_ctx.booleanValue("GetFileBlobsResponse.Success"));
		getFileBlobsResponse.setErrorMessage(_ctx.stringValue("GetFileBlobsResponse.ErrorMessage"));

		Result result = new Result();
		result.setContent(_ctx.stringValue("GetFileBlobsResponse.Result.Content"));
		result.setTotalLines(_ctx.integerValue("GetFileBlobsResponse.Result.TotalLines"));
		getFileBlobsResponse.setResult(result);
	 
	 	return getFileBlobsResponse;
	}
}