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

package com.aliyuncs.address_purification.transform.v20191118;

import com.aliyuncs.address_purification.model.v20191118.GetReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetReportResponseUnmarshaller {

	public static GetReportResponse unmarshall(GetReportResponse getReportResponse, UnmarshallerContext _ctx) {
		
		getReportResponse.setRequestId(_ctx.stringValue("GetReportResponse.RequestId"));
		getReportResponse.setErrCode(_ctx.stringValue("GetReportResponse.ErrCode"));
		getReportResponse.setErrMessage(_ctx.stringValue("GetReportResponse.ErrMessage"));
		getReportResponse.setData(_ctx.stringValue("GetReportResponse.Data"));
	 
	 	return getReportResponse;
	}
}