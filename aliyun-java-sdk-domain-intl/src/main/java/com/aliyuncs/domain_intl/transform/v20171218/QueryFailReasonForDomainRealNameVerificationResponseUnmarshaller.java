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

package com.aliyuncs.domain_intl.transform.v20171218;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain_intl.model.v20171218.QueryFailReasonForDomainRealNameVerificationResponse;
import com.aliyuncs.domain_intl.model.v20171218.QueryFailReasonForDomainRealNameVerificationResponse.FailRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFailReasonForDomainRealNameVerificationResponseUnmarshaller {

	public static QueryFailReasonForDomainRealNameVerificationResponse unmarshall(QueryFailReasonForDomainRealNameVerificationResponse queryFailReasonForDomainRealNameVerificationResponse, UnmarshallerContext context) {
		
		queryFailReasonForDomainRealNameVerificationResponse.setRequestId(context.stringValue("QueryFailReasonForDomainRealNameVerificationResponse.RequestId"));

		List<FailRecord> data = new ArrayList<FailRecord>();
		for (int i = 0; i < context.lengthValue("QueryFailReasonForDomainRealNameVerificationResponse.Data.Length"); i++) {
			FailRecord failRecord = new FailRecord();
			failRecord.setDate(context.stringValue("QueryFailReasonForDomainRealNameVerificationResponse.Data["+ i +"].Date"));
			failRecord.setFailReason(context.stringValue("QueryFailReasonForDomainRealNameVerificationResponse.Data["+ i +"].FailReason"));

			data.add(failRecord);
		}
		queryFailReasonForDomainRealNameVerificationResponse.setData(data);
	 
	 	return queryFailReasonForDomainRealNameVerificationResponse;
	}
}