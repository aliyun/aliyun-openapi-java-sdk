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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerEcsDescribeIpsInGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerEcsDescribeIpsInGroupResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private Long aliUid;

	private String groupId;

	private Integer pageNo;

	private Integer pageSize;

	private String networkType;

	private List<Ip> ips;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public List<Ip> getIps() {
		return this.ips;
	}

	public void setIps(List<Ip> ips) {
		this.ips = ips;
	}

	public static class Ip {

		private String instanceId;

		private List<String> privateIps;

		private List<String> publicIps;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<String> getPrivateIps() {
			return this.privateIps;
		}

		public void setPrivateIps(List<String> privateIps) {
			this.privateIps = privateIps;
		}

		public List<String> getPublicIps() {
			return this.publicIps;
		}

		public void setPublicIps(List<String> publicIps) {
			this.publicIps = publicIps;
		}
	}

	@Override
	public InnerEcsDescribeIpsInGroupResponse getInstance(UnmarshallerContext context) {
		return	InnerEcsDescribeIpsInGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
