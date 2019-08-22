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

package com.aliyuncs.ivpd.model.v20190625;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ivpd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExtendImageStyleRequest extends RpcAcsRequest<ExtendImageStyleResponse> {
	
	public ExtendImageStyleRequest() {
		super("ivpd", "2019-06-25", "ExtendImageStyle", "ivpd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String majorUrl;

	private String styleUrl;

	public String getMajorUrl() {
		return this.majorUrl;
	}

	public void setMajorUrl(String majorUrl) {
		this.majorUrl = majorUrl;
		if(majorUrl != null){
			putBodyParameter("MajorUrl", majorUrl);
		}
	}

	public String getStyleUrl() {
		return this.styleUrl;
	}

	public void setStyleUrl(String styleUrl) {
		this.styleUrl = styleUrl;
		if(styleUrl != null){
			putBodyParameter("StyleUrl", styleUrl);
		}
	}

	@Override
	public Class<ExtendImageStyleResponse> getResponseClass() {
		return ExtendImageStyleResponse.class;
	}

}
