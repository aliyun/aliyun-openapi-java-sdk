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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeCdsFileShareLinksResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeCdsFileShareLinksResponse.CdsFileShareLinkModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdsFileShareLinksResponseUnmarshaller {

	public static DescribeCdsFileShareLinksResponse unmarshall(DescribeCdsFileShareLinksResponse describeCdsFileShareLinksResponse, UnmarshallerContext _ctx) {
		
		describeCdsFileShareLinksResponse.setRequestId(_ctx.stringValue("DescribeCdsFileShareLinksResponse.RequestId"));
		describeCdsFileShareLinksResponse.setNextToken(_ctx.stringValue("DescribeCdsFileShareLinksResponse.NextToken"));
		describeCdsFileShareLinksResponse.setSuccess(_ctx.booleanValue("DescribeCdsFileShareLinksResponse.Success"));
		describeCdsFileShareLinksResponse.setCode(_ctx.stringValue("DescribeCdsFileShareLinksResponse.Code"));
		describeCdsFileShareLinksResponse.setMessage(_ctx.stringValue("DescribeCdsFileShareLinksResponse.Message"));

		List<CdsFileShareLinkModel> data = new ArrayList<CdsFileShareLinkModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdsFileShareLinksResponse.Data.Length"); i++) {
			CdsFileShareLinkModel cdsFileShareLinkModel = new CdsFileShareLinkModel();
			cdsFileShareLinkModel.setDescription(_ctx.stringValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].Description"));
			cdsFileShareLinkModel.setSaveLimit(_ctx.longValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].SaveLimit"));
			cdsFileShareLinkModel.setDownloadCount(_ctx.longValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].DownloadCount"));
			cdsFileShareLinkModel.setCreator(_ctx.stringValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].Creator"));
			cdsFileShareLinkModel.setSaveCount(_ctx.longValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].SaveCount"));
			cdsFileShareLinkModel.setDisableSave(_ctx.booleanValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].DisableSave"));
			cdsFileShareLinkModel.setSharePwd(_ctx.stringValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].SharePwd"));
			cdsFileShareLinkModel.setDisablePreview(_ctx.booleanValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].DisablePreview"));
			cdsFileShareLinkModel.setAccessCount(_ctx.longValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].AccessCount"));
			cdsFileShareLinkModel.setShareId(_ctx.stringValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].ShareId"));
			cdsFileShareLinkModel.setDownloadLimit(_ctx.longValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].DownloadLimit"));
			cdsFileShareLinkModel.setStatus(_ctx.stringValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].Status"));
			cdsFileShareLinkModel.setDriveId(_ctx.stringValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].DriveId"));
			cdsFileShareLinkModel.setModifiyTime(_ctx.stringValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].ModifiyTime"));
			cdsFileShareLinkModel.setDisableDownload(_ctx.booleanValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].DisableDownload"));
			cdsFileShareLinkModel.setExpiration(_ctx.stringValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].Expiration"));
			cdsFileShareLinkModel.setExpired(_ctx.booleanValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].Expired"));
			cdsFileShareLinkModel.setPreviewCount(_ctx.longValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].PreviewCount"));
			cdsFileShareLinkModel.setPreviewLimit(_ctx.longValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].PreviewLimit"));
			cdsFileShareLinkModel.setVideoPreviewCount(_ctx.longValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].VideoPreviewCount"));
			cdsFileShareLinkModel.setReportCount(_ctx.longValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].ReportCount"));
			cdsFileShareLinkModel.setFileIds(_ctx.stringValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].FileIds"));
			cdsFileShareLinkModel.setShareName(_ctx.stringValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].ShareName"));
			cdsFileShareLinkModel.setCreateTime(_ctx.stringValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].CreateTime"));
			cdsFileShareLinkModel.setShareLink(_ctx.stringValue("DescribeCdsFileShareLinksResponse.Data["+ i +"].ShareLink"));

			data.add(cdsFileShareLinkModel);
		}
		describeCdsFileShareLinksResponse.setData(data);
	 
	 	return describeCdsFileShareLinksResponse;
	}
}