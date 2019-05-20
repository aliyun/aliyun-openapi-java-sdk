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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.DownloadBasicStatisticsReportResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.DownloadBasicStatisticsReportResponse.DownloadParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadBasicStatisticsReportResponseUnmarshaller {

	public static DownloadBasicStatisticsReportResponse unmarshall(DownloadBasicStatisticsReportResponse downloadBasicStatisticsReportResponse, UnmarshallerContext context) {
		
		downloadBasicStatisticsReportResponse.setRequestId(context.stringValue("DownloadBasicStatisticsReportResponse.RequestId"));
		downloadBasicStatisticsReportResponse.setSuccess(context.booleanValue("DownloadBasicStatisticsReportResponse.Success"));
		downloadBasicStatisticsReportResponse.setCode(context.stringValue("DownloadBasicStatisticsReportResponse.Code"));
		downloadBasicStatisticsReportResponse.setMessage(context.stringValue("DownloadBasicStatisticsReportResponse.Message"));
		downloadBasicStatisticsReportResponse.setHttpStatusCode(context.integerValue("DownloadBasicStatisticsReportResponse.HttpStatusCode"));

		DownloadParams downloadParams = new DownloadParams();
		downloadParams.setSignatureUrl(context.stringValue("DownloadBasicStatisticsReportResponse.DownloadParams.SignatureUrl"));
		downloadBasicStatisticsReportResponse.setDownloadParams(downloadParams);
	 
	 	return downloadBasicStatisticsReportResponse;
	}
}