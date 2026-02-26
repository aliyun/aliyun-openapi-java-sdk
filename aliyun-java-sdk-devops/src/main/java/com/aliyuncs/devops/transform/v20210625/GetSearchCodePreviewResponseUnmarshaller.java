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

import com.aliyuncs.devops.model.v20210625.GetSearchCodePreviewResponse;
import com.aliyuncs.devops.model.v20210625.GetSearchCodePreviewResponse.Result;
import com.aliyuncs.devops.model.v20210625.GetSearchCodePreviewResponse.Result.HighlightTextMap;
import com.aliyuncs.devops.model.v20210625.GetSearchCodePreviewResponse.Result.Source;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSearchCodePreviewResponseUnmarshaller {

	public static GetSearchCodePreviewResponse unmarshall(GetSearchCodePreviewResponse getSearchCodePreviewResponse, UnmarshallerContext _ctx) {
		
		getSearchCodePreviewResponse.setRequestId(_ctx.stringValue("GetSearchCodePreviewResponse.requestId"));
		getSearchCodePreviewResponse.setErrorCode(_ctx.stringValue("GetSearchCodePreviewResponse.errorCode"));
		getSearchCodePreviewResponse.setErrorMessage(_ctx.stringValue("GetSearchCodePreviewResponse.errorMessage"));
		getSearchCodePreviewResponse.setSuccess(_ctx.booleanValue("GetSearchCodePreviewResponse.success"));

		Result result = new Result();
		result.setDocId(_ctx.stringValue("GetSearchCodePreviewResponse.result.docId"));

		HighlightTextMap highlightTextMap = new HighlightTextMap();
		highlightTextMap.setOrganizationId(_ctx.stringValue("GetSearchCodePreviewResponse.result.highlightTextMap.organizationId"));
		highlightTextMap.setFileName(_ctx.stringValue("GetSearchCodePreviewResponse.result.highlightTextMap.fileName"));
		highlightTextMap.setClob(_ctx.stringValue("GetSearchCodePreviewResponse.result.highlightTextMap.clob"));
		result.setHighlightTextMap(highlightTextMap);

		Source source = new Source();
		source.setRepoPath(_ctx.stringValue("GetSearchCodePreviewResponse.result.source.repoPath"));
		source.setFileName(_ctx.stringValue("GetSearchCodePreviewResponse.result.source.fileName"));
		source.setFilePath(_ctx.stringValue("GetSearchCodePreviewResponse.result.source.filePath"));
		source.setLanguage(_ctx.stringValue("GetSearchCodePreviewResponse.result.source.language"));
		source.setCheckinDate(_ctx.stringValue("GetSearchCodePreviewResponse.result.source.checkinDate"));
		source.setBranch(_ctx.stringValue("GetSearchCodePreviewResponse.result.source.branch"));
		source.setOrganizationId(_ctx.stringValue("GetSearchCodePreviewResponse.result.source.organizationId"));
		result.setSource(source);
		getSearchCodePreviewResponse.setResult(result);
	 
	 	return getSearchCodePreviewResponse;
	}
}