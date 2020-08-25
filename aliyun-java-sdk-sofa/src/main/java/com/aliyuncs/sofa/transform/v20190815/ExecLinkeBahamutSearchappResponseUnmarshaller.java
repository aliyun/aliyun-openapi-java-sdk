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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeBahamutSearchappResponse;
import com.aliyuncs.sofa.model.v20190815.ExecLinkeBahamutSearchappResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeBahamutSearchappResponseUnmarshaller {

	public static ExecLinkeBahamutSearchappResponse unmarshall(ExecLinkeBahamutSearchappResponse execLinkeBahamutSearchappResponse, UnmarshallerContext _ctx) {
		
		execLinkeBahamutSearchappResponse.setRequestId(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.RequestId"));
		execLinkeBahamutSearchappResponse.setResultCode(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.ResultCode"));
		execLinkeBahamutSearchappResponse.setResultMessage(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.ResultMessage"));
		execLinkeBahamutSearchappResponse.setErrorMessage(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.ErrorMessage"));
		execLinkeBahamutSearchappResponse.setErrorMsgParamsMap(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.ErrorMsgParamsMap"));
		execLinkeBahamutSearchappResponse.setMessage(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.Message"));
		execLinkeBahamutSearchappResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeBahamutSearchappResponse.ResponseStatusCode"));
		execLinkeBahamutSearchappResponse.setSuccess(_ctx.booleanValue("ExecLinkeBahamutSearchappResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ExecLinkeBahamutSearchappResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppGroupName(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.Result["+ i +"].AppGroupName"));
			resultItem.setAppType(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.Result["+ i +"].AppType"));
			resultItem.setFirstArchDomain(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.Result["+ i +"].FirstArchDomain"));
			resultItem.setId(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.Result["+ i +"].Id"));
			resultItem.setLevel(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.Result["+ i +"].Level"));
			resultItem.setName(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.Result["+ i +"].Name"));
			resultItem.setRecentLiveTime(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.Result["+ i +"].RecentLiveTime"));
			resultItem.setSecondArchDomain(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.Result["+ i +"].SecondArchDomain"));
			resultItem.setStatus(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.Result["+ i +"].Status"));

			List<String> owners = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ExecLinkeBahamutSearchappResponse.Result["+ i +"].Owners.Length"); j++) {
				owners.add(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.Result["+ i +"].Owners["+ j +"]"));
			}
			resultItem.setOwners(owners);

			List<String> ownerObjs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ExecLinkeBahamutSearchappResponse.Result["+ i +"].OwnerObjs.Length"); j++) {
				ownerObjs.add(_ctx.stringValue("ExecLinkeBahamutSearchappResponse.Result["+ i +"].OwnerObjs["+ j +"]"));
			}
			resultItem.setOwnerObjs(ownerObjs);

			result.add(resultItem);
		}
		execLinkeBahamutSearchappResponse.setResult(result);
	 
	 	return execLinkeBahamutSearchappResponse;
	}
}