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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class UpdateDataDispatchConfigRequest extends RpcAcsRequest<UpdateDataDispatchConfigResponse> {
	
	public UpdateDataDispatchConfigRequest() {
		super("LinkWAN", "2018-12-30", "UpdateDataDispatchConfig", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private String uplinkTopic;

	private String productKey;

	private String productType;

	private String productName;

	private String uplinkRegionName;

	private String nodeGroupId;

	private String dataDispatchDestination;

	public String getUplinkTopic() {
		return this.uplinkTopic;
	}

	public void setUplinkTopic(String uplinkTopic) {
		this.uplinkTopic = uplinkTopic;
		if(uplinkTopic != null){
			putBodyParameter("UplinkTopic", uplinkTopic);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putBodyParameter("ProductKey", productKey);
		}
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putBodyParameter("ProductType", productType);
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putBodyParameter("ProductName", productName);
		}
	}

	public String getUplinkRegionName() {
		return this.uplinkRegionName;
	}

	public void setUplinkRegionName(String uplinkRegionName) {
		this.uplinkRegionName = uplinkRegionName;
		if(uplinkRegionName != null){
			putBodyParameter("UplinkRegionName", uplinkRegionName);
		}
	}

	public String getNodeGroupId() {
		return this.nodeGroupId;
	}

	public void setNodeGroupId(String nodeGroupId) {
		this.nodeGroupId = nodeGroupId;
		if(nodeGroupId != null){
			putBodyParameter("NodeGroupId", nodeGroupId);
		}
	}

	public String getDataDispatchDestination() {
		return this.dataDispatchDestination;
	}

	public void setDataDispatchDestination(String dataDispatchDestination) {
		this.dataDispatchDestination = dataDispatchDestination;
		if(dataDispatchDestination != null){
			putBodyParameter("DataDispatchDestination", dataDispatchDestination);
		}
	}

	@Override
	public Class<UpdateDataDispatchConfigResponse> getResponseClass() {
		return UpdateDataDispatchConfigResponse.class;
	}

}
