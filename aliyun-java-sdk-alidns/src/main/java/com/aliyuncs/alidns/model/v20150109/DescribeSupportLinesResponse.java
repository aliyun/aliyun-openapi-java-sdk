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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeSupportLinesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSupportLinesResponse extends AcsResponse {

	private String requestId;

	private List<RecordLine> recordLines;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RecordLine> getRecordLines() {
		return this.recordLines;
	}

	public void setRecordLines(List<RecordLine> recordLines) {
		this.recordLines = recordLines;
	}

	public static class RecordLine {

		private String lineCode;

		private String fatherCode;

		private String lineName;

		private String lineDisplayName;

		public String getLineCode() {
			return this.lineCode;
		}

		public void setLineCode(String lineCode) {
			this.lineCode = lineCode;
		}

		public String getFatherCode() {
			return this.fatherCode;
		}

		public void setFatherCode(String fatherCode) {
			this.fatherCode = fatherCode;
		}

		public String getLineName() {
			return this.lineName;
		}

		public void setLineName(String lineName) {
			this.lineName = lineName;
		}

		public String getLineDisplayName() {
			return this.lineDisplayName;
		}

		public void setLineDisplayName(String lineDisplayName) {
			this.lineDisplayName = lineDisplayName;
		}
	}

	@Override
	public DescribeSupportLinesResponse getInstance(UnmarshallerContext context) {
		return	DescribeSupportLinesResponseUnmarshaller.unmarshall(this, context);
	}
}
