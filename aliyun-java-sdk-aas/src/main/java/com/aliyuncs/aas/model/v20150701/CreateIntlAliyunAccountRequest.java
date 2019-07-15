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

package com.aliyuncs.aas.model.v20150701;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateIntlAliyunAccountRequest extends RpcAcsRequest<CreateIntlAliyunAccountResponse> {
	
	public CreateIntlAliyunAccountRequest() {
		super("Aas", "2015-07-01", "CreateIntlAliyunAccount");
	}

	private String nationalityCode;

	public String getNationalityCode() {
		return this.nationalityCode;
	}

	public void setNationalityCode(String nationalityCode) {
		this.nationalityCode = nationalityCode;
		if(nationalityCode != null){
			putQueryParameter("NationalityCode", nationalityCode);
		}
	}

	@Override
	public Class<CreateIntlAliyunAccountResponse> getResponseClass() {
		return CreateIntlAliyunAccountResponse.class;
	}

}
