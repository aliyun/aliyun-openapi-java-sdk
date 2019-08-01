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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryBatchRegistAnonymousTbAccountResultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBatchRegistAnonymousTbAccountResultResponseUnmarshaller {

	public static QueryBatchRegistAnonymousTbAccountResultResponse unmarshall(QueryBatchRegistAnonymousTbAccountResultResponse queryBatchRegistAnonymousTbAccountResultResponse, UnmarshallerContext _ctx) {
		
		queryBatchRegistAnonymousTbAccountResultResponse.setRequestId(_ctx.stringValue("QueryBatchRegistAnonymousTbAccountResultResponse.RequestId"));
		queryBatchRegistAnonymousTbAccountResultResponse.setCode(_ctx.stringValue("QueryBatchRegistAnonymousTbAccountResultResponse.Code"));
		queryBatchRegistAnonymousTbAccountResultResponse.setMessage(_ctx.stringValue("QueryBatchRegistAnonymousTbAccountResultResponse.Message"));
		queryBatchRegistAnonymousTbAccountResultResponse.setBatchId(_ctx.stringValue("QueryBatchRegistAnonymousTbAccountResultResponse.BatchId"));
		queryBatchRegistAnonymousTbAccountResultResponse.setStatus(_ctx.stringValue("QueryBatchRegistAnonymousTbAccountResultResponse.Status"));

		List<String> failIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryBatchRegistAnonymousTbAccountResultResponse.FailIds.Length"); i++) {
			failIds.add(_ctx.stringValue("QueryBatchRegistAnonymousTbAccountResultResponse.FailIds["+ i +"]"));
		}
		queryBatchRegistAnonymousTbAccountResultResponse.setFailIds(failIds);
	 
	 	return queryBatchRegistAnonymousTbAccountResultResponse;
	}
}