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

package com.aliyuncs.agency.transform.v20180703;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20180703.ReportCustomerResponse;
import com.aliyuncs.agency.model.v20180703.ReportCustomerResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReportCustomerResponseUnmarshaller {

	public static ReportCustomerResponse unmarshall(ReportCustomerResponse reportCustomerResponse, UnmarshallerContext _ctx) {
		
		reportCustomerResponse.setCode(_ctx.stringValue("ReportCustomerResponse.Code"));
		reportCustomerResponse.setMessage(_ctx.stringValue("ReportCustomerResponse.Message"));
		reportCustomerResponse.setSuccess(_ctx.booleanValue("ReportCustomerResponse.Success"));

		List<Result> data = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ReportCustomerResponse.Data.Length"); i++) {
			Result result = new Result();
			result.setCode(_ctx.stringValue("ReportCustomerResponse.Data["+ i +"].Code"));
			result.setMessage(_ctx.stringValue("ReportCustomerResponse.Data["+ i +"].Message"));
			result.setData(_ctx.booleanValue("ReportCustomerResponse.Data["+ i +"].Data"));
			result.setSuccess(_ctx.booleanValue("ReportCustomerResponse.Data["+ i +"].Success"));

			data.add(result);
		}
		reportCustomerResponse.setData(data);
	 
	 	return reportCustomerResponse;
	}
}