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
public class OpsInventoryCacheAndDbRequest extends RpcAcsRequest<OpsInventoryCacheAndDbResponse> {
	   

	private List<String> syncIzss;

	private String operator;

	private String synchronizeType;

	private List<String> syncRegionss;

	private Boolean fullSynchronize;

	private String auditParamStr;
	public OpsInventoryCacheAndDbRequest() {
		super("Ecsops", "2016-04-01", "OpsInventoryCacheAndDb", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<String> getSyncIzss() {
		return this.syncIzss;
	}

	public void setSyncIzss(List<String> syncIzss) {
		this.syncIzss = syncIzss;	
		if (syncIzss != null) {
			for (int i = 0; i < syncIzss.size(); i++) {
				putQueryParameter("SyncIzs." + (i + 1) , syncIzss.get(i));
			}
		}	
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getSynchronizeType() {
		return this.synchronizeType;
	}

	public void setSynchronizeType(String synchronizeType) {
		this.synchronizeType = synchronizeType;
		if(synchronizeType != null){
			putQueryParameter("SynchronizeType", synchronizeType);
		}
	}

	public List<String> getSyncRegionss() {
		return this.syncRegionss;
	}

	public void setSyncRegionss(List<String> syncRegionss) {
		this.syncRegionss = syncRegionss;	
		if (syncRegionss != null) {
			for (int i = 0; i < syncRegionss.size(); i++) {
				putQueryParameter("SyncRegions." + (i + 1) , syncRegionss.get(i));
			}
		}	
	}

	public Boolean getFullSynchronize() {
		return this.fullSynchronize;
	}

	public void setFullSynchronize(Boolean fullSynchronize) {
		this.fullSynchronize = fullSynchronize;
		if(fullSynchronize != null){
			putQueryParameter("FullSynchronize", fullSynchronize.toString());
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

	@Override
	public Class<OpsInventoryCacheAndDbResponse> getResponseClass() {
		return OpsInventoryCacheAndDbResponse.class;
	}

}
