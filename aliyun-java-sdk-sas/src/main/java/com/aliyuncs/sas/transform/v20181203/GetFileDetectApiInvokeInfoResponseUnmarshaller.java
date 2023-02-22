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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.GetFileDetectApiInvokeInfoResponse;
import com.aliyuncs.sas.model.v20181203.GetFileDetectApiInvokeInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFileDetectApiInvokeInfoResponseUnmarshaller {

	public static GetFileDetectApiInvokeInfoResponse unmarshall(GetFileDetectApiInvokeInfoResponse getFileDetectApiInvokeInfoResponse, UnmarshallerContext _ctx) {
		
		getFileDetectApiInvokeInfoResponse.setRequestId(_ctx.stringValue("GetFileDetectApiInvokeInfoResponse.RequestId"));

		Data data = new Data();
		data.setAuthCount(_ctx.longValue("GetFileDetectApiInvokeInfoResponse.Data.AuthCount"));
		data.setRemainAuthCount(_ctx.longValue("GetFileDetectApiInvokeInfoResponse.Data.RemainAuthCount"));
		data.setFlowRate(_ctx.integerValue("GetFileDetectApiInvokeInfoResponse.Data.FlowRate"));
		data.setTimeUnit(_ctx.stringValue("GetFileDetectApiInvokeInfoResponse.Data.TimeUnit"));
		data.setExpire(_ctx.longValue("GetFileDetectApiInvokeInfoResponse.Data.Expire"));
		data.setSaleVersion(_ctx.integerValue("GetFileDetectApiInvokeInfoResponse.Data.SaleVersion"));
		getFileDetectApiInvokeInfoResponse.setData(data);
	 
	 	return getFileDetectApiInvokeInfoResponse;
	}
}