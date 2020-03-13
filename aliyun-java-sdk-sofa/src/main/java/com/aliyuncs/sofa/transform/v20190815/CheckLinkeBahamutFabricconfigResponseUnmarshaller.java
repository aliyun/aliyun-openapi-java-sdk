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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutFabricconfigResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutFabricconfigResponse.Result;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutFabricconfigResponse.Result.CheckListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutFabricconfigResponseUnmarshaller {

	public static CheckLinkeBahamutFabricconfigResponse unmarshall(CheckLinkeBahamutFabricconfigResponse checkLinkeBahamutFabricconfigResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutFabricconfigResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutFabricconfigResponse.RequestId"));
		checkLinkeBahamutFabricconfigResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutFabricconfigResponse.ResultCode"));
		checkLinkeBahamutFabricconfigResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutFabricconfigResponse.ResultMessage"));
		checkLinkeBahamutFabricconfigResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutFabricconfigResponse.ErrorMessage"));
		checkLinkeBahamutFabricconfigResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutFabricconfigResponse.Message"));
		checkLinkeBahamutFabricconfigResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutFabricconfigResponse.Success"));

		Result result = new Result();
		result.setDetailMessage(_ctx.stringValue("CheckLinkeBahamutFabricconfigResponse.Result.DetailMessage"));
		result.setForceStop(_ctx.booleanValue("CheckLinkeBahamutFabricconfigResponse.Result.ForceStop"));
		result.setPass(_ctx.booleanValue("CheckLinkeBahamutFabricconfigResponse.Result.Pass"));

		List<CheckListItem> checkList = new ArrayList<CheckListItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeBahamutFabricconfigResponse.Result.CheckList.Length"); i++) {
			CheckListItem checkListItem = new CheckListItem();
			checkListItem.setCheckItem(_ctx.stringValue("CheckLinkeBahamutFabricconfigResponse.Result.CheckList["+ i +"].CheckItem"));
			checkListItem.setConfigType(_ctx.stringValue("CheckLinkeBahamutFabricconfigResponse.Result.CheckList["+ i +"].ConfigType"));
			checkListItem.setDetailMessage(_ctx.stringValue("CheckLinkeBahamutFabricconfigResponse.Result.CheckList["+ i +"].DetailMessage"));
			checkListItem.setForceStop(_ctx.booleanValue("CheckLinkeBahamutFabricconfigResponse.Result.CheckList["+ i +"].ForceStop"));
			checkListItem.setPass(_ctx.booleanValue("CheckLinkeBahamutFabricconfigResponse.Result.CheckList["+ i +"].Pass"));

			checkList.add(checkListItem);
		}
		result.setCheckList(checkList);
		checkLinkeBahamutFabricconfigResponse.setResult(result);
	 
	 	return checkLinkeBahamutFabricconfigResponse;
	}
}