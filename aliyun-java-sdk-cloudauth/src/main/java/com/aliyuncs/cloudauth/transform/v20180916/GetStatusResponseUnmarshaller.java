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

package com.aliyuncs.cloudauth.transform.v20180916;

import com.aliyuncs.cloudauth.model.v20180916.GetStatusResponse;
import com.aliyuncs.cloudauth.model.v20180916.GetStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStatusResponseUnmarshaller {

	public static GetStatusResponse unmarshall(GetStatusResponse getStatusResponse, UnmarshallerContext _ctx) {
		
		getStatusResponse.setRequestId(_ctx.stringValue("GetStatusResponse.RequestId"));
		getStatusResponse.setSuccess(_ctx.booleanValue("GetStatusResponse.Success"));
		getStatusResponse.setCode(_ctx.stringValue("GetStatusResponse.Code"));
		getStatusResponse.setMessage(_ctx.stringValue("GetStatusResponse.Message"));

		Data data = new Data();
		data.setStatusCode(_ctx.integerValue("GetStatusResponse.Data.StatusCode"));
		data.setTrustedScore(_ctx.floatValue("GetStatusResponse.Data.TrustedScore"));
		data.setSimilarityScore(_ctx.floatValue("GetStatusResponse.Data.SimilarityScore"));
		data.setAuditConclusions(_ctx.stringValue("GetStatusResponse.Data.AuditConclusions"));
		data.setAuthorityComparisonScore(_ctx.floatValue("GetStatusResponse.Data.AuthorityComparisonScore"));
		getStatusResponse.setData(data);
	 
	 	return getStatusResponse;
	}
}