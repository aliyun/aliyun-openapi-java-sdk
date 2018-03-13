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

import com.aliyuncs.aegis.model.v20161111.GetStatisticsResponse;
import com.aliyuncs.aegis.model.v20161111.GetStatisticsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStatisticsResponseUnmarshaller {

	public static GetStatisticsResponse unmarshall(GetStatisticsResponse getStatisticsResponse, UnmarshallerContext context) {
		
		getStatisticsResponse.setRequestId(context.stringValue("GetStatisticsResponse.requestId"));
		getStatisticsResponse.setCode(context.stringValue("GetStatisticsResponse.Code"));
		getStatisticsResponse.setSuccess(context.booleanValue("GetStatisticsResponse.Success"));
		getStatisticsResponse.setMessage(context.stringValue("GetStatisticsResponse.Message"));

		Data data = new Data();
		data.setAccount(context.integerValue("GetStatisticsResponse.Data.Account"));
		data.setHealth(context.integerValue("GetStatisticsResponse.Data.Health"));
		data.setPatch(context.integerValue("GetStatisticsResponse.Data.Patch"));
		data.setTrojan(context.integerValue("GetStatisticsResponse.Data.Trojan"));
		getStatisticsResponse.setData(data);
	 
	 	return getStatisticsResponse;
	}
}