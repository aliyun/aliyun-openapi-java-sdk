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

package com.aliyuncs.lto.model.v20210707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddPrivacyRuleRequest extends RpcAcsRequest<AddPrivacyRuleResponse> {
	   

	private String remark;

	private String name;

	private String algImpl;

	private String algType;
	public AddPrivacyRuleRequest() {
		super("lto", "2021-07-07", "AddPrivacyRule");
		setMethod(MethodType.POST);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getAlgImpl() {
		return this.algImpl;
	}

	public void setAlgImpl(String algImpl) {
		this.algImpl = algImpl;
		if(algImpl != null){
			putQueryParameter("AlgImpl", algImpl);
		}
	}

	public String getAlgType() {
		return this.algType;
	}

	public void setAlgType(String algType) {
		this.algType = algType;
		if(algType != null){
			putQueryParameter("AlgType", algType);
		}
	}

	@Override
	public Class<AddPrivacyRuleResponse> getResponseClass() {
		return AddPrivacyRuleResponse.class;
	}

}
