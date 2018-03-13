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
package com.aliyuncs.aegis.transform.v20161111;

import com.aliyuncs.aegis.model.v20161111.GetAccountStatisticsResponse;
import com.aliyuncs.aegis.model.v20161111.GetAccountStatisticsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountStatisticsResponseUnmarshaller {

	public static GetAccountStatisticsResponse unmarshall(GetAccountStatisticsResponse getAccountStatisticsResponse, UnmarshallerContext context) {
		
		getAccountStatisticsResponse.setRequestId(context.stringValue("GetAccountStatisticsResponse.requestId"));
		getAccountStatisticsResponse.setCode(context.stringValue("GetAccountStatisticsResponse.Code"));
		getAccountStatisticsResponse.setSuccess(context.booleanValue("GetAccountStatisticsResponse.Success"));
		getAccountStatisticsResponse.setMessage(context.stringValue("GetAccountStatisticsResponse.Message"));

		Data data = new Data();
		data.setRemoteLogin(context.integerValue("GetAccountStatisticsResponse.Data.RemoteLogin"));
		data.setCrackSuccess(context.integerValue("GetAccountStatisticsResponse.Data.CrackSuccess"));
		getAccountStatisticsResponse.setData(data);
	 
	 	return getAccountStatisticsResponse;
	}
}