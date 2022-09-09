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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyCustomizedListHeadersRequest extends RpcAcsRequest<ModifyCustomizedListHeadersResponse> {
	   

	private List<Headers> headerss;

	private String listType;
	public ModifyCustomizedListHeadersRequest() {
		super("ecd", "2020-09-30", "ModifyCustomizedListHeaders");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Headers> getHeaderss() {
		return this.headerss;
	}

	public void setHeaderss(List<Headers> headerss) {
		this.headerss = headerss;	
		if (headerss != null) {
			for (int depth1 = 0; depth1 < headerss.size(); depth1++) {
				putQueryParameter("Headers." + (depth1 + 1) + ".DisplayType" , headerss.get(depth1).getDisplayType());
				putQueryParameter("Headers." + (depth1 + 1) + ".HeaderKey" , headerss.get(depth1).getHeaderKey());
			}
		}	
	}

	public String getListType() {
		return this.listType;
	}

	public void setListType(String listType) {
		this.listType = listType;
		if(listType != null){
			putQueryParameter("ListType", listType);
		}
	}

	public static class Headers {

		private String displayType;

		private String headerKey;

		public String getDisplayType() {
			return this.displayType;
		}

		public void setDisplayType(String displayType) {
			this.displayType = displayType;
		}

		public String getHeaderKey() {
			return this.headerKey;
		}

		public void setHeaderKey(String headerKey) {
			this.headerKey = headerKey;
		}
	}

	@Override
	public Class<ModifyCustomizedListHeadersResponse> getResponseClass() {
		return ModifyCustomizedListHeadersResponse.class;
	}

}
