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

package com.aliyuncs.hbase.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.QueryHBaseHaDBResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryHBaseHaDBResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Cluster> clusterList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Cluster> getClusterList() {
		return this.clusterList;
	}

	public void setClusterList(List<Cluster> clusterList) {
		this.clusterList = clusterList;
	}

	public static class Cluster {

		private String haName;

		private String bdsName;

		private String activeName;

		private String standbyName;

		private List<HaSlbConn> haSlbConnList;

		public String getHaName() {
			return this.haName;
		}

		public void setHaName(String haName) {
			this.haName = haName;
		}

		public String getBdsName() {
			return this.bdsName;
		}

		public void setBdsName(String bdsName) {
			this.bdsName = bdsName;
		}

		public String getActiveName() {
			return this.activeName;
		}

		public void setActiveName(String activeName) {
			this.activeName = activeName;
		}

		public String getStandbyName() {
			return this.standbyName;
		}

		public void setStandbyName(String standbyName) {
			this.standbyName = standbyName;
		}

		public List<HaSlbConn> getHaSlbConnList() {
			return this.haSlbConnList;
		}

		public void setHaSlbConnList(List<HaSlbConn> haSlbConnList) {
			this.haSlbConnList = haSlbConnList;
		}

		public static class HaSlbConn {

			private String slbType;

			private String slbConnAddr;

			private String hbaseType;

			public String getSlbType() {
				return this.slbType;
			}

			public void setSlbType(String slbType) {
				this.slbType = slbType;
			}

			public String getSlbConnAddr() {
				return this.slbConnAddr;
			}

			public void setSlbConnAddr(String slbConnAddr) {
				this.slbConnAddr = slbConnAddr;
			}

			public String getHbaseType() {
				return this.hbaseType;
			}

			public void setHbaseType(String hbaseType) {
				this.hbaseType = hbaseType;
			}
		}
	}

	@Override
	public QueryHBaseHaDBResponse getInstance(UnmarshallerContext context) {
		return	QueryHBaseHaDBResponseUnmarshaller.unmarshall(this, context);
	}
}
