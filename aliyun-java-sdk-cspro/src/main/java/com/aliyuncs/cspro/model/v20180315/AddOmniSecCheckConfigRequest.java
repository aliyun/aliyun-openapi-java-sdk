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

package com.aliyuncs.cspro.model.v20180315;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddOmniSecCheckConfigRequest extends RpcAcsRequest<AddOmniSecCheckConfigResponse> {
	   

	private String name;

	private List<CheckDetailDTO> checkDetailDTOs;

	private String extras;

	private String checkTarget;

	private String spec;

	private String confType;
	public AddOmniSecCheckConfigRequest() {
		super("cspro", "2018-03-15", "AddOmniSecCheckConfig", "cspro");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public List<CheckDetailDTO> getCheckDetailDTOs() {
		return this.checkDetailDTOs;
	}

	public void setCheckDetailDTOs(List<CheckDetailDTO> checkDetailDTOs) {
		this.checkDetailDTOs = checkDetailDTOs;	
		if (checkDetailDTOs != null) {
			for (int depth1 = 0; depth1 < checkDetailDTOs.size(); depth1++) {
				putBodyParameter("CheckDetailDTO." + (depth1 + 1) + ".CheckType" , checkDetailDTOs.get(depth1).getCheckType());
				putBodyParameter("CheckDetailDTO." + (depth1 + 1) + ".CheckIntervalUnit" , checkDetailDTOs.get(depth1).getCheckIntervalUnit());
				putBodyParameter("CheckDetailDTO." + (depth1 + 1) + ".CheckExtras" , checkDetailDTOs.get(depth1).getCheckExtras());
				putBodyParameter("CheckDetailDTO." + (depth1 + 1) + ".CheckIntervalVal" , checkDetailDTOs.get(depth1).getCheckIntervalVal());
			}
		}	
	}

	public String getExtras() {
		return this.extras;
	}

	public void setExtras(String extras) {
		this.extras = extras;
		if(extras != null){
			putBodyParameter("Extras", extras);
		}
	}

	public String getCheckTarget() {
		return this.checkTarget;
	}

	public void setCheckTarget(String checkTarget) {
		this.checkTarget = checkTarget;
		if(checkTarget != null){
			putBodyParameter("CheckTarget", checkTarget);
		}
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
		if(spec != null){
			putBodyParameter("Spec", spec);
		}
	}

	public String getConfType() {
		return this.confType;
	}

	public void setConfType(String confType) {
		this.confType = confType;
		if(confType != null){
			putBodyParameter("ConfType", confType);
		}
	}

	public static class CheckDetailDTO {

		private String checkType;

		private String checkIntervalUnit;

		private String checkExtras;

		private Integer checkIntervalVal;

		public String getCheckType() {
			return this.checkType;
		}

		public void setCheckType(String checkType) {
			this.checkType = checkType;
		}

		public String getCheckIntervalUnit() {
			return this.checkIntervalUnit;
		}

		public void setCheckIntervalUnit(String checkIntervalUnit) {
			this.checkIntervalUnit = checkIntervalUnit;
		}

		public String getCheckExtras() {
			return this.checkExtras;
		}

		public void setCheckExtras(String checkExtras) {
			this.checkExtras = checkExtras;
		}

		public Integer getCheckIntervalVal() {
			return this.checkIntervalVal;
		}

		public void setCheckIntervalVal(Integer checkIntervalVal) {
			this.checkIntervalVal = checkIntervalVal;
		}
	}

	@Override
	public Class<AddOmniSecCheckConfigResponse> getResponseClass() {
		return AddOmniSecCheckConfigResponse.class;
	}

}
