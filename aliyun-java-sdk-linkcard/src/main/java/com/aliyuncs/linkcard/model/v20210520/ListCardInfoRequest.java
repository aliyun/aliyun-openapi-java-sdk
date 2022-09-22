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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkcard.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListCardInfoRequest extends RpcAcsRequest<ListCardInfoResponse> {
	   

	private String activeTimeEnd;

	private String aliFee;

	private String osStatus;

	private Boolean isAutoRecharge;

	private String iccid;

	private String tagName;

	private String dataLevel;

	private String period;

	private String expireTimeStart;

	private String credentialNo;

	private Integer pageNo;

	private String apnName;

	private String activeTimeStart;

	private String status;

	private String simType;

	private String maxFlow;

	private String imsi;

	private String expireTimeEnd;

	private String dataType;

	private String vendor;

	private Integer pageSize;

	private String poolId;

	private String aliyunOrderId;

	private String notifyId;

	private String certifyType;

	private String msisdn;

	private String directionalGroupId;

	private String minFlow;
	public ListCardInfoRequest() {
		super("Linkcard", "2021-05-20", "ListCardInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getActiveTimeEnd() {
		return this.activeTimeEnd;
	}

	public void setActiveTimeEnd(String activeTimeEnd) {
		this.activeTimeEnd = activeTimeEnd;
		if(activeTimeEnd != null){
			putQueryParameter("ActiveTimeEnd", activeTimeEnd);
		}
	}

	public String getAliFee() {
		return this.aliFee;
	}

	public void setAliFee(String aliFee) {
		this.aliFee = aliFee;
		if(aliFee != null){
			putQueryParameter("AliFee", aliFee);
		}
	}

	public String getOsStatus() {
		return this.osStatus;
	}

	public void setOsStatus(String osStatus) {
		this.osStatus = osStatus;
		if(osStatus != null){
			putQueryParameter("OsStatus", osStatus);
		}
	}

	public Boolean getIsAutoRecharge() {
		return this.isAutoRecharge;
	}

	public void setIsAutoRecharge(Boolean isAutoRecharge) {
		this.isAutoRecharge = isAutoRecharge;
		if(isAutoRecharge != null){
			putQueryParameter("IsAutoRecharge", isAutoRecharge.toString());
		}
	}

	public String getIccid() {
		return this.iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
		if(iccid != null){
			putQueryParameter("Iccid", iccid);
		}
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
		if(tagName != null){
			putQueryParameter("TagName", tagName);
		}
	}

	public String getDataLevel() {
		return this.dataLevel;
	}

	public void setDataLevel(String dataLevel) {
		this.dataLevel = dataLevel;
		if(dataLevel != null){
			putQueryParameter("DataLevel", dataLevel);
		}
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
		}
	}

	public String getExpireTimeStart() {
		return this.expireTimeStart;
	}

	public void setExpireTimeStart(String expireTimeStart) {
		this.expireTimeStart = expireTimeStart;
		if(expireTimeStart != null){
			putQueryParameter("ExpireTimeStart", expireTimeStart);
		}
	}

	public String getCredentialNo() {
		return this.credentialNo;
	}

	public void setCredentialNo(String credentialNo) {
		this.credentialNo = credentialNo;
		if(credentialNo != null){
			putQueryParameter("CredentialNo", credentialNo);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public String getApnName() {
		return this.apnName;
	}

	public void setApnName(String apnName) {
		this.apnName = apnName;
		if(apnName != null){
			putQueryParameter("ApnName", apnName);
		}
	}

	public String getActiveTimeStart() {
		return this.activeTimeStart;
	}

	public void setActiveTimeStart(String activeTimeStart) {
		this.activeTimeStart = activeTimeStart;
		if(activeTimeStart != null){
			putQueryParameter("ActiveTimeStart", activeTimeStart);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public String getSimType() {
		return this.simType;
	}

	public void setSimType(String simType) {
		this.simType = simType;
		if(simType != null){
			putQueryParameter("SimType", simType);
		}
	}

	public String getMaxFlow() {
		return this.maxFlow;
	}

	public void setMaxFlow(String maxFlow) {
		this.maxFlow = maxFlow;
		if(maxFlow != null){
			putQueryParameter("MaxFlow", maxFlow);
		}
	}

	public String getImsi() {
		return this.imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
		if(imsi != null){
			putQueryParameter("Imsi", imsi);
		}
	}

	public String getExpireTimeEnd() {
		return this.expireTimeEnd;
	}

	public void setExpireTimeEnd(String expireTimeEnd) {
		this.expireTimeEnd = expireTimeEnd;
		if(expireTimeEnd != null){
			putQueryParameter("ExpireTimeEnd", expireTimeEnd);
		}
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
		if(dataType != null){
			putQueryParameter("DataType", dataType);
		}
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
		if(vendor != null){
			putQueryParameter("Vendor", vendor);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getPoolId() {
		return this.poolId;
	}

	public void setPoolId(String poolId) {
		this.poolId = poolId;
		if(poolId != null){
			putQueryParameter("PoolId", poolId);
		}
	}

	public String getAliyunOrderId() {
		return this.aliyunOrderId;
	}

	public void setAliyunOrderId(String aliyunOrderId) {
		this.aliyunOrderId = aliyunOrderId;
		if(aliyunOrderId != null){
			putQueryParameter("AliyunOrderId", aliyunOrderId);
		}
	}

	public String getNotifyId() {
		return this.notifyId;
	}

	public void setNotifyId(String notifyId) {
		this.notifyId = notifyId;
		if(notifyId != null){
			putQueryParameter("NotifyId", notifyId);
		}
	}

	public String getCertifyType() {
		return this.certifyType;
	}

	public void setCertifyType(String certifyType) {
		this.certifyType = certifyType;
		if(certifyType != null){
			putQueryParameter("CertifyType", certifyType);
		}
	}

	public String getMsisdn() {
		return this.msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
		if(msisdn != null){
			putQueryParameter("Msisdn", msisdn);
		}
	}

	public String getDirectionalGroupId() {
		return this.directionalGroupId;
	}

	public void setDirectionalGroupId(String directionalGroupId) {
		this.directionalGroupId = directionalGroupId;
		if(directionalGroupId != null){
			putQueryParameter("DirectionalGroupId", directionalGroupId);
		}
	}

	public String getMinFlow() {
		return this.minFlow;
	}

	public void setMinFlow(String minFlow) {
		this.minFlow = minFlow;
		if(minFlow != null){
			putQueryParameter("MinFlow", minFlow);
		}
	}

	@Override
	public Class<ListCardInfoResponse> getResponseClass() {
		return ListCardInfoResponse.class;
	}

}
