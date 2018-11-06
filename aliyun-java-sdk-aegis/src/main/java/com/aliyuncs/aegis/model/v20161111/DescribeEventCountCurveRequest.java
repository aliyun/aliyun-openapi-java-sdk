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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventCountCurveRequest extends RpcAcsRequest<DescribeEventCountCurveResponse> {
	
	public DescribeEventCountCurveRequest() {
		super("aegis", "2016-11-11", "DescribeEventCountCurve", "vipaegis");
	}

	private String types;

	private String sourceIp;

	private String vulEventLevels;

	private Integer lastDays;

	private String healthEventLevels;

	private String suspiciousEventLevels;

	public String getTypes() {
		return this.types;
	}

	public void setTypes(String types) {
		this.types = types;
		if(types != null){
			putQueryParameter("Types", types);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getVulEventLevels() {
		return this.vulEventLevels;
	}

	public void setVulEventLevels(String vulEventLevels) {
		this.vulEventLevels = vulEventLevels;
		if(vulEventLevels != null){
			putQueryParameter("VulEventLevels", vulEventLevels);
		}
	}

	public Integer getLastDays() {
		return this.lastDays;
	}

	public void setLastDays(Integer lastDays) {
		this.lastDays = lastDays;
		if(lastDays != null){
			putQueryParameter("LastDays", lastDays.toString());
		}
	}

	public String getHealthEventLevels() {
		return this.healthEventLevels;
	}

	public void setHealthEventLevels(String healthEventLevels) {
		this.healthEventLevels = healthEventLevels;
		if(healthEventLevels != null){
			putQueryParameter("HealthEventLevels", healthEventLevels);
		}
	}

	public String getSuspiciousEventLevels() {
		return this.suspiciousEventLevels;
	}

	public void setSuspiciousEventLevels(String suspiciousEventLevels) {
		this.suspiciousEventLevels = suspiciousEventLevels;
		if(suspiciousEventLevels != null){
			putQueryParameter("SuspiciousEventLevels", suspiciousEventLevels);
		}
	}

	@Override
	public Class<DescribeEventCountCurveResponse> getResponseClass() {
		return DescribeEventCountCurveResponse.class;
	}

}
