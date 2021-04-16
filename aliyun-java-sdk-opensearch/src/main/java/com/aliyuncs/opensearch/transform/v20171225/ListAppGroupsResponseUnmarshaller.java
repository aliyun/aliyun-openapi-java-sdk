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

import com.aliyuncs.opensearch.model.v20171225.ListAppGroupsResponse;
import com.aliyuncs.opensearch.model.v20171225.ListAppGroupsResponse.ResultItem;
import com.aliyuncs.opensearch.model.v20171225.ListAppGroupsResponse.ResultItem.Quota;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppGroupsResponseUnmarshaller {

	public static ListAppGroupsResponse unmarshall(ListAppGroupsResponse listAppGroupsResponse, UnmarshallerContext _ctx) {
		
		listAppGroupsResponse.setRequestId(_ctx.stringValue("ListAppGroupsResponse.requestId"));
		listAppGroupsResponse.setTotalCount(_ctx.integerValue("ListAppGroupsResponse.totalCount"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppGroupsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].id"));
			resultItem.setName(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].name"));
			resultItem.setCurrentVersion(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].currentVersion"));
			resultItem.setSwitchedTime(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].switchedTime"));
			resultItem.setChargingWay(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].chargingWay"));
			resultItem.setType(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].type"));
			resultItem.setProjectId(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].projectId"));
			resultItem.setChargeType(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].chargeType"));
			resultItem.setExpireOn(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].expireOn"));
			resultItem.setInstanceId(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].instanceId"));
			resultItem.setCommodityCode(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].commodityCode"));
			resultItem.setProcessingOrderId(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].processingOrderId"));
			resultItem.setFirstRankAlgoDeploymentId(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].firstRankAlgoDeploymentId"));
			resultItem.setSecondRankAlgoDeploymentId(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].secondRankAlgoDeploymentId"));
			resultItem.setPendingSecondRankAlgoDeploymentId(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].pendingSecondRankAlgoDeploymentId"));
			resultItem.setDescription(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].description"));
			resultItem.setProduced(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].produced"));
			resultItem.setLockedByExpiration(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].lockedByExpiration"));
			resultItem.setHasPendingQuotaReviewTask(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].hasPendingQuotaReviewTask"));
			resultItem.setCreated(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].created"));
			resultItem.setUpdated(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].updated"));
			resultItem.setStatus(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].status"));
			resultItem.setLockMode(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].lockMode"));
			resultItem.setDomain(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].domain"));

			Quota quota = new Quota();
			quota.setDocSize(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].quota.docSize"));
			quota.setComputeResource(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].quota.computeResource"));
			quota.setSpec(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].quota.spec"));
			resultItem.setQuota(quota);

			result.add(resultItem);
		}
		listAppGroupsResponse.setResult(result);
	 
	 	return listAppGroupsResponse;
	}
}