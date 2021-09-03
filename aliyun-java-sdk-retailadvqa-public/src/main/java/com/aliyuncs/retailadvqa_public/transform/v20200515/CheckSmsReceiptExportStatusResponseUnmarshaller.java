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

import com.aliyuncs.retailadvqa_public.model.v20200515.CheckSmsReceiptExportStatusResponse;
import com.aliyuncs.retailadvqa_public.model.v20200515.CheckSmsReceiptExportStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckSmsReceiptExportStatusResponseUnmarshaller {

	public static CheckSmsReceiptExportStatusResponse unmarshall(CheckSmsReceiptExportStatusResponse checkSmsReceiptExportStatusResponse, UnmarshallerContext _ctx) {
		
		checkSmsReceiptExportStatusResponse.setRequestId(_ctx.stringValue("CheckSmsReceiptExportStatusResponse.RequestId"));
		checkSmsReceiptExportStatusResponse.setSuccess(_ctx.booleanValue("CheckSmsReceiptExportStatusResponse.Success"));
		checkSmsReceiptExportStatusResponse.setErrorDesc(_ctx.stringValue("CheckSmsReceiptExportStatusResponse.ErrorDesc"));
		checkSmsReceiptExportStatusResponse.setTraceId(_ctx.stringValue("CheckSmsReceiptExportStatusResponse.TraceId"));
		checkSmsReceiptExportStatusResponse.setErrorCode(_ctx.stringValue("CheckSmsReceiptExportStatusResponse.ErrorCode"));

		Data data = new Data();
		data.setOssFilePath(_ctx.stringValue("CheckSmsReceiptExportStatusResponse.Data.OssFilePath"));
		data.setExportStatus(_ctx.stringValue("CheckSmsReceiptExportStatusResponse.Data.ExportStatus"));
		checkSmsReceiptExportStatusResponse.setData(data);
	 
	 	return checkSmsReceiptExportStatusResponse;
	}
}