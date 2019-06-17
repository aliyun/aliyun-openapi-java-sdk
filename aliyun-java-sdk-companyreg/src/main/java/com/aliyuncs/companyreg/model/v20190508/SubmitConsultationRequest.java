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

package com.aliyuncs.companyreg.model.v20190508;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SubmitConsultationRequest extends RpcAcsRequest<SubmitConsultationResponse> {
	
	public SubmitConsultationRequest() {
		super("companyreg", "2019-05-08", "SubmitConsultation", "companyreg");
	}

	private String data;

	private String consultRequestId;

	private String vcode;

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putQueryParameter("Data", data);
		}
	}

	public String getConsultRequestId() {
		return this.consultRequestId;
	}

	public void setConsultRequestId(String consultRequestId) {
		this.consultRequestId = consultRequestId;
		if(consultRequestId != null){
			putQueryParameter("ConsultRequestId", consultRequestId);
		}
	}

	public String getVcode() {
		return this.vcode;
	}

	public void setVcode(String vcode) {
		this.vcode = vcode;
		if(vcode != null){
			putQueryParameter("Vcode", vcode);
		}
	}

	@Override
	public Class<SubmitConsultationResponse> getResponseClass() {
		return SubmitConsultationResponse.class;
	}

}
