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

import com.aliyuncs.finmall.model.v20180723.AddTrialRecordResponse;
import com.aliyuncs.finmall.model.v20180723.AddTrialRecordResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddTrialRecordResponseUnmarshaller {

	public static AddTrialRecordResponse unmarshall(AddTrialRecordResponse addTrialRecordResponse, UnmarshallerContext context) {
		
		addTrialRecordResponse.setRequestId(context.stringValue("AddTrialRecordResponse.RequestId"));
		addTrialRecordResponse.setCode(context.stringValue("AddTrialRecordResponse.Code"));
		addTrialRecordResponse.setMessage(context.stringValue("AddTrialRecordResponse.Message"));

		Data data = new Data();
		data.setCustomId(context.stringValue("AddTrialRecordResponse.Data.CustomId"));
		addTrialRecordResponse.setData(data);
	 
	 	return addTrialRecordResponse;
	}
}