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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPomgetpomentitiesResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutPomgetpomentitiesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutPomgetpomentitiesResponseUnmarshaller {

	public static GetLinkeBahamutPomgetpomentitiesResponse unmarshall(GetLinkeBahamutPomgetpomentitiesResponse getLinkeBahamutPomgetpomentitiesResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutPomgetpomentitiesResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.RequestId"));
		getLinkeBahamutPomgetpomentitiesResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.ResultCode"));
		getLinkeBahamutPomgetpomentitiesResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.ResultMessage"));
		getLinkeBahamutPomgetpomentitiesResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.ErrorMessage"));
		getLinkeBahamutPomgetpomentitiesResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.ErrorMsgParamsMap"));
		getLinkeBahamutPomgetpomentitiesResponse.setMessage(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.Message"));
		getLinkeBahamutPomgetpomentitiesResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutPomgetpomentitiesResponse.ResponseStatusCode"));
		getLinkeBahamutPomgetpomentitiesResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutPomgetpomentitiesResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutPomgetpomentitiesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setArtifactId(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.Result["+ i +"].ArtifactId"));
			resultItem.setGroupId(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.Result["+ i +"].GroupId"));
			resultItem.setPackaging(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.Result["+ i +"].Packaging"));
			resultItem.setParentArtifactId(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.Result["+ i +"].ParentArtifactId"));
			resultItem.setParentGroupId(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.Result["+ i +"].ParentGroupId"));
			resultItem.setPomKeyString(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.Result["+ i +"].PomKeyString"));
			resultItem.setProperties(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.Result["+ i +"].Properties"));
			resultItem.setRelativePath(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.Result["+ i +"].RelativePath"));
			resultItem.setVersion(_ctx.stringValue("GetLinkeBahamutPomgetpomentitiesResponse.Result["+ i +"].Version"));

			result.add(resultItem);
		}
		getLinkeBahamutPomgetpomentitiesResponse.setResult(result);
	 
	 	return getLinkeBahamutPomgetpomentitiesResponse;
	}
}