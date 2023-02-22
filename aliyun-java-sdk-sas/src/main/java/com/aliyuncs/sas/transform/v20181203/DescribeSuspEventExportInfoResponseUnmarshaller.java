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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeSuspEventExportInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspEventExportInfoResponseUnmarshaller {

	public static DescribeSuspEventExportInfoResponse unmarshall(DescribeSuspEventExportInfoResponse describeSuspEventExportInfoResponse, UnmarshallerContext _ctx) {
		
		describeSuspEventExportInfoResponse.setRequestId(_ctx.stringValue("DescribeSuspEventExportInfoResponse.RequestId"));
		describeSuspEventExportInfoResponse.setLink(_ctx.stringValue("DescribeSuspEventExportInfoResponse.Link"));
		describeSuspEventExportInfoResponse.setType(_ctx.stringValue("DescribeSuspEventExportInfoResponse.Type"));
		describeSuspEventExportInfoResponse.setProgress(_ctx.integerValue("DescribeSuspEventExportInfoResponse.Progress"));
		describeSuspEventExportInfoResponse.setGmtCreate(_ctx.longValue("DescribeSuspEventExportInfoResponse.GmtCreate"));
		describeSuspEventExportInfoResponse.setFileName(_ctx.stringValue("DescribeSuspEventExportInfoResponse.FileName"));
		describeSuspEventExportInfoResponse.setTotalCount(_ctx.integerValue("DescribeSuspEventExportInfoResponse.TotalCount"));
		describeSuspEventExportInfoResponse.setGmtModified(_ctx.longValue("DescribeSuspEventExportInfoResponse.GmtModified"));
		describeSuspEventExportInfoResponse.setExportStatus(_ctx.stringValue("DescribeSuspEventExportInfoResponse.ExportStatus"));
		describeSuspEventExportInfoResponse.setId(_ctx.integerValue("DescribeSuspEventExportInfoResponse.Id"));
		describeSuspEventExportInfoResponse.setProperties(_ctx.stringValue("DescribeSuspEventExportInfoResponse.Properties"));
	 
	 	return describeSuspEventExportInfoResponse;
	}
}