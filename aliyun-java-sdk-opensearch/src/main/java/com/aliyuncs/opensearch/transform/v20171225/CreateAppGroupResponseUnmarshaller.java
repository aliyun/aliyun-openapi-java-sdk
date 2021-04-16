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

import com.aliyuncs.opensearch.model.v20171225.CreateAppGroupResponse;
import com.aliyuncs.opensearch.model.v20171225.CreateAppGroupResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.CreateAppGroupResponse.Result.Quota;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppGroupResponseUnmarshaller {

	public static CreateAppGroupResponse unmarshall(CreateAppGroupResponse createAppGroupResponse, UnmarshallerContext _ctx) {
		
		createAppGroupResponse.setRequestId(_ctx.stringValue("CreateAppGroupResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("CreateAppGroupResponse.result.id"));
		result.setName(_ctx.stringValue("CreateAppGroupResponse.result.name"));
		result.setCurrentVersion(_ctx.stringValue("CreateAppGroupResponse.result.currentVersion"));
		result.setSwitchedTime(_ctx.integerValue("CreateAppGroupResponse.result.switchedTime"));
		result.setChargingWay(_ctx.integerValue("CreateAppGroupResponse.result.chargingWay"));
		result.setType(_ctx.stringValue("CreateAppGroupResponse.result.type"));
		result.setProjectId(_ctx.stringValue("CreateAppGroupResponse.result.projectId"));
		result.setChargeType(_ctx.stringValue("CreateAppGroupResponse.result.chargeType"));
		result.setExpireOn(_ctx.stringValue("CreateAppGroupResponse.result.expireOn"));
		result.setInstanceId(_ctx.stringValue("CreateAppGroupResponse.result.instanceId"));
		result.setCommodityCode(_ctx.stringValue("CreateAppGroupResponse.result.commodityCode"));
		result.setProcessingOrderId(_ctx.stringValue("CreateAppGroupResponse.result.processingOrderId"));
		result.setFirstRankAlgoDeploymentId(_ctx.integerValue("CreateAppGroupResponse.result.firstRankAlgoDeploymentId"));
		result.setSecondRankAlgoDeploymentId(_ctx.integerValue("CreateAppGroupResponse.result.secondRankAlgoDeploymentId"));
		result.setPendingSecondRankAlgoDeploymentId(_ctx.integerValue("CreateAppGroupResponse.result.pendingSecondRankAlgoDeploymentId"));
		result.setDescription(_ctx.stringValue("CreateAppGroupResponse.result.description"));
		result.setProduced(_ctx.integerValue("CreateAppGroupResponse.result.produced"));
		result.setLockedByExpiration(_ctx.integerValue("CreateAppGroupResponse.result.lockedByExpiration"));
		result.setHasPendingQuotaReviewTask(_ctx.integerValue("CreateAppGroupResponse.result.hasPendingQuotaReviewTask"));
		result.setCreated(_ctx.integerValue("CreateAppGroupResponse.result.created"));
		result.setUpdated(_ctx.integerValue("CreateAppGroupResponse.result.updated"));
		result.setStatus(_ctx.stringValue("CreateAppGroupResponse.result.status"));
		result.setLockMode(_ctx.stringValue("CreateAppGroupResponse.result.lockMode"));
		result.setDomain(_ctx.stringValue("CreateAppGroupResponse.result.domain"));

		Quota quota = new Quota();
		quota.setDocSize(_ctx.integerValue("CreateAppGroupResponse.result.quota.docSize"));
		quota.setComputeResource(_ctx.integerValue("CreateAppGroupResponse.result.quota.computeResource"));
		quota.setSpec(_ctx.stringValue("CreateAppGroupResponse.result.quota.spec"));
		result.setQuota(quota);
		createAppGroupResponse.setResult(result);
	 
	 	return createAppGroupResponse;
	}
}