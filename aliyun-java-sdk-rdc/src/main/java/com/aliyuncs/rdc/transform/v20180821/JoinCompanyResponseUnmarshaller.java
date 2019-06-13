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

package com.aliyuncs.rdc.transform.v20180821;

import com.aliyuncs.rdc.model.v20180821.JoinCompanyResponse;
import com.aliyuncs.rdc.model.v20180821.JoinCompanyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class JoinCompanyResponseUnmarshaller {

	public static JoinCompanyResponse unmarshall(JoinCompanyResponse joinCompanyResponse, UnmarshallerContext context) {
		
		joinCompanyResponse.setRequestId(context.stringValue("JoinCompanyResponse.RequestId"));
		joinCompanyResponse.setSuccess(context.booleanValue("JoinCompanyResponse.Success"));
		joinCompanyResponse.setCode(context.integerValue("JoinCompanyResponse.Code"));
		joinCompanyResponse.setMessage(context.stringValue("JoinCompanyResponse.Message"));

		Data data = new Data();
		data.setApplicationId(context.stringValue("JoinCompanyResponse.Data.ApplicationId"));
		joinCompanyResponse.setData(data);
	 
	 	return joinCompanyResponse;
	}
}