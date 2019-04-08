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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.CreateVpnPbrRouteEntryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateVpnPbrRouteEntryResponse extends AcsResponse {

	private String requestId;

	private String vpnInstanceId;

	private String routeSource;

	private String routeDest;

	private String nextHop;

	private Integer weight;

	private String overlayMode;

	private String description;

	private String state;

	private Long createTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVpnInstanceId() {
		return this.vpnInstanceId;
	}

	public void setVpnInstanceId(String vpnInstanceId) {
		this.vpnInstanceId = vpnInstanceId;
	}

	public String getRouteSource() {
		return this.routeSource;
	}

	public void setRouteSource(String routeSource) {
		this.routeSource = routeSource;
	}

	public String getRouteDest() {
		return this.routeDest;
	}

	public void setRouteDest(String routeDest) {
		this.routeDest = routeDest;
	}

	public String getNextHop() {
		return this.nextHop;
	}

	public void setNextHop(String nextHop) {
		this.nextHop = nextHop;
	}

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getOverlayMode() {
		return this.overlayMode;
	}

	public void setOverlayMode(String overlayMode) {
		this.overlayMode = overlayMode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	@Override
	public CreateVpnPbrRouteEntryResponse getInstance(UnmarshallerContext context) {
		return	CreateVpnPbrRouteEntryResponseUnmarshaller.unmarshall(this, context);
	}
}
