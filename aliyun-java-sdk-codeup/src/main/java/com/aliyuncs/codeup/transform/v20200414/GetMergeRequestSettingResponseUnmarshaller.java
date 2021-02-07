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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.codeup.model.v20200414.GetMergeRequestSettingResponse;
import com.aliyuncs.codeup.model.v20200414.GetMergeRequestSettingResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMergeRequestSettingResponseUnmarshaller {

	public static GetMergeRequestSettingResponse unmarshall(GetMergeRequestSettingResponse getMergeRequestSettingResponse, UnmarshallerContext _ctx) {
		
		getMergeRequestSettingResponse.setRequestId(_ctx.stringValue("GetMergeRequestSettingResponse.RequestId"));
		getMergeRequestSettingResponse.setErrorCode(_ctx.stringValue("GetMergeRequestSettingResponse.ErrorCode"));
		getMergeRequestSettingResponse.setErrorMessage(_ctx.stringValue("GetMergeRequestSettingResponse.ErrorMessage"));
		getMergeRequestSettingResponse.setSuccess(_ctx.booleanValue("GetMergeRequestSettingResponse.Success"));

		Result result = new Result();
		result.setIsEnableSmartCodeReview(_ctx.booleanValue("GetMergeRequestSettingResponse.Result.IsEnableSmartCodeReview"));

		List<String> mergeTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetMergeRequestSettingResponse.Result.MergeTypes.Length"); i++) {
			mergeTypes.add(_ctx.stringValue("GetMergeRequestSettingResponse.Result.MergeTypes["+ i +"]"));
		}
		result.setMergeTypes(mergeTypes);
		getMergeRequestSettingResponse.setResult(result);
	 
	 	return getMergeRequestSettingResponse;
	}
}