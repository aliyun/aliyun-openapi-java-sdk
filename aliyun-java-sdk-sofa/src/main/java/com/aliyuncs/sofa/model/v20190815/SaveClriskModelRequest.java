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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveClriskModelRequest extends RpcAcsRequest<SaveClriskModelResponse> {
	   

	private Long productId;

	private String memo;

	private List<String> ownersRepeatLists;

	private String triggerDelay;

	private List<String> dataNodesRepeatLists;

	private String triggerMode;

	private List<ExtMap> extMaps;

	private String modelCode;

	private String name;
	public SaveClriskModelRequest() {
		super("SOFA", "2019-08-15", "SaveClriskModel", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
		if(productId != null){
			putBodyParameter("ProductId", productId.toString());
		}
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
		if(memo != null){
			putBodyParameter("Memo", memo);
		}
	}

	public List<String> getOwnersRepeatLists() {
		return this.ownersRepeatLists;
	}

	public void setOwnersRepeatLists(List<String> ownersRepeatLists) {
		this.ownersRepeatLists = ownersRepeatLists;	
		if (ownersRepeatLists != null) {
			for (int i = 0; i < ownersRepeatLists.size(); i++) {
				putBodyParameter("OwnersRepeatList." + (i + 1) , ownersRepeatLists.get(i));
			}
		}	
	}

	public String getTriggerDelay() {
		return this.triggerDelay;
	}

	public void setTriggerDelay(String triggerDelay) {
		this.triggerDelay = triggerDelay;
		if(triggerDelay != null){
			putBodyParameter("TriggerDelay", triggerDelay);
		}
	}

	public List<String> getDataNodesRepeatLists() {
		return this.dataNodesRepeatLists;
	}

	public void setDataNodesRepeatLists(List<String> dataNodesRepeatLists) {
		this.dataNodesRepeatLists = dataNodesRepeatLists;	
		if (dataNodesRepeatLists != null) {
			for (int i = 0; i < dataNodesRepeatLists.size(); i++) {
				putBodyParameter("DataNodesRepeatList." + (i + 1) , dataNodesRepeatLists.get(i));
			}
		}	
	}

	public String getTriggerMode() {
		return this.triggerMode;
	}

	public void setTriggerMode(String triggerMode) {
		this.triggerMode = triggerMode;
		if(triggerMode != null){
			putBodyParameter("TriggerMode", triggerMode);
		}
	}

	public List<ExtMap> getExtMaps() {
		return this.extMaps;
	}

	public void setExtMaps(List<ExtMap> extMaps) {
		this.extMaps = extMaps;	
		if (extMaps != null) {
			for (int depth1 = 0; depth1 < extMaps.size(); depth1++) {
				putBodyParameter("ExtMap." + (depth1 + 1) + ".Value" , extMaps.get(depth1).getValue());
				putBodyParameter("ExtMap." + (depth1 + 1) + ".Key" , extMaps.get(depth1).getKey());
			}
		}	
	}

	public String getModelCode() {
		return this.modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
		if(modelCode != null){
			putBodyParameter("ModelCode", modelCode);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public static class ExtMap {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<SaveClriskModelResponse> getResponseClass() {
		return SaveClriskModelResponse.class;
	}

}
