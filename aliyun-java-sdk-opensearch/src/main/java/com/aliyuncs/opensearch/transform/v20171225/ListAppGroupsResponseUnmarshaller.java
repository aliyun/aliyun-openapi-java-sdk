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
import com.aliyuncs.opensearch.model.v20171225.ListAppGroupsResponse.ResultItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppGroupsResponseUnmarshaller {

	public static ListAppGroupsResponse unmarshall(ListAppGroupsResponse listAppGroupsResponse, UnmarshallerContext _ctx) {
		
		listAppGroupsResponse.setTotalCount(_ctx.integerValue("ListAppGroupsResponse.totalCount"));
		listAppGroupsResponse.setRequestId(_ctx.stringValue("ListAppGroupsResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppGroupsResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCreated(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].created"));
			resultItem.setCurrentVersion(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].currentVersion"));
			resultItem.setPendingSecondRankAlgoDeploymentId(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].pendingSecondRankAlgoDeploymentId"));
			resultItem.setLockMode(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].lockMode"));
			resultItem.setUpdated(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].updated"));
			resultItem.setId(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].id"));
			resultItem.setChargeType(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].chargeType"));
			resultItem.setHasPendingQuotaReviewTask(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].hasPendingQuotaReviewTask"));
			resultItem.setSecondRankAlgoDeploymentId(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].secondRankAlgoDeploymentId"));
			resultItem.setName(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].name"));
			resultItem.setInstanceId(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].instanceId"));
			resultItem.setProcessingOrderId(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].processingOrderId"));
			resultItem.setChargingWay(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].chargingWay"));
			resultItem.setType(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].type"));
			resultItem.setStatus(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].status"));
			resultItem.setProjectId(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].projectId"));
			resultItem.setSwitchedTime(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].switchedTime"));
			resultItem.setCommodityCode(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].commodityCode"));
			resultItem.setExpireOn(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].expireOn"));
			resultItem.setDomain(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].domain"));
			resultItem.setDescription(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].description"));
			resultItem.setFirstRankAlgoDeploymentId(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].firstRankAlgoDeploymentId"));
			resultItem.setProduced(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].produced"));
			resultItem.setLockedByExpiration(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].lockedByExpiration"));

			Quota quota = new Quota();
			quota.setSpec(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].quota.spec"));
			quota.setDocSize(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].quota.docSize"));
			quota.setComputeResource(_ctx.integerValue("ListAppGroupsResponse.result["+ i +"].quota.computeResource"));
			resultItem.setQuota(quota);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAppGroupsResponse.result["+ i +"].tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].tags["+ j +"].key"));
				tagsItem.setValue(_ctx.stringValue("ListAppGroupsResponse.result["+ i +"].tags["+ j +"].value"));

				tags.add(tagsItem);
			}
			resultItem.setTags(tags);

			result.add(resultItem);
		}
		listAppGroupsResponse.setResult(result);
	 
	 	return listAppGroupsResponse;
	}
}