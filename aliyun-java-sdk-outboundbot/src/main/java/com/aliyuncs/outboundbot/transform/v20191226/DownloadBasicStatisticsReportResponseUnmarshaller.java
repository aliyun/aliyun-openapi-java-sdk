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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.DownloadBasicStatisticsReportResponse;
import com.aliyuncs.outboundbot.model.v20191226.DownloadBasicStatisticsReportResponse.DownloadParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadBasicStatisticsReportResponseUnmarshaller {

	public static DownloadBasicStatisticsReportResponse unmarshall(DownloadBasicStatisticsReportResponse downloadBasicStatisticsReportResponse, UnmarshallerContext _ctx) {
		
		downloadBasicStatisticsReportResponse.setRequestId(_ctx.stringValue("DownloadBasicStatisticsReportResponse.RequestId"));
		downloadBasicStatisticsReportResponse.setSuccess(_ctx.booleanValue("DownloadBasicStatisticsReportResponse.Success"));
		downloadBasicStatisticsReportResponse.setCode(_ctx.stringValue("DownloadBasicStatisticsReportResponse.Code"));
		downloadBasicStatisticsReportResponse.setMessage(_ctx.stringValue("DownloadBasicStatisticsReportResponse.Message"));
		downloadBasicStatisticsReportResponse.setHttpStatusCode(_ctx.integerValue("DownloadBasicStatisticsReportResponse.HttpStatusCode"));

		DownloadParams downloadParams = new DownloadParams();
		downloadParams.setSignatureUrl(_ctx.stringValue("DownloadBasicStatisticsReportResponse.DownloadParams.SignatureUrl"));
		downloadBasicStatisticsReportResponse.setDownloadParams(downloadParams);
	 
	 	return downloadBasicStatisticsReportResponse;
	}
}