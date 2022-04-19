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

import com.aliyuncs.sas.model.v20181203.ExportVulResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportVulResponseUnmarshaller {

	public static ExportVulResponse unmarshall(ExportVulResponse exportVulResponse, UnmarshallerContext _ctx) {
		
		exportVulResponse.setRequestId(_ctx.stringValue("ExportVulResponse.RequestId"));
		exportVulResponse.setLink(_ctx.stringValue("ExportVulResponse.Link"));
		exportVulResponse.setProgress(_ctx.integerValue("ExportVulResponse.Progress"));
		exportVulResponse.setCurrentCount(_ctx.integerValue("ExportVulResponse.CurrentCount"));
		exportVulResponse.setMessage(_ctx.stringValue("ExportVulResponse.Message"));
		exportVulResponse.setFileName(_ctx.stringValue("ExportVulResponse.FileName"));
		exportVulResponse.setTotalCount(_ctx.integerValue("ExportVulResponse.TotalCount"));
		exportVulResponse.setExportStatus(_ctx.stringValue("ExportVulResponse.ExportStatus"));
		exportVulResponse.setId(_ctx.longValue("ExportVulResponse.Id"));
	 
	 	return exportVulResponse;
	}
}