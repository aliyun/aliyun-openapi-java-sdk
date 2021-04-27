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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ListPlaylistResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPlaylistResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private List<ProgramInfo> programList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<ProgramInfo> getProgramList() {
		return this.programList;
	}

	public void setProgramList(List<ProgramInfo> programList) {
		this.programList = programList;
	}

	public static class ProgramInfo {

		private String programId;

		private String programName;

		private String casterId;

		private String domainName;

		private Integer repeatNumber;

		private Integer status;

		public String getProgramId() {
			return this.programId;
		}

		public void setProgramId(String programId) {
			this.programId = programId;
		}

		public String getProgramName() {
			return this.programName;
		}

		public void setProgramName(String programName) {
			this.programName = programName;
		}

		public String getCasterId() {
			return this.casterId;
		}

		public void setCasterId(String casterId) {
			this.casterId = casterId;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Integer getRepeatNumber() {
			return this.repeatNumber;
		}

		public void setRepeatNumber(Integer repeatNumber) {
			this.repeatNumber = repeatNumber;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
	}

	@Override
	public ListPlaylistResponse getInstance(UnmarshallerContext context) {
		return	ListPlaylistResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
