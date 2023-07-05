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

package com.aliyuncs.advisor_share.transform.v20180608;

import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityNetworkResponse;
import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityNetworkResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckConnectivityNetworkResponseUnmarshaller {

	public static CheckConnectivityNetworkResponse unmarshall(CheckConnectivityNetworkResponse checkConnectivityNetworkResponse, UnmarshallerContext _ctx) {
		
		checkConnectivityNetworkResponse.setRequestId(_ctx.stringValue("CheckConnectivityNetworkResponse.RequestId"));

		Data data = new Data();
		data.setCheckId(_ctx.stringValue("CheckConnectivityNetworkResponse.Data.CheckId"));
		data.setSeverity(_ctx.integerValue("CheckConnectivityNetworkResponse.Data.Severity"));
		data.setNetworkResult(_ctx.stringValue("CheckConnectivityNetworkResponse.Data.NetworkResult"));
		data.setErrorCode(_ctx.stringValue("CheckConnectivityNetworkResponse.Data.ErrorCode"));
		checkConnectivityNetworkResponse.setData(data);
	 
	 	return checkConnectivityNetworkResponse;
	}
}