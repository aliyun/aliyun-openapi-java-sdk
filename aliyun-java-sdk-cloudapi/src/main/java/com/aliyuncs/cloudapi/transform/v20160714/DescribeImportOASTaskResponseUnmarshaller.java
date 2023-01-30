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

import com.aliyuncs.cloudapi.model.v20160714.DescribeImportOASTaskResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeImportOASTaskResponse.ApiResult;
import com.aliyuncs.cloudapi.model.v20160714.DescribeImportOASTaskResponse.ModelResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImportOASTaskResponseUnmarshaller {

	public static DescribeImportOASTaskResponse unmarshall(DescribeImportOASTaskResponse describeImportOASTaskResponse, UnmarshallerContext _ctx) {
		
		describeImportOASTaskResponse.setRequestId(_ctx.stringValue("DescribeImportOASTaskResponse.RequestId"));
		describeImportOASTaskResponse.setTaskStatus(_ctx.stringValue("DescribeImportOASTaskResponse.TaskStatus"));

		List<ApiResult> apiResults = new ArrayList<ApiResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImportOASTaskResponse.ApiResults.Length"); i++) {
			ApiResult apiResult = new ApiResult();
			apiResult.setApiId(_ctx.stringValue("DescribeImportOASTaskResponse.ApiResults["+ i +"].ApiId"));
			apiResult.setPath(_ctx.stringValue("DescribeImportOASTaskResponse.ApiResults["+ i +"].Path"));
			apiResult.setBizMethod(_ctx.stringValue("DescribeImportOASTaskResponse.ApiResults["+ i +"].Method"));
			apiResult.setDescription(_ctx.stringValue("DescribeImportOASTaskResponse.ApiResults["+ i +"].Description"));
			apiResult.setGroupId(_ctx.stringValue("DescribeImportOASTaskResponse.ApiResults["+ i +"].GroupId"));
			apiResult.setApiName(_ctx.stringValue("DescribeImportOASTaskResponse.ApiResults["+ i +"].ApiName"));
			apiResult.setErrorMessage(_ctx.stringValue("DescribeImportOASTaskResponse.ApiResults["+ i +"].ErrorMessage"));
			apiResult.setUpdateStatus(_ctx.stringValue("DescribeImportOASTaskResponse.ApiResults["+ i +"].UpdateStatus"));

			apiResults.add(apiResult);
		}
		describeImportOASTaskResponse.setApiResults(apiResults);

		List<ModelResult> modelResults = new ArrayList<ModelResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImportOASTaskResponse.ModelResults.Length"); i++) {
			ModelResult modelResult = new ModelResult();
			modelResult.setModelName(_ctx.stringValue("DescribeImportOASTaskResponse.ModelResults["+ i +"].ModelName"));
			modelResult.setModelId(_ctx.stringValue("DescribeImportOASTaskResponse.ModelResults["+ i +"].ModelId"));
			modelResult.setGroupId(_ctx.stringValue("DescribeImportOASTaskResponse.ModelResults["+ i +"].GroupId"));
			modelResult.setErrorMessage(_ctx.stringValue("DescribeImportOASTaskResponse.ModelResults["+ i +"].ErrorMessage"));
			modelResult.setUpdateStatus(_ctx.stringValue("DescribeImportOASTaskResponse.ModelResults["+ i +"].UpdateStatus"));

			modelResults.add(modelResult);
		}
		describeImportOASTaskResponse.setModelResults(modelResults);
	 
	 	return describeImportOASTaskResponse;
	}
}