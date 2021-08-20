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

import com.aliyuncs.mpaas.model.v20201028.GetMcubeNebulaResourceResponse;
import com.aliyuncs.mpaas.model.v20201028.GetMcubeNebulaResourceResponse.GetNebulaResourceResult;
import com.aliyuncs.mpaas.model.v20201028.GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMcubeNebulaResourceResponseUnmarshaller {

	public static GetMcubeNebulaResourceResponse unmarshall(GetMcubeNebulaResourceResponse getMcubeNebulaResourceResponse, UnmarshallerContext _ctx) {
		
		getMcubeNebulaResourceResponse.setRequestId(_ctx.stringValue("GetMcubeNebulaResourceResponse.RequestId"));
		getMcubeNebulaResourceResponse.setResultCode(_ctx.stringValue("GetMcubeNebulaResourceResponse.ResultCode"));
		getMcubeNebulaResourceResponse.setResultMessage(_ctx.stringValue("GetMcubeNebulaResourceResponse.ResultMessage"));

		GetNebulaResourceResult getNebulaResourceResult = new GetNebulaResourceResult();
		getNebulaResourceResult.setErrorCode(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.ErrorCode"));
		getNebulaResourceResult.setResultMsg(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.ResultMsg"));
		getNebulaResourceResult.setSuccess(_ctx.booleanValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.Success"));
		getNebulaResourceResult.setRequestId(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.RequestId"));

		NebulaResourceInfo nebulaResourceInfo = new NebulaResourceInfo();
		nebulaResourceInfo.setAppCode(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.AppCode"));
		nebulaResourceInfo.setMemo(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.Memo"));
		nebulaResourceInfo.setDownloadUrl(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.DownloadUrl"));
		nebulaResourceInfo.setPlatform(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.Platform"));
		nebulaResourceInfo.setPackageType(_ctx.integerValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.PackageType"));
		nebulaResourceInfo.setGmtModified(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.GmtModified"));
		nebulaResourceInfo.setModifier(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.Modifier"));
		nebulaResourceInfo.setExtraData(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.ExtraData"));
		nebulaResourceInfo.setMetaId(_ctx.longValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.MetaId"));
		nebulaResourceInfo.setId(_ctx.longValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.Id"));
		nebulaResourceInfo.setH5Version(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.H5Version"));
		nebulaResourceInfo.setFallbackBaseUrl(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.FallbackBaseUrl"));
		nebulaResourceInfo.setAutoInstall(_ctx.integerValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.AutoInstall"));
		nebulaResourceInfo.setGmtCreate(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.GmtCreate"));
		nebulaResourceInfo.setExtendInfo(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.ExtendInfo"));
		nebulaResourceInfo.setCreator(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.Creator"));
		nebulaResourceInfo.setPublishPeriod(_ctx.integerValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.PublishPeriod"));
		nebulaResourceInfo.setClientVersionMax(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.ClientVersionMax"));
		nebulaResourceInfo.setH5Id(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.H5Id"));
		nebulaResourceInfo.setH5Name(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.H5Name"));
		nebulaResourceInfo.setStatus(_ctx.integerValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.Status"));
		nebulaResourceInfo.setResourceType(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.ResourceType"));
		nebulaResourceInfo.setMainUrl(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.MainUrl"));
		nebulaResourceInfo.setVhost(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.Vhost"));
		nebulaResourceInfo.setClientVersionMin(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.ClientVersionMin"));
		nebulaResourceInfo.setInstallType(_ctx.integerValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.InstallType"));
		nebulaResourceInfo.setFileSize(_ctx.stringValue("GetMcubeNebulaResourceResponse.GetNebulaResourceResult.NebulaResourceInfo.FileSize"));
		getNebulaResourceResult.setNebulaResourceInfo(nebulaResourceInfo);
		getMcubeNebulaResourceResponse.setGetNebulaResourceResult(getNebulaResourceResult);
	 
	 	return getMcubeNebulaResourceResponse;
	}
}