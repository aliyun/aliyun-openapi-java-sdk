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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.GetTotalUserReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTotalUserReportResponseUnmarshaller {

	public static GetTotalUserReportResponse unmarshall(GetTotalUserReportResponse getTotalUserReportResponse, UnmarshallerContext _ctx) {
		
		getTotalUserReportResponse.setRequestId(_ctx.stringValue("GetTotalUserReportResponse.RequestId"));
		getTotalUserReportResponse.setMetrics(_ctx.stringValue("GetTotalUserReportResponse.Metrics"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTotalUserReportResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetTotalUserReportResponse.Data["+ i +"]"));
		}
		getTotalUserReportResponse.setData(data);
	 
	 	return getTotalUserReportResponse;
	}
}