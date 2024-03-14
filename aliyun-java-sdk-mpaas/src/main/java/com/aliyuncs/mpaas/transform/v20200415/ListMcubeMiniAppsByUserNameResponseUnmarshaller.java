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

import com.aliyuncs.mpaas.model.v20200415.ListMcubeMiniAppsByUserNameResponse;
import com.aliyuncs.mpaas.model.v20200415.ListMcubeMiniAppsByUserNameResponse.ListMiniResult;
import com.aliyuncs.mpaas.model.v20200415.ListMcubeMiniAppsByUserNameResponse.ListMiniResult.MiniProgramListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcubeMiniAppsByUserNameResponseUnmarshaller {

	public static ListMcubeMiniAppsByUserNameResponse unmarshall(ListMcubeMiniAppsByUserNameResponse listMcubeMiniAppsByUserNameResponse, UnmarshallerContext _ctx) {
		
		listMcubeMiniAppsByUserNameResponse.setRequestId(_ctx.stringValue("ListMcubeMiniAppsByUserNameResponse.RequestId"));
		listMcubeMiniAppsByUserNameResponse.setResultMessage(_ctx.stringValue("ListMcubeMiniAppsByUserNameResponse.ResultMessage"));
		listMcubeMiniAppsByUserNameResponse.setResultCode(_ctx.stringValue("ListMcubeMiniAppsByUserNameResponse.ResultCode"));

		ListMiniResult listMiniResult = new ListMiniResult();
		listMiniResult.setSuccess(_ctx.booleanValue("ListMcubeMiniAppsByUserNameResponse.ListMiniResult.Success"));
		listMiniResult.setResultMsg(_ctx.stringValue("ListMcubeMiniAppsByUserNameResponse.ListMiniResult.ResultMsg"));

		List<MiniProgramListItem> miniProgramList = new ArrayList<MiniProgramListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeMiniAppsByUserNameResponse.ListMiniResult.MiniProgramList.Length"); i++) {
			MiniProgramListItem miniProgramListItem = new MiniProgramListItem();
			miniProgramListItem.setH5Name(_ctx.stringValue("ListMcubeMiniAppsByUserNameResponse.ListMiniResult.MiniProgramList["+ i +"].H5Name"));
			miniProgramListItem.setH5Id(_ctx.stringValue("ListMcubeMiniAppsByUserNameResponse.ListMiniResult.MiniProgramList["+ i +"].H5Id"));
			miniProgramListItem.setGmtCreate(_ctx.stringValue("ListMcubeMiniAppsByUserNameResponse.ListMiniResult.MiniProgramList["+ i +"].GmtCreate"));
			miniProgramListItem.setGmtModified(_ctx.stringValue("ListMcubeMiniAppsByUserNameResponse.ListMiniResult.MiniProgramList["+ i +"].GmtModified"));
			miniProgramListItem.setAppCode(_ctx.stringValue("ListMcubeMiniAppsByUserNameResponse.ListMiniResult.MiniProgramList["+ i +"].AppCode"));

			miniProgramList.add(miniProgramListItem);
		}
		listMiniResult.setMiniProgramList(miniProgramList);
		listMcubeMiniAppsByUserNameResponse.setListMiniResult(listMiniResult);
	 
	 	return listMcubeMiniAppsByUserNameResponse;
	}
}