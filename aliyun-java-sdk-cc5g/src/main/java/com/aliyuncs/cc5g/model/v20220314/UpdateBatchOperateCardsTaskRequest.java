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

package com.aliyuncs.cc5g.model.v20220314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateBatchOperateCardsTaskRequest extends RpcAcsRequest<UpdateBatchOperateCardsTaskResponse> {
	   

	private List<String> iccids;

	private String clientToken;

	private String description;

	private Long threshold;

	private String batchOperateCardsTaskId;

	private String effectType;

	private List<String> wirelessCloudConnectorIds;

	private Boolean dryRun;

	private String name;

	private String operateType;

	private String iccidsOssFilePath;
	public UpdateBatchOperateCardsTaskRequest() {
		super("CC5G", "2022-03-14", "UpdateBatchOperateCardsTask", "fivegcc");
		setMethod(MethodType.POST);
	}

	public List<String> getIccids() {
		return this.iccids;
	}

	public void setIccids(List<String> iccids) {
		this.iccids = iccids;	
		if (iccids != null) {
			for (int depth1 = 0; depth1 < iccids.size(); depth1++) {
				putQueryParameter("Iccids." + (depth1 + 1) , iccids.get(depth1));
			}
		}	
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getThreshold() {
		return this.threshold;
	}

	public void setThreshold(Long threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putQueryParameter("Threshold", threshold.toString());
		}
	}

	public String getBatchOperateCardsTaskId() {
		return this.batchOperateCardsTaskId;
	}

	public void setBatchOperateCardsTaskId(String batchOperateCardsTaskId) {
		this.batchOperateCardsTaskId = batchOperateCardsTaskId;
		if(batchOperateCardsTaskId != null){
			putQueryParameter("BatchOperateCardsTaskId", batchOperateCardsTaskId);
		}
	}

	public String getEffectType() {
		return this.effectType;
	}

	public void setEffectType(String effectType) {
		this.effectType = effectType;
		if(effectType != null){
			putQueryParameter("EffectType", effectType);
		}
	}

	public List<String> getWirelessCloudConnectorIds() {
		return this.wirelessCloudConnectorIds;
	}

	public void setWirelessCloudConnectorIds(List<String> wirelessCloudConnectorIds) {
		this.wirelessCloudConnectorIds = wirelessCloudConnectorIds;	
		if (wirelessCloudConnectorIds != null) {
			for (int depth1 = 0; depth1 < wirelessCloudConnectorIds.size(); depth1++) {
				putQueryParameter("WirelessCloudConnectorIds." + (depth1 + 1) , wirelessCloudConnectorIds.get(depth1));
			}
		}	
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
		if(operateType != null){
			putQueryParameter("OperateType", operateType);
		}
	}

	public String getIccidsOssFilePath() {
		return this.iccidsOssFilePath;
	}

	public void setIccidsOssFilePath(String iccidsOssFilePath) {
		this.iccidsOssFilePath = iccidsOssFilePath;
		if(iccidsOssFilePath != null){
			putQueryParameter("IccidsOssFilePath", iccidsOssFilePath);
		}
	}

	@Override
	public Class<UpdateBatchOperateCardsTaskResponse> getResponseClass() {
		return UpdateBatchOperateCardsTaskResponse.class;
	}

}
