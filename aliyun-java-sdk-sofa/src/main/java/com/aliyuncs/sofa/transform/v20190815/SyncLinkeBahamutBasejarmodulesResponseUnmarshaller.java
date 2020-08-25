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

import com.aliyuncs.sofa.model.v20190815.SyncLinkeBahamutBasejarmodulesResponse;
import com.aliyuncs.sofa.model.v20190815.SyncLinkeBahamutBasejarmodulesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncLinkeBahamutBasejarmodulesResponseUnmarshaller {

	public static SyncLinkeBahamutBasejarmodulesResponse unmarshall(SyncLinkeBahamutBasejarmodulesResponse syncLinkeBahamutBasejarmodulesResponse, UnmarshallerContext _ctx) {
		
		syncLinkeBahamutBasejarmodulesResponse.setRequestId(_ctx.stringValue("SyncLinkeBahamutBasejarmodulesResponse.RequestId"));
		syncLinkeBahamutBasejarmodulesResponse.setResultCode(_ctx.stringValue("SyncLinkeBahamutBasejarmodulesResponse.ResultCode"));
		syncLinkeBahamutBasejarmodulesResponse.setResultMessage(_ctx.stringValue("SyncLinkeBahamutBasejarmodulesResponse.ResultMessage"));
		syncLinkeBahamutBasejarmodulesResponse.setErrorMessage(_ctx.stringValue("SyncLinkeBahamutBasejarmodulesResponse.ErrorMessage"));
		syncLinkeBahamutBasejarmodulesResponse.setErrorMsgParamsMap(_ctx.stringValue("SyncLinkeBahamutBasejarmodulesResponse.ErrorMsgParamsMap"));
		syncLinkeBahamutBasejarmodulesResponse.setMessage(_ctx.stringValue("SyncLinkeBahamutBasejarmodulesResponse.Message"));
		syncLinkeBahamutBasejarmodulesResponse.setResponseStatusCode(_ctx.longValue("SyncLinkeBahamutBasejarmodulesResponse.ResponseStatusCode"));
		syncLinkeBahamutBasejarmodulesResponse.setSuccess(_ctx.booleanValue("SyncLinkeBahamutBasejarmodulesResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("SyncLinkeBahamutBasejarmodulesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setArtifactId(_ctx.stringValue("SyncLinkeBahamutBasejarmodulesResponse.Result["+ i +"].ArtifactId"));
			resultItem.setClassifier(_ctx.stringValue("SyncLinkeBahamutBasejarmodulesResponse.Result["+ i +"].Classifier"));
			resultItem.setGroupId(_ctx.stringValue("SyncLinkeBahamutBasejarmodulesResponse.Result["+ i +"].GroupId"));
			resultItem.setModuleType(_ctx.stringValue("SyncLinkeBahamutBasejarmodulesResponse.Result["+ i +"].ModuleType"));

			result.add(resultItem);
		}
		syncLinkeBahamutBasejarmodulesResponse.setResult(result);
	 
	 	return syncLinkeBahamutBasejarmodulesResponse;
	}
}