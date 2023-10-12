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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDbExportDownloadURLResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDbExportDownloadURLResponse.DownloadURLResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDbExportDownloadURLResponseUnmarshaller {

	public static GetDbExportDownloadURLResponse unmarshall(GetDbExportDownloadURLResponse getDbExportDownloadURLResponse, UnmarshallerContext _ctx) {
		
		getDbExportDownloadURLResponse.setRequestId(_ctx.stringValue("GetDbExportDownloadURLResponse.RequestId"));
		getDbExportDownloadURLResponse.setErrorCode(_ctx.stringValue("GetDbExportDownloadURLResponse.ErrorCode"));
		getDbExportDownloadURLResponse.setErrorMessage(_ctx.stringValue("GetDbExportDownloadURLResponse.ErrorMessage"));
		getDbExportDownloadURLResponse.setSuccess(_ctx.booleanValue("GetDbExportDownloadURLResponse.Success"));

		DownloadURLResult downloadURLResult = new DownloadURLResult();
		downloadURLResult.setHasResult(_ctx.booleanValue("GetDbExportDownloadURLResponse.DownloadURLResult.HasResult"));
		downloadURLResult.setTipMessage(_ctx.stringValue("GetDbExportDownloadURLResponse.DownloadURLResult.TipMessage"));
		downloadURLResult.setURL(_ctx.stringValue("GetDbExportDownloadURLResponse.DownloadURLResult.URL"));
		getDbExportDownloadURLResponse.setDownloadURLResult(downloadURLResult);
	 
	 	return getDbExportDownloadURLResponse;
	}
}