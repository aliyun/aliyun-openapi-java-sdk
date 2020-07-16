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

import com.aliyuncs.opensearch.model.v20171225.ReplaceAppGroupCommodityCodeResponse;
import com.aliyuncs.opensearch.model.v20171225.ReplaceAppGroupCommodityCodeResponse.Result;
import com.aliyuncs.opensearch.model.v20171225.ReplaceAppGroupCommodityCodeResponse.Result.Quota;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReplaceAppGroupCommodityCodeResponseUnmarshaller {

	public static ReplaceAppGroupCommodityCodeResponse unmarshall(ReplaceAppGroupCommodityCodeResponse replaceAppGroupCommodityCodeResponse, UnmarshallerContext _ctx) {
		
		replaceAppGroupCommodityCodeResponse.setRequestId(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.requestId"));

		Result result = new Result();
		result.setId(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.id"));
		result.setName(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.name"));
		result.setCurrentVersion(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.currentVersion"));
		result.setSwitchedTime(_ctx.integerValue("ReplaceAppGroupCommodityCodeResponse.result.switchedTime"));
		result.setChargingWay(_ctx.integerValue("ReplaceAppGroupCommodityCodeResponse.result.chargingWay"));
		result.setType(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.type"));
		result.setProjectId(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.projectId"));
		result.setChargeType(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.chargeType"));
		result.setExpireOn(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.expireOn"));
		result.setInstanceId(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.instanceId"));
		result.setCommodityCode(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.commodityCode"));
		result.setProcessingOrderId(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.processingOrderId"));
		result.setFirstRankAlgoDeploymentId(_ctx.integerValue("ReplaceAppGroupCommodityCodeResponse.result.firstRankAlgoDeploymentId"));
		result.setSecondRankAlgoDeploymentId(_ctx.integerValue("ReplaceAppGroupCommodityCodeResponse.result.secondRankAlgoDeploymentId"));
		result.setPendingSecondRankAlgoDeploymentId(_ctx.integerValue("ReplaceAppGroupCommodityCodeResponse.result.pendingSecondRankAlgoDeploymentId"));
		result.setDescription(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.description"));
		result.setProduced(_ctx.integerValue("ReplaceAppGroupCommodityCodeResponse.result.produced"));
		result.setLockedByExpiration(_ctx.integerValue("ReplaceAppGroupCommodityCodeResponse.result.lockedByExpiration"));
		result.setHasPendingQuotaReviewTask(_ctx.integerValue("ReplaceAppGroupCommodityCodeResponse.result.hasPendingQuotaReviewTask"));
		result.setCreated(_ctx.integerValue("ReplaceAppGroupCommodityCodeResponse.result.created"));
		result.setUpdated(_ctx.integerValue("ReplaceAppGroupCommodityCodeResponse.result.updated"));
		result.setStatus(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.status"));
		result.setLockMode(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.lockMode"));

		List<String> versions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReplaceAppGroupCommodityCodeResponse.result.versions.Length"); i++) {
			versions.add(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.versions["+ i +"]"));
		}
		result.setVersions(versions);

		Quota quota = new Quota();
		quota.setDocSize(_ctx.integerValue("ReplaceAppGroupCommodityCodeResponse.result.quota.docSize"));
		quota.setComputeResource(_ctx.integerValue("ReplaceAppGroupCommodityCodeResponse.result.quota.computeResource"));
		quota.setSpec(_ctx.stringValue("ReplaceAppGroupCommodityCodeResponse.result.quota.spec"));
		result.setQuota(quota);
		replaceAppGroupCommodityCodeResponse.setResult(result);
	 
	 	return replaceAppGroupCommodityCodeResponse;
	}
}