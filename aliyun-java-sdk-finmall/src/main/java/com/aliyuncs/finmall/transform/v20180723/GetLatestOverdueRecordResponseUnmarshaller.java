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

package com.aliyuncs.finmall.transform.v20180723;

import com.aliyuncs.finmall.model.v20180723.GetLatestOverdueRecordResponse;
import com.aliyuncs.finmall.model.v20180723.GetLatestOverdueRecordResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLatestOverdueRecordResponseUnmarshaller {

	public static GetLatestOverdueRecordResponse unmarshall(GetLatestOverdueRecordResponse getLatestOverdueRecordResponse, UnmarshallerContext context) {
		
		getLatestOverdueRecordResponse.setRequestId(context.stringValue("GetLatestOverdueRecordResponse.RequestId"));
		getLatestOverdueRecordResponse.setCode(context.stringValue("GetLatestOverdueRecordResponse.Code"));
		getLatestOverdueRecordResponse.setMessage(context.stringValue("GetLatestOverdueRecordResponse.Message"));

		Data data = new Data();
		data.setOverdueId(context.stringValue("GetLatestOverdueRecordResponse.Data.OverdueId"));
		data.setCreditId(context.stringValue("GetLatestOverdueRecordResponse.Data.CreditId"));
		data.setOverdueType(context.stringValue("GetLatestOverdueRecordResponse.Data.OverdueType"));
		data.setCreditAccount(context.stringValue("GetLatestOverdueRecordResponse.Data.CreditAccount"));
		data.setPrincipal(context.stringValue("GetLatestOverdueRecordResponse.Data.Principal"));
		data.setInterestAmount(context.stringValue("GetLatestOverdueRecordResponse.Data.InterestAmount"));
		data.setInterestOfInterest(context.stringValue("GetLatestOverdueRecordResponse.Data.InterestOfInterest"));
		data.setFineAmount(context.stringValue("GetLatestOverdueRecordResponse.Data.FineAmount"));
		data.setFineInterest(context.stringValue("GetLatestOverdueRecordResponse.Data.FineInterest"));
		data.setOverdueStartDate(context.stringValue("GetLatestOverdueRecordResponse.Data.OverdueStartDate"));
		data.setOverdueDays(context.stringValue("GetLatestOverdueRecordResponse.Data.OverdueDays"));
		getLatestOverdueRecordResponse.setData(data);
	 
	 	return getLatestOverdueRecordResponse;
	}
}