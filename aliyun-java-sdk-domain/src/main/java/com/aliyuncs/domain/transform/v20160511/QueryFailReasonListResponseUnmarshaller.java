/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain.transform.v20160511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20160511.QueryFailReasonListResponse;
import com.aliyuncs.domain.model.v20160511.QueryFailReasonListResponse.FailRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFailReasonListResponseUnmarshaller {

	public static QueryFailReasonListResponse unmarshall(QueryFailReasonListResponse queryFailReasonListResponse, UnmarshallerContext context) {
		
		queryFailReasonListResponse.setRequestId(context.stringValue("QueryFailReasonListResponse.RequestId"));

		List<FailRecord> data = new ArrayList<FailRecord>();
		for (int i = 0; i < context.lengthValue("QueryFailReasonListResponse.Data.Length"); i++) {
			FailRecord failRecord = new FailRecord();
			failRecord.setDate(context.stringValue("QueryFailReasonListResponse.Data["+ i +"].Date"));
			failRecord.setFailReason(context.stringValue("QueryFailReasonListResponse.Data["+ i +"].FailReason"));

			data.add(failRecord);
		}
		queryFailReasonListResponse.setData(data);
	 
	 	return queryFailReasonListResponse;
	}
}