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
import com.aliyuncs.live.transform.v20161101.DescribeLiveDomainLimitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainLimitResponse extends AcsResponse {

	private String requestId;

	private List<LiveDomainLimit> liveDomainLimitList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LiveDomainLimit> getLiveDomainLimitList() {
		return this.liveDomainLimitList;
	}

	public void setLiveDomainLimitList(List<LiveDomainLimit> liveDomainLimitList) {
		this.liveDomainLimitList = liveDomainLimitList;
	}

	public static class LiveDomainLimit {

		private String domainName;

		private Integer limitNum;

		private Integer limitTranscodeNum;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public Integer getLimitNum() {
			return this.limitNum;
		}

		public void setLimitNum(Integer limitNum) {
			this.limitNum = limitNum;
		}

		public Integer getLimitTranscodeNum() {
			return this.limitTranscodeNum;
		}

		public void setLimitTranscodeNum(Integer limitTranscodeNum) {
			this.limitTranscodeNum = limitTranscodeNum;
		}
	}

	@Override
	public DescribeLiveDomainLimitResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDomainLimitResponseUnmarshaller.unmarshall(this, context);
	}
}
