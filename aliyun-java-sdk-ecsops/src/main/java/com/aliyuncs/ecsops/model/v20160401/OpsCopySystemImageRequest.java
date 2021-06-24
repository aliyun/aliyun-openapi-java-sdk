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
public class OpsCopySystemImageRequest extends RpcAcsRequest<OpsCopySystemImageResponse> {
	   

	private String clientToken;

	private List<String> toRegionNoLists;

	private String toImageName;

	private String imageNo;

	private String toImageDesc;

	private String auditParamStr;
	public OpsCopySystemImageRequest() {
		super("Ecsops", "2016-04-01", "OpsCopySystemImage", "ecsops");
		setMethod(MethodType.POST);
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

	public List<String> getToRegionNoLists() {
		return this.toRegionNoLists;
	}

	public void setToRegionNoLists(List<String> toRegionNoLists) {
		this.toRegionNoLists = toRegionNoLists;	
		if (toRegionNoLists != null) {
			for (int i = 0; i < toRegionNoLists.size(); i++) {
				putQueryParameter("ToRegionNoList." + (i + 1) , toRegionNoLists.get(i));
			}
		}	
	}

	public String getToImageName() {
		return this.toImageName;
	}

	public void setToImageName(String toImageName) {
		this.toImageName = toImageName;
		if(toImageName != null){
			putQueryParameter("ToImageName", toImageName);
		}
	}

	public String getImageNo() {
		return this.imageNo;
	}

	public void setImageNo(String imageNo) {
		this.imageNo = imageNo;
		if(imageNo != null){
			putQueryParameter("ImageNo", imageNo);
		}
	}

	public String getToImageDesc() {
		return this.toImageDesc;
	}

	public void setToImageDesc(String toImageDesc) {
		this.toImageDesc = toImageDesc;
		if(toImageDesc != null){
			putQueryParameter("ToImageDesc", toImageDesc);
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
	public Class<OpsCopySystemImageResponse> getResponseClass() {
		return OpsCopySystemImageResponse.class;
	}

}
