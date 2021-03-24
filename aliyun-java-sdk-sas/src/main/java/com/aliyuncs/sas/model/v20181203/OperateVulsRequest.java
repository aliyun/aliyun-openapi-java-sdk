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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OperateVulsRequest extends RpcAcsRequest<OperateVulsResponse> {
	   

	private String reason;

	private String type;

	private List<String> vulNamess;

	private Integer precondition;

	private String operateType;

	private List<String> uuidss;
	public OperateVulsRequest() {
		super("Sas", "2018-12-03", "OperateVuls", "sas");
		setMethod(MethodType.POST);
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public List<String> getVulNamess() {
		return this.vulNamess;
	}

	public void setVulNamess(List<String> vulNamess) {
		this.vulNamess = vulNamess;	
		if (vulNamess != null) {
			for (int i = 0; i < vulNamess.size(); i++) {
				putQueryParameter("VulNames." + (i + 1) , vulNamess.get(i));
			}
		}	
	}

	public Integer getPrecondition() {
		return this.precondition;
	}

	public void setPrecondition(Integer precondition) {
		this.precondition = precondition;
		if(precondition != null){
			putQueryParameter("Precondition", precondition.toString());
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

	public List<String> getUuidss() {
		return this.uuidss;
	}

	public void setUuidss(List<String> uuidss) {
		this.uuidss = uuidss;	
		if (uuidss != null) {
			for (int i = 0; i < uuidss.size(); i++) {
				putQueryParameter("Uuids." + (i + 1) , uuidss.get(i));
			}
		}	
	}

	@Override
	public Class<OperateVulsResponse> getResponseClass() {
		return OperateVulsResponse.class;
	}

}
