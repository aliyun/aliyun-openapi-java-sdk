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

package com.aliyuncs.iotts.model.v20181126;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class GetPassListRequest extends RpcAcsRequest<GetPassListResponse> {
	
	public GetPassListRequest() {
		super("iotts", "2018-11-26", "GetPassList", "iotts");
	}

	private List<Long> platformLists;

	private List<Long> chipTypeLists;

	private Long startApplyDate;

	private String swChannels;

	private List<Long> funcEnumIdLists;

	private Integer certifyPlan;

	private List<Long> deviceTypeLists;

	private String deviceType;

	private String platform;

	private List<Long> protocolLists;

	private List<Long> terminalTypeLists;

	private String protocol;

	private Long endVerifyDate;

	private String model;

	private Integer certifyType;

	private Long id;

	private Long startPassDate;

	private String keyword;

	private String brand;

	private Long endPassDate;

	private Long endExpressGetDate;

	private String deviceTypeType;

	private Long startVerifyDate;

	private Long startPayDate;

	private Integer certifyPlanType;

	private Integer serviceType;

	private Long endPayDate;

	private Integer netType;

	private Long endApplyDate;

	private Long startExpressGetDate;

	private Integer pageNo;

	private Integer pageSize;

	public List<Long> getPlatformLists() {
		return this.platformLists;
	}

	public void setPlatformLists(List<Long> platformLists) {
		this.platformLists = platformLists;	
		if (platformLists != null) {
			for (int i = 0; i < platformLists.size(); i++) {
				putQueryParameter("PlatformList." + (i + 1) , platformLists.get(i));
			}
		}	
	}

	public List<Long> getChipTypeLists() {
		return this.chipTypeLists;
	}

	public void setChipTypeLists(List<Long> chipTypeLists) {
		this.chipTypeLists = chipTypeLists;	
		if (chipTypeLists != null) {
			for (int i = 0; i < chipTypeLists.size(); i++) {
				putQueryParameter("ChipTypeList." + (i + 1) , chipTypeLists.get(i));
			}
		}	
	}

	public Long getStartApplyDate() {
		return this.startApplyDate;
	}

	public void setStartApplyDate(Long startApplyDate) {
		this.startApplyDate = startApplyDate;
		if(startApplyDate != null){
			putQueryParameter("StartApplyDate", startApplyDate.toString());
		}
	}

	public String getSwChannels() {
		return this.swChannels;
	}

	public void setSwChannels(String swChannels) {
		this.swChannels = swChannels;
		if(swChannels != null){
			putQueryParameter("SwChannels", swChannels);
		}
	}

	public List<Long> getFuncEnumIdLists() {
		return this.funcEnumIdLists;
	}

	public void setFuncEnumIdLists(List<Long> funcEnumIdLists) {
		this.funcEnumIdLists = funcEnumIdLists;	
		if (funcEnumIdLists != null) {
			for (int i = 0; i < funcEnumIdLists.size(); i++) {
				putQueryParameter("FuncEnumIdList." + (i + 1) , funcEnumIdLists.get(i));
			}
		}	
	}

	public Integer getCertifyPlan() {
		return this.certifyPlan;
	}

	public void setCertifyPlan(Integer certifyPlan) {
		this.certifyPlan = certifyPlan;
		if(certifyPlan != null){
			putQueryParameter("CertifyPlan", certifyPlan.toString());
		}
	}

	public List<Long> getDeviceTypeLists() {
		return this.deviceTypeLists;
	}

	public void setDeviceTypeLists(List<Long> deviceTypeLists) {
		this.deviceTypeLists = deviceTypeLists;	
		if (deviceTypeLists != null) {
			for (int i = 0; i < deviceTypeLists.size(); i++) {
				putQueryParameter("DeviceTypeList." + (i + 1) , deviceTypeLists.get(i));
			}
		}	
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putQueryParameter("DeviceType", deviceType);
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
		}
	}

	public List<Long> getProtocolLists() {
		return this.protocolLists;
	}

	public void setProtocolLists(List<Long> protocolLists) {
		this.protocolLists = protocolLists;	
		if (protocolLists != null) {
			for (int i = 0; i < protocolLists.size(); i++) {
				putQueryParameter("ProtocolList." + (i + 1) , protocolLists.get(i));
			}
		}	
	}

	public List<Long> getTerminalTypeLists() {
		return this.terminalTypeLists;
	}

	public void setTerminalTypeLists(List<Long> terminalTypeLists) {
		this.terminalTypeLists = terminalTypeLists;	
		if (terminalTypeLists != null) {
			for (int i = 0; i < terminalTypeLists.size(); i++) {
				putQueryParameter("TerminalTypeList." + (i + 1) , terminalTypeLists.get(i));
			}
		}	
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
		}
	}

	/**
	 * @deprecated use getBizProtocol instead of this.
	 */
	@Deprecated
	public String getProtocol() {
		return this.protocol;
	}

	/**
	 * @deprecated use setBizProtocol instead of this.
	 */
	@Deprecated
	public void setProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
		}
	}

	public Long getEndVerifyDate() {
		return this.endVerifyDate;
	}

	public void setEndVerifyDate(Long endVerifyDate) {
		this.endVerifyDate = endVerifyDate;
		if(endVerifyDate != null){
			putQueryParameter("EndVerifyDate", endVerifyDate.toString());
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putQueryParameter("Model", model);
		}
	}

	public Integer getCertifyType() {
		return this.certifyType;
	}

	public void setCertifyType(Integer certifyType) {
		this.certifyType = certifyType;
		if(certifyType != null){
			putQueryParameter("CertifyType", certifyType.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public Long getStartPassDate() {
		return this.startPassDate;
	}

	public void setStartPassDate(Long startPassDate) {
		this.startPassDate = startPassDate;
		if(startPassDate != null){
			putQueryParameter("StartPassDate", startPassDate.toString());
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
		if(brand != null){
			putQueryParameter("Brand", brand);
		}
	}

	public Long getEndPassDate() {
		return this.endPassDate;
	}

	public void setEndPassDate(Long endPassDate) {
		this.endPassDate = endPassDate;
		if(endPassDate != null){
			putQueryParameter("EndPassDate", endPassDate.toString());
		}
	}

	public Long getEndExpressGetDate() {
		return this.endExpressGetDate;
	}

	public void setEndExpressGetDate(Long endExpressGetDate) {
		this.endExpressGetDate = endExpressGetDate;
		if(endExpressGetDate != null){
			putQueryParameter("EndExpressGetDate", endExpressGetDate.toString());
		}
	}

	public String getDeviceTypeType() {
		return this.deviceTypeType;
	}

	public void setDeviceTypeType(String deviceTypeType) {
		this.deviceTypeType = deviceTypeType;
		if(deviceTypeType != null){
			putQueryParameter("DeviceTypeType", deviceTypeType);
		}
	}

	public Long getStartVerifyDate() {
		return this.startVerifyDate;
	}

	public void setStartVerifyDate(Long startVerifyDate) {
		this.startVerifyDate = startVerifyDate;
		if(startVerifyDate != null){
			putQueryParameter("StartVerifyDate", startVerifyDate.toString());
		}
	}

	public Long getStartPayDate() {
		return this.startPayDate;
	}

	public void setStartPayDate(Long startPayDate) {
		this.startPayDate = startPayDate;
		if(startPayDate != null){
			putQueryParameter("StartPayDate", startPayDate.toString());
		}
	}

	public Integer getCertifyPlanType() {
		return this.certifyPlanType;
	}

	public void setCertifyPlanType(Integer certifyPlanType) {
		this.certifyPlanType = certifyPlanType;
		if(certifyPlanType != null){
			putQueryParameter("CertifyPlanType", certifyPlanType.toString());
		}
	}

	public Integer getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
		if(serviceType != null){
			putQueryParameter("ServiceType", serviceType.toString());
		}
	}

	public Long getEndPayDate() {
		return this.endPayDate;
	}

	public void setEndPayDate(Long endPayDate) {
		this.endPayDate = endPayDate;
		if(endPayDate != null){
			putQueryParameter("EndPayDate", endPayDate.toString());
		}
	}

	public Integer getNetType() {
		return this.netType;
	}

	public void setNetType(Integer netType) {
		this.netType = netType;
		if(netType != null){
			putQueryParameter("NetType", netType.toString());
		}
	}

	public Long getEndApplyDate() {
		return this.endApplyDate;
	}

	public void setEndApplyDate(Long endApplyDate) {
		this.endApplyDate = endApplyDate;
		if(endApplyDate != null){
			putQueryParameter("EndApplyDate", endApplyDate.toString());
		}
	}

	public Long getStartExpressGetDate() {
		return this.startExpressGetDate;
	}

	public void setStartExpressGetDate(Long startExpressGetDate) {
		this.startExpressGetDate = startExpressGetDate;
		if(startExpressGetDate != null){
			putQueryParameter("StartExpressGetDate", startExpressGetDate.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<GetPassListResponse> getResponseClass() {
		return GetPassListResponse.class;
	}

}
