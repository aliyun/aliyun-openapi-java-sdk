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

package com.aliyuncs.mpaas.transform.v20190821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20190821.ListMcubeWhitelistsResponse;
import com.aliyuncs.mpaas.model.v20190821.ListMcubeWhitelistsResponse.ListWhitelistResult;
import com.aliyuncs.mpaas.model.v20190821.ListMcubeWhitelistsResponse.ListWhitelistResult.WhitelistsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcubeWhitelistsResponseUnmarshaller {

	public static ListMcubeWhitelistsResponse unmarshall(ListMcubeWhitelistsResponse listMcubeWhitelistsResponse, UnmarshallerContext _ctx) {
		
		listMcubeWhitelistsResponse.setRequestId(_ctx.stringValue("ListMcubeWhitelistsResponse.RequestId"));
		listMcubeWhitelistsResponse.setResultCode(_ctx.stringValue("ListMcubeWhitelistsResponse.ResultCode"));
		listMcubeWhitelistsResponse.setResultMessage(_ctx.stringValue("ListMcubeWhitelistsResponse.ResultMessage"));

		ListWhitelistResult listWhitelistResult = new ListWhitelistResult();
		listWhitelistResult.setResultMsg(_ctx.stringValue("ListMcubeWhitelistsResponse.ListWhitelistResult.ResultMsg"));
		listWhitelistResult.setSuccess(_ctx.booleanValue("ListMcubeWhitelistsResponse.ListWhitelistResult.Success"));

		List<WhitelistsItem> whitelists = new ArrayList<WhitelistsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeWhitelistsResponse.ListWhitelistResult.Whitelists.Length"); i++) {
			WhitelistsItem whitelistsItem = new WhitelistsItem();
			whitelistsItem.setAppCode(_ctx.stringValue("ListMcubeWhitelistsResponse.ListWhitelistResult.Whitelists["+ i +"].AppCode"));
			whitelistsItem.setGmtCreate(_ctx.stringValue("ListMcubeWhitelistsResponse.ListWhitelistResult.Whitelists["+ i +"].GmtCreate"));
			whitelistsItem.setGmtModified(_ctx.stringValue("ListMcubeWhitelistsResponse.ListWhitelistResult.Whitelists["+ i +"].GmtModified"));
			whitelistsItem.setId(_ctx.longValue("ListMcubeWhitelistsResponse.ListWhitelistResult.Whitelists["+ i +"].Id"));
			whitelistsItem.setWhitelistType(_ctx.stringValue("ListMcubeWhitelistsResponse.ListWhitelistResult.Whitelists["+ i +"].WhitelistType"));
			whitelistsItem.setWhiteListCount(_ctx.longValue("ListMcubeWhitelistsResponse.ListWhitelistResult.Whitelists["+ i +"].WhiteListCount"));
			whitelistsItem.setWhiteListName(_ctx.stringValue("ListMcubeWhitelistsResponse.ListWhitelistResult.Whitelists["+ i +"].WhiteListName"));

			whitelists.add(whitelistsItem);
		}
		listWhitelistResult.setWhitelists(whitelists);
		listMcubeWhitelistsResponse.setListWhitelistResult(listWhitelistResult);
	 
	 	return listMcubeWhitelistsResponse;
	}
}