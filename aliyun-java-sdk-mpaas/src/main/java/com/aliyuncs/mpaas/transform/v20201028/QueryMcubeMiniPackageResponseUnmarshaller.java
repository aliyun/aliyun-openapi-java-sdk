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

import com.aliyuncs.mpaas.model.v20201028.QueryMcubeMiniPackageResponse;
import com.aliyuncs.mpaas.model.v20201028.QueryMcubeMiniPackageResponse.QueryMiniPackageResult;
import com.aliyuncs.mpaas.model.v20201028.QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMcubeMiniPackageResponseUnmarshaller {

	public static QueryMcubeMiniPackageResponse unmarshall(QueryMcubeMiniPackageResponse queryMcubeMiniPackageResponse, UnmarshallerContext _ctx) {
		
		queryMcubeMiniPackageResponse.setRequestId(_ctx.stringValue("QueryMcubeMiniPackageResponse.RequestId"));
		queryMcubeMiniPackageResponse.setResultCode(_ctx.stringValue("QueryMcubeMiniPackageResponse.ResultCode"));
		queryMcubeMiniPackageResponse.setResultMessage(_ctx.stringValue("QueryMcubeMiniPackageResponse.ResultMessage"));

		QueryMiniPackageResult queryMiniPackageResult = new QueryMiniPackageResult();
		queryMiniPackageResult.setResultMsg(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.ResultMsg"));
		queryMiniPackageResult.setSuccess(_ctx.booleanValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.Success"));

		MiniPackageInfo miniPackageInfo = new MiniPackageInfo();
		miniPackageInfo.setAppCode(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.AppCode"));
		miniPackageInfo.setAutoInstall(_ctx.longValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.AutoInstall"));
		miniPackageInfo.setClientVersionMax(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.ClientVersionMax"));
		miniPackageInfo.setClientVersionMin(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.ClientVersionMin"));
		miniPackageInfo.setDownloadUrl(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.DownloadUrl"));
		miniPackageInfo.setExtendInfo(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.ExtendInfo"));
		miniPackageInfo.setExtraData(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.ExtraData"));
		miniPackageInfo.setFallbackBaseUrl(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.FallbackBaseUrl"));
		miniPackageInfo.setGmtCreate(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.GmtCreate"));
		miniPackageInfo.setGmtModified(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.GmtModified"));
		miniPackageInfo.setH5Id(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.H5Id"));
		miniPackageInfo.setH5Name(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.H5Name"));
		miniPackageInfo.setH5Version(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.H5Version"));
		miniPackageInfo.setId(_ctx.longValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.Id"));
		miniPackageInfo.setInstallType(_ctx.longValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.InstallType"));
		miniPackageInfo.setMainUrl(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.MainUrl"));
		miniPackageInfo.setMemo(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.Memo"));
		miniPackageInfo.setPackageType(_ctx.longValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.PackageType"));
		miniPackageInfo.setPlatform(_ctx.stringValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.Platform"));
		miniPackageInfo.setPublishPeriod(_ctx.longValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.PublishPeriod"));
		miniPackageInfo.setResourceType(_ctx.longValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.ResourceType"));
		miniPackageInfo.setStatus(_ctx.longValue("QueryMcubeMiniPackageResponse.QueryMiniPackageResult.MiniPackageInfo.Status"));
		queryMiniPackageResult.setMiniPackageInfo(miniPackageInfo);
		queryMcubeMiniPackageResponse.setQueryMiniPackageResult(queryMiniPackageResult);
	 
	 	return queryMcubeMiniPackageResponse;
	}
}