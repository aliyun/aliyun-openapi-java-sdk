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

import com.aliyuncs.sas.model.v20181203.ExportSuspEventsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportSuspEventsResponseUnmarshaller {

	public static ExportSuspEventsResponse unmarshall(ExportSuspEventsResponse exportSuspEventsResponse, UnmarshallerContext _ctx) {
		
		exportSuspEventsResponse.setRequestId(_ctx.stringValue("ExportSuspEventsResponse.RequestId"));
		exportSuspEventsResponse.setFileName(_ctx.stringValue("ExportSuspEventsResponse.FileName"));
		exportSuspEventsResponse.setId(_ctx.integerValue("ExportSuspEventsResponse.Id"));
	 
	 	return exportSuspEventsResponse;
	}
}