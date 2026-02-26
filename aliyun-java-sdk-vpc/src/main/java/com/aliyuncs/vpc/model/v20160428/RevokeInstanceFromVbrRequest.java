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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RevokeInstanceFromVbrRequest extends RpcAcsRequest<RevokeInstanceFromVbrResponse> {
	   

	private String vbrOwnerUid;

	private String vbrRegionNo;

	private List<String> vbrInstanceIds;

	private String grantType;

	private String instanceId;
	public RevokeInstanceFromVbrRequest() {
		super("Vpc", "2016-04-28", "RevokeInstanceFromVbr", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVbrOwnerUid() {
		return this.vbrOwnerUid;
	}

	public void setVbrOwnerUid(String vbrOwnerUid) {
		this.vbrOwnerUid = vbrOwnerUid;
		if(vbrOwnerUid != null){
			putQueryParameter("VbrOwnerUid", vbrOwnerUid);
		}
	}

	public String getVbrRegionNo() {
		return this.vbrRegionNo;
	}

	public void setVbrRegionNo(String vbrRegionNo) {
		this.vbrRegionNo = vbrRegionNo;
		if(vbrRegionNo != null){
			putQueryParameter("VbrRegionNo", vbrRegionNo);
		}
	}

	public List<String> getVbrInstanceIds() {
		return this.vbrInstanceIds;
	}

	public void setVbrInstanceIds(List<String> vbrInstanceIds) {
		this.vbrInstanceIds = vbrInstanceIds;	
		if (vbrInstanceIds != null) {
			String vbrInstanceIdsArrVal = "";
			for(int depth1 = 0; depth1 < vbrInstanceIds.size(); depth1++) {
				vbrInstanceIdsArrVal += vbrInstanceIds.get(depth1) + ",";
			}
			if (vbrInstanceIdsArrVal.length() > 0) {
				vbrInstanceIdsArrVal = vbrInstanceIdsArrVal.substring(0, vbrInstanceIdsArrVal.length() - 1);
			}
			putQueryParameter("VbrInstanceIds" , vbrInstanceIdsArrVal);
		}	
	}

	public String getGrantType() {
		return this.grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
		if(grantType != null){
			putQueryParameter("GrantType", grantType);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<RevokeInstanceFromVbrResponse> getResponseClass() {
		return RevokeInstanceFromVbrResponse.class;
	}

}
