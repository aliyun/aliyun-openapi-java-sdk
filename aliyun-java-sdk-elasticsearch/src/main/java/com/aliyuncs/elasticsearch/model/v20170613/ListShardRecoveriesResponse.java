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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.ListShardRecoveriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListShardRecoveriesResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String index;

		private String sourceHost;

		private String targetNode;

		private String stage;

		private Long filesTotal;

		private String filesPercent;

		private Long bytesTotal;

		private String bytesPercent;

		private Long translogOps;

		private String translogOpsPercent;

		private String sourceNode;

		private String targetHost;

		public String getIndex() {
			return this.index;
		}

		public void setIndex(String index) {
			this.index = index;
		}

		public String getSourceHost() {
			return this.sourceHost;
		}

		public void setSourceHost(String sourceHost) {
			this.sourceHost = sourceHost;
		}

		public String getTargetNode() {
			return this.targetNode;
		}

		public void setTargetNode(String targetNode) {
			this.targetNode = targetNode;
		}

		public String getStage() {
			return this.stage;
		}

		public void setStage(String stage) {
			this.stage = stage;
		}

		public Long getFilesTotal() {
			return this.filesTotal;
		}

		public void setFilesTotal(Long filesTotal) {
			this.filesTotal = filesTotal;
		}

		public String getFilesPercent() {
			return this.filesPercent;
		}

		public void setFilesPercent(String filesPercent) {
			this.filesPercent = filesPercent;
		}

		public Long getBytesTotal() {
			return this.bytesTotal;
		}

		public void setBytesTotal(Long bytesTotal) {
			this.bytesTotal = bytesTotal;
		}

		public String getBytesPercent() {
			return this.bytesPercent;
		}

		public void setBytesPercent(String bytesPercent) {
			this.bytesPercent = bytesPercent;
		}

		public Long getTranslogOps() {
			return this.translogOps;
		}

		public void setTranslogOps(Long translogOps) {
			this.translogOps = translogOps;
		}

		public String getTranslogOpsPercent() {
			return this.translogOpsPercent;
		}

		public void setTranslogOpsPercent(String translogOpsPercent) {
			this.translogOpsPercent = translogOpsPercent;
		}

		public String getSourceNode() {
			return this.sourceNode;
		}

		public void setSourceNode(String sourceNode) {
			this.sourceNode = sourceNode;
		}

		public String getTargetHost() {
			return this.targetHost;
		}

		public void setTargetHost(String targetHost) {
			this.targetHost = targetHost;
		}
	}

	@Override
	public ListShardRecoveriesResponse getInstance(UnmarshallerContext context) {
		return	ListShardRecoveriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
