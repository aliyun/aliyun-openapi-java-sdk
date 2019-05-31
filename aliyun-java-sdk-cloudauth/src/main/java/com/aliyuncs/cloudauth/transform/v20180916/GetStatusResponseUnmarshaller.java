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

	public static GetStatusResponse unmarshall(GetStatusResponse getStatusResponse, UnmarshallerContext context) {
		
		getStatusResponse.setRequestId(context.stringValue("GetStatusResponse.RequestId"));
		getStatusResponse.setSuccess(context.booleanValue("GetStatusResponse.Success"));
		getStatusResponse.setCode(context.stringValue("GetStatusResponse.Code"));
		getStatusResponse.setMessage(context.stringValue("GetStatusResponse.Message"));

		Data data = new Data();
		data.setStatusCode(context.integerValue("GetStatusResponse.Data.StatusCode"));
		data.setTrustedScore(context.floatValue("GetStatusResponse.Data.TrustedScore"));
		data.setSimilarityScore(context.floatValue("GetStatusResponse.Data.SimilarityScore"));
		data.setAuditConclusions(context.stringValue("GetStatusResponse.Data.AuditConclusions"));
		data.setAuthorityComparisonScore(context.floatValue("GetStatusResponse.Data.AuthorityComparisonScore"));
		getStatusResponse.setData(data);
	 
	 	return getStatusResponse;
	}
}