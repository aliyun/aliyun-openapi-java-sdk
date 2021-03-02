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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alidns.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddGtmAddressPoolRequest extends RpcAcsRequest<AddGtmAddressPoolResponse> {
	   

	private String monitorExtendInfo;

	private String type;

	private Integer timeout;

	private Integer minAvailableAddrNum;

	private Integer evaluationCount;

	private String lang;

	private List<Addr> addrs;

	private String monitorStatus;

	private String instanceId;

	private String name;

	private String protocolType;

	private Integer interval;

	private List<IspCityNode> ispCityNodes;
	public AddGtmAddressPoolRequest() {
		super("Alidns", "2015-01-09", "AddGtmAddressPool", "alidns");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMonitorExtendInfo() {
		return this.monitorExtendInfo;
	}

	public void setMonitorExtendInfo(String monitorExtendInfo) {
		this.monitorExtendInfo = monitorExtendInfo;
		if(monitorExtendInfo != null){
			putQueryParameter("MonitorExtendInfo", monitorExtendInfo);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
		}
	}

	public Integer getMinAvailableAddrNum() {
		return this.minAvailableAddrNum;
	}

	public void setMinAvailableAddrNum(Integer minAvailableAddrNum) {
		this.minAvailableAddrNum = minAvailableAddrNum;
		if(minAvailableAddrNum != null){
			putQueryParameter("MinAvailableAddrNum", minAvailableAddrNum.toString());
		}
	}

	public Integer getEvaluationCount() {
		return this.evaluationCount;
	}

	public void setEvaluationCount(Integer evaluationCount) {
		this.evaluationCount = evaluationCount;
		if(evaluationCount != null){
			putQueryParameter("EvaluationCount", evaluationCount.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public List<Addr> getAddrs() {
		return this.addrs;
	}

	public void setAddrs(List<Addr> addrs) {
		this.addrs = addrs;	
		if (addrs != null) {
			for (int depth1 = 0; depth1 < addrs.size(); depth1++) {
				putQueryParameter("Addr." + (depth1 + 1) + ".Mode" , addrs.get(depth1).getMode());
				putQueryParameter("Addr." + (depth1 + 1) + ".LbaWeight" , addrs.get(depth1).getLbaWeight());
				putQueryParameter("Addr." + (depth1 + 1) + ".Value" , addrs.get(depth1).getValue());
			}
		}	
	}

	public String getMonitorStatus() {
		return this.monitorStatus;
	}

	public void setMonitorStatus(String monitorStatus) {
		this.monitorStatus = monitorStatus;
		if(monitorStatus != null){
			putQueryParameter("MonitorStatus", monitorStatus);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
		if(protocolType != null){
			putQueryParameter("ProtocolType", protocolType);
		}
	}

	public Integer getInterval() {
		return this.interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval.toString());
		}
	}

	public List<IspCityNode> getIspCityNodes() {
		return this.ispCityNodes;
	}

	public void setIspCityNodes(List<IspCityNode> ispCityNodes) {
		this.ispCityNodes = ispCityNodes;	
		if (ispCityNodes != null) {
			for (int depth1 = 0; depth1 < ispCityNodes.size(); depth1++) {
				putQueryParameter("IspCityNode." + (depth1 + 1) + ".CityCode" , ispCityNodes.get(depth1).getCityCode());
				putQueryParameter("IspCityNode." + (depth1 + 1) + ".IspCode" , ispCityNodes.get(depth1).getIspCode());
			}
		}	
	}

	public static class Addr {

		private String mode;

		private Integer lbaWeight;

		private String value;

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public Integer getLbaWeight() {
			return this.lbaWeight;
		}

		public void setLbaWeight(Integer lbaWeight) {
			this.lbaWeight = lbaWeight;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class IspCityNode {

		private String cityCode;

		private String ispCode;

		public String getCityCode() {
			return this.cityCode;
		}

		public void setCityCode(String cityCode) {
			this.cityCode = cityCode;
		}

		public String getIspCode() {
			return this.ispCode;
		}

		public void setIspCode(String ispCode) {
			this.ispCode = ispCode;
		}
	}

	@Override
	public Class<AddGtmAddressPoolResponse> getResponseClass() {
		return AddGtmAddressPoolResponse.class;
	}

}
