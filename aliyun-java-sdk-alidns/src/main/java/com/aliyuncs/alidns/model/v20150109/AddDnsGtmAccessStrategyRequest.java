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
public class AddDnsGtmAccessStrategyRequest extends RpcAcsRequest<AddDnsGtmAccessStrategyResponse> {
	   

	private String defaultLbaStrategy;

	private String failoverAddrPoolType;

	private String defaultAddrPoolType;

	private Integer failoverMaxReturnAddrNum;

	private String failoverLbaStrategy;

	private List<DefaultAddrPool> defaultAddrPools;

	private Integer failoverMinAvailableAddrNum;

	private Integer defaultMaxReturnAddrNum;

	private Integer defaultMinAvailableAddrNum;

	private String strategyMode;

	private String lang;

	private String lines;

	private String strategyName;

	private String defaultLatencyOptimization;

	private String instanceId;

	private String failoverLatencyOptimization;

	private List<FailoverAddrPool> failoverAddrPools;
	public AddDnsGtmAccessStrategyRequest() {
		super("Alidns", "2015-01-09", "AddDnsGtmAccessStrategy", "alidns");
		setMethod(MethodType.POST);
	}

	public String getDefaultLbaStrategy() {
		return this.defaultLbaStrategy;
	}

	public void setDefaultLbaStrategy(String defaultLbaStrategy) {
		this.defaultLbaStrategy = defaultLbaStrategy;
		if(defaultLbaStrategy != null){
			putQueryParameter("DefaultLbaStrategy", defaultLbaStrategy);
		}
	}

	public String getFailoverAddrPoolType() {
		return this.failoverAddrPoolType;
	}

	public void setFailoverAddrPoolType(String failoverAddrPoolType) {
		this.failoverAddrPoolType = failoverAddrPoolType;
		if(failoverAddrPoolType != null){
			putQueryParameter("FailoverAddrPoolType", failoverAddrPoolType);
		}
	}

	public String getDefaultAddrPoolType() {
		return this.defaultAddrPoolType;
	}

	public void setDefaultAddrPoolType(String defaultAddrPoolType) {
		this.defaultAddrPoolType = defaultAddrPoolType;
		if(defaultAddrPoolType != null){
			putQueryParameter("DefaultAddrPoolType", defaultAddrPoolType);
		}
	}

	public Integer getFailoverMaxReturnAddrNum() {
		return this.failoverMaxReturnAddrNum;
	}

	public void setFailoverMaxReturnAddrNum(Integer failoverMaxReturnAddrNum) {
		this.failoverMaxReturnAddrNum = failoverMaxReturnAddrNum;
		if(failoverMaxReturnAddrNum != null){
			putQueryParameter("FailoverMaxReturnAddrNum", failoverMaxReturnAddrNum.toString());
		}
	}

	public String getFailoverLbaStrategy() {
		return this.failoverLbaStrategy;
	}

	public void setFailoverLbaStrategy(String failoverLbaStrategy) {
		this.failoverLbaStrategy = failoverLbaStrategy;
		if(failoverLbaStrategy != null){
			putQueryParameter("FailoverLbaStrategy", failoverLbaStrategy);
		}
	}

	public List<DefaultAddrPool> getDefaultAddrPools() {
		return this.defaultAddrPools;
	}

	public void setDefaultAddrPools(List<DefaultAddrPool> defaultAddrPools) {
		this.defaultAddrPools = defaultAddrPools;	
		if (defaultAddrPools != null) {
			for (int depth1 = 0; depth1 < defaultAddrPools.size(); depth1++) {
				putQueryParameter("DefaultAddrPool." + (depth1 + 1) + ".Id" , defaultAddrPools.get(depth1).getId());
				putQueryParameter("DefaultAddrPool." + (depth1 + 1) + ".LbaWeight" , defaultAddrPools.get(depth1).getLbaWeight());
			}
		}	
	}

	public Integer getFailoverMinAvailableAddrNum() {
		return this.failoverMinAvailableAddrNum;
	}

