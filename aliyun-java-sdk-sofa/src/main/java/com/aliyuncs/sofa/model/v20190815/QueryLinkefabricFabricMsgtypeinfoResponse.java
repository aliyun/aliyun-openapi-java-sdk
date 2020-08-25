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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkefabricFabricMsgtypeinfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkefabricFabricMsgtypeinfoResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String action;

		private String clusterName;

		private String desc;

		private String eventcode;

		private String msgSize;

		private String msgTotal;

		private String normalTps;

		private String peakTotal;

		private String peakTps;

		private String pgroup;

		private String readPartition;

		private String reliabilityReq;

		private String topic;

		private String typeDesc;

		private String useCase;

		private String writePartition;

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getEventcode() {
			return this.eventcode;
		}

		public void setEventcode(String eventcode) {
			this.eventcode = eventcode;
		}

		public String getMsgSize() {
			return this.msgSize;
		}

		public void setMsgSize(String msgSize) {
			this.msgSize = msgSize;
		}

		public String getMsgTotal() {
			return this.msgTotal;
		}

		public void setMsgTotal(String msgTotal) {
			this.msgTotal = msgTotal;
		}

		public String getNormalTps() {
			return this.normalTps;
		}

		public void setNormalTps(String normalTps) {
			this.normalTps = normalTps;
		}

		public String getPeakTotal() {
			return this.peakTotal;
		}

		public void setPeakTotal(String peakTotal) {
			this.peakTotal = peakTotal;
		}

		public String getPeakTps() {
			return this.peakTps;
		}

		public void setPeakTps(String peakTps) {
			this.peakTps = peakTps;
		}

		public String getPgroup() {
			return this.pgroup;
		}

		public void setPgroup(String pgroup) {
			this.pgroup = pgroup;
		}

		public String getReadPartition() {
			return this.readPartition;
		}

		public void setReadPartition(String readPartition) {
			this.readPartition = readPartition;
		}

		public String getReliabilityReq() {
			return this.reliabilityReq;
		}

		public void setReliabilityReq(String reliabilityReq) {
			this.reliabilityReq = reliabilityReq;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public String getTypeDesc() {
			return this.typeDesc;
		}

		public void setTypeDesc(String typeDesc) {
			this.typeDesc = typeDesc;
		}

		public String getUseCase() {
			return this.useCase;
		}

		public void setUseCase(String useCase) {
			this.useCase = useCase;
		}

		public String getWritePartition() {
			return this.writePartition;
		}

		public void setWritePartition(String writePartition) {
			this.writePartition = writePartition;
		}
	}

	@Override
	public QueryLinkefabricFabricMsgtypeinfoResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkefabricFabricMsgtypeinfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
