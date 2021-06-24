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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQuerySequentialImpactResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQuerySequentialImpactResponse extends AcsResponse {

	private String requestId;

	private List<SeqItem> seqItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SeqItem> getSeqItems() {
		return this.seqItems;
	}

	public void setSeqItems(List<SeqItem> seqItems) {
		this.seqItems = seqItems;
	}

	public static class SeqItem {

		private Integer dataCnt;

		private Boolean dataValid;

		private Boolean defaultResultFormat;

		private String endTime;

		private String startTime;

		private String targetExceptionName;

		private Integer interval;

		private List<String> userCnts;

		private List<String> gc2Cnts;

		private List<String> gocVcpuCnts;

		private List<String> gc1Cnts;

		private List<String> realVcpuCnts;

		private List<String> gc3Cnts;

		private List<String> gc5Cnts;

		private List<String> gc4Cnts;

		private List<String> gc0Cnts;

		private List<String> timeLines;

		private List<String> vmCnts;

		private List<String> gc6Cnts;

		private List<String> gc7Cnts;

		public Integer getDataCnt() {
			return this.dataCnt;
		}

		public void setDataCnt(Integer dataCnt) {
			this.dataCnt = dataCnt;
		}

		public Boolean getDataValid() {
			return this.dataValid;
		}

		public void setDataValid(Boolean dataValid) {
			this.dataValid = dataValid;
		}

		public Boolean getDefaultResultFormat() {
			return this.defaultResultFormat;
		}

		public void setDefaultResultFormat(Boolean defaultResultFormat) {
			this.defaultResultFormat = defaultResultFormat;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getTargetExceptionName() {
			return this.targetExceptionName;
		}

		public void setTargetExceptionName(String targetExceptionName) {
			this.targetExceptionName = targetExceptionName;
		}

		public Integer getInterval() {
			return this.interval;
		}

		public void setInterval(Integer interval) {
			this.interval = interval;
		}

		public List<String> getUserCnts() {
			return this.userCnts;
		}

		public void setUserCnts(List<String> userCnts) {
			this.userCnts = userCnts;
		}

		public List<String> getGc2Cnts() {
			return this.gc2Cnts;
		}

		public void setGc2Cnts(List<String> gc2Cnts) {
			this.gc2Cnts = gc2Cnts;
		}

		public List<String> getGocVcpuCnts() {
			return this.gocVcpuCnts;
		}

		public void setGocVcpuCnts(List<String> gocVcpuCnts) {
			this.gocVcpuCnts = gocVcpuCnts;
		}

		public List<String> getGc1Cnts() {
			return this.gc1Cnts;
		}

		public void setGc1Cnts(List<String> gc1Cnts) {
			this.gc1Cnts = gc1Cnts;
		}

		public List<String> getRealVcpuCnts() {
			return this.realVcpuCnts;
		}

		public void setRealVcpuCnts(List<String> realVcpuCnts) {
			this.realVcpuCnts = realVcpuCnts;
		}

		public List<String> getGc3Cnts() {
			return this.gc3Cnts;
		}

		public void setGc3Cnts(List<String> gc3Cnts) {
			this.gc3Cnts = gc3Cnts;
		}

		public List<String> getGc5Cnts() {
			return this.gc5Cnts;
		}

		public void setGc5Cnts(List<String> gc5Cnts) {
			this.gc5Cnts = gc5Cnts;
		}

		public List<String> getGc4Cnts() {
			return this.gc4Cnts;
		}

		public void setGc4Cnts(List<String> gc4Cnts) {
			this.gc4Cnts = gc4Cnts;
		}

		public List<String> getGc0Cnts() {
			return this.gc0Cnts;
		}

		public void setGc0Cnts(List<String> gc0Cnts) {
			this.gc0Cnts = gc0Cnts;
		}

		public List<String> getTimeLines() {
			return this.timeLines;
		}

		public void setTimeLines(List<String> timeLines) {
			this.timeLines = timeLines;
		}

		public List<String> getVmCnts() {
			return this.vmCnts;
		}

		public void setVmCnts(List<String> vmCnts) {
			this.vmCnts = vmCnts;
		}

		public List<String> getGc6Cnts() {
			return this.gc6Cnts;
		}

		public void setGc6Cnts(List<String> gc6Cnts) {
			this.gc6Cnts = gc6Cnts;
		}

		public List<String> getGc7Cnts() {
			return this.gc7Cnts;
		}

		public void setGc7Cnts(List<String> gc7Cnts) {
			this.gc7Cnts = gc7Cnts;
		}
	}

	@Override
	public OpsQuerySequentialImpactResponse getInstance(UnmarshallerContext context) {
		return	OpsQuerySequentialImpactResponseUnmarshaller.unmarshall(this, context);
	}
}
