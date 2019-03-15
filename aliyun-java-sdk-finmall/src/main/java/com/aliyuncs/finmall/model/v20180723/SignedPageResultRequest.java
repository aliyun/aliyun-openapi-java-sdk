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
public class SignedPageResultRequest extends RpcAcsRequest<SignedPageResultResponse> {
	
	public SignedPageResultRequest() {
		super("finmall", "2018-07-23", "SignedPageResult", "finmall");
		setMethod(MethodType.POST);
	}

	private String downloadUrl;

	private String digest;

	private String viewUrl;

	private Integer resultCode;

	private String transactionId;

	private String resultDesc;

	private String timestamp;

	public String getDownloadUrl() {
		return this.downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
		if(downloadUrl != null){
			putQueryParameter("DownloadUrl", downloadUrl);
		}
	}

	public String getDigest() {
		return this.digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
		if(digest != null){
			putQueryParameter("Digest", digest);
		}
	}

	public String getViewUrl() {
		return this.viewUrl;
	}

	public void setViewUrl(String viewUrl) {
		this.viewUrl = viewUrl;
		if(viewUrl != null){
			putQueryParameter("ViewUrl", viewUrl);
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

	public String getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
		if(timestamp != null){
			putQueryParameter("Timestamp", timestamp);
		}
	}

	@Override
	public Class<SignedPageResultResponse> getResponseClass() {
		return SignedPageResultResponse.class;
	}

}
