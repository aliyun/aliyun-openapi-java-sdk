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

import com.aliyuncs.domain.model.v20180129.QueryDSRecordResponse;
import com.aliyuncs.domain.model.v20180129.QueryDSRecordResponse.DSRecord;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDSRecordResponseUnmarshaller {

	public static QueryDSRecordResponse unmarshall(QueryDSRecordResponse queryDSRecordResponse, UnmarshallerContext context) {
		
		queryDSRecordResponse.setRequestId(context.stringValue("QueryDSRecordResponse.RequestId"));

		List<DSRecord> dSRecordList = new ArrayList<DSRecord>();
		for (int i = 0; i < context.lengthValue("QueryDSRecordResponse.DSRecordList.Length"); i++) {
			DSRecord dSRecord = new DSRecord();
			dSRecord.setKeyTag(context.integerValue("QueryDSRecordResponse.DSRecordList["+ i +"].KeyTag"));
			dSRecord.setAlgorithm(context.integerValue("QueryDSRecordResponse.DSRecordList["+ i +"].Algorithm"));
			dSRecord.setDigestType(context.integerValue("QueryDSRecordResponse.DSRecordList["+ i +"].DigestType"));
			dSRecord.setDigest(context.stringValue("QueryDSRecordResponse.DSRecordList["+ i +"].Digest"));

			dSRecordList.add(dSRecord);
		}
		queryDSRecordResponse.setDSRecordList(dSRecordList);
	 
	 	return queryDSRecordResponse;
	}
}