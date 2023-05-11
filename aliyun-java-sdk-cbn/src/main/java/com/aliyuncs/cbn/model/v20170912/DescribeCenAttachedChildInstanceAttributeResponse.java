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

	private String status;

	private String childInstanceType;

	private String childInstanceRegionId;

	private String requestId;

	private Long childInstanceOwnerId;

	private String childInstanceId;

	private String cenId;

	private String childInstanceName;

	private String ipv6StatusInCen;

	private String childInstanceAttachTime;

	private List<ChildInstanceRouteTable> childInstanceRouteTables;

	private ChildInstanceAttributes childInstanceAttributes;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getChildInstanceOwnerId() {
		return this.childInstanceOwnerId;
	}

	public void setChildInstanceOwnerId(Long childInstanceOwnerId) {
		this.childInstanceOwnerId = childInstanceOwnerId;
	}

	public String getChildInstanceId() {
		return this.childInstanceId;
	}

	public void setChildInstanceId(String childInstanceId) {
		this.childInstanceId = childInstanceId;
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
	}

	public String getChildInstanceName() {
		return this.childInstanceName;
	}

	public void setChildInstanceName(String childInstanceName) {
		this.childInstanceName = childInstanceName;
	}

	public String getIpv6StatusInCen() {
		return this.ipv6StatusInCen;
	}

	public void setIpv6StatusInCen(String ipv6StatusInCen) {
		this.ipv6StatusInCen = ipv6StatusInCen;
	}

	public String getChildInstanceAttachTime() {
		return this.childInstanceAttachTime;
	}

	public void setChildInstanceAttachTime(String childInstanceAttachTime) {
		this.childInstanceAttachTime = childInstanceAttachTime;
	}

	public List<ChildInstanceRouteTable> getChildInstanceRouteTables() {
		return this.childInstanceRouteTables;
	}

	public void setChildInstanceRouteTables(List<ChildInstanceRouteTable> childInstanceRouteTables) {
		this.childInstanceRouteTables = childInstanceRouteTables;
	}

	public ChildInstanceAttributes getChildInstanceAttributes() {
		return this.childInstanceAttributes;
	}

	public void setChildInstanceAttributes(ChildInstanceAttributes childInstanceAttributes) {
		this.childInstanceAttributes = childInstanceAttributes;
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

	public static class ChildInstanceAttributes {

		private String cidrBlock;

		private String ipv6CidrBlock;

		private List<Ipv6CidrBlock> ipv6CidrBlocks;

		private List<String> secondaryCidrBlocks;

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public String getIpv6CidrBlock() {
			return this.ipv6CidrBlock;
		}

		public void setIpv6CidrBlock(String ipv6CidrBlock) {
			this.ipv6CidrBlock = ipv6CidrBlock;
		}

		public List<Ipv6CidrBlock> getIpv6CidrBlocks() {
			return this.ipv6CidrBlocks;
		}

		public void setIpv6CidrBlocks(List<Ipv6CidrBlock> ipv6CidrBlocks) {
			this.ipv6CidrBlocks = ipv6CidrBlocks;
		}

		public List<String> getSecondaryCidrBlocks() {
			return this.secondaryCidrBlocks;
		}

		public void setSecondaryCidrBlocks(List<String> secondaryCidrBlocks) {
			this.secondaryCidrBlocks = secondaryCidrBlocks;
		}

		public static class Ipv6CidrBlock {

			private String ipv6Isp;

			private String ipv6CidrBlock;

			public String getIpv6Isp() {
				return this.ipv6Isp;
			}

			public void setIpv6Isp(String ipv6Isp) {
				this.ipv6Isp = ipv6Isp;
			}

			public String getIpv6CidrBlock() {
				return this.ipv6CidrBlock;
			}

			public void setIpv6CidrBlock(String ipv6CidrBlock) {
				this.ipv6CidrBlock = ipv6CidrBlock;
			}
		}
	}

	@Override
	public DescribeCenAttachedChildInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeCenAttachedChildInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
