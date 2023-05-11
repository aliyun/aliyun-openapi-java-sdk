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

import com.aliyuncs.iot.model.v20180120.QueryCertUrlByApplyIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCertUrlByApplyIdResponseUnmarshaller {

	public static QueryCertUrlByApplyIdResponse unmarshall(QueryCertUrlByApplyIdResponse queryCertUrlByApplyIdResponse, UnmarshallerContext _ctx) {
		
		queryCertUrlByApplyIdResponse.setRequestId(_ctx.stringValue("QueryCertUrlByApplyIdResponse.RequestId"));
		queryCertUrlByApplyIdResponse.setSuccess(_ctx.booleanValue("QueryCertUrlByApplyIdResponse.Success"));
		queryCertUrlByApplyIdResponse.setCode(_ctx.stringValue("QueryCertUrlByApplyIdResponse.Code"));
		queryCertUrlByApplyIdResponse.setErrorMessage(_ctx.stringValue("QueryCertUrlByApplyIdResponse.ErrorMessage"));
		queryCertUrlByApplyIdResponse.setCertUrl(_ctx.stringValue("QueryCertUrlByApplyIdResponse.CertUrl"));
	 
	 	return queryCertUrlByApplyIdResponse;
	}
}