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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.CreateRetcodeAppResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateRetcodeAppResponse extends AcsResponse {

	private String requestId;

	private RetcodeAppDataBean retcodeAppDataBean;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RetcodeAppDataBean getRetcodeAppDataBean() {
		return this.retcodeAppDataBean;
	}

	public void setRetcodeAppDataBean(RetcodeAppDataBean retcodeAppDataBean) {
		this.retcodeAppDataBean = retcodeAppDataBean;
	}

	public static class RetcodeAppDataBean {

		private Long appId;

		private String pid;

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public String getPid() {
			return this.pid;
		}

		public void setPid(String pid) {
			this.pid = pid;
		}
	}

	@Override
	public CreateRetcodeAppResponse getInstance(UnmarshallerContext context) {
		return	CreateRetcodeAppResponseUnmarshaller.unmarshall(this, context);
	}
}