	public void setFailoverMinAvailableAddrNum(Integer failoverMinAvailableAddrNum) {
		this.failoverMinAvailableAddrNum = failoverMinAvailableAddrNum;
		if(failoverMinAvailableAddrNum != null){
			putQueryParameter("FailoverMinAvailableAddrNum", failoverMinAvailableAddrNum.toString());
		}
	}

	public Integer getDefaultMaxReturnAddrNum() {
		return this.defaultMaxReturnAddrNum;
	}

	public void setDefaultMaxReturnAddrNum(Integer defaultMaxReturnAddrNum) {
		this.defaultMaxReturnAddrNum = defaultMaxReturnAddrNum;
		if(defaultMaxReturnAddrNum != null){
			putQueryParameter("DefaultMaxReturnAddrNum", defaultMaxReturnAddrNum.toString());
		}
	}

	public Integer getDefaultMinAvailableAddrNum() {
		return this.defaultMinAvailableAddrNum;
	}

	public void setDefaultMinAvailableAddrNum(Integer defaultMinAvailableAddrNum) {
		this.defaultMinAvailableAddrNum = defaultMinAvailableAddrNum;
		if(defaultMinAvailableAddrNum != null){
			putQueryParameter("DefaultMinAvailableAddrNum", defaultMinAvailableAddrNum.toString());
		}
	}

	public String getStrategyMode() {
		return this.strategyMode;
	}

	public void setStrategyMode(String strategyMode) {
		this.strategyMode = strategyMode;
		if(strategyMode != null){
			putQueryParameter("StrategyMode", strategyMode);
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

	public String getLines() {
		return this.lines;
	}

	public void setLines(String lines) {
		this.lines = lines;
		if(lines != null){
			putQueryParameter("Lines", lines);
		}
	}

	public String getStrategyName() {
		return this.strategyName;
	}

	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
		if(strategyName != null){
			putQueryParameter("StrategyName", strategyName);
		}
	}

	public String getDefaultLatencyOptimization() {
		return this.defaultLatencyOptimization;
	}

	public void setDefaultLatencyOptimization(String defaultLatencyOptimization) {
		this.defaultLatencyOptimization = defaultLatencyOptimization;
		if(defaultLatencyOptimization != null){
			putQueryParameter("DefaultLatencyOptimization", defaultLatencyOptimization);
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

	public String getFailoverLatencyOptimization() {
		return this.failoverLatencyOptimization;
	}

	public void setFailoverLatencyOptimization(String failoverLatencyOptimization) {
		this.failoverLatencyOptimization = failoverLatencyOptimization;
		if(failoverLatencyOptimization != null){
			putQueryParameter("FailoverLatencyOptimization", failoverLatencyOptimization);
		}
	}

	public List<FailoverAddrPool> getFailoverAddrPools() {
		return this.failoverAddrPools;
	}

	public void setFailoverAddrPools(List<FailoverAddrPool> failoverAddrPools) {
		this.failoverAddrPools = failoverAddrPools;	
		if (failoverAddrPools != null) {
			for (int depth1 = 0; depth1 < failoverAddrPools.size(); depth1++) {
				putQueryParameter("FailoverAddrPool." + (depth1 + 1) + ".Id" , failoverAddrPools.get(depth1).getId());
				putQueryParameter("FailoverAddrPool." + (depth1 + 1) + ".LbaWeight" , failoverAddrPools.get(depth1).getLbaWeight());
			}
		}	
	}

	public static class DefaultAddrPool {

		private String id;

		private Integer lbaWeight;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Integer getLbaWeight() {
			return this.lbaWeight;
		}

		public void setLbaWeight(Integer lbaWeight) {
			this.lbaWeight = lbaWeight;
		}
	}

	public static class FailoverAddrPool {

		private String id;

		private Integer lbaWeight;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Integer getLbaWeight() {
			return this.lbaWeight;
		}

		public void setLbaWeight(Integer lbaWeight) {
			this.lbaWeight = lbaWeight;
		}
	}

	@Override
	public Class<AddDnsGtmAccessStrategyResponse> getResponseClass() {
		return AddDnsGtmAccessStrategyResponse.class;
	}

}
