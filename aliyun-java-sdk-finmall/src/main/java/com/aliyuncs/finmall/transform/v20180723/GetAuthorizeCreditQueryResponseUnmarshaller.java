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

package com.aliyuncs.finmall.transform.v20180723;

import com.aliyuncs.finmall.model.v20180723.GetAuthorizeCreditQueryResponse;
import com.aliyuncs.finmall.model.v20180723.GetAuthorizeCreditQueryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAuthorizeCreditQueryResponseUnmarshaller {

	public static GetAuthorizeCreditQueryResponse unmarshall(GetAuthorizeCreditQueryResponse getAuthorizeCreditQueryResponse, UnmarshallerContext context) {
		
		getAuthorizeCreditQueryResponse.setRequestId(context.stringValue("GetAuthorizeCreditQueryResponse.RequestId"));
		getAuthorizeCreditQueryResponse.setCode(context.stringValue("GetAuthorizeCreditQueryResponse.Code"));
		getAuthorizeCreditQueryResponse.setMessage(context.stringValue("GetAuthorizeCreditQueryResponse.Message"));

		Data data = new Data();
		data.setUrl(context.stringValue("GetAuthorizeCreditQueryResponse.Data.Url"));
		data.setReturnCode(context.stringValue("GetAuthorizeCreditQueryResponse.Data.ReturnCode"));
		data.setDownloadUrl(context.stringValue("GetAuthorizeCreditQueryResponse.Data.DownloadUrl"));
		data.setViewUrl(context.stringValue("GetAuthorizeCreditQueryResponse.Data.ViewUrl"));
		getAuthorizeCreditQueryResponse.setData(data);
	 
	 	return getAuthorizeCreditQueryResponse;
	}
}