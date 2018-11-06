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

package com.aliyuncs.aegis.transform.v20161111;

import com.aliyuncs.aegis.model.v20161111.DescribeSuspiciousExportInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspiciousExportInfoResponseUnmarshaller {

	public static DescribeSuspiciousExportInfoResponse unmarshall(DescribeSuspiciousExportInfoResponse describeSuspiciousExportInfoResponse, UnmarshallerContext context) {
		
		describeSuspiciousExportInfoResponse.setRequestId(context.stringValue("DescribeSuspiciousExportInfoResponse.RequestId"));
		describeSuspiciousExportInfoResponse.setId(context.integerValue("DescribeSuspiciousExportInfoResponse.Id"));
		describeSuspiciousExportInfoResponse.setGmtCreate(context.longValue("DescribeSuspiciousExportInfoResponse.GmtCreate"));
		describeSuspiciousExportInfoResponse.setFileName(context.stringValue("DescribeSuspiciousExportInfoResponse.FileName"));
		describeSuspiciousExportInfoResponse.setCurrentCount(context.integerValue("DescribeSuspiciousExportInfoResponse.CurrentCount"));
		describeSuspiciousExportInfoResponse.setTotalCount(context.integerValue("DescribeSuspiciousExportInfoResponse.TotalCount"));
		describeSuspiciousExportInfoResponse.setProgress(context.integerValue("DescribeSuspiciousExportInfoResponse.Progress"));
		describeSuspiciousExportInfoResponse.setStatus(context.stringValue("DescribeSuspiciousExportInfoResponse.Status"));
		describeSuspiciousExportInfoResponse.setMessage(context.stringValue("DescribeSuspiciousExportInfoResponse.Message"));
		describeSuspiciousExportInfoResponse.setLink(context.stringValue("DescribeSuspiciousExportInfoResponse.Link"));
	 
	 	return describeSuspiciousExportInfoResponse;
	}
}