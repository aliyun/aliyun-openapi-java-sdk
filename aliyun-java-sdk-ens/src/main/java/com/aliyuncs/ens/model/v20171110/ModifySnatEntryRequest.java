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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifySnatEntryRequest extends RpcAcsRequest<ModifySnatEntryResponse> {
	   

	private String snatIp;

	private Boolean eipAffinity;

	private String snatEntryId;

	private String snatEntryName;

	private Boolean ispAffinity;
	public ModifySnatEntryRequest() {
		super("Ens", "2017-11-10", "ModifySnatEntry", "ens");
		setMethod(MethodType.POST);
	}

	public String getSnatIp() {
		return this.snatIp;
	}

	public void setSnatIp(String snatIp) {
		this.snatIp = snatIp;
		if(snatIp != null){
			putQueryParameter("SnatIp", snatIp);
		}
	}

	public Boolean getEipAffinity() {
		return this.eipAffinity;
	}

	public void setEipAffinity(Boolean eipAffinity) {
		this.eipAffinity = eipAffinity;
		if(eipAffinity != null){
			putQueryParameter("EipAffinity", eipAffinity.toString());
		}
	}

	public String getSnatEntryId() {
		return this.snatEntryId;
	}

	public void setSnatEntryId(String snatEntryId) {
		this.snatEntryId = snatEntryId;
		if(snatEntryId != null){
			putQueryParameter("SnatEntryId", snatEntryId);
		}
	}

	public String getSnatEntryName() {
		return this.snatEntryName;
	}

	public void setSnatEntryName(String snatEntryName) {
		this.snatEntryName = snatEntryName;
		if(snatEntryName != null){
			putQueryParameter("SnatEntryName", snatEntryName);
		}
	}

	public Boolean getIspAffinity() {
		return this.ispAffinity;
	}

	public void setIspAffinity(Boolean ispAffinity) {
		this.ispAffinity = ispAffinity;
		if(ispAffinity != null){
			putQueryParameter("IspAffinity", ispAffinity.toString());
		}
	}

	@Override
	public Class<ModifySnatEntryResponse> getResponseClass() {
		return ModifySnatEntryResponse.class;
	}

}
