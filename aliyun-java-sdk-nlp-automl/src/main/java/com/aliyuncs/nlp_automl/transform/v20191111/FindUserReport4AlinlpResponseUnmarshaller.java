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

package com.aliyuncs.nlp_automl.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nlp_automl.model.v20191111.FindUserReport4AlinlpResponse;
import com.aliyuncs.nlp_automl.model.v20191111.FindUserReport4AlinlpResponse.Report;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindUserReport4AlinlpResponseUnmarshaller {

	public static FindUserReport4AlinlpResponse unmarshall(FindUserReport4AlinlpResponse findUserReport4AlinlpResponse, UnmarshallerContext _ctx) {
		
		findUserReport4AlinlpResponse.setRequestId(_ctx.stringValue("FindUserReport4AlinlpResponse.RequestId"));
		findUserReport4AlinlpResponse.setCode(_ctx.stringValue("FindUserReport4AlinlpResponse.Code"));

		List<Report> data = new ArrayList<Report>();
		for (int i = 0; i < _ctx.lengthValue("FindUserReport4AlinlpResponse.Data.Length"); i++) {
			Report report = new Report();
			report.setTotalCount(_ctx.longValue("FindUserReport4AlinlpResponse.Data["+ i +"].TotalCount"));
			report.setSuccessCount(_ctx.longValue("FindUserReport4AlinlpResponse.Data["+ i +"].SuccessCount"));
			report.setFailCount(_ctx.longValue("FindUserReport4AlinlpResponse.Data["+ i +"].FailCount"));
			report.setQpsMax(_ctx.integerValue("FindUserReport4AlinlpResponse.Data["+ i +"].QpsMax"));
			report.setRptTime(_ctx.stringValue("FindUserReport4AlinlpResponse.Data["+ i +"].RptTime"));

			data.add(report);
		}
		findUserReport4AlinlpResponse.setData(data);
	 
	 	return findUserReport4AlinlpResponse;
	}
}