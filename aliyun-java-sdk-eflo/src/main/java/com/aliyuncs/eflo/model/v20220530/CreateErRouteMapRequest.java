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
public class CreateErRouteMapRequest extends RpcAcsRequest<CreateErRouteMapResponse> {
	   

	private String receptionInstanceType;

	private String description;

	private String receptionInstanceId;

	private String routeMapAction;

	private String transmissionInstanceType;

	private String destinationCidrBlock;

	private String erId;

	private Integer routeMapNum;

	private String receptionInstanceOwner;

	private String transmissionInstanceOwner;

	private String transmissionInstanceId;
	public CreateErRouteMapRequest() {
		super("eflo", "2022-05-30", "CreateErRouteMap", "eflo");
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
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

	public Integer getRouteMapNum() {
		return this.routeMapNum;
	}

	public void setRouteMapNum(Integer routeMapNum) {
		this.routeMapNum = routeMapNum;
		if(routeMapNum != null){
			putBodyParameter("RouteMapNum", routeMapNum.toString());
		}
	}

	public String getReceptionInstanceOwner() {
		return this.receptionInstanceOwner;
	}

	public void setReceptionInstanceOwner(String receptionInstanceOwner) {
		this.receptionInstanceOwner = receptionInstanceOwner;
		if(receptionInstanceOwner != null){
			putBodyParameter("ReceptionInstanceOwner", receptionInstanceOwner);
		}
	}

	public String getTransmissionInstanceOwner() {
		return this.transmissionInstanceOwner;
	}

	public void setTransmissionInstanceOwner(String transmissionInstanceOwner) {
		this.transmissionInstanceOwner = transmissionInstanceOwner;
		if(transmissionInstanceOwner != null){
			putBodyParameter("TransmissionInstanceOwner", transmissionInstanceOwner);
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
	public Class<CreateErRouteMapResponse> getResponseClass() {
		return CreateErRouteMapResponse.class;
	}

}
