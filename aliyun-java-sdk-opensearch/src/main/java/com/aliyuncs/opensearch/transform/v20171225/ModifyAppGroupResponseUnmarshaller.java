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
		result.setId(_ctx.stringValue("ModifyAppGroupResponse.result.id"));
		result.setName(_ctx.stringValue("ModifyAppGroupResponse.result.name"));
		result.setCurrentVersion(_ctx.stringValue("ModifyAppGroupResponse.result.currentVersion"));
		result.setSwitchedTime(_ctx.integerValue("ModifyAppGroupResponse.result.switchedTime"));
		result.setChargingWay(_ctx.integerValue("ModifyAppGroupResponse.result.chargingWay"));
		result.setType(_ctx.stringValue("ModifyAppGroupResponse.result.type"));
		result.setProjectId(_ctx.stringValue("ModifyAppGroupResponse.result.projectId"));
		result.setChargeType(_ctx.stringValue("ModifyAppGroupResponse.result.chargeType"));
		result.setExpireOn(_ctx.stringValue("ModifyAppGroupResponse.result.expireOn"));
		result.setInstanceId(_ctx.stringValue("ModifyAppGroupResponse.result.instanceId"));
		result.setCommodityCode(_ctx.stringValue("ModifyAppGroupResponse.result.commodityCode"));
		result.setProcessingOrderId(_ctx.stringValue("ModifyAppGroupResponse.result.processingOrderId"));
		result.setFirstRankAlgoDeploymentId(_ctx.integerValue("ModifyAppGroupResponse.result.firstRankAlgoDeploymentId"));
		result.setSecondRankAlgoDeploymentId(_ctx.integerValue("ModifyAppGroupResponse.result.secondRankAlgoDeploymentId"));
		result.setPendingSecondRankAlgoDeploymentId(_ctx.integerValue("ModifyAppGroupResponse.result.pendingSecondRankAlgoDeploymentId"));
		result.setDescription(_ctx.stringValue("ModifyAppGroupResponse.result.description"));
		result.setProduced(_ctx.integerValue("ModifyAppGroupResponse.result.produced"));
		result.setLockedByExpiration(_ctx.integerValue("ModifyAppGroupResponse.result.lockedByExpiration"));
		result.setHasPendingQuotaReviewTask(_ctx.integerValue("ModifyAppGroupResponse.result.hasPendingQuotaReviewTask"));
		result.setCreated(_ctx.integerValue("ModifyAppGroupResponse.result.created"));
		result.setUpdated(_ctx.integerValue("ModifyAppGroupResponse.result.updated"));
		result.setStatus(_ctx.stringValue("ModifyAppGroupResponse.result.status"));
		result.setLockMode(_ctx.stringValue("ModifyAppGroupResponse.result.lockMode"));
		result.setDomain(_ctx.stringValue("ModifyAppGroupResponse.result.domain"));

		Quota quota = new Quota();
		quota.setDocSize(_ctx.integerValue("ModifyAppGroupResponse.result.quota.docSize"));
		quota.setComputeResource(_ctx.integerValue("ModifyAppGroupResponse.result.quota.computeResource"));
		quota.setSpec(_ctx.stringValue("ModifyAppGroupResponse.result.quota.spec"));
		result.setQuota(quota);
		modifyAppGroupResponse.setResult(result);
	 
	 	return modifyAppGroupResponse;
	}
}