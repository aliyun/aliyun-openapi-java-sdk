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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutMiscgetgraylterationsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutMiscgetgraylterationsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutMiscgetgraylterationsResponseUnmarshaller {

	public static GetLinkeBahamutMiscgetgraylterationsResponse unmarshall(GetLinkeBahamutMiscgetgraylterationsResponse getLinkeBahamutMiscgetgraylterationsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutMiscgetgraylterationsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationsResponse.RequestId"));
		getLinkeBahamutMiscgetgraylterationsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationsResponse.ResultCode"));
		getLinkeBahamutMiscgetgraylterationsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationsResponse.ResultMessage"));
		getLinkeBahamutMiscgetgraylterationsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationsResponse.ErrorMessage"));
		getLinkeBahamutMiscgetgraylterationsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutMiscgetgraylterationsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationsResponse.Message"));
		getLinkeBahamutMiscgetgraylterationsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutMiscgetgraylterationsResponse.ResponseStatusCode"));
		getLinkeBahamutMiscgetgraylterationsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutMiscgetgraylterationsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutMiscgetgraylterationsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreateTime(_ctx.longValue("GetLinkeBahamutMiscgetgraylterationsResponse.Result["+ i +"].CreateTime"));
			resultItem.setCreator(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationsResponse.Result["+ i +"].Creator"));
			resultItem.setFinished(_ctx.booleanValue("GetLinkeBahamutMiscgetgraylterationsResponse.Result["+ i +"].Finished"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationsResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationsResponse.Result["+ i +"].Name"));
			resultItem.setReleaseId(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationsResponse.Result["+ i +"].ReleaseId"));
			resultItem.setReleaseTime(_ctx.longValue("GetLinkeBahamutMiscgetgraylterationsResponse.Result["+ i +"].ReleaseTime"));
			resultItem.setStage(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationsResponse.Result["+ i +"].Stage"));
			resultItem.setType(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationsResponse.Result["+ i +"].Type"));

			List<String> apps = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutMiscgetgraylterationsResponse.Result["+ i +"].Apps.Length"); j++) {
				apps.add(_ctx.stringValue("GetLinkeBahamutMiscgetgraylterationsResponse.Result["+ i +"].Apps["+ j +"]"));
			}
			resultItem.setApps(apps);

			result.add(resultItem);
		}
		getLinkeBahamutMiscgetgraylterationsResponse.setResult(result);
	 
	 	return getLinkeBahamutMiscgetgraylterationsResponse;
	}
}