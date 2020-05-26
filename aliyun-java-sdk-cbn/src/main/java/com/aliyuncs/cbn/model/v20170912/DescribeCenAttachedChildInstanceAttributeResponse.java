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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.DescribeCenAttachedChildInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCenAttachedChildInstanceAttributeResponse extends AcsResponse {

	private String requestId;

	private String cenId;

	private String childInstanceId;

	private String childInstanceType;

	private String childInstanceRegionId;

	private Long childInstanceOwnerId;

	private String status;

	private String childInstanceName;

	private String childInstanceAttachTime;

	private String ipv6StatusInCen;

	private List<ChildInstanceRouteTable> childInstanceRouteTables;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
	}

	public String getChildInstanceId() {
		return this.childInstanceId;
	}

	public void setChildInstanceId(String childInstanceId) {
		this.childInstanceId = childInstanceId;
	}

	public String getChildInstanceType() {
		return this.childInstanceType;
	}

	public void setChildInstanceType(String childInstanceType) {
		this.childInstanceType = childInstanceType;
	}

	public String getChildInstanceRegionId() {
		return this.childInstanceRegionId;
	}

	public void setChildInstanceRegionId(String childInstanceRegionId) {
		this.childInstanceRegionId = childInstanceRegionId;
	}

	public Long getChildInstanceOwnerId() {
		return this.childInstanceOwnerId;
	}

	public void setChildInstanceOwnerId(Long childInstanceOwnerId) {
		this.childInstanceOwnerId = childInstanceOwnerId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getChildInstanceName() {
		return this.childInstanceName;
	}

	public void setChildInstanceName(String childInstanceName) {
		this.childInstanceName = childInstanceName;
	}

	public String getChildInstanceAttachTime() {
		return this.childInstanceAttachTime;
	}

	public void setChildInstanceAttachTime(String childInstanceAttachTime) {
		this.childInstanceAttachTime = childInstanceAttachTime;
	}

	public String getIpv6StatusInCen() {
		return this.ipv6StatusInCen;
	}

	public void setIpv6StatusInCen(String ipv6StatusInCen) {
		this.ipv6StatusInCen = ipv6StatusInCen;
	}

	public List<ChildInstanceRouteTable> getChildInstanceRouteTables() {
		return this.childInstanceRouteTables;
	}

	public void setChildInstanceRouteTables(List<ChildInstanceRouteTable> childInstanceRouteTables) {
		this.childInstanceRouteTables = childInstanceRouteTables;
	}

	public static class ChildInstanceRouteTable {

		private String routeTableId;

		private String routeTableType;

		public String getRouteTableId() {
			return this.routeTableId;
		}

		public void setRouteTableId(String routeTableId) {
			this.routeTableId = routeTableId;
		}

		public String getRouteTableType() {
			return this.routeTableType;
		}

		public void setRouteTableType(String routeTableType) {
			this.routeTableType = routeTableType;
		}
	}

	@Override
	public DescribeCenAttachedChildInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeCenAttachedChildInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
