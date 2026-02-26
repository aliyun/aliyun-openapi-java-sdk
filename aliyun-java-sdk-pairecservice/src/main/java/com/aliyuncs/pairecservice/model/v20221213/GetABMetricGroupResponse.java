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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.GetABMetricGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetABMetricGroupResponse extends AcsResponse {

	private String requestId;

	private String name;

	private String sceneId;

	private String description;

	private String owner;

	private String aBMetricIds;

	private String aBMetricNames;

	private Boolean realtime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getABMetricIds() {
		return this.aBMetricIds;
	}

	public void setABMetricIds(String aBMetricIds) {
		this.aBMetricIds = aBMetricIds;
	}

	public String getABMetricNames() {
		return this.aBMetricNames;
	}

	public void setABMetricNames(String aBMetricNames) {
		this.aBMetricNames = aBMetricNames;
	}

	public Boolean getRealtime() {
		return this.realtime;
	}

	public void setRealtime(Boolean realtime) {
		this.realtime = realtime;
	}

	@Override
	public GetABMetricGroupResponse getInstance(UnmarshallerContext context) {
		return	GetABMetricGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
