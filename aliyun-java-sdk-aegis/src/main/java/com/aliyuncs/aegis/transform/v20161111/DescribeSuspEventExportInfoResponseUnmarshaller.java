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

import com.aliyuncs.aegis.model.v20161111.DescribeSuspEventExportInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspEventExportInfoResponseUnmarshaller {

	public static DescribeSuspEventExportInfoResponse unmarshall(DescribeSuspEventExportInfoResponse describeSuspEventExportInfoResponse, UnmarshallerContext context) {
		
		describeSuspEventExportInfoResponse.setRequestId(context.stringValue("DescribeSuspEventExportInfoResponse.RequestId"));
		describeSuspEventExportInfoResponse.setFileName(context.stringValue("DescribeSuspEventExportInfoResponse.FileName"));
		describeSuspEventExportInfoResponse.setGmtModified(context.longValue("DescribeSuspEventExportInfoResponse.GmtModified"));
		describeSuspEventExportInfoResponse.setProgress(context.integerValue("DescribeSuspEventExportInfoResponse.Progress"));
		describeSuspEventExportInfoResponse.setId(context.integerValue("DescribeSuspEventExportInfoResponse.Id"));
		describeSuspEventExportInfoResponse.setType(context.stringValue("DescribeSuspEventExportInfoResponse.Type"));
		describeSuspEventExportInfoResponse.setTotalCount(context.integerValue("DescribeSuspEventExportInfoResponse.TotalCount"));
		describeSuspEventExportInfoResponse.setGmtCreate(context.longValue("DescribeSuspEventExportInfoResponse.GmtCreate"));
		describeSuspEventExportInfoResponse.setProperties(context.stringValue("DescribeSuspEventExportInfoResponse.Properties"));
		describeSuspEventExportInfoResponse.setExportStatus(context.stringValue("DescribeSuspEventExportInfoResponse.ExportStatus"));
		describeSuspEventExportInfoResponse.setLink(context.stringValue("DescribeSuspEventExportInfoResponse.Link"));
	 
	 	return describeSuspEventExportInfoResponse;
	}
}