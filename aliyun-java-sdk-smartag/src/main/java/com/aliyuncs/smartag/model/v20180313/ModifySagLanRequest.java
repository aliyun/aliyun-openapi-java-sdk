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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smartag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySagLanRequest extends RpcAcsRequest<ModifySagLanResponse> {
	   

	private String endIp;

	private Long resourceOwnerId;

	private String mask;

	private String startIp;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String iP;

	private Long ownerId;

	private String iPType;

	private String smartAGId;

	private String smartAGSn;

	private String portName;

	private String lease;
	public ModifySagLanRequest() {
		super("Smartag", "2018-03-13", "ModifySagLan", "smartag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEndIp() {
		return this.endIp;
	}

	public void setEndIp(String endIp) {
		this.endIp = endIp;
		if(endIp != null){
			putQueryParameter("EndIp", endIp);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getMask() {
		return this.mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
		if(mask != null){
			putQueryParameter("Mask", mask);
		}
	}

	public String getStartIp() {
		return this.startIp;
	}

	public void setStartIp(String startIp) {
		this.startIp = startIp;
		if(startIp != null){
			putQueryParameter("StartIp", startIp);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getIP() {
		return this.iP;
	}

	public void setIP(String iP) {
		this.iP = iP;
		if(iP != null){
			putQueryParameter("IP", iP);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getIPType() {
		return this.iPType;
	}

	public void setIPType(String iPType) {
		this.iPType = iPType;
		if(iPType != null){
			putQueryParameter("IPType", iPType);
		}
	}

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
		if(smartAGId != null){
			putQueryParameter("SmartAGId", smartAGId);
		}
	}

	public String getSmartAGSn() {
		return this.smartAGSn;
	}

	public void setSmartAGSn(String smartAGSn) {
		this.smartAGSn = smartAGSn;
		if(smartAGSn != null){
			putQueryParameter("SmartAGSn", smartAGSn);
		}
	}

	public String getPortName() {
		return this.portName;
	}

	public void setPortName(String portName) {
		this.portName = portName;
		if(portName != null){
			putQueryParameter("PortName", portName);
		}
	}

	public String getLease() {
		return this.lease;
	}

	public void setLease(String lease) {
		this.lease = lease;
		if(lease != null){
			putQueryParameter("Lease", lease);
		}
	}

	@Override
	public Class<ModifySagLanResponse> getResponseClass() {
		return ModifySagLanResponse.class;
	}

}
