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

package com.aliyuncs.cciotgw.model.v20210721;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AssociateIccidToIpExcelRequest extends RpcAcsRequest<AssociateIccidToIpExcelResponse> {
	   

	private String clientToken;

	private String isp;

	private String cciotGwId;

	private List<String> iccidIpsFileUrlLists;

	private String apn;
	public AssociateIccidToIpExcelRequest() {
		super("CCIoTGW", "2021-07-21", "AssociateIccidToIpExcel");
		setMethod(MethodType.GET);
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

	public String getIsp() {
		return this.isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
		if(isp != null){
			putQueryParameter("Isp", isp);
		}
	}

	public String getCciotGwId() {
		return this.cciotGwId;
	}

	public void setCciotGwId(String cciotGwId) {
		this.cciotGwId = cciotGwId;
		if(cciotGwId != null){
			putQueryParameter("CciotGwId", cciotGwId);
		}
	}

	public List<String> getIccidIpsFileUrlLists() {
		return this.iccidIpsFileUrlLists;
	}

	public void setIccidIpsFileUrlLists(List<String> iccidIpsFileUrlLists) {
		this.iccidIpsFileUrlLists = iccidIpsFileUrlLists;	
		if (iccidIpsFileUrlLists != null) {
			for (int i = 0; i < iccidIpsFileUrlLists.size(); i++) {
				putQueryParameter("IccidIpsFileUrlList." + (i + 1) , iccidIpsFileUrlLists.get(i));
			}
		}	
	}

	public String getApn() {
		return this.apn;
	}

	public void setApn(String apn) {
		this.apn = apn;
		if(apn != null){
			putQueryParameter("Apn", apn);
		}
	}

	@Override
	public Class<AssociateIccidToIpExcelResponse> getResponseClass() {
		return AssociateIccidToIpExcelResponse.class;
	}

}
