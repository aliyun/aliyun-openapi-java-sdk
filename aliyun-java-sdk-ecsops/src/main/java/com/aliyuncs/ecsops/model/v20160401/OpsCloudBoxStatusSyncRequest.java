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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsCloudBoxStatusSyncRequest extends RpcAcsRequest<OpsCloudBoxStatusSyncResponse> {
	   

	private String demandId;

	private String comment;

	private List<SnModel> snModels;

	private String auditParamStr;

	private String status;
	public OpsCloudBoxStatusSyncRequest() {
		super("Ecsops", "2016-04-01", "OpsCloudBoxStatusSync", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getDemandId() {
		return this.demandId;
	}

	public void setDemandId(String demandId) {
		this.demandId = demandId;
		if(demandId != null){
			putQueryParameter("DemandId", demandId);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
		}
	}

	public List<SnModel> getSnModels() {
		return this.snModels;
	}

	public void setSnModels(List<SnModel> snModels) {
		this.snModels = snModels;	
		if (snModels != null) {
			for (int depth1 = 0; depth1 < snModels.size(); depth1++) {
				putQueryParameter("SnModel." + (depth1 + 1) + ".Product" , snModels.get(depth1).getProduct());
				putQueryParameter("SnModel." + (depth1 + 1) + ".ArmoryGroup" , snModels.get(depth1).getArmoryGroup());
				if (snModels.get(depth1).getSnss() != null) {
					for (int i = 0; i < snModels.get(depth1).getSnss().size(); i++) {
						putQueryParameter("SnModel." + (depth1 + 1) + ".Sns." + (i + 1) , snModels.get(depth1).getSnss().get(i));
					}
				}
				putQueryParameter("SnModel." + (depth1 + 1) + ".Type" , snModels.get(depth1).getType());
			}
		}	
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public static class SnModel {

		private String product;

		private String armoryGroup;

		private List<String> snss;

		private String type;

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getArmoryGroup() {
			return this.armoryGroup;
		}

		public void setArmoryGroup(String armoryGroup) {
			this.armoryGroup = armoryGroup;
		}

		public List<String> getSnss() {
			return this.snss;
		}

		public void setSnss(List<String> snss) {
			this.snss = snss;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public Class<OpsCloudBoxStatusSyncResponse> getResponseClass() {
		return OpsCloudBoxStatusSyncResponse.class;
	}

}
