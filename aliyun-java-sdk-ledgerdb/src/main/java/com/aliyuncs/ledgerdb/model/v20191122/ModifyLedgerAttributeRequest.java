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

package com.aliyuncs.ledgerdb.model.v20191122;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyLedgerAttributeRequest extends RpcAcsRequest<ModifyLedgerAttributeResponse> {
	   

	private String ledgerId;

	private String ledgerName;

	private String ledgerDescription;
	public ModifyLedgerAttributeRequest() {
		super("ledgerdb", "2019-11-22", "ModifyLedgerAttribute", "ledgerdb");
		setMethod(MethodType.POST);
	}

	public String getLedgerId() {
		return this.ledgerId;
	}

	public void setLedgerId(String ledgerId) {
		this.ledgerId = ledgerId;
		if(ledgerId != null){
			putBodyParameter("LedgerId", ledgerId);
		}
	}

	public String getLedgerName() {
		return this.ledgerName;
	}

	public void setLedgerName(String ledgerName) {
		this.ledgerName = ledgerName;
		if(ledgerName != null){
			putBodyParameter("LedgerName", ledgerName);
		}
	}

	public String getLedgerDescription() {
		return this.ledgerDescription;
	}

	public void setLedgerDescription(String ledgerDescription) {
		this.ledgerDescription = ledgerDescription;
		if(ledgerDescription != null){
			putBodyParameter("LedgerDescription", ledgerDescription);
		}
	}

	@Override
	public Class<ModifyLedgerAttributeResponse> getResponseClass() {
		return ModifyLedgerAttributeResponse.class;
	}

}
