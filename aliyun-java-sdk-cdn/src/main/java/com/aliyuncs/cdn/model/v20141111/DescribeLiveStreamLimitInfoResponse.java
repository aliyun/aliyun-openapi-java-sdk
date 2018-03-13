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
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeLiveStreamLimitInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamLimitInfoResponse extends AcsResponse {

	private String requestId;

	private List<UserLimitMode> userLimitLists;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UserLimitMode> getUserLimitLists() {
		return this.userLimitLists;
	}

	public void setUserLimitLists(List<UserLimitMode> userLimitLists) {
		this.userLimitLists = userLimitLists;
	}

	public static class UserLimitMode {

		private String limitDomain;

		private String limitNum;

		private String limitTranscodeNum;

		public String getLimitDomain() {
			return this.limitDomain;
		}

		public void setLimitDomain(String limitDomain) {
			this.limitDomain = limitDomain;
		}

		public String getLimitNum() {
			return this.limitNum;
		}

		public void setLimitNum(String limitNum) {
			this.limitNum = limitNum;
		}

		public String getLimitTranscodeNum() {
			return this.limitTranscodeNum;
		}

		public void setLimitTranscodeNum(String limitTranscodeNum) {
			this.limitTranscodeNum = limitTranscodeNum;
		}
	}

	@Override
	public DescribeLiveStreamLimitInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamLimitInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
