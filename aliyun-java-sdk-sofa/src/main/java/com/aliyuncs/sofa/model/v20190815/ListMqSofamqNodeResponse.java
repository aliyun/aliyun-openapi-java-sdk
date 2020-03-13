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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ListMqSofamqNodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMqSofamqNodeResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String cluster;

		private String dataCenter;

		private String gmtCreate;

		private String gmtModified;

		private String hostname;

		private Long id;

		private String nodeGroup;

		private String nodeType;

		private String perm;

		private String rip;

		private String room;

		private String vip;

		public String getCluster() {
			return this.cluster;
		}

		public void setCluster(String cluster) {
			this.cluster = cluster;
		}

		public String getDataCenter() {
			return this.dataCenter;
		}

		public void setDataCenter(String dataCenter) {
			this.dataCenter = dataCenter;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNodeGroup() {
			return this.nodeGroup;
		}

		public void setNodeGroup(String nodeGroup) {
			this.nodeGroup = nodeGroup;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getPerm() {
			return this.perm;
		}

		public void setPerm(String perm) {
			this.perm = perm;
		}

		public String getRip() {
			return this.rip;
		}

		public void setRip(String rip) {
			this.rip = rip;
		}

		public String getRoom() {
			return this.room;
		}

		public void setRoom(String room) {
			this.room = room;
		}

		public String getVip() {
			return this.vip;
		}

		public void setVip(String vip) {
			this.vip = vip;
		}
	}

	@Override
	public ListMqSofamqNodeResponse getInstance(UnmarshallerContext context) {
		return	ListMqSofamqNodeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
