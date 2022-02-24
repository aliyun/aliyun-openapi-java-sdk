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

package com.aliyuncs.eas.transform.v20171023;

import com.aliyuncs.eas.model.v20171023.ReportStressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReportStressResponseUnmarshaller {

	public static ReportStressResponse unmarshall(ReportStressResponse reportStressResponse, UnmarshallerContext _ctx) {
		
		reportStressResponse.setRequestId(_ctx.stringValue("ReportStressResponse.RequestId"));
		reportStressResponse.setCode(_ctx.longValue("ReportStressResponse.Code"));
		reportStressResponse.setReportUrl(_ctx.stringValue("ReportStressResponse.ReportUrl"));
	 
	 	return reportStressResponse;
	}
}