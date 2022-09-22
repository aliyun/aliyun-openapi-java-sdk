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

package com.aliyuncs.linkcard.model.v20210520;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkcard.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchAddDirectionalAddressRequest extends RpcAcsRequest<BatchAddDirectionalAddressResponse> {
	   

	private String source;

	private String addressType;

	private Long groupId;

	private List<String> listAddresss;
	public BatchAddDirectionalAddressRequest() {
		super("Linkcard", "2021-05-20", "BatchAddDirectionalAddress");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
		if(addressType != null){
			putQueryParameter("AddressType", addressType);
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public List<String> getListAddresss() {
		return this.listAddresss;
	}

	public void setListAddresss(List<String> listAddresss) {
		this.listAddresss = listAddresss;	
		if (listAddresss != null) {
			for (int i = 0; i < listAddresss.size(); i++) {
				putQueryParameter("ListAddress." + (i + 1) , listAddresss.get(i));
			}
		}	
	}

	@Override
	public Class<BatchAddDirectionalAddressResponse> getResponseClass() {
		return BatchAddDirectionalAddressResponse.class;
	}

}
