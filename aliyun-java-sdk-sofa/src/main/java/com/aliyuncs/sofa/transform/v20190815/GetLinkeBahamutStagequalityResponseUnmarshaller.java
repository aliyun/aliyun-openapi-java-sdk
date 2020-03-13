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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutStagequalityResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutStagequalityResponse.Result;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutStagequalityResponse.Result.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutStagequalityResponseUnmarshaller {

	public static GetLinkeBahamutStagequalityResponse unmarshall(GetLinkeBahamutStagequalityResponse getLinkeBahamutStagequalityResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutStagequalityResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutStagequalityResponse.RequestId"));
		getLinkeBahamutStagequalityResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutStagequalityResponse.ResultCode"));
		getLinkeBahamutStagequalityResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutStagequalityResponse.ResultMessage"));
		getLinkeBahamutStagequalityResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutStagequalityResponse.ErrorMessage"));
		getLinkeBahamutStagequalityResponse.setMessage(_ctx.stringValue("GetLinkeBahamutStagequalityResponse.Message"));
		getLinkeBahamutStagequalityResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutStagequalityResponse.Success"));

		Result result = new Result();
		result.setAppName(_ctx.stringValue("GetLinkeBahamutStagequalityResponse.Result.AppName"));
		result.setBranch(_ctx.stringValue("GetLinkeBahamutStagequalityResponse.Result.Branch"));
		result.setCodeName(_ctx.stringValue("GetLinkeBahamutStagequalityResponse.Result.CodeName"));
		result.setPass(_ctx.booleanValue("GetLinkeBahamutStagequalityResponse.Result.Pass"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutStagequalityResponse.Result.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setKey(_ctx.stringValue("GetLinkeBahamutStagequalityResponse.Result.Items["+ i +"].Key"));
			itemsItem.setLink(_ctx.stringValue("GetLinkeBahamutStagequalityResponse.Result.Items["+ i +"].Link"));
			itemsItem.setMeetTheRule(_ctx.booleanValue("GetLinkeBahamutStagequalityResponse.Result.Items["+ i +"].MeetTheRule"));
			itemsItem.setMessage(_ctx.stringValue("GetLinkeBahamutStagequalityResponse.Result.Items["+ i +"].Message"));
			itemsItem.setRule(_ctx.stringValue("GetLinkeBahamutStagequalityResponse.Result.Items["+ i +"].Rule"));
			itemsItem.setValue(_ctx.stringValue("GetLinkeBahamutStagequalityResponse.Result.Items["+ i +"].Value"));

			items.add(itemsItem);
		}
		result.setItems(items);
		getLinkeBahamutStagequalityResponse.setResult(result);
	 
	 	return getLinkeBahamutStagequalityResponse;
	}
}