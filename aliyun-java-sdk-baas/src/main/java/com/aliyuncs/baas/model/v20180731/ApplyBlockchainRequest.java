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

package com.aliyuncs.baas.model.v20180731;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ApplyBlockchainRequest extends RpcAcsRequest<ApplyBlockchainResponse> {
	
	public ApplyBlockchainRequest() {
		super("Baas", "2018-07-31", "ApplyBlockchain");
	}

	private String blockchain;

	private String uploadReq;

	public String getBlockchain() {
		return this.blockchain;
	}

	public void setBlockchain(String blockchain) {
		this.blockchain = blockchain;
		if(blockchain != null){
			putBodyParameter("Blockchain", blockchain);
		}
	}

	public String getUploadReq() {
		return this.uploadReq;
	}

	public void setUploadReq(String uploadReq) {
		this.uploadReq = uploadReq;
		if(uploadReq != null){
			putBodyParameter("UploadReq", uploadReq);
		}
	}

	@Override
	public Class<ApplyBlockchainResponse> getResponseClass() {
		return ApplyBlockchainResponse.class;
	}

}
