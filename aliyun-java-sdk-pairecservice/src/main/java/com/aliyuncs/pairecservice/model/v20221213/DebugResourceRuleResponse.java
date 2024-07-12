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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.DebugResourceRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DebugResourceRuleResponse extends AcsResponse {

	private String requestId;

	private Map<Object,Object> currentValues;

	private Map<Object,Object> outputValues;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Map<Object,Object> getCurrentValues() {
		return this.currentValues;
	}

	public void setCurrentValues(Map<Object,Object> currentValues) {
		this.currentValues = currentValues;
	}

	public Map<Object,Object> getOutputValues() {
		return this.outputValues;
	}

	public void setOutputValues(Map<Object,Object> outputValues) {
		this.outputValues = outputValues;
	}

	@Override
	public DebugResourceRuleResponse getInstance(UnmarshallerContext context) {
		return	DebugResourceRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
