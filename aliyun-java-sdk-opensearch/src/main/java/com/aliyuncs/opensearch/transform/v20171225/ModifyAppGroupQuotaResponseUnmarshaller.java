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

import com.aliyuncs.opensearch.model.v20171225.ModifyAppGroupQuotaResponse;
import com.aliyuncs.opensearch.model.v20171225.ModifyAppGroupQuotaResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.ModifyAppGroupQuotaResponse.Result.Quota;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyAppGroupQuotaResponseUnmarshaller {

	public static ModifyAppGroupQuotaResponse unmarshall(ModifyAppGroupQuotaResponse modifyAppGroupQuotaResponse, UnmarshallerContext _ctx) {
		
		modifyAppGroupQuotaResponse.setRequestId(_ctx.stringValue("ModifyAppGroupQuotaResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("ModifyAppGroupQuotaResponse.result.id"));
		result.setName(_ctx.stringValue("ModifyAppGroupQuotaResponse.result.name"));
		result.setCurrentVersion(_ctx.stringValue("ModifyAppGroupQuotaResponse.result.currentVersion"));
		result.setSwitchedTime(_ctx.integerValue("ModifyAppGroupQuotaResponse.result.switchedTime"));
		result.setChargingWay(_ctx.integerValue("ModifyAppGroupQuotaResponse.result.chargingWay"));
		result.setType(_ctx.stringValue("ModifyAppGroupQuotaResponse.result.type"));
		result.setProjectId(_ctx.stringValue("ModifyAppGroupQuotaResponse.result.projectId"));
		result.setChargeType(_ctx.stringValue("ModifyAppGroupQuotaResponse.result.chargeType"));
		result.setExpireOn(_ctx.stringValue("ModifyAppGroupQuotaResponse.result.expireOn"));
		result.setInstanceId(_ctx.stringValue("ModifyAppGroupQuotaResponse.result.instanceId"));
		result.setCommodityCode(_ctx.stringValue("ModifyAppGroupQuotaResponse.result.commodityCode"));
		result.setProcessingOrderId(_ctx.stringValue("ModifyAppGroupQuotaResponse.result.processingOrderId"));
		result.setFirstRankAlgoDeploymentId(_ctx.integerValue("ModifyAppGroupQuotaResponse.result.firstRankAlgoDeploymentId"));
		result.setSecondRankAlgoDeploymentId(_ctx.integerValue("ModifyAppGroupQuotaResponse.result.secondRankAlgoDeploymentId"));
		result.setPendingSecondRankAlgoDeploymentId(_ctx.integerValue("ModifyAppGroupQuotaResponse.result.pendingSecondRankAlgoDeploymentId"));
		result.setDescription(_ctx.stringValue("ModifyAppGroupQuotaResponse.result.description"));
		result.setProduced(_ctx.integerValue("ModifyAppGroupQuotaResponse.result.produced"));
		result.setLockedByExpiration(_ctx.integerValue("ModifyAppGroupQuotaResponse.result.lockedByExpiration"));
		result.setHasPendingQuotaReviewTask(_ctx.integerValue("ModifyAppGroupQuotaResponse.result.hasPendingQuotaReviewTask"));
		result.setCreated(_ctx.integerValue("ModifyAppGroupQuotaResponse.result.created"));
		result.setUpdated(_ctx.integerValue("ModifyAppGroupQuotaResponse.result.updated"));
		result.setStatus(_ctx.stringValue("ModifyAppGroupQuotaResponse.result.status"));
		result.setLockMode(_ctx.stringValue("ModifyAppGroupQuotaResponse.result.lockMode"));

		Quota quota = new Quota();
		quota.setDocSize(_ctx.integerValue("ModifyAppGroupQuotaResponse.result.quota.docSize"));
		quota.setComputeResource(_ctx.integerValue("ModifyAppGroupQuotaResponse.result.quota.computeResource"));
		quota.setSpec(_ctx.stringValue("ModifyAppGroupQuotaResponse.result.quota.spec"));
		result.setQuota(quota);
		modifyAppGroupQuotaResponse.setResult(result);
	 
	 	return modifyAppGroupQuotaResponse;
	}
}