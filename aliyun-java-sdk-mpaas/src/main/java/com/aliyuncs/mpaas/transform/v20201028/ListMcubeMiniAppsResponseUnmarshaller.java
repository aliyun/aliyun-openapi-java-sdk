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

package com.aliyuncs.mpaas.transform.v20201028;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20201028.ListMcubeMiniAppsResponse;
import com.aliyuncs.mpaas.model.v20201028.ListMcubeMiniAppsResponse.ListMiniResult;
import com.aliyuncs.mpaas.model.v20201028.ListMcubeMiniAppsResponse.ListMiniResult.MiniProgramListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcubeMiniAppsResponseUnmarshaller {

	public static ListMcubeMiniAppsResponse unmarshall(ListMcubeMiniAppsResponse listMcubeMiniAppsResponse, UnmarshallerContext _ctx) {
		
		listMcubeMiniAppsResponse.setRequestId(_ctx.stringValue("ListMcubeMiniAppsResponse.RequestId"));
		listMcubeMiniAppsResponse.setResultCode(_ctx.stringValue("ListMcubeMiniAppsResponse.ResultCode"));
		listMcubeMiniAppsResponse.setResultMessage(_ctx.stringValue("ListMcubeMiniAppsResponse.ResultMessage"));

		ListMiniResult listMiniResult = new ListMiniResult();
		listMiniResult.setResultMsg(_ctx.stringValue("ListMcubeMiniAppsResponse.ListMiniResult.ResultMsg"));
		listMiniResult.setSuccess(_ctx.booleanValue("ListMcubeMiniAppsResponse.ListMiniResult.Success"));

		List<MiniProgramListItem> miniProgramList = new ArrayList<MiniProgramListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeMiniAppsResponse.ListMiniResult.MiniProgramList.Length"); i++) {
			MiniProgramListItem miniProgramListItem = new MiniProgramListItem();
			miniProgramListItem.setAppCode(_ctx.stringValue("ListMcubeMiniAppsResponse.ListMiniResult.MiniProgramList["+ i +"].AppCode"));
			miniProgramListItem.setGmtCreate(_ctx.stringValue("ListMcubeMiniAppsResponse.ListMiniResult.MiniProgramList["+ i +"].GmtCreate"));
			miniProgramListItem.setGmtModified(_ctx.stringValue("ListMcubeMiniAppsResponse.ListMiniResult.MiniProgramList["+ i +"].GmtModified"));
			miniProgramListItem.setH5Id(_ctx.stringValue("ListMcubeMiniAppsResponse.ListMiniResult.MiniProgramList["+ i +"].H5Id"));
			miniProgramListItem.setH5Name(_ctx.stringValue("ListMcubeMiniAppsResponse.ListMiniResult.MiniProgramList["+ i +"].H5Name"));

			miniProgramList.add(miniProgramListItem);
		}
		listMiniResult.setMiniProgramList(miniProgramList);
		listMcubeMiniAppsResponse.setListMiniResult(listMiniResult);
	 
	 	return listMcubeMiniAppsResponse;
	}
}