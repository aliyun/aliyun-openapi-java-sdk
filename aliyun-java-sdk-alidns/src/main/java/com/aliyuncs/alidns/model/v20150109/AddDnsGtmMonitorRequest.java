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

/**
 * @author auto create
 * @version 
 */
public class AddDnsGtmMonitorRequest extends RpcAcsRequest<AddDnsGtmMonitorResponse> {
	   

	private String monitorExtendInfo;

	private Integer timeout;

	private String addrPoolId;

	private Integer evaluationCount;

	private String protocolType;

	private Integer interval;

	private String lang;

	private List<IspCityNode> ispCityNodes;
	public AddDnsGtmMonitorRequest() {
		super("Alidns", "2015-01-09", "AddDnsGtmMonitor", "alidns");
		setMethod(MethodType.POST);
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

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
		}
	}

	public String getAddrPoolId() {
		return this.addrPoolId;
	}

	public void setAddrPoolId(String addrPoolId) {
		this.addrPoolId = addrPoolId;
		if(addrPoolId != null){
			putQueryParameter("AddrPoolId", addrPoolId);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
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
	public Class<AddDnsGtmMonitorResponse> getResponseClass() {
		return AddDnsGtmMonitorResponse.class;
	}

}
