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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ListQuotaReviewTasksResponse;
import com.aliyuncs.opensearch.model.v20171225.ListQuotaReviewTasksResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQuotaReviewTasksResponseUnmarshaller {

	public static ListQuotaReviewTasksResponse unmarshall(ListQuotaReviewTasksResponse listQuotaReviewTasksResponse, UnmarshallerContext _ctx) {
		
		listQuotaReviewTasksResponse.setTotalCount(_ctx.integerValue("ListQuotaReviewTasksResponse.totalCount"));
		listQuotaReviewTasksResponse.setRequestId(_ctx.stringValue("ListQuotaReviewTasksResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQuotaReviewTasksResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setOldDocSize(_ctx.integerValue("ListQuotaReviewTasksResponse.result["+ i +"].oldDocSize"));
			resultItem.setPending(_ctx.booleanValue("ListQuotaReviewTasksResponse.result["+ i +"].pending"));
			resultItem.setMemo(_ctx.stringValue("ListQuotaReviewTasksResponse.result["+ i +"].memo"));
			resultItem.setApproved(_ctx.booleanValue("ListQuotaReviewTasksResponse.result["+ i +"].approved"));
			resultItem.setOldSpec(_ctx.stringValue("ListQuotaReviewTasksResponse.result["+ i +"].oldSpec"));
			resultItem.setOldComputeResource(_ctx.integerValue("ListQuotaReviewTasksResponse.result["+ i +"].oldComputeResource"));
			resultItem.setAppGroupType(_ctx.stringValue("ListQuotaReviewTasksResponse.result["+ i +"].appGroupType"));
			resultItem.setAvailable(_ctx.booleanValue("ListQuotaReviewTasksResponse.result["+ i +"].available"));
			resultItem.setGmtCreate(_ctx.stringValue("ListQuotaReviewTasksResponse.result["+ i +"].gmtCreate"));
			resultItem.setNewSocSize(_ctx.integerValue("ListQuotaReviewTasksResponse.result["+ i +"].newSocSize"));
			resultItem.setId(_ctx.integerValue("ListQuotaReviewTasksResponse.result["+ i +"].id"));
			resultItem.setAppGroupId(_ctx.integerValue("ListQuotaReviewTasksResponse.result["+ i +"].appGroupId"));
			resultItem.setNewComputeResource(_ctx.integerValue("ListQuotaReviewTasksResponse.result["+ i +"].newComputeResource"));
			resultItem.setAppGroupName(_ctx.stringValue("ListQuotaReviewTasksResponse.result["+ i +"].appGroupName"));
			resultItem.setGmtModified(_ctx.stringValue("ListQuotaReviewTasksResponse.result["+ i +"].gmtModified"));
			resultItem.setNewSpec(_ctx.stringValue("ListQuotaReviewTasksResponse.result["+ i +"].newSpec"));

			result.add(resultItem);
		}
		listQuotaReviewTasksResponse.setResult(result);
	 
	 	return listQuotaReviewTasksResponse;
	}
}