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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import com.aliyuncs.retailadvqa_public.model.v20200515.CheckMarketingAudienceExportStatusResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.CheckMarketingAudienceExportStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckMarketingAudienceExportStatusResponseUnmarshaller {

	public static CheckMarketingAudienceExportStatusResponse unmarshall(CheckMarketingAudienceExportStatusResponse checkMarketingAudienceExportStatusResponse, UnmarshallerContext _ctx) {
		
		checkMarketingAudienceExportStatusResponse.setRequestId(_ctx.stringValue("CheckMarketingAudienceExportStatusResponse.RequestId"));
		checkMarketingAudienceExportStatusResponse.setSuccess(_ctx.booleanValue("CheckMarketingAudienceExportStatusResponse.Success"));
		checkMarketingAudienceExportStatusResponse.setErrorDesc(_ctx.stringValue("CheckMarketingAudienceExportStatusResponse.ErrorDesc"));
		checkMarketingAudienceExportStatusResponse.setTraceId(_ctx.stringValue("CheckMarketingAudienceExportStatusResponse.TraceId"));
		checkMarketingAudienceExportStatusResponse.setErrorCode(_ctx.stringValue("CheckMarketingAudienceExportStatusResponse.ErrorCode"));

		Data data = new Data();
		data.setOssFilePath(_ctx.stringValue("CheckMarketingAudienceExportStatusResponse.Data.OssFilePath"));
		data.setExportStatus(_ctx.stringValue("CheckMarketingAudienceExportStatusResponse.Data.ExportStatus"));
		checkMarketingAudienceExportStatusResponse.setData(data);
	 
	 	return checkMarketingAudienceExportStatusResponse;
	}
}