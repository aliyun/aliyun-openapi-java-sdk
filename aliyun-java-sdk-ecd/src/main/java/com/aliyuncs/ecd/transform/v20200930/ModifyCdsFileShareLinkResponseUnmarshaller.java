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

package com.aliyuncs.ecd.transform.v20200930;

import com.aliyuncs.ecd.model.v20200930.ModifyCdsFileShareLinkResponse;
import com.aliyuncs.ecd.model.v20200930.ModifyCdsFileShareLinkResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyCdsFileShareLinkResponseUnmarshaller {

	public static ModifyCdsFileShareLinkResponse unmarshall(ModifyCdsFileShareLinkResponse modifyCdsFileShareLinkResponse, UnmarshallerContext _ctx) {
		
		modifyCdsFileShareLinkResponse.setRequestId(_ctx.stringValue("ModifyCdsFileShareLinkResponse.RequestId"));
		modifyCdsFileShareLinkResponse.setCode(_ctx.stringValue("ModifyCdsFileShareLinkResponse.Code"));
		modifyCdsFileShareLinkResponse.setMessage(_ctx.stringValue("ModifyCdsFileShareLinkResponse.Message"));
		modifyCdsFileShareLinkResponse.setSuccess(_ctx.booleanValue("ModifyCdsFileShareLinkResponse.Success"));

		Data data = new Data();
		data.setDescription(_ctx.stringValue("ModifyCdsFileShareLinkResponse.Data.Description"));
		data.setSaveLimit(_ctx.longValue("ModifyCdsFileShareLinkResponse.Data.SaveLimit"));
		data.setDownloadCount(_ctx.longValue("ModifyCdsFileShareLinkResponse.Data.DownloadCount"));
		data.setCreator(_ctx.stringValue("ModifyCdsFileShareLinkResponse.Data.Creator"));
		data.setSaveCount(_ctx.longValue("ModifyCdsFileShareLinkResponse.Data.SaveCount"));
		data.setDisableSave(_ctx.booleanValue("ModifyCdsFileShareLinkResponse.Data.DisableSave"));
		data.setSharePwd(_ctx.stringValue("ModifyCdsFileShareLinkResponse.Data.SharePwd"));
		data.setDisablePreview(_ctx.booleanValue("ModifyCdsFileShareLinkResponse.Data.DisablePreview"));
		data.setAccessCount(_ctx.longValue("ModifyCdsFileShareLinkResponse.Data.AccessCount"));
		data.setShareId(_ctx.stringValue("ModifyCdsFileShareLinkResponse.Data.ShareId"));
		data.setDownloadLimit(_ctx.longValue("ModifyCdsFileShareLinkResponse.Data.DownloadLimit"));
		data.setStatus(_ctx.stringValue("ModifyCdsFileShareLinkResponse.Data.Status"));
		data.setDriveId(_ctx.stringValue("ModifyCdsFileShareLinkResponse.Data.DriveId"));
		data.setModifiyTime(_ctx.stringValue("ModifyCdsFileShareLinkResponse.Data.ModifiyTime"));
		data.setDisableDownload(_ctx.booleanValue("ModifyCdsFileShareLinkResponse.Data.DisableDownload"));
		data.setExpiration(_ctx.stringValue("ModifyCdsFileShareLinkResponse.Data.Expiration"));
		data.setExpired(_ctx.booleanValue("ModifyCdsFileShareLinkResponse.Data.Expired"));
		data.setPreviewCount(_ctx.longValue("ModifyCdsFileShareLinkResponse.Data.PreviewCount"));
		data.setPreviewLimit(_ctx.longValue("ModifyCdsFileShareLinkResponse.Data.PreviewLimit"));
		data.setVideoPreviewCount(_ctx.longValue("ModifyCdsFileShareLinkResponse.Data.VideoPreviewCount"));
		data.setReportCount(_ctx.longValue("ModifyCdsFileShareLinkResponse.Data.ReportCount"));
		data.setFileIds(_ctx.stringValue("ModifyCdsFileShareLinkResponse.Data.FileIds"));
		data.setShareName(_ctx.stringValue("ModifyCdsFileShareLinkResponse.Data.ShareName"));
		data.setCreateTime(_ctx.stringValue("ModifyCdsFileShareLinkResponse.Data.CreateTime"));
		data.setShareLink(_ctx.stringValue("ModifyCdsFileShareLinkResponse.Data.ShareLink"));
		modifyCdsFileShareLinkResponse.setData(data);
	 
	 	return modifyCdsFileShareLinkResponse;
	}
}