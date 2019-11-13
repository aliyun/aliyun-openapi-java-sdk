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

import com.aliyuncs.linkvisual.model.v20180120.QueryDeviceVodUrlResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryDeviceVodUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceVodUrlResponseUnmarshaller {

	public static QueryDeviceVodUrlResponse unmarshall(QueryDeviceVodUrlResponse queryDeviceVodUrlResponse, UnmarshallerContext _ctx) {
		
		queryDeviceVodUrlResponse.setRequestId(_ctx.stringValue("QueryDeviceVodUrlResponse.RequestId"));
		queryDeviceVodUrlResponse.setSuccess(_ctx.booleanValue("QueryDeviceVodUrlResponse.Success"));
		queryDeviceVodUrlResponse.setErrorMessage(_ctx.stringValue("QueryDeviceVodUrlResponse.ErrorMessage"));
		queryDeviceVodUrlResponse.setCode(_ctx.stringValue("QueryDeviceVodUrlResponse.Code"));
		queryDeviceVodUrlResponse.setDecryptKey(_ctx.stringValue("QueryDeviceVodUrlResponse.DecryptKey"));

		Data data = new Data();
		data.setVodUrl(_ctx.stringValue("QueryDeviceVodUrlResponse.Data.VodUrl"));
		queryDeviceVodUrlResponse.setData(data);
	 
	 	return queryDeviceVodUrlResponse;
	}
}