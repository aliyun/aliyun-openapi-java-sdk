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

import com.aliyuncs.mpaas.model.v20201028.ListMcubeNebulaAppsResponse;
import com.aliyuncs.mpaas.model.v20201028.ListMcubeNebulaAppsResponse.ListMcubeNebulaAppsResult;
import com.aliyuncs.mpaas.model.v20201028.ListMcubeNebulaAppsResponse.ListMcubeNebulaAppsResult.NebulaAppInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcubeNebulaAppsResponseUnmarshaller {

	public static ListMcubeNebulaAppsResponse unmarshall(ListMcubeNebulaAppsResponse listMcubeNebulaAppsResponse, UnmarshallerContext _ctx) {
		
		listMcubeNebulaAppsResponse.setRequestId(_ctx.stringValue("ListMcubeNebulaAppsResponse.RequestId"));
		listMcubeNebulaAppsResponse.setResultCode(_ctx.stringValue("ListMcubeNebulaAppsResponse.ResultCode"));
		listMcubeNebulaAppsResponse.setResultMessage(_ctx.stringValue("ListMcubeNebulaAppsResponse.ResultMessage"));

		ListMcubeNebulaAppsResult listMcubeNebulaAppsResult = new ListMcubeNebulaAppsResult();
		listMcubeNebulaAppsResult.setErrorCode(_ctx.stringValue("ListMcubeNebulaAppsResponse.ListMcubeNebulaAppsResult.ErrorCode"));
		listMcubeNebulaAppsResult.setResultMsg(_ctx.stringValue("ListMcubeNebulaAppsResponse.ListMcubeNebulaAppsResult.ResultMsg"));
		listMcubeNebulaAppsResult.setSuccess(_ctx.booleanValue("ListMcubeNebulaAppsResponse.ListMcubeNebulaAppsResult.Success"));
		listMcubeNebulaAppsResult.setRequestId(_ctx.stringValue("ListMcubeNebulaAppsResponse.ListMcubeNebulaAppsResult.RequestId"));

		List<NebulaAppInfosItem> nebulaAppInfos = new ArrayList<NebulaAppInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeNebulaAppsResponse.ListMcubeNebulaAppsResult.NebulaAppInfos.Length"); i++) {
			NebulaAppInfosItem nebulaAppInfosItem = new NebulaAppInfosItem();
			nebulaAppInfosItem.setH5Id(_ctx.stringValue("ListMcubeNebulaAppsResponse.ListMcubeNebulaAppsResult.NebulaAppInfos["+ i +"].H5Id"));
			nebulaAppInfosItem.setH5Name(_ctx.stringValue("ListMcubeNebulaAppsResponse.ListMcubeNebulaAppsResult.NebulaAppInfos["+ i +"].H5Name"));

			nebulaAppInfos.add(nebulaAppInfosItem);
		}
		listMcubeNebulaAppsResult.setNebulaAppInfos(nebulaAppInfos);
		listMcubeNebulaAppsResponse.setListMcubeNebulaAppsResult(listMcubeNebulaAppsResult);
	 
	 	return listMcubeNebulaAppsResponse;
	}
}