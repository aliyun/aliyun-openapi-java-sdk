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

package com.aliyuncs.nlp_automl.model.v20190701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlp_automl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetPredictDocRequest extends RpcAcsRequest<GetPredictDocResponse> {
	   

	private String product;

	private Long docId;
	public GetPredictDocRequest() {
		super("nlp-automl", "2019-07-01", "GetPredictDoc", "nlpautoml");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
		}
	}

	public Long getDocId() {
		return this.docId;
	}

	public void setDocId(Long docId) {
		this.docId = docId;
		if(docId != null){
			putQueryParameter("DocId", docId.toString());
		}
	}

	@Override
	public Class<GetPredictDocResponse> getResponseClass() {
		return GetPredictDocResponse.class;
	}

}
