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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.QueryFailReasonForRegistrantProfileRealNameVerificationResponse;
import com.aliyuncs.domain.model.v20180129.QueryFailReasonForRegistrantProfileRealNameVerificationResponse.FailRecord;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFailReasonForRegistrantProfileRealNameVerificationResponseUnmarshaller {

	public static QueryFailReasonForRegistrantProfileRealNameVerificationResponse unmarshall(QueryFailReasonForRegistrantProfileRealNameVerificationResponse queryFailReasonForRegistrantProfileRealNameVerificationResponse, UnmarshallerContext context) {
		
		queryFailReasonForRegistrantProfileRealNameVerificationResponse.setRequestId(context.stringValue("QueryFailReasonForRegistrantProfileRealNameVerificationResponse.RequestId"));

		List<FailRecord> data = new ArrayList<FailRecord>();
		for (int i = 0; i < context.lengthValue("QueryFailReasonForRegistrantProfileRealNameVerificationResponse.Data.Length"); i++) {
			FailRecord failRecord = new FailRecord();
			failRecord.setDate(context.stringValue("QueryFailReasonForRegistrantProfileRealNameVerificationResponse.Data["+ i +"].Date"));
			failRecord.setFailReason(context.stringValue("QueryFailReasonForRegistrantProfileRealNameVerificationResponse.Data["+ i +"].FailReason"));

			data.add(failRecord);
		}
		queryFailReasonForRegistrantProfileRealNameVerificationResponse.setData(data);
	 
	 	return queryFailReasonForRegistrantProfileRealNameVerificationResponse;
	}
}