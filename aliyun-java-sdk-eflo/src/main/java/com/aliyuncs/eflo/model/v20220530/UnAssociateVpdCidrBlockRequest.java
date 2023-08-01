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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UnAssociateVpdCidrBlockRequest extends RpcAcsRequest<UnAssociateVpdCidrBlockResponse> {
	   

	private String vpdId;

	private String secondaryCidrBlock;
	public UnAssociateVpdCidrBlockRequest() {
		super("eflo", "2022-05-30", "UnAssociateVpdCidrBlock", "eflo");
		setMethod(MethodType.POST);
	}

	public String getVpdId() {
		return this.vpdId;
	}

	public void setVpdId(String vpdId) {
		this.vpdId = vpdId;
		if(vpdId != null){
			putBodyParameter("VpdId", vpdId);
		}
	}

	public String getSecondaryCidrBlock() {
		return this.secondaryCidrBlock;
	}

	public void setSecondaryCidrBlock(String secondaryCidrBlock) {
		this.secondaryCidrBlock = secondaryCidrBlock;
		if(secondaryCidrBlock != null){
			putBodyParameter("SecondaryCidrBlock", secondaryCidrBlock);
		}
	}

	@Override
	public Class<UnAssociateVpdCidrBlockResponse> getResponseClass() {
		return UnAssociateVpdCidrBlockResponse.class;
	}

}
