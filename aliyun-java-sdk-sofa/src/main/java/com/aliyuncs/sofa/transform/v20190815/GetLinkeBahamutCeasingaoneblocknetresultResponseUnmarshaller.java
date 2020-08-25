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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutCeasingaoneblocknetresultResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutCeasingaoneblocknetresultResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutCeasingaoneblocknetresultResponseUnmarshaller {

	public static GetLinkeBahamutCeasingaoneblocknetresultResponse unmarshall(GetLinkeBahamutCeasingaoneblocknetresultResponse getLinkeBahamutCeasingaoneblocknetresultResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutCeasingaoneblocknetresultResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutCeasingaoneblocknetresultResponse.RequestId"));
		getLinkeBahamutCeasingaoneblocknetresultResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutCeasingaoneblocknetresultResponse.ResultCode"));
		getLinkeBahamutCeasingaoneblocknetresultResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutCeasingaoneblocknetresultResponse.ResultMessage"));
		getLinkeBahamutCeasingaoneblocknetresultResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutCeasingaoneblocknetresultResponse.ErrorMessage"));
		getLinkeBahamutCeasingaoneblocknetresultResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutCeasingaoneblocknetresultResponse.ErrorMsgParamsMap"));
		getLinkeBahamutCeasingaoneblocknetresultResponse.setMessage(_ctx.stringValue("GetLinkeBahamutCeasingaoneblocknetresultResponse.Message"));
		getLinkeBahamutCeasingaoneblocknetresultResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutCeasingaoneblocknetresultResponse.ResponseStatusCode"));
		getLinkeBahamutCeasingaoneblocknetresultResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutCeasingaoneblocknetresultResponse.Success"));

		Result result = new Result();
		result.setApproved(_ctx.booleanValue("GetLinkeBahamutCeasingaoneblocknetresultResponse.Result.Approved"));

		List<String> blockList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutCeasingaoneblocknetresultResponse.Result.BlockList.Length"); i++) {
			blockList.add(_ctx.stringValue("GetLinkeBahamutCeasingaoneblocknetresultResponse.Result.BlockList["+ i +"]"));
		}
		result.setBlockList(blockList);
		getLinkeBahamutCeasingaoneblocknetresultResponse.setResult(result);
	 
	 	return getLinkeBahamutCeasingaoneblocknetresultResponse;
	}
}