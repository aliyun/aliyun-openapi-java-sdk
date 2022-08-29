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

package com.aliyuncs.mpaas.transform.v20200415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20200415.ListMcubeWhitelistResponse;
import com.aliyuncs.mpaas.model.v20200415.ListMcubeWhitelistResponse.ListWhitelistResult;
import com.aliyuncs.mpaas.model.v20200415.ListMcubeWhitelistResponse.ListWhitelistResult.WhitelistsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcubeWhitelistResponseUnmarshaller {

	public static ListMcubeWhitelistResponse unmarshall(ListMcubeWhitelistResponse listMcubeWhitelistResponse, UnmarshallerContext _ctx) {
		
		listMcubeWhitelistResponse.setRequestId(_ctx.stringValue("ListMcubeWhitelistResponse.RequestId"));
		listMcubeWhitelistResponse.setResultMessage(_ctx.stringValue("ListMcubeWhitelistResponse.ResultMessage"));
		listMcubeWhitelistResponse.setResultCode(_ctx.stringValue("ListMcubeWhitelistResponse.ResultCode"));

		ListWhitelistResult listWhitelistResult = new ListWhitelistResult();
		listWhitelistResult.setSuccess(_ctx.booleanValue("ListMcubeWhitelistResponse.ListWhitelistResult.Success"));
		listWhitelistResult.setResultMsg(_ctx.stringValue("ListMcubeWhitelistResponse.ListWhitelistResult.ResultMsg"));

		List<WhitelistsItem> whitelists = new ArrayList<WhitelistsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeWhitelistResponse.ListWhitelistResult.Whitelists.Length"); i++) {
			WhitelistsItem whitelistsItem = new WhitelistsItem();
			whitelistsItem.setWhiteListCount(_ctx.longValue("ListMcubeWhitelistResponse.ListWhitelistResult.Whitelists["+ i +"].WhiteListCount"));
			whitelistsItem.setAppCode(_ctx.stringValue("ListMcubeWhitelistResponse.ListWhitelistResult.Whitelists["+ i +"].AppCode"));
			whitelistsItem.setGmtCreate(_ctx.stringValue("ListMcubeWhitelistResponse.ListWhitelistResult.Whitelists["+ i +"].GmtCreate"));
			whitelistsItem.setGmtModified(_ctx.stringValue("ListMcubeWhitelistResponse.ListWhitelistResult.Whitelists["+ i +"].GmtModified"));
			whitelistsItem.setWhitelistType(_ctx.stringValue("ListMcubeWhitelistResponse.ListWhitelistResult.Whitelists["+ i +"].WhitelistType"));
			whitelistsItem.setId(_ctx.longValue("ListMcubeWhitelistResponse.ListWhitelistResult.Whitelists["+ i +"].Id"));
			whitelistsItem.setWhiteListName(_ctx.stringValue("ListMcubeWhitelistResponse.ListWhitelistResult.Whitelists["+ i +"].WhiteListName"));

			whitelists.add(whitelistsItem);
		}
		listWhitelistResult.setWhitelists(whitelists);
		listMcubeWhitelistResponse.setListWhitelistResult(listWhitelistResult);
	 
	 	return listMcubeWhitelistResponse;
	}
}