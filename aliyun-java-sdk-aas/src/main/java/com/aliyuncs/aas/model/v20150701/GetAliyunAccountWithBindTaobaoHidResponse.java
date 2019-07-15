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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aas.transform.v20150701.GetAliyunAccountWithBindTaobaoHidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAliyunAccountWithBindTaobaoHidResponse extends AcsResponse {

	private String requestId;

	private String pK;

	private String partnerPk;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPK() {
		return this.pK;
	}

	public void setPK(String pK) {
		this.pK = pK;
	}

	public String getPartnerPk() {
		return this.partnerPk;
	}

	public void setPartnerPk(String partnerPk) {
		this.partnerPk = partnerPk;
	}

	@Override
	public GetAliyunAccountWithBindTaobaoHidResponse getInstance(UnmarshallerContext context) {
		return	GetAliyunAccountWithBindTaobaoHidResponseUnmarshaller.unmarshall(this, context);
	}
}
