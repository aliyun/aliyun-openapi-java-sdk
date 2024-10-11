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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.CheckDataSourceConnectivityByIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckDataSourceConnectivityByIdResponseUnmarshaller {

	public static CheckDataSourceConnectivityByIdResponse unmarshall(CheckDataSourceConnectivityByIdResponse checkDataSourceConnectivityByIdResponse, UnmarshallerContext _ctx) {
		
		checkDataSourceConnectivityByIdResponse.setRequestId(_ctx.stringValue("CheckDataSourceConnectivityByIdResponse.RequestId"));
		checkDataSourceConnectivityByIdResponse.setSuccess(_ctx.booleanValue("CheckDataSourceConnectivityByIdResponse.Success"));
		checkDataSourceConnectivityByIdResponse.setHttpStatusCode(_ctx.integerValue("CheckDataSourceConnectivityByIdResponse.HttpStatusCode"));
		checkDataSourceConnectivityByIdResponse.setCode(_ctx.stringValue("CheckDataSourceConnectivityByIdResponse.Code"));
		checkDataSourceConnectivityByIdResponse.setMessage(_ctx.stringValue("CheckDataSourceConnectivityByIdResponse.Message"));
		checkDataSourceConnectivityByIdResponse.setData(_ctx.booleanValue("CheckDataSourceConnectivityByIdResponse.Data"));
	 
	 	return checkDataSourceConnectivityByIdResponse;
	}
}