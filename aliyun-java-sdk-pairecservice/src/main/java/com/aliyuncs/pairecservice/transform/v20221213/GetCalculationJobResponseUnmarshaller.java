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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.GetCalculationJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCalculationJobResponseUnmarshaller {

	public static GetCalculationJobResponse unmarshall(GetCalculationJobResponse getCalculationJobResponse, UnmarshallerContext _ctx) {
		
		getCalculationJobResponse.setRequestId(_ctx.stringValue("GetCalculationJobResponse.RequestId"));
		getCalculationJobResponse.setABMetricId(_ctx.stringValue("GetCalculationJobResponse.ABMetricId"));
		getCalculationJobResponse.setABMetricName(_ctx.stringValue("GetCalculationJobResponse.ABMetricName"));
		getCalculationJobResponse.setStatus(_ctx.stringValue("GetCalculationJobResponse.Status"));
		getCalculationJobResponse.setConfig(_ctx.stringValue("GetCalculationJobResponse.Config"));
		getCalculationJobResponse.setGmtRanTime(_ctx.stringValue("GetCalculationJobResponse.GmtRanTime"));
		getCalculationJobResponse.setBizDate(_ctx.stringValue("GetCalculationJobResponse.BizDate"));
		getCalculationJobResponse.setJobSource(_ctx.stringValue("GetCalculationJobResponse.JobSource"));

		List<String> jobMessage = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetCalculationJobResponse.JobMessage.Length"); i++) {
			jobMessage.add(_ctx.stringValue("GetCalculationJobResponse.JobMessage["+ i +"]"));
		}
		getCalculationJobResponse.setJobMessage(jobMessage);
	 
	 	return getCalculationJobResponse;
	}
}