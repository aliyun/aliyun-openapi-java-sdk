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

import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityStatusResponse;
import com.aliyuncs.advisor_share.model.v20180608.CheckConnectivityStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckConnectivityStatusResponseUnmarshaller {

	public static CheckConnectivityStatusResponse unmarshall(CheckConnectivityStatusResponse checkConnectivityStatusResponse, UnmarshallerContext _ctx) {
		
		checkConnectivityStatusResponse.setRequestId(_ctx.stringValue("CheckConnectivityStatusResponse.RequestId"));

		Data data = new Data();
		data.setDstStatus(_ctx.stringValue("CheckConnectivityStatusResponse.Data.DstStatus"));
		data.setSeverity(_ctx.integerValue("CheckConnectivityStatusResponse.Data.Severity"));
		data.setCheckId(_ctx.stringValue("CheckConnectivityStatusResponse.Data.CheckId"));
		data.setErrorCode(_ctx.stringValue("CheckConnectivityStatusResponse.Data.ErrorCode"));
		data.setSrcStatus(_ctx.stringValue("CheckConnectivityStatusResponse.Data.SrcStatus"));
		checkConnectivityStatusResponse.setData(data);
	 
	 	return checkConnectivityStatusResponse;
	}
}