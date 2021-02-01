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

package com.aliyuncs.facebody.transform.v20200910;

import com.aliyuncs.facebody.model.v20200910.ExecuteServerSideVerificationResponse;
import com.aliyuncs.facebody.model.v20200910.ExecuteServerSideVerificationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteServerSideVerificationResponseUnmarshaller {

	public static ExecuteServerSideVerificationResponse unmarshall(ExecuteServerSideVerificationResponse executeServerSideVerificationResponse, UnmarshallerContext _ctx) {
		
		executeServerSideVerificationResponse.setRequestId(_ctx.stringValue("ExecuteServerSideVerificationResponse.RequestId"));
		executeServerSideVerificationResponse.setMessage(_ctx.stringValue("ExecuteServerSideVerificationResponse.Message"));
		executeServerSideVerificationResponse.setCode(_ctx.stringValue("ExecuteServerSideVerificationResponse.Code"));

		Data data = new Data();
		data.setVerificationToken(_ctx.stringValue("ExecuteServerSideVerificationResponse.Data.VerificationToken"));
		data.setPass(_ctx.booleanValue("ExecuteServerSideVerificationResponse.Data.Pass"));
		data.setReason(_ctx.stringValue("ExecuteServerSideVerificationResponse.Data.Reason"));
		executeServerSideVerificationResponse.setData(data);
	 
	 	return executeServerSideVerificationResponse;
	}
}