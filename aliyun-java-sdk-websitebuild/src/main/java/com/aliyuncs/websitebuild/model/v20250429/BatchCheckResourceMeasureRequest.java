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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BatchCheckResourceMeasureRequest extends RpcAcsRequest<BatchCheckResourceMeasureResponse> {
	   

	private String orderComponentParams;

	private String bizType;

	private String espBizId;

	private String resourceCheckItems;

	private String belongId;

	private String belongIdType;
	public BatchCheckResourceMeasureRequest() {
		super("WebsiteBuild", "2025-04-29", "BatchCheckResourceMeasure");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getOrderComponentParams() {
		return this.orderComponentParams;
	}

	public void setOrderComponentParams(String orderComponentParams) {
		this.orderComponentParams = orderComponentParams;
		if(orderComponentParams != null){
			putQueryParameter("OrderComponentParams", orderComponentParams);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getEspBizId() {
		return this.espBizId;
	}

	public void setEspBizId(String espBizId) {
		this.espBizId = espBizId;
		if(espBizId != null){
			putQueryParameter("EspBizId", espBizId);
		}
	}

	public String getResourceCheckItems() {
		return this.resourceCheckItems;
	}

	public void setResourceCheckItems(String resourceCheckItems) {
		this.resourceCheckItems = resourceCheckItems;
		if(resourceCheckItems != null){
			putQueryParameter("ResourceCheckItems", resourceCheckItems);
		}
	}

	public String getBelongId() {
		return this.belongId;
	}

	public void setBelongId(String belongId) {
		this.belongId = belongId;
		if(belongId != null){
			putQueryParameter("BelongId", belongId);
		}
	}

	public String getBelongIdType() {
		return this.belongIdType;
	}

	public void setBelongIdType(String belongIdType) {
		this.belongIdType = belongIdType;
		if(belongIdType != null){
			putQueryParameter("BelongIdType", belongIdType);
		}
	}

	@Override
	public Class<BatchCheckResourceMeasureResponse> getResponseClass() {
		return BatchCheckResourceMeasureResponse.class;
	}

}
