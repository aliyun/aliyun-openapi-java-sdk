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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.DownloadOriginalStatisticsReportResponse;
import com.aliyuncs.ccc.model.v20170705.DownloadOriginalStatisticsReportResponse.DownloadParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadOriginalStatisticsReportResponseUnmarshaller {

	public static DownloadOriginalStatisticsReportResponse unmarshall(DownloadOriginalStatisticsReportResponse downloadOriginalStatisticsReportResponse, UnmarshallerContext _ctx) {
		
		downloadOriginalStatisticsReportResponse.setRequestId(_ctx.stringValue("DownloadOriginalStatisticsReportResponse.RequestId"));
		downloadOriginalStatisticsReportResponse.setSuccess(_ctx.booleanValue("DownloadOriginalStatisticsReportResponse.Success"));
		downloadOriginalStatisticsReportResponse.setCode(_ctx.stringValue("DownloadOriginalStatisticsReportResponse.Code"));
		downloadOriginalStatisticsReportResponse.setMessage(_ctx.stringValue("DownloadOriginalStatisticsReportResponse.Message"));
		downloadOriginalStatisticsReportResponse.setHttpStatusCode(_ctx.integerValue("DownloadOriginalStatisticsReportResponse.HttpStatusCode"));

		DownloadParams downloadParams = new DownloadParams();
		downloadParams.setSignatureUrl(_ctx.stringValue("DownloadOriginalStatisticsReportResponse.DownloadParams.SignatureUrl"));
		downloadOriginalStatisticsReportResponse.setDownloadParams(downloadParams);
	 
	 	return downloadOriginalStatisticsReportResponse;
	}
}