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

package com.aliyuncs.afs.model.v20180112;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.afs.transform.v20180112.DescribeCaptchaMinResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCaptchaMinResponse extends AcsResponse {

	private String requestId;

	private String bizCode;

	private Boolean hasData;

	private List<CaptchaMin> captchaMins;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public Boolean getHasData() {
		return this.hasData;
	}

	public void setHasData(Boolean hasData) {
		this.hasData = hasData;
	}

	public List<CaptchaMin> getCaptchaMins() {
		return this.captchaMins;
	}

	public void setCaptchaMins(List<CaptchaMin> captchaMins) {
		this.captchaMins = captchaMins;
	}

	public static class CaptchaMin {

		private String time;

		private String pass;

		private String interception;

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getPass() {
			return this.pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}

		public String getInterception() {
			return this.interception;
		}

		public void setInterception(String interception) {
			this.interception = interception;
		}
	}

	@Override
	public DescribeCaptchaMinResponse getInstance(UnmarshallerContext context) {
		return	DescribeCaptchaMinResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
