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

package com.aliyuncs.eas.model.v20210701;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20210701.DescribeServiceAutoScalerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServiceAutoScalerResponse extends AcsResponse {

	private String requestId;

	private String serviceName;

	private Integer minReplica;

	private Integer maxReplica;

	private Map<Object,Object> strategies;

	private Map<Object,Object> currentValues;

	private Map<Object,Object> behavior;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Integer getMinReplica() {
		return this.minReplica;
	}

	public void setMinReplica(Integer minReplica) {
		this.minReplica = minReplica;
	}

	public Integer getMaxReplica() {
		return this.maxReplica;
	}

	public void setMaxReplica(Integer maxReplica) {
		this.maxReplica = maxReplica;
	}

	public Map<Object,Object> getStrategies() {
		return this.strategies;
	}

	public void setStrategies(Map<Object,Object> strategies) {
		this.strategies = strategies;
	}

	public Map<Object,Object> getCurrentValues() {
		return this.currentValues;
	}

	public void setCurrentValues(Map<Object,Object> currentValues) {
		this.currentValues = currentValues;
	}

	public Map<Object,Object> getBehavior() {
		return this.behavior;
	}

	public void setBehavior(Map<Object,Object> behavior) {
		this.behavior = behavior;
	}

	@Override
	public DescribeServiceAutoScalerResponse getInstance(UnmarshallerContext context) {
		return	DescribeServiceAutoScalerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
