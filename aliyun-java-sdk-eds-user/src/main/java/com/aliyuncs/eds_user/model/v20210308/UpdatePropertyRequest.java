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

package com.aliyuncs.eds_user.model.v20210308;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eds_user.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdatePropertyRequest extends RpcAcsRequest<UpdatePropertyResponse> {
	   

	private String propertyKey;

	private Long propertyId;

	private List<PropertyValues> propertyValuess;
	public UpdatePropertyRequest() {
		super("eds-user", "2021-03-08", "UpdateProperty", "eds-user");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPropertyKey() {
		return this.propertyKey;
	}

	public void setPropertyKey(String propertyKey) {
		this.propertyKey = propertyKey;
		if(propertyKey != null){
			putBodyParameter("PropertyKey", propertyKey);
		}
	}

	public Long getPropertyId() {
		return this.propertyId;
	}

	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
		if(propertyId != null){
			putBodyParameter("PropertyId", propertyId.toString());
		}
	}

	public List<PropertyValues> getPropertyValuess() {
		return this.propertyValuess;
	}

	public void setPropertyValuess(List<PropertyValues> propertyValuess) {
		this.propertyValuess = propertyValuess;	
		if (propertyValuess != null) {
			for (int depth1 = 0; depth1 < propertyValuess.size(); depth1++) {
				putBodyParameter("PropertyValues." + (depth1 + 1) + ".PropertyValueId" , propertyValuess.get(depth1).getPropertyValueId());
				putBodyParameter("PropertyValues." + (depth1 + 1) + ".PropertyValue" , propertyValuess.get(depth1).getPropertyValue());
			}
		}	
	}

	public static class PropertyValues {

		private Long propertyValueId;

		private String propertyValue;

		public Long getPropertyValueId() {
			return this.propertyValueId;
		}

		public void setPropertyValueId(Long propertyValueId) {
			this.propertyValueId = propertyValueId;
		}

		public String getPropertyValue() {
			return this.propertyValue;
		}

		public void setPropertyValue(String propertyValue) {
			this.propertyValue = propertyValue;
		}
	}

	@Override
	public Class<UpdatePropertyResponse> getResponseClass() {
		return UpdatePropertyResponse.class;
	}

}
