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
public class InvokeActionRequest extends RpcAcsRequest<InvokeActionResponse> {
	   

	private String invokeProduct;

	private String invokeAction;

	private String invokeParams;

	private String invokeRegion;
	public InvokeActionRequest() {
		super("nlp-automl", "2019-07-01", "InvokeAction", "nlpautoml");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInvokeProduct() {
		return this.invokeProduct;
	}

	public void setInvokeProduct(String invokeProduct) {
		this.invokeProduct = invokeProduct;
		if(invokeProduct != null){
			putQueryParameter("InvokeProduct", invokeProduct);
		}
	}

	public String getInvokeAction() {
		return this.invokeAction;
	}

	public void setInvokeAction(String invokeAction) {
		this.invokeAction = invokeAction;
		if(invokeAction != null){
			putBodyParameter("InvokeAction", invokeAction);
		}
	}

	public String getInvokeParams() {
		return this.invokeParams;
	}

	public void setInvokeParams(String invokeParams) {
		this.invokeParams = invokeParams;
		if(invokeParams != null){
			putBodyParameter("InvokeParams", invokeParams);
		}
	}

	public String getInvokeRegion() {
		return this.invokeRegion;
	}

	public void setInvokeRegion(String invokeRegion) {
		this.invokeRegion = invokeRegion;
		if(invokeRegion != null){
			putQueryParameter("InvokeRegion", invokeRegion);
		}
	}

	@Override
	public Class<InvokeActionResponse> getResponseClass() {
		return InvokeActionResponse.class;
	}

}
