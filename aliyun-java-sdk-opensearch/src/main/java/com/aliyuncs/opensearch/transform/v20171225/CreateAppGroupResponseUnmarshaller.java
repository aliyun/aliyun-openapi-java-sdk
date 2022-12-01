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
		result.setCreated(_ctx.integerValue("CreateAppGroupResponse.result.created"));
		result.setCurrentVersion(_ctx.stringValue("CreateAppGroupResponse.result.currentVersion"));
		result.setPendingSecondRankAlgoDeploymentId(_ctx.integerValue("CreateAppGroupResponse.result.pendingSecondRankAlgoDeploymentId"));
		result.setLockMode(_ctx.stringValue("CreateAppGroupResponse.result.lockMode"));
		result.setUpdated(_ctx.integerValue("CreateAppGroupResponse.result.updated"));
		result.setId(_ctx.stringValue("CreateAppGroupResponse.result.id"));
		result.setChargeType(_ctx.stringValue("CreateAppGroupResponse.result.chargeType"));
		result.setHasPendingQuotaReviewTask(_ctx.integerValue("CreateAppGroupResponse.result.hasPendingQuotaReviewTask"));
		result.setSecondRankAlgoDeploymentId(_ctx.integerValue("CreateAppGroupResponse.result.secondRankAlgoDeploymentId"));
		result.setName(_ctx.stringValue("CreateAppGroupResponse.result.name"));
		result.setInstanceId(_ctx.stringValue("CreateAppGroupResponse.result.instanceId"));
		result.setProcessingOrderId(_ctx.stringValue("CreateAppGroupResponse.result.processingOrderId"));
		result.setChargingWay(_ctx.integerValue("CreateAppGroupResponse.result.chargingWay"));
		result.setType(_ctx.stringValue("CreateAppGroupResponse.result.type"));
		result.setStatus(_ctx.stringValue("CreateAppGroupResponse.result.status"));
		result.setProjectId(_ctx.stringValue("CreateAppGroupResponse.result.projectId"));
		result.setSwitchedTime(_ctx.integerValue("CreateAppGroupResponse.result.switchedTime"));
		result.setCommodityCode(_ctx.stringValue("CreateAppGroupResponse.result.commodityCode"));
		result.setExpireOn(_ctx.stringValue("CreateAppGroupResponse.result.expireOn"));
		result.setDomain(_ctx.stringValue("CreateAppGroupResponse.result.domain"));
		result.setDescription(_ctx.stringValue("CreateAppGroupResponse.result.description"));
		result.setFirstRankAlgoDeploymentId(_ctx.integerValue("CreateAppGroupResponse.result.firstRankAlgoDeploymentId"));
		result.setProduced(_ctx.integerValue("CreateAppGroupResponse.result.produced"));
		result.setLockedByExpiration(_ctx.integerValue("CreateAppGroupResponse.result.lockedByExpiration"));

		Quota quota = new Quota();
		quota.setSpec(_ctx.stringValue("CreateAppGroupResponse.result.quota.spec"));
		quota.setDocSize(_ctx.integerValue("CreateAppGroupResponse.result.quota.docSize"));
		quota.setComputeResource(_ctx.integerValue("CreateAppGroupResponse.result.quota.computeResource"));
		result.setQuota(quota);
		createAppGroupResponse.setResult(result);
	 
	 	return createAppGroupResponse;
	}
}