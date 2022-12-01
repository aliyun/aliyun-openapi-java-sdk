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

import com.aliyuncs.opensearch.model.v20171225.DescribeAppGroupResponse;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppGroupResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppGroupResponse.Result.Quota;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppGroupResponse.Result.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppGroupResponseUnmarshaller {

	public static DescribeAppGroupResponse unmarshall(DescribeAppGroupResponse describeAppGroupResponse, UnmarshallerContext _ctx) {
		
		describeAppGroupResponse.setRequestId(_ctx.stringValue("DescribeAppGroupResponse.requestId"));

		Result result = new Result();
		result.setCreated(_ctx.integerValue("DescribeAppGroupResponse.result.created"));
		result.setCurrentVersion(_ctx.stringValue("DescribeAppGroupResponse.result.currentVersion"));
		result.setPendingSecondRankAlgoDeploymentId(_ctx.integerValue("DescribeAppGroupResponse.result.pendingSecondRankAlgoDeploymentId"));
		result.setLockMode(_ctx.stringValue("DescribeAppGroupResponse.result.lockMode"));
		result.setUpdated(_ctx.integerValue("DescribeAppGroupResponse.result.updated"));
		result.setId(_ctx.stringValue("DescribeAppGroupResponse.result.id"));
		result.setChargeType(_ctx.stringValue("DescribeAppGroupResponse.result.chargeType"));
		result.setHasPendingQuotaReviewTask(_ctx.integerValue("DescribeAppGroupResponse.result.hasPendingQuotaReviewTask"));
		result.setSecondRankAlgoDeploymentId(_ctx.integerValue("DescribeAppGroupResponse.result.secondRankAlgoDeploymentId"));
		result.setName(_ctx.stringValue("DescribeAppGroupResponse.result.name"));
		result.setInstanceId(_ctx.stringValue("DescribeAppGroupResponse.result.instanceId"));
		result.setProcessingOrderId(_ctx.stringValue("DescribeAppGroupResponse.result.processingOrderId"));
		result.setChargingWay(_ctx.integerValue("DescribeAppGroupResponse.result.chargingWay"));
		result.setType(_ctx.stringValue("DescribeAppGroupResponse.result.type"));
		result.setStatus(_ctx.stringValue("DescribeAppGroupResponse.result.status"));
		result.setProjectId(_ctx.stringValue("DescribeAppGroupResponse.result.projectId"));
		result.setSwitchedTime(_ctx.integerValue("DescribeAppGroupResponse.result.switchedTime"));
		result.setCommodityCode(_ctx.stringValue("DescribeAppGroupResponse.result.commodityCode"));
		result.setExpireOn(_ctx.stringValue("DescribeAppGroupResponse.result.expireOn"));
		result.setDomain(_ctx.stringValue("DescribeAppGroupResponse.result.domain"));
		result.setDescription(_ctx.stringValue("DescribeAppGroupResponse.result.description"));
		result.setFirstRankAlgoDeploymentId(_ctx.integerValue("DescribeAppGroupResponse.result.firstRankAlgoDeploymentId"));
		result.setProduced(_ctx.integerValue("DescribeAppGroupResponse.result.produced"));
		result.setLockedByExpiration(_ctx.integerValue("DescribeAppGroupResponse.result.lockedByExpiration"));

		Quota quota = new Quota();
		quota.setSpec(_ctx.stringValue("DescribeAppGroupResponse.result.quota.spec"));
		quota.setDocSize(_ctx.integerValue("DescribeAppGroupResponse.result.quota.docSize"));
		quota.setComputeResource(_ctx.integerValue("DescribeAppGroupResponse.result.quota.computeResource"));
		result.setQuota(quota);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAppGroupResponse.result.tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("DescribeAppGroupResponse.result.tags["+ i +"].key"));
			tagsItem.setValue(_ctx.stringValue("DescribeAppGroupResponse.result.tags["+ i +"].value"));

			tags.add(tagsItem);
		}
		result.setTags(tags);
		describeAppGroupResponse.setResult(result);
	 
	 	return describeAppGroupResponse;
	}
}