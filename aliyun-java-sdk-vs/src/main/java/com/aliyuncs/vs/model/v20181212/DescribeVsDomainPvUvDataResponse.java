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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeVsDomainPvUvDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVsDomainPvUvDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private List<PvUvDataInfo> pvUvDataInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public List<PvUvDataInfo> getPvUvDataInfos() {
		return this.pvUvDataInfos;
	}

	public void setPvUvDataInfos(List<PvUvDataInfo> pvUvDataInfos) {
		this.pvUvDataInfos = pvUvDataInfos;
	}

	public static class PvUvDataInfo {

		private String pV;

		private String uV;

		private String timeStamp;

		public String getPV() {
			return this.pV;
		}

		public void setPV(String pV) {
			this.pV = pV;
		}

		public String getUV() {
			return this.uV;
		}

		public void setUV(String uV) {
			this.uV = uV;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeVsDomainPvUvDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVsDomainPvUvDataResponseUnmarshaller.unmarshall(this, context);
	}
}
