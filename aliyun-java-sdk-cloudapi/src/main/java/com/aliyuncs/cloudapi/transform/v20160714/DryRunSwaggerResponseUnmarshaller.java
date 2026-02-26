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

import com.aliyuncs.cloudapi.model.v20160714.DryRunSwaggerResponse;
import com.aliyuncs.cloudapi.model.v20160714.DryRunSwaggerResponse.ApiDryRunSwaggerSuccess;
import com.aliyuncs.cloudapi.model.v20160714.DryRunSwaggerResponse.ApiImportModelFailed;
import com.aliyuncs.cloudapi.model.v20160714.DryRunSwaggerResponse.ApiImportModelSuccess;
import com.aliyuncs.cloudapi.model.v20160714.DryRunSwaggerResponse.ApiImportSwaggerFailed;
import com.aliyuncs.transform.UnmarshallerContext;


public class DryRunSwaggerResponseUnmarshaller {

	public static DryRunSwaggerResponse unmarshall(DryRunSwaggerResponse dryRunSwaggerResponse, UnmarshallerContext _ctx) {
		
		dryRunSwaggerResponse.setRequestId(_ctx.stringValue("DryRunSwaggerResponse.RequestId"));
		dryRunSwaggerResponse.setGlobalCondition(_ctx.stringValue("DryRunSwaggerResponse.GlobalCondition"));

		List<ApiDryRunSwaggerSuccess> success = new ArrayList<ApiDryRunSwaggerSuccess>();
		for (int i = 0; i < _ctx.lengthValue("DryRunSwaggerResponse.Success.Length"); i++) {
			ApiDryRunSwaggerSuccess apiDryRunSwaggerSuccess = new ApiDryRunSwaggerSuccess();
			apiDryRunSwaggerSuccess.setPath(_ctx.stringValue("DryRunSwaggerResponse.Success["+ i +"].Path"));
			apiDryRunSwaggerSuccess.setHttpMethod(_ctx.stringValue("DryRunSwaggerResponse.Success["+ i +"].HttpMethod"));
			apiDryRunSwaggerSuccess.setApiSwagger(_ctx.stringValue("DryRunSwaggerResponse.Success["+ i +"].ApiSwagger"));
			apiDryRunSwaggerSuccess.setApiOperation(_ctx.stringValue("DryRunSwaggerResponse.Success["+ i +"].ApiOperation"));
			apiDryRunSwaggerSuccess.setApiUid(_ctx.stringValue("DryRunSwaggerResponse.Success["+ i +"].ApiUid"));

			success.add(apiDryRunSwaggerSuccess);
		}
		dryRunSwaggerResponse.setSuccess(success);

		List<ApiImportSwaggerFailed> failed = new ArrayList<ApiImportSwaggerFailed>();
		for (int i = 0; i < _ctx.lengthValue("DryRunSwaggerResponse.Failed.Length"); i++) {
			ApiImportSwaggerFailed apiImportSwaggerFailed = new ApiImportSwaggerFailed();
			apiImportSwaggerFailed.setPath(_ctx.stringValue("DryRunSwaggerResponse.Failed["+ i +"].Path"));
			apiImportSwaggerFailed.setHttpMethod(_ctx.stringValue("DryRunSwaggerResponse.Failed["+ i +"].HttpMethod"));
			apiImportSwaggerFailed.setErrorMsg(_ctx.stringValue("DryRunSwaggerResponse.Failed["+ i +"].ErrorMsg"));

			failed.add(apiImportSwaggerFailed);
		}
		dryRunSwaggerResponse.setFailed(failed);

		List<ApiImportModelFailed> modelFailed = new ArrayList<ApiImportModelFailed>();
		for (int i = 0; i < _ctx.lengthValue("DryRunSwaggerResponse.ModelFailed.Length"); i++) {
			ApiImportModelFailed apiImportModelFailed = new ApiImportModelFailed();
			apiImportModelFailed.setErrorMsg(_ctx.stringValue("DryRunSwaggerResponse.ModelFailed["+ i +"].ErrorMsg"));
			apiImportModelFailed.setModelName(_ctx.stringValue("DryRunSwaggerResponse.ModelFailed["+ i +"].ModelName"));
			apiImportModelFailed.setGroupId(_ctx.stringValue("DryRunSwaggerResponse.ModelFailed["+ i +"].GroupId"));

			modelFailed.add(apiImportModelFailed);
		}
		dryRunSwaggerResponse.setModelFailed(modelFailed);

		List<ApiImportModelSuccess> modelSuccess = new ArrayList<ApiImportModelSuccess>();
		for (int i = 0; i < _ctx.lengthValue("DryRunSwaggerResponse.ModelSuccess.Length"); i++) {
			ApiImportModelSuccess apiImportModelSuccess = new ApiImportModelSuccess();
			apiImportModelSuccess.setModelUid(_ctx.stringValue("DryRunSwaggerResponse.ModelSuccess["+ i +"].ModelUid"));
			apiImportModelSuccess.setModelName(_ctx.stringValue("DryRunSwaggerResponse.ModelSuccess["+ i +"].ModelName"));
			apiImportModelSuccess.setGroupId(_ctx.stringValue("DryRunSwaggerResponse.ModelSuccess["+ i +"].GroupId"));
			apiImportModelSuccess.setModelOperation(_ctx.stringValue("DryRunSwaggerResponse.ModelSuccess["+ i +"].ModelOperation"));

			modelSuccess.add(apiImportModelSuccess);
		}
		dryRunSwaggerResponse.setModelSuccess(modelSuccess);
	 
	 	return dryRunSwaggerResponse;
	}
}