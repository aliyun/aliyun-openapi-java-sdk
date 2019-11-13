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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.QueryDevicePictureLifeCycleResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryDevicePictureLifeCycleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicePictureLifeCycleResponseUnmarshaller {

	public static QueryDevicePictureLifeCycleResponse unmarshall(QueryDevicePictureLifeCycleResponse queryDevicePictureLifeCycleResponse, UnmarshallerContext _ctx) {
		
		queryDevicePictureLifeCycleResponse.setRequestId(_ctx.stringValue("QueryDevicePictureLifeCycleResponse.RequestId"));
		queryDevicePictureLifeCycleResponse.setSuccess(_ctx.booleanValue("QueryDevicePictureLifeCycleResponse.Success"));
		queryDevicePictureLifeCycleResponse.setErrorMessage(_ctx.stringValue("QueryDevicePictureLifeCycleResponse.ErrorMessage"));
		queryDevicePictureLifeCycleResponse.setCode(_ctx.stringValue("QueryDevicePictureLifeCycleResponse.Code"));

		Data data = new Data();
		data.setIotId(_ctx.stringValue("QueryDevicePictureLifeCycleResponse.Data.IotId"));
		data.setDay(_ctx.integerValue("QueryDevicePictureLifeCycleResponse.Data.Day"));
		queryDevicePictureLifeCycleResponse.setData(data);
	 
	 	return queryDevicePictureLifeCycleResponse;
	}
}