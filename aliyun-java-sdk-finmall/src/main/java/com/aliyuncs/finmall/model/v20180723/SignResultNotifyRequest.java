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

package com.aliyuncs.finmall.model.v20180723;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SignResultNotifyRequest extends RpcAcsRequest<SignResultNotifyResponse> {
	
	public SignResultNotifyRequest() {
		super("finmall", "2018-07-23", "SignResultNotify", "finmall", "innerAPI");
		setMethod(MethodType.POST);
	}

	private String docId;

	private String docContent;

	private String sign;

	private Integer resultCode;

	private Long time;

	private String transactionId;

	private String resultDesc;

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
		if(docId != null){
			putQueryParameter("DocId", docId);
		}
	}

	public String getDocContent() {
		return this.docContent;
	}

	public void setDocContent(String docContent) {
		this.docContent = docContent;
		if(docContent != null){
			putBodyParameter("DocContent", docContent);
		}
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
		if(sign != null){
			putQueryParameter("Sign", sign);
		}
	}

	public Integer getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
		if(resultCode != null){
			putQueryParameter("ResultCode", resultCode.toString());
		}
	}

	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
		if(time != null){
			putQueryParameter("Time", time.toString());
		}
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
		if(transactionId != null){
			putQueryParameter("TransactionId", transactionId);
		}
	}

	public String getResultDesc() {
		return this.resultDesc;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
		if(resultDesc != null){
			putQueryParameter("ResultDesc", resultDesc);
		}
	}

	@Override
	public Class<SignResultNotifyResponse> getResponseClass() {
		return SignResultNotifyResponse.class;
	}

}
