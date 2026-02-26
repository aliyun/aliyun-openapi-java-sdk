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

import com.aliyuncs.cloudapi.model.v20160714.ImportOASResponse;
import com.aliyuncs.cloudapi.model.v20160714.ImportOASResponse.FailedApi;
import com.aliyuncs.cloudapi.model.v20160714.ImportOASResponse.FailedModel;
import com.aliyuncs.cloudapi.model.v20160714.ImportOASResponse.SuccessApi;
import com.aliyuncs.cloudapi.model.v20160714.ImportOASResponse.SuccessModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportOASResponseUnmarshaller {

	public static ImportOASResponse unmarshall(ImportOASResponse importOASResponse, UnmarshallerContext _ctx) {
		
		importOASResponse.setRequestId(_ctx.stringValue("ImportOASResponse.RequestId"));
		importOASResponse.setOperationId(_ctx.stringValue("ImportOASResponse.OperationId"));

		List<String> errorMessages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ImportOASResponse.ErrorMessages.Length"); i++) {
			errorMessages.add(_ctx.stringValue("ImportOASResponse.ErrorMessages["+ i +"]"));
		}
		importOASResponse.setErrorMessages(errorMessages);

		List<String> warningMessages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ImportOASResponse.WarningMessages.Length"); i++) {
			warningMessages.add(_ctx.stringValue("ImportOASResponse.WarningMessages["+ i +"]"));
		}
		importOASResponse.setWarningMessages(warningMessages);

		List<SuccessApi> successApis = new ArrayList<SuccessApi>();
		for (int i = 0; i < _ctx.lengthValue("ImportOASResponse.SuccessApis.Length"); i++) {
			SuccessApi successApi = new SuccessApi();
			successApi.setPath(_ctx.stringValue("ImportOASResponse.SuccessApis["+ i +"].Path"));
			successApi.setHttpMethod(_ctx.stringValue("ImportOASResponse.SuccessApis["+ i +"].HttpMethod"));
			successApi.setApiId(_ctx.stringValue("ImportOASResponse.SuccessApis["+ i +"].ApiId"));
			successApi.setApiOperation(_ctx.stringValue("ImportOASResponse.SuccessApis["+ i +"].ApiOperation"));

			successApis.add(successApi);
		}
		importOASResponse.setSuccessApis(successApis);

		List<FailedApi> failedApis = new ArrayList<FailedApi>();
		for (int i = 0; i < _ctx.lengthValue("ImportOASResponse.FailedApis.Length"); i++) {
			FailedApi failedApi = new FailedApi();
			failedApi.setPath(_ctx.stringValue("ImportOASResponse.FailedApis["+ i +"].Path"));
			failedApi.setHttpMethod(_ctx.stringValue("ImportOASResponse.FailedApis["+ i +"].HttpMethod"));
			failedApi.setErrorMsg(_ctx.stringValue("ImportOASResponse.FailedApis["+ i +"].ErrorMsg"));

			failedApis.add(failedApi);
		}
		importOASResponse.setFailedApis(failedApis);

		List<FailedModel> failedModels = new ArrayList<FailedModel>();
		for (int i = 0; i < _ctx.lengthValue("ImportOASResponse.FailedModels.Length"); i++) {
			FailedModel failedModel = new FailedModel();
			failedModel.setErrorMsg(_ctx.stringValue("ImportOASResponse.FailedModels["+ i +"].ErrorMsg"));
			failedModel.setModelName(_ctx.stringValue("ImportOASResponse.FailedModels["+ i +"].ModelName"));
			failedModel.setGroupId(_ctx.stringValue("ImportOASResponse.FailedModels["+ i +"].GroupId"));

			failedModels.add(failedModel);
		}
		importOASResponse.setFailedModels(failedModels);

		List<SuccessModel> successModels = new ArrayList<SuccessModel>();
		for (int i = 0; i < _ctx.lengthValue("ImportOASResponse.SuccessModels.Length"); i++) {
			SuccessModel successModel = new SuccessModel();
			successModel.setModelUid(_ctx.stringValue("ImportOASResponse.SuccessModels["+ i +"].ModelUid"));
			successModel.setModelName(_ctx.stringValue("ImportOASResponse.SuccessModels["+ i +"].ModelName"));
			successModel.setGroupId(_ctx.stringValue("ImportOASResponse.SuccessModels["+ i +"].GroupId"));
			successModel.setModelOperation(_ctx.stringValue("ImportOASResponse.SuccessModels["+ i +"].ModelOperation"));

			successModels.add(successModel);
		}
		importOASResponse.setSuccessModels(successModels);
	 
	 	return importOASResponse;
	}
}