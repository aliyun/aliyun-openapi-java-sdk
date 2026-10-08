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

package com.aliyuncs.dataphin_public.model.v20230630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BatchHandoverAssetRequest extends RpcAcsRequest<BatchHandoverAssetResponse> {
	   

	private Long opTenantId;

	private String opUserId;

	@SerializedName("handoverCommand")
	private HandoverCommand handoverCommand;
	public BatchHandoverAssetRequest() {
		super("dataphin-public", "2023-06-30", "BatchHandoverAsset", "1111");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
		if(opUserId != null){
			putQueryParameter("OpUserId", opUserId);
		}
	}

	public HandoverCommand getHandoverCommand() {
		return this.handoverCommand;
	}

	public void setHandoverCommand(HandoverCommand handoverCommand) {
		this.handoverCommand = handoverCommand;	
		if (handoverCommand != null) {
			putBodyParameter("HandoverCommand" , new Gson().toJson(handoverCommand));
		}	
	}

	public static class HandoverCommand {

		@SerializedName("GuidList")
		private List<String> guidList;

		@SerializedName("TargetUserId")
		private String targetUserId;

		public List<String> getGuidList() {
			return this.guidList;
		}

		public void setGuidList(List<String> guidList) {
			this.guidList = guidList;
		}

		public String getTargetUserId() {
			return this.targetUserId;
		}

		public void setTargetUserId(String targetUserId) {
			this.targetUserId = targetUserId;
		}
	}

	@Override
	public Class<BatchHandoverAssetResponse> getResponseClass() {
		return BatchHandoverAssetResponse.class;
	}

}
