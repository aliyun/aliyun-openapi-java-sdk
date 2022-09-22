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

package com.aliyuncs.linkcard.model.v20210520;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkcard.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetCardDetailRequest extends RpcAcsRequest<GetCardDetailResponse> {
	   

	private String iccid;

	private Boolean destroyCard;

	private String instanceId;

	private Boolean showPsim;
	public GetCardDetailRequest() {
		super("Linkcard", "2021-05-20", "GetCardDetail");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIccid() {
		return this.iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
		if(iccid != null){
			putQueryParameter("Iccid", iccid);
		}
	}

	public Boolean getDestroyCard() {
		return this.destroyCard;
	}

	public void setDestroyCard(Boolean destroyCard) {
		this.destroyCard = destroyCard;
		if(destroyCard != null){
			putQueryParameter("DestroyCard", destroyCard.toString());
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

	public Boolean getShowPsim() {
		return this.showPsim;
	}

	public void setShowPsim(Boolean showPsim) {
		this.showPsim = showPsim;
		if(showPsim != null){
			putQueryParameter("ShowPsim", showPsim.toString());
		}
	}

	@Override
	public Class<GetCardDetailResponse> getResponseClass() {
		return GetCardDetailResponse.class;
	}

}
