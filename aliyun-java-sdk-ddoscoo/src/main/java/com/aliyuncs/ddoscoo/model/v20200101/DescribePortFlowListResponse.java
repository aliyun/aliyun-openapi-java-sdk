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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribePortFlowListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePortFlowListResponse extends AcsResponse {

	private String requestId;

	private List<PortFlow> portFlowList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PortFlow> getPortFlowList() {
		return this.portFlowList;
	}

	public void setPortFlowList(List<PortFlow> portFlowList) {
		this.portFlowList = portFlowList;
	}

	public static class PortFlow {

		private Long attackBps;

		private Long attackPps;

		private Long outPps;

		private Long index;

		private Long time;

		private Long inBps;

		private Long outBps;

		private Long inPps;

		private String region;

		public Long getAttackBps() {
			return this.attackBps;
		}

		public void setAttackBps(Long attackBps) {
			this.attackBps = attackBps;
		}

		public Long getAttackPps() {
			return this.attackPps;
		}

		public void setAttackPps(Long attackPps) {
			this.attackPps = attackPps;
		}

		public Long getOutPps() {
			return this.outPps;
		}

		public void setOutPps(Long outPps) {
			this.outPps = outPps;
		}

		public Long getIndex() {
			return this.index;
		}

		public void setIndex(Long index) {
			this.index = index;
		}

		public Long getTime() {
			return this.time;
		}

		public void setTime(Long time) {
			this.time = time;
		}

		public Long getInBps() {
			return this.inBps;
		}

		public void setInBps(Long inBps) {
			this.inBps = inBps;
		}

		public Long getOutBps() {
			return this.outBps;
		}

		public void setOutBps(Long outBps) {
			this.outBps = outBps;
		}

		public Long getInPps() {
			return this.inPps;
		}

		public void setInPps(Long inPps) {
			this.inPps = inPps;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}
	}

	@Override
	public DescribePortFlowListResponse getInstance(UnmarshallerContext context) {
		return	DescribePortFlowListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
