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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListSearchSourceCodeResponse;
import com.aliyuncs.devops.model.v20210625.ListSearchSourceCodeResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListSearchSourceCodeResponse.ResultItem.HighlightTextMap;
import com.aliyuncs.devops.model.v20210625.ListSearchSourceCodeResponse.ResultItem.Source;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSearchSourceCodeResponseUnmarshaller {

	public static ListSearchSourceCodeResponse unmarshall(ListSearchSourceCodeResponse listSearchSourceCodeResponse, UnmarshallerContext _ctx) {
		
		listSearchSourceCodeResponse.setRequestId(_ctx.stringValue("ListSearchSourceCodeResponse.requestId"));
		listSearchSourceCodeResponse.setErrorMessage(_ctx.stringValue("ListSearchSourceCodeResponse.errorMessage"));
		listSearchSourceCodeResponse.setErrorCode(_ctx.stringValue("ListSearchSourceCodeResponse.errorCode"));
		listSearchSourceCodeResponse.setSuccess(_ctx.booleanValue("ListSearchSourceCodeResponse.success"));
		listSearchSourceCodeResponse.setTotal(_ctx.longValue("ListSearchSourceCodeResponse.total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSearchSourceCodeResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDocId(_ctx.stringValue("ListSearchSourceCodeResponse.result["+ i +"].docId"));

			HighlightTextMap highlightTextMap = new HighlightTextMap();
			highlightTextMap.setOrganizationId(_ctx.stringValue("ListSearchSourceCodeResponse.result["+ i +"].highlightTextMap.organizationId"));
			highlightTextMap.setFileName(_ctx.stringValue("ListSearchSourceCodeResponse.result["+ i +"].highlightTextMap.fileName"));
			highlightTextMap.setClob(_ctx.stringValue("ListSearchSourceCodeResponse.result["+ i +"].highlightTextMap.clob"));
			highlightTextMap.setLanguage(_ctx.stringValue("ListSearchSourceCodeResponse.result["+ i +"].highlightTextMap.language"));
			resultItem.setHighlightTextMap(highlightTextMap);

			Source source = new Source();
			source.setRepoPath(_ctx.stringValue("ListSearchSourceCodeResponse.result["+ i +"].source.repoPath"));
			source.setFileName(_ctx.stringValue("ListSearchSourceCodeResponse.result["+ i +"].source.fileName"));
			source.setFilePath(_ctx.stringValue("ListSearchSourceCodeResponse.result["+ i +"].source.filePath"));
			source.setLanguage(_ctx.stringValue("ListSearchSourceCodeResponse.result["+ i +"].source.language"));
			source.setCheckinDate(_ctx.stringValue("ListSearchSourceCodeResponse.result["+ i +"].source.checkinDate"));
			source.setBranch(_ctx.stringValue("ListSearchSourceCodeResponse.result["+ i +"].source.branch"));
			source.setOrganizationId(_ctx.stringValue("ListSearchSourceCodeResponse.result["+ i +"].source.organizationId"));
			resultItem.setSource(source);

			result.add(resultItem);
		}
		listSearchSourceCodeResponse.setResult(result);
	 
	 	return listSearchSourceCodeResponse;
	}
}