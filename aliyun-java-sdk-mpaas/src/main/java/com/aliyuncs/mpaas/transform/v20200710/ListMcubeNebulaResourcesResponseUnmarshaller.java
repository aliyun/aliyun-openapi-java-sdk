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

package com.aliyuncs.mpaas.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20200710.ListMcubeNebulaResourcesResponse;
import com.aliyuncs.mpaas.model.v20200710.ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult;
import com.aliyuncs.mpaas.model.v20200710.ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcubeNebulaResourcesResponseUnmarshaller {

	public static ListMcubeNebulaResourcesResponse unmarshall(ListMcubeNebulaResourcesResponse listMcubeNebulaResourcesResponse, UnmarshallerContext _ctx) {
		
		listMcubeNebulaResourcesResponse.setRequestId(_ctx.stringValue("ListMcubeNebulaResourcesResponse.RequestId"));
		listMcubeNebulaResourcesResponse.setResultMessage(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ResultMessage"));
		listMcubeNebulaResourcesResponse.setResultCode(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ResultCode"));

		ListMcubeNebulaResourceResult listMcubeNebulaResourceResult = new ListMcubeNebulaResourceResult();
		listMcubeNebulaResourceResult.setRequestId(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.RequestId"));
		listMcubeNebulaResourceResult.setErrorCode(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.ErrorCode"));
		listMcubeNebulaResourceResult.setSuccess(_ctx.booleanValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.Success"));
		listMcubeNebulaResourceResult.setResultMsg(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.ResultMsg"));

		List<NebulaResourceInfoItem> nebulaResourceInfo = new ArrayList<NebulaResourceInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo.Length"); i++) {
			NebulaResourceInfoItem nebulaResourceInfoItem = new NebulaResourceInfoItem();
			nebulaResourceInfoItem.setStatus(_ctx.integerValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].Status"));
			nebulaResourceInfoItem.setLazyLoad(_ctx.integerValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].LazyLoad"));
			nebulaResourceInfoItem.setH5Version(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].H5Version"));
			nebulaResourceInfoItem.setGmtModified(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].GmtModified"));
			nebulaResourceInfoItem.setPackageType(_ctx.integerValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].PackageType"));
			nebulaResourceInfoItem.setCreator(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].Creator"));
			nebulaResourceInfoItem.setFallbackBaseUrl(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].FallbackBaseUrl"));
			nebulaResourceInfoItem.setModifier(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].Modifier"));
			nebulaResourceInfoItem.setMetaId(_ctx.longValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].MetaId"));
			nebulaResourceInfoItem.setResourceType(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].ResourceType"));
			nebulaResourceInfoItem.setAutoInstall(_ctx.integerValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].AutoInstall"));
			nebulaResourceInfoItem.setPlatform(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].Platform"));
			nebulaResourceInfoItem.setH5Name(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].H5Name"));
			nebulaResourceInfoItem.setClientVersionMin(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].ClientVersionMin"));
			nebulaResourceInfoItem.setVhost(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].Vhost"));
			nebulaResourceInfoItem.setMainUrl(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].MainUrl"));
			nebulaResourceInfoItem.setReleaseVersion(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].ReleaseVersion"));
			nebulaResourceInfoItem.setFileSize(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].FileSize"));
			nebulaResourceInfoItem.setDownloadUrl(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].DownloadUrl"));
			nebulaResourceInfoItem.setDebugUrl(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].DebugUrl"));
			nebulaResourceInfoItem.setAppCode(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].AppCode"));
			nebulaResourceInfoItem.setMemo(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].Memo"));
			nebulaResourceInfoItem.setH5Id(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].H5Id"));
			nebulaResourceInfoItem.setPublishPeriod(_ctx.integerValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].PublishPeriod"));
			nebulaResourceInfoItem.setExtendInfo(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].ExtendInfo"));
			nebulaResourceInfoItem.setInstallType(_ctx.integerValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].InstallType"));
			nebulaResourceInfoItem.setClientVersionMax(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].ClientVersionMax"));
			nebulaResourceInfoItem.setGmtCreate(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].GmtCreate"));
			nebulaResourceInfoItem.setMd5(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].Md5"));
			nebulaResourceInfoItem.setId(_ctx.longValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].Id"));
			nebulaResourceInfoItem.setExtraData(_ctx.stringValue("ListMcubeNebulaResourcesResponse.ListMcubeNebulaResourceResult.NebulaResourceInfo["+ i +"].ExtraData"));

			nebulaResourceInfo.add(nebulaResourceInfoItem);
		}
		listMcubeNebulaResourceResult.setNebulaResourceInfo(nebulaResourceInfo);
		listMcubeNebulaResourcesResponse.setListMcubeNebulaResourceResult(listMcubeNebulaResourceResult);
	 
	 	return listMcubeNebulaResourcesResponse;
	}
}