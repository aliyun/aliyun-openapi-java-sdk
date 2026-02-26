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

import com.aliyuncs.opensearch.model.v20171225.ModifyAppGroupResponse;
import com.aliyuncs.opensearch.model.v20171225.ModifyAppGroupResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.ModifyAppGroupResponse.Result.Quota;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyAppGroupResponseUnmarshaller {

	public static ModifyAppGroupResponse unmarshall(ModifyAppGroupResponse modifyAppGroupResponse, UnmarshallerContext _ctx) {
		
		modifyAppGroupResponse.setRequestId(_ctx.stringValue("ModifyAppGroupResponse.requestId"));

		Result result = new Result();
		result.setCreated(_ctx.integerValue("ModifyAppGroupResponse.result.created"));
		result.setCurrentVersion(_ctx.stringValue("ModifyAppGroupResponse.result.currentVersion"));
		result.setPendingSecondRankAlgoDeploymentId(_ctx.integerValue("ModifyAppGroupResponse.result.pendingSecondRankAlgoDeploymentId"));
		result.setLockMode(_ctx.stringValue("ModifyAppGroupResponse.result.lockMode"));
		result.setUpdated(_ctx.integerValue("ModifyAppGroupResponse.result.updated"));
		result.setId(_ctx.stringValue("ModifyAppGroupResponse.result.id"));
		result.setChargeType(_ctx.stringValue("ModifyAppGroupResponse.result.chargeType"));
		result.setHasPendingQuotaReviewTask(_ctx.integerValue("ModifyAppGroupResponse.result.hasPendingQuotaReviewTask"));
		result.setSecondRankAlgoDeploymentId(_ctx.integerValue("ModifyAppGroupResponse.result.secondRankAlgoDeploymentId"));
		result.setName(_ctx.stringValue("ModifyAppGroupResponse.result.name"));
		result.setInstanceId(_ctx.stringValue("ModifyAppGroupResponse.result.instanceId"));
		result.setProcessingOrderId(_ctx.stringValue("ModifyAppGroupResponse.result.processingOrderId"));
		result.setChargingWay(_ctx.integerValue("ModifyAppGroupResponse.result.chargingWay"));
		result.setType(_ctx.stringValue("ModifyAppGroupResponse.result.type"));
		result.setStatus(_ctx.stringValue("ModifyAppGroupResponse.result.status"));
		result.setProjectId(_ctx.stringValue("ModifyAppGroupResponse.result.projectId"));
		result.setSwitchedTime(_ctx.integerValue("ModifyAppGroupResponse.result.switchedTime"));
		result.setCommodityCode(_ctx.stringValue("ModifyAppGroupResponse.result.commodityCode"));
		result.setExpireOn(_ctx.stringValue("ModifyAppGroupResponse.result.expireOn"));
		result.setDomain(_ctx.stringValue("ModifyAppGroupResponse.result.domain"));
		result.setDescription(_ctx.stringValue("ModifyAppGroupResponse.result.description"));
		result.setFirstRankAlgoDeploymentId(_ctx.integerValue("ModifyAppGroupResponse.result.firstRankAlgoDeploymentId"));
		result.setProduced(_ctx.integerValue("ModifyAppGroupResponse.result.produced"));
		result.setLockedByExpiration(_ctx.integerValue("ModifyAppGroupResponse.result.lockedByExpiration"));

		Quota quota = new Quota();
		quota.setSpec(_ctx.stringValue("ModifyAppGroupResponse.result.quota.spec"));
		quota.setDocSize(_ctx.integerValue("ModifyAppGroupResponse.result.quota.docSize"));
		quota.setComputeResource(_ctx.integerValue("ModifyAppGroupResponse.result.quota.computeResource"));
		result.setQuota(quota);
		modifyAppGroupResponse.setResult(result);
	 
	 	return modifyAppGroupResponse;
	}
}