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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListErRouteMapsRequest extends RpcAcsRequest<ListErRouteMapsResponse> {
	   

	private String receptionInstanceType;

	private String receptionInstanceId;

	private Integer erRouteMapNum;

	private Integer pageNumber;

	private String routeMapAction;

	private String transmissionInstanceType;

	private Integer pageSize;

	private String transmissionInstanceName;

	private String destinationCidrBlock;

	private String erId;

	private String erRouteMapId;

	private String receptionInstanceName;

	private Boolean enablePage;

	private String transmissionInstanceId;
	public ListErRouteMapsRequest() {
		super("eflo", "2022-05-30", "ListErRouteMaps", "eflo");
		setMethod(MethodType.POST);
	}

	public String getReceptionInstanceType() {
		return this.receptionInstanceType;
	}

	public void setReceptionInstanceType(String receptionInstanceType) {
		this.receptionInstanceType = receptionInstanceType;
		if(receptionInstanceType != null){
			putBodyParameter("ReceptionInstanceType", receptionInstanceType);
		}
	}

	public String getReceptionInstanceId() {
		return this.receptionInstanceId;
	}

	public void setReceptionInstanceId(String receptionInstanceId) {
		this.receptionInstanceId = receptionInstanceId;
		if(receptionInstanceId != null){
			putBodyParameter("ReceptionInstanceId", receptionInstanceId);
		}
	}

	public Integer getErRouteMapNum() {
		return this.erRouteMapNum;
	}

	public void setErRouteMapNum(Integer erRouteMapNum) {
		this.erRouteMapNum = erRouteMapNum;
		if(erRouteMapNum != null){
			putBodyParameter("ErRouteMapNum", erRouteMapNum.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getRouteMapAction() {
		return this.routeMapAction;
	}

	public void setRouteMapAction(String routeMapAction) {
		this.routeMapAction = routeMapAction;
		if(routeMapAction != null){
			putBodyParameter("RouteMapAction", routeMapAction);
		}
	}

	public String getTransmissionInstanceType() {
		return this.transmissionInstanceType;
	}

	public void setTransmissionInstanceType(String transmissionInstanceType) {
		this.transmissionInstanceType = transmissionInstanceType;
		if(transmissionInstanceType != null){
			putBodyParameter("TransmissionInstanceType", transmissionInstanceType);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getTransmissionInstanceName() {
		return this.transmissionInstanceName;
	}

	public void setTransmissionInstanceName(String transmissionInstanceName) {
		this.transmissionInstanceName = transmissionInstanceName;
		if(transmissionInstanceName != null){
			putBodyParameter("TransmissionInstanceName", transmissionInstanceName);
		}
	}

	public String getDestinationCidrBlock() {
		return this.destinationCidrBlock;
	}

	public void setDestinationCidrBlock(String destinationCidrBlock) {
		this.destinationCidrBlock = destinationCidrBlock;
		if(destinationCidrBlock != null){
			putBodyParameter("DestinationCidrBlock", destinationCidrBlock);
		}
	}

	public String getErId() {
		return this.erId;
	}

	public void setErId(String erId) {
		this.erId = erId;
		if(erId != null){
			putBodyParameter("ErId", erId);
		}
	}

	public String getErRouteMapId() {
		return this.erRouteMapId;
	}

	public void setErRouteMapId(String erRouteMapId) {
		this.erRouteMapId = erRouteMapId;
		if(erRouteMapId != null){
			putBodyParameter("ErRouteMapId", erRouteMapId);
		}
	}

	public String getReceptionInstanceName() {
		return this.receptionInstanceName;
	}

	public void setReceptionInstanceName(String receptionInstanceName) {
		this.receptionInstanceName = receptionInstanceName;
		if(receptionInstanceName != null){
			putBodyParameter("ReceptionInstanceName", receptionInstanceName);
		}
	}

	public Boolean getEnablePage() {
		return this.enablePage;
	}

	public void setEnablePage(Boolean enablePage) {
		this.enablePage = enablePage;
		if(enablePage != null){
			putBodyParameter("EnablePage", enablePage.toString());
		}
	}

	public String getTransmissionInstanceId() {
		return this.transmissionInstanceId;
	}

	public void setTransmissionInstanceId(String transmissionInstanceId) {
		this.transmissionInstanceId = transmissionInstanceId;
		if(transmissionInstanceId != null){
			putBodyParameter("TransmissionInstanceId", transmissionInstanceId);
		}
	}

	@Override
	public Class<ListErRouteMapsResponse> getResponseClass() {
		return ListErRouteMapsResponse.class;
	}

}
