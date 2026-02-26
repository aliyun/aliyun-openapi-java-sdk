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

package com.aliyuncs.domain_intl.transform.v20171218;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain_intl.model.v20171218.QueryDSRecordResponse;
import com.aliyuncs.domain_intl.model.v20171218.QueryDSRecordResponse.DSRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDSRecordResponseUnmarshaller {

	public static QueryDSRecordResponse unmarshall(QueryDSRecordResponse queryDSRecordResponse, UnmarshallerContext _ctx) {
		
		queryDSRecordResponse.setRequestId(_ctx.stringValue("QueryDSRecordResponse.RequestId"));

		List<DSRecord> dSRecordList = new ArrayList<DSRecord>();
		for (int i = 0; i < _ctx.lengthValue("QueryDSRecordResponse.DSRecordList.Length"); i++) {
			DSRecord dSRecord = new DSRecord();
			dSRecord.setDigestType(_ctx.integerValue("QueryDSRecordResponse.DSRecordList["+ i +"].DigestType"));
			dSRecord.setDigest(_ctx.stringValue("QueryDSRecordResponse.DSRecordList["+ i +"].Digest"));
			dSRecord.setAlgorithm(_ctx.integerValue("QueryDSRecordResponse.DSRecordList["+ i +"].Algorithm"));
			dSRecord.setKeyTag(_ctx.integerValue("QueryDSRecordResponse.DSRecordList["+ i +"].KeyTag"));

			dSRecordList.add(dSRecord);
		}
		queryDSRecordResponse.setDSRecordList(dSRecordList);
	 
	 	return queryDSRecordResponse;
	}
}