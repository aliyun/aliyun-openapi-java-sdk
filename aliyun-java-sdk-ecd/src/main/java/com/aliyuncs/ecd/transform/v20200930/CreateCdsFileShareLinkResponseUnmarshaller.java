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

import com.aliyuncs.ecd.model.v20200930.CreateCdsFileShareLinkResponse;
import com.aliyuncs.ecd.model.v20200930.CreateCdsFileShareLinkResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCdsFileShareLinkResponseUnmarshaller {

	public static CreateCdsFileShareLinkResponse unmarshall(CreateCdsFileShareLinkResponse createCdsFileShareLinkResponse, UnmarshallerContext _ctx) {
		
		createCdsFileShareLinkResponse.setRequestId(_ctx.stringValue("CreateCdsFileShareLinkResponse.RequestId"));
		createCdsFileShareLinkResponse.setCode(_ctx.stringValue("CreateCdsFileShareLinkResponse.Code"));
		createCdsFileShareLinkResponse.setMessage(_ctx.stringValue("CreateCdsFileShareLinkResponse.Message"));
		createCdsFileShareLinkResponse.setSuccess(_ctx.booleanValue("CreateCdsFileShareLinkResponse.Success"));

		Data data = new Data();
		data.setDescription(_ctx.stringValue("CreateCdsFileShareLinkResponse.Data.Description"));
		data.setSaveLimit(_ctx.longValue("CreateCdsFileShareLinkResponse.Data.SaveLimit"));
		data.setDownloadCount(_ctx.longValue("CreateCdsFileShareLinkResponse.Data.DownloadCount"));
		data.setCreator(_ctx.stringValue("CreateCdsFileShareLinkResponse.Data.Creator"));
		data.setSaveCount(_ctx.longValue("CreateCdsFileShareLinkResponse.Data.SaveCount"));
		data.setDisableSave(_ctx.booleanValue("CreateCdsFileShareLinkResponse.Data.DisableSave"));
		data.setSharePwd(_ctx.stringValue("CreateCdsFileShareLinkResponse.Data.SharePwd"));
		data.setDisablePreview(_ctx.booleanValue("CreateCdsFileShareLinkResponse.Data.DisablePreview"));
		data.setAccessCount(_ctx.longValue("CreateCdsFileShareLinkResponse.Data.AccessCount"));
		data.setShareId(_ctx.stringValue("CreateCdsFileShareLinkResponse.Data.ShareId"));
		data.setDownloadLimit(_ctx.longValue("CreateCdsFileShareLinkResponse.Data.DownloadLimit"));
		data.setStatus(_ctx.stringValue("CreateCdsFileShareLinkResponse.Data.Status"));
		data.setDriveId(_ctx.stringValue("CreateCdsFileShareLinkResponse.Data.DriveId"));
		data.setModifiyTime(_ctx.stringValue("CreateCdsFileShareLinkResponse.Data.ModifiyTime"));
		data.setDisableDownload(_ctx.booleanValue("CreateCdsFileShareLinkResponse.Data.DisableDownload"));
		data.setExpiration(_ctx.stringValue("CreateCdsFileShareLinkResponse.Data.Expiration"));
		data.setExpired(_ctx.booleanValue("CreateCdsFileShareLinkResponse.Data.Expired"));
		data.setPreviewCount(_ctx.longValue("CreateCdsFileShareLinkResponse.Data.PreviewCount"));
		data.setPreviewLimit(_ctx.longValue("CreateCdsFileShareLinkResponse.Data.PreviewLimit"));
		data.setVideoPreviewCount(_ctx.longValue("CreateCdsFileShareLinkResponse.Data.VideoPreviewCount"));
		data.setReportCount(_ctx.longValue("CreateCdsFileShareLinkResponse.Data.ReportCount"));
		data.setFileIds(_ctx.stringValue("CreateCdsFileShareLinkResponse.Data.FileIds"));
		data.setShareName(_ctx.stringValue("CreateCdsFileShareLinkResponse.Data.ShareName"));
		data.setCreateTime(_ctx.stringValue("CreateCdsFileShareLinkResponse.Data.CreateTime"));
		data.setShareLink(_ctx.stringValue("CreateCdsFileShareLinkResponse.Data.ShareLink"));
		createCdsFileShareLinkResponse.setData(data);
	 
	 	return createCdsFileShareLinkResponse;
	}
}