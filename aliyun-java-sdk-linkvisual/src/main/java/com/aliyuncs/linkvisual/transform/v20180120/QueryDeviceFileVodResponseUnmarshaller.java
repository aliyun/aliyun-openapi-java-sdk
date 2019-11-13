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

import com.aliyuncs.linkvisual.model.v20180120.QueryDeviceFileVodResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryDeviceFileVodResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceFileVodResponseUnmarshaller {

	public static QueryDeviceFileVodResponse unmarshall(QueryDeviceFileVodResponse queryDeviceFileVodResponse, UnmarshallerContext _ctx) {
		
		queryDeviceFileVodResponse.setRequestId(_ctx.stringValue("QueryDeviceFileVodResponse.RequestId"));
		queryDeviceFileVodResponse.setSuccess(_ctx.booleanValue("QueryDeviceFileVodResponse.Success"));
		queryDeviceFileVodResponse.setErrorMessage(_ctx.stringValue("QueryDeviceFileVodResponse.ErrorMessage"));
		queryDeviceFileVodResponse.setCode(_ctx.stringValue("QueryDeviceFileVodResponse.Code"));
		queryDeviceFileVodResponse.setDecryptKey(_ctx.stringValue("QueryDeviceFileVodResponse.DecryptKey"));

		Data data = new Data();
		data.setVodUrl(_ctx.stringValue("QueryDeviceFileVodResponse.Data.VodUrl"));
		queryDeviceFileVodResponse.setData(data);
	 
	 	return queryDeviceFileVodResponse;
	}
}