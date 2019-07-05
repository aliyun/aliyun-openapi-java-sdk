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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.QueryQualificationDetailResponse;
import com.aliyuncs.domain.model.v20180129.QueryQualificationDetailResponse.QualificationCredential;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryQualificationDetailResponseUnmarshaller {

	public static QueryQualificationDetailResponse unmarshall(QueryQualificationDetailResponse queryQualificationDetailResponse, UnmarshallerContext _ctx) {
		
		queryQualificationDetailResponse.setRequestId(_ctx.stringValue("QueryQualificationDetailResponse.RequestId"));
		queryQualificationDetailResponse.setTrackId(_ctx.stringValue("QueryQualificationDetailResponse.TrackId"));
		queryQualificationDetailResponse.setAuditStatus(_ctx.integerValue("QueryQualificationDetailResponse.AuditStatus"));

		List<QualificationCredential> credentials = new ArrayList<QualificationCredential>();
		for (int i = 0; i < _ctx.lengthValue("QueryQualificationDetailResponse.Credentials.Length"); i++) {
			QualificationCredential qualificationCredential = new QualificationCredential();
			qualificationCredential.setCredentialNo(_ctx.stringValue("QueryQualificationDetailResponse.Credentials["+ i +"].CredentialNo"));
			qualificationCredential.setCredentialType(_ctx.stringValue("QueryQualificationDetailResponse.Credentials["+ i +"].CredentialType"));
			qualificationCredential.setCredentialUrl(_ctx.stringValue("QueryQualificationDetailResponse.Credentials["+ i +"].CredentialUrl"));

			credentials.add(qualificationCredential);
		}
		queryQualificationDetailResponse.setCredentials(credentials);
	 
	 	return queryQualificationDetailResponse;
	}
}