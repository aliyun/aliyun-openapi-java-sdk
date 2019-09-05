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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.ImportSwaggerResponse;
import com.aliyuncs.cloudapi.model.v20160714.ImportSwaggerResponse.ApiImportSwaggerFailed;
import com.aliyuncs.cloudapi.model.v20160714.ImportSwaggerResponse.ApiImportSwaggerSuccess;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportSwaggerResponseUnmarshaller {

	public static ImportSwaggerResponse unmarshall(ImportSwaggerResponse importSwaggerResponse, UnmarshallerContext _ctx) {
		
		importSwaggerResponse.setRequestId(_ctx.stringValue("ImportSwaggerResponse.RequestId"));

		List<ApiImportSwaggerSuccess> success = new ArrayList<ApiImportSwaggerSuccess>();
		for (int i = 0; i < _ctx.lengthValue("ImportSwaggerResponse.Success.Length"); i++) {
			ApiImportSwaggerSuccess apiImportSwaggerSuccess = new ApiImportSwaggerSuccess();
			apiImportSwaggerSuccess.setPath(_ctx.stringValue("ImportSwaggerResponse.Success["+ i +"].Path"));
			apiImportSwaggerSuccess.setHttpMethod(_ctx.stringValue("ImportSwaggerResponse.Success["+ i +"].HttpMethod"));
			apiImportSwaggerSuccess.setApiUid(_ctx.stringValue("ImportSwaggerResponse.Success["+ i +"].ApiUid"));
			apiImportSwaggerSuccess.setApiOperation(_ctx.stringValue("ImportSwaggerResponse.Success["+ i +"].ApiOperation"));

			success.add(apiImportSwaggerSuccess);
		}
		importSwaggerResponse.setSuccess(success);

		List<ApiImportSwaggerFailed> failed = new ArrayList<ApiImportSwaggerFailed>();
		for (int i = 0; i < _ctx.lengthValue("ImportSwaggerResponse.Failed.Length"); i++) {
			ApiImportSwaggerFailed apiImportSwaggerFailed = new ApiImportSwaggerFailed();
			apiImportSwaggerFailed.setPath(_ctx.stringValue("ImportSwaggerResponse.Failed["+ i +"].Path"));
			apiImportSwaggerFailed.setHttpMethod(_ctx.stringValue("ImportSwaggerResponse.Failed["+ i +"].HttpMethod"));
			apiImportSwaggerFailed.setErrorMsg(_ctx.stringValue("ImportSwaggerResponse.Failed["+ i +"].ErrorMsg"));

			failed.add(apiImportSwaggerFailed);
		}
		importSwaggerResponse.setFailed(failed);
	 
	 	return importSwaggerResponse;
	}
}