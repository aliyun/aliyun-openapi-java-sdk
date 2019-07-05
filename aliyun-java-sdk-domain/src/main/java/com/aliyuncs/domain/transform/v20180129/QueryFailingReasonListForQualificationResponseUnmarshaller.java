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

import com.aliyuncs.domain.model.v20180129.QueryFailingReasonListForQualificationResponse;
import com.aliyuncs.domain.model.v20180129.QueryFailingReasonListForQualificationResponse.FailRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFailingReasonListForQualificationResponseUnmarshaller {

	public static QueryFailingReasonListForQualificationResponse unmarshall(QueryFailingReasonListForQualificationResponse queryFailingReasonListForQualificationResponse, UnmarshallerContext _ctx) {
		
		queryFailingReasonListForQualificationResponse.setRequestId(_ctx.stringValue("QueryFailingReasonListForQualificationResponse.RequestId"));

		List<FailRecord> data = new ArrayList<FailRecord>();
		for (int i = 0; i < _ctx.lengthValue("QueryFailingReasonListForQualificationResponse.Data.Length"); i++) {
			FailRecord failRecord = new FailRecord();
			failRecord.setDate(_ctx.stringValue("QueryFailingReasonListForQualificationResponse.Data["+ i +"].Date"));
			failRecord.setFailReason(_ctx.stringValue("QueryFailingReasonListForQualificationResponse.Data["+ i +"].FailReason"));

			data.add(failRecord);
		}
		queryFailingReasonListForQualificationResponse.setData(data);
	 
	 	return queryFailingReasonListForQualificationResponse;
	}
}