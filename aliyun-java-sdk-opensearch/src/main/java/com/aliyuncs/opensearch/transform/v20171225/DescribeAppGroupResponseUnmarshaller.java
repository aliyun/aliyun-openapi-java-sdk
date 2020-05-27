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

import com.aliyuncs.opensearch.model.v20171225.DescribeAppGroupResponse;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppGroupResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.DescribeAppGroupResponse.Result.Quota;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAppGroupResponseUnmarshaller {

	public static DescribeAppGroupResponse unmarshall(DescribeAppGroupResponse describeAppGroupResponse, UnmarshallerContext _ctx) {
		
		describeAppGroupResponse.setRequestId(_ctx.stringValue("DescribeAppGroupResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("DescribeAppGroupResponse.result.id"));
		result.setName(_ctx.stringValue("DescribeAppGroupResponse.result.name"));
		result.setCurrentVersion(_ctx.stringValue("DescribeAppGroupResponse.result.currentVersion"));
		result.setSwitchedTime(_ctx.integerValue("DescribeAppGroupResponse.result.switchedTime"));
		result.setChargingWay(_ctx.integerValue("DescribeAppGroupResponse.result.chargingWay"));
		result.setType(_ctx.stringValue("DescribeAppGroupResponse.result.type"));
		result.setProjectId(_ctx.stringValue("DescribeAppGroupResponse.result.projectId"));
		result.setChargeType(_ctx.stringValue("DescribeAppGroupResponse.result.chargeType"));
		result.setExpireOn(_ctx.stringValue("DescribeAppGroupResponse.result.expireOn"));
		result.setInstanceId(_ctx.stringValue("DescribeAppGroupResponse.result.instanceId"));
		result.setCommodityCode(_ctx.stringValue("DescribeAppGroupResponse.result.commodityCode"));
		result.setProcessingOrderId(_ctx.stringValue("DescribeAppGroupResponse.result.processingOrderId"));
		result.setFirstRankAlgoDeploymentId(_ctx.integerValue("DescribeAppGroupResponse.result.firstRankAlgoDeploymentId"));
		result.setSecondRankAlgoDeploymentId(_ctx.integerValue("DescribeAppGroupResponse.result.secondRankAlgoDeploymentId"));
		result.setPendingSecondRankAlgoDeploymentId(_ctx.integerValue("DescribeAppGroupResponse.result.pendingSecondRankAlgoDeploymentId"));
		result.setDescription(_ctx.stringValue("DescribeAppGroupResponse.result.description"));
		result.setProduced(_ctx.integerValue("DescribeAppGroupResponse.result.produced"));
		result.setLockedByExpiration(_ctx.integerValue("DescribeAppGroupResponse.result.lockedByExpiration"));
		result.setHasPendingQuotaReviewTask(_ctx.integerValue("DescribeAppGroupResponse.result.hasPendingQuotaReviewTask"));
		result.setCreated(_ctx.integerValue("DescribeAppGroupResponse.result.created"));
		result.setUpdated(_ctx.integerValue("DescribeAppGroupResponse.result.updated"));
		result.setStatus(_ctx.stringValue("DescribeAppGroupResponse.result.status"));
		result.setLockMode(_ctx.stringValue("DescribeAppGroupResponse.result.lockMode"));

		Quota quota = new Quota();
		quota.setDocSize(_ctx.integerValue("DescribeAppGroupResponse.result.quota.docSize"));
		quota.setComputeResource(_ctx.integerValue("DescribeAppGroupResponse.result.quota.computeResource"));
		quota.setSpec(_ctx.stringValue("DescribeAppGroupResponse.result.quota.spec"));
		result.setQuota(quota);
		describeAppGroupResponse.setResult(result);
	 
	 	return describeAppGroupResponse;
	}
}