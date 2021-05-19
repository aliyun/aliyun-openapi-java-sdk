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

package com.aliyuncs.mpaas.transform.v20200710;

import com.aliyuncs.mpaas.model.v20200710.MssOpenApiCreateSingleDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MssOpenApiCreateSingleDataResponseUnmarshaller {

	public static MssOpenApiCreateSingleDataResponse unmarshall(MssOpenApiCreateSingleDataResponse mssOpenApiCreateSingleDataResponse, UnmarshallerContext _ctx) {
		
		mssOpenApiCreateSingleDataResponse.setRequestId(_ctx.stringValue("MssOpenApiCreateSingleDataResponse.RequestId"));
		mssOpenApiCreateSingleDataResponse.setResultCode(_ctx.stringValue("MssOpenApiCreateSingleDataResponse.ResultCode"));
		mssOpenApiCreateSingleDataResponse.setResultMessage(_ctx.stringValue("MssOpenApiCreateSingleDataResponse.ResultMessage"));
	 
	 	return mssOpenApiCreateSingleDataResponse;
	}
}