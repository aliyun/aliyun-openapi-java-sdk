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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PutExporterRuleRequest extends RpcAcsRequest<PutExporterRuleResponse> {
	   

	private String ruleName;

	private List<String> dstNamess;

	private String namespace;

	private String targetWindows;

	private String describe;

	private String metricName;
	public PutExporterRuleRequest() {
		super("Cms", "2019-01-01", "PutExporterRule", "cms");
		setMethod(MethodType.POST);
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public List<String> getDstNamess() {
		return this.dstNamess;
	}

	public void setDstNamess(List<String> dstNamess) {
		this.dstNamess = dstNamess;	
		if (dstNamess != null) {
			for (int i = 0; i < dstNamess.size(); i++) {
				putQueryParameter("DstNames." + (i + 1) , dstNamess.get(i));
			}
		}	
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public String getTargetWindows() {
		return this.targetWindows;
	}

	public void setTargetWindows(String targetWindows) {
		this.targetWindows = targetWindows;
		if(targetWindows != null){
			putQueryParameter("TargetWindows", targetWindows);
		}
	}

	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
		if(describe != null){
			putQueryParameter("Describe", describe);
		}
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
		if(metricName != null){
			putQueryParameter("MetricName", metricName);
		}
	}

	@Override
	public Class<PutExporterRuleResponse> getResponseClass() {
		return PutExporterRuleResponse.class;
	}

}
