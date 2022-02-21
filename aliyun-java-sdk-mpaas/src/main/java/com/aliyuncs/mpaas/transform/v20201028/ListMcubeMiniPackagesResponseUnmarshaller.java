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

import com.aliyuncs.mpaas.model.v20201028.ListMcubeMiniPackagesResponse;
import com.aliyuncs.mpaas.model.v20201028.ListMcubeMiniPackagesResponse.ListMiniPackageResult;
import com.aliyuncs.mpaas.model.v20201028.ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcubeMiniPackagesResponseUnmarshaller {

	public static ListMcubeMiniPackagesResponse unmarshall(ListMcubeMiniPackagesResponse listMcubeMiniPackagesResponse, UnmarshallerContext _ctx) {
		
		listMcubeMiniPackagesResponse.setRequestId(_ctx.stringValue("ListMcubeMiniPackagesResponse.RequestId"));
		listMcubeMiniPackagesResponse.setResultMessage(_ctx.stringValue("ListMcubeMiniPackagesResponse.ResultMessage"));
		listMcubeMiniPackagesResponse.setResultCode(_ctx.stringValue("ListMcubeMiniPackagesResponse.ResultCode"));

		ListMiniPackageResult listMiniPackageResult = new ListMiniPackageResult();
		listMiniPackageResult.setSuccess(_ctx.booleanValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.Success"));
		listMiniPackageResult.setResultMsg(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.ResultMsg"));

		List<MiniPackageListItem> miniPackageList = new ArrayList<MiniPackageListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList.Length"); i++) {
			MiniPackageListItem miniPackageListItem = new MiniPackageListItem();
			miniPackageListItem.setStatus(_ctx.longValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].Status"));
			miniPackageListItem.setDownloadUrl(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].DownloadUrl"));
			miniPackageListItem.setAppCode(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].AppCode"));
			miniPackageListItem.setMemo(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].Memo"));
			miniPackageListItem.setH5Id(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].H5Id"));
			miniPackageListItem.setH5Version(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].H5Version"));
			miniPackageListItem.setPublishPeriod(_ctx.longValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].PublishPeriod"));
			miniPackageListItem.setGmtModified(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].GmtModified"));
			miniPackageListItem.setPackageType(_ctx.longValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].PackageType"));
			miniPackageListItem.setExtendInfo(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].ExtendInfo"));
			miniPackageListItem.setFallbackBaseUrl(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].FallbackBaseUrl"));
			miniPackageListItem.setResourceType(_ctx.longValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].ResourceType"));
			miniPackageListItem.setAutoInstall(_ctx.longValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].AutoInstall"));
			miniPackageListItem.setInstallType(_ctx.longValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].InstallType"));
			miniPackageListItem.setClientVersionMax(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].ClientVersionMax"));
			miniPackageListItem.setPlatform(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].Platform"));
			miniPackageListItem.setH5Name(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].H5Name"));
			miniPackageListItem.setGmtCreate(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].GmtCreate"));
			miniPackageListItem.setClientVersionMin(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].ClientVersionMin"));
			miniPackageListItem.setMainUrl(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].MainUrl"));
			miniPackageListItem.setId(_ctx.longValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].Id"));
			miniPackageListItem.setExtraData(_ctx.stringValue("ListMcubeMiniPackagesResponse.ListMiniPackageResult.MiniPackageList["+ i +"].ExtraData"));

			miniPackageList.add(miniPackageListItem);
		}
		listMiniPackageResult.setMiniPackageList(miniPackageList);
		listMcubeMiniPackagesResponse.setListMiniPackageResult(listMiniPackageResult);
	 
	 	return listMcubeMiniPackagesResponse;
	}
}