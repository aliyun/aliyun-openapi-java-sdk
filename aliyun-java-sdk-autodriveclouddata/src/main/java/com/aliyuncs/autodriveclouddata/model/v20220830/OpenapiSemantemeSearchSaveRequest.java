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

package com.aliyuncs.autodriveclouddata.model.v20220830;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpenapiSemantemeSearchSaveRequest extends RoaAcsRequest<OpenapiSemantemeSearchSaveResponse> {
	   

	private String body;
	public OpenapiSemantemeSearchSaveRequest() {
		super("AutoDriveCloudData", "2022-08-30", "OpenapiSemantemeSearchSave");
		setUriPattern("/autoDrive/openapi/semantemeSearchSave");
		setMethod(MethodType.POST);
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
	}

	@Override
	public Class<OpenapiSemantemeSearchSaveResponse> getResponseClass() {
		return OpenapiSemantemeSearchSaveResponse.class;
	}

}
