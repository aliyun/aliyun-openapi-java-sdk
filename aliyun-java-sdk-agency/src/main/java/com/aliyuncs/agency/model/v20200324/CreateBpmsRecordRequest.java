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

package com.aliyuncs.agency.model.v20200324;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateBpmsRecordRequest extends RpcAcsRequest<CreateBpmsRecordResponse> {
	   

	private String bpmsType;

	private Long partnerId;

	private String remark;

	private String bpmsParamJson;
	public CreateBpmsRecordRequest() {
		super("Agency", "2020-03-24", "CreateBpmsRecord");
		setMethod(MethodType.POST);
	}

	public String getBpmsType() {
		return this.bpmsType;
	}

	public void setBpmsType(String bpmsType) {
		this.bpmsType = bpmsType;
		if(bpmsType != null){
			putQueryParameter("BpmsType", bpmsType);
		}
	}

	public Long getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
		if(partnerId != null){
			putQueryParameter("PartnerId", partnerId.toString());
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getBpmsParamJson() {
		return this.bpmsParamJson;
	}

	public void setBpmsParamJson(String bpmsParamJson) {
		this.bpmsParamJson = bpmsParamJson;
		if(bpmsParamJson != null){
			putQueryParameter("BpmsParamJson", bpmsParamJson);
		}
	}

	@Override
	public Class<CreateBpmsRecordResponse> getResponseClass() {
		return CreateBpmsRecordResponse.class;
	}

}
