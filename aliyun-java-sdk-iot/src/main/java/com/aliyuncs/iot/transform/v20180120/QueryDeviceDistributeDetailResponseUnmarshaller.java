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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.QueryDeviceDistributeDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceDistributeDetailResponseUnmarshaller {

	public static QueryDeviceDistributeDetailResponse unmarshall(QueryDeviceDistributeDetailResponse queryDeviceDistributeDetailResponse, UnmarshallerContext _ctx) {
		
		queryDeviceDistributeDetailResponse.setRequestId(_ctx.stringValue("QueryDeviceDistributeDetailResponse.RequestId"));
		queryDeviceDistributeDetailResponse.setSuccess(_ctx.booleanValue("QueryDeviceDistributeDetailResponse.Success"));
		queryDeviceDistributeDetailResponse.setCode(_ctx.stringValue("QueryDeviceDistributeDetailResponse.Code"));
		queryDeviceDistributeDetailResponse.setErrorMessage(_ctx.stringValue("QueryDeviceDistributeDetailResponse.ErrorMessage"));
		queryDeviceDistributeDetailResponse.setFile(_ctx.stringValue("QueryDeviceDistributeDetailResponse.File"));
	 
	 	return queryDeviceDistributeDetailResponse;
	}
}