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

package com.aliyuncs.democenter.model.v20200121;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.democenter.transform.v20200121.DescribeDemoAccessTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDemoAccessTokenResponse extends AcsResponse {

	private String requestId;

	private String demoAccessToken;

	private String expiredDate;

	private String openUserId;

	private String demoTrialPage;

	private String demoDetailPage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDemoAccessToken() {
		return this.demoAccessToken;
	}

	public void setDemoAccessToken(String demoAccessToken) {
		this.demoAccessToken = demoAccessToken;
	}

	public String getExpiredDate() {
		return this.expiredDate;
	}

	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}

	public String getOpenUserId() {
		return this.openUserId;
	}

	public void setOpenUserId(String openUserId) {
		this.openUserId = openUserId;
	}

	public String getDemoTrialPage() {
		return this.demoTrialPage;
	}

	public void setDemoTrialPage(String demoTrialPage) {
		this.demoTrialPage = demoTrialPage;
	}

	public String getDemoDetailPage() {
		return this.demoDetailPage;
	}

	public void setDemoDetailPage(String demoDetailPage) {
		this.demoDetailPage = demoDetailPage;
	}

	@Override
	public DescribeDemoAccessTokenResponse getInstance(UnmarshallerContext context) {
		return	DescribeDemoAccessTokenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
