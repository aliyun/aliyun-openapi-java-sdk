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

import com.aliyuncs.aegis.model.v20161111.ExportVulResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportVulResponseUnmarshaller {

	public static ExportVulResponse unmarshall(ExportVulResponse exportVulResponse, UnmarshallerContext context) {
		
		exportVulResponse.setRequestId(context.stringValue("ExportVulResponse.RequestId"));
		exportVulResponse.setId(context.longValue("ExportVulResponse.Id"));
		exportVulResponse.setFileName(context.stringValue("ExportVulResponse.FileName"));
		exportVulResponse.setCurrentCount(context.integerValue("ExportVulResponse.CurrentCount"));
		exportVulResponse.setTotalCount(context.integerValue("ExportVulResponse.TotalCount"));
		exportVulResponse.setProgress(context.integerValue("ExportVulResponse.Progress"));
		exportVulResponse.setExportStatus(context.stringValue("ExportVulResponse.ExportStatus"));
		exportVulResponse.setMessage(context.stringValue("ExportVulResponse.Message"));
		exportVulResponse.setLink(context.stringValue("ExportVulResponse.Link"));
	 
	 	return exportVulResponse;
	}
}