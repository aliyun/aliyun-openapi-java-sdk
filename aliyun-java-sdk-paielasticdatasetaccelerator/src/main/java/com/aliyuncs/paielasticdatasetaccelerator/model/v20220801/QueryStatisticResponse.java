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

package com.aliyuncs.paielasticdatasetaccelerator.model.v20220801;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.paielasticdatasetaccelerator.transform.v20220801.QueryStatisticResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryStatisticResponse extends AcsResponse {

	private String requestId;

	private Map<Object,Object> instanceCapacityEachType;

	private Map<Object,Object> instanceNumEachType;

	private Map<Object,Object> slotNumEachType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Map<Object,Object> getInstanceCapacityEachType() {
		return this.instanceCapacityEachType;
	}

	public void setInstanceCapacityEachType(Map<Object,Object> instanceCapacityEachType) {
		this.instanceCapacityEachType = instanceCapacityEachType;
	}

	public Map<Object,Object> getInstanceNumEachType() {
		return this.instanceNumEachType;
	}

	public void setInstanceNumEachType(Map<Object,Object> instanceNumEachType) {
		this.instanceNumEachType = instanceNumEachType;
	}

	public Map<Object,Object> getSlotNumEachType() {
		return this.slotNumEachType;
	}

	public void setSlotNumEachType(Map<Object,Object> slotNumEachType) {
		this.slotNumEachType = slotNumEachType;
	}

	@Override
	public QueryStatisticResponse getInstance(UnmarshallerContext context) {
		return	QueryStatisticResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
