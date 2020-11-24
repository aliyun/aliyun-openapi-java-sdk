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
import com.aliyuncs.ddoscoo.transform.v20200101.DescribePortConnsListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePortConnsListResponse extends AcsResponse {

	private String requestId;

	private List<Conn> connsList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Conn> getConnsList() {
		return this.connsList;
	}

	public void setConnsList(List<Conn> connsList) {
		this.connsList = connsList;
	}

	public static class Conn {

		private Long conns;

		private Long actConns;

		private Long inActConns;

		private Long cps;

		private Long index;

		private Long time;

		public Long getConns() {
			return this.conns;
		}

		public void setConns(Long conns) {
			this.conns = conns;
		}

		public Long getActConns() {
			return this.actConns;
		}

		public void setActConns(Long actConns) {
			this.actConns = actConns;
		}

		public Long getInActConns() {
			return this.inActConns;
		}

		public void setInActConns(Long inActConns) {
			this.inActConns = inActConns;
		}

		public Long getCps() {
			return this.cps;
		}

		public void setCps(Long cps) {
			this.cps = cps;
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
	}

	@Override
	public DescribePortConnsListResponse getInstance(UnmarshallerContext context) {
		return	DescribePortConnsListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
