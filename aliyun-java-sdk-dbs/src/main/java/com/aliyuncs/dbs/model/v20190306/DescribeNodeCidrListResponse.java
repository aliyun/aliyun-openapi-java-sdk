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

package com.aliyuncs.dbs.model.v20190306;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbs.transform.v20190306.DescribeNodeCidrListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNodeCidrListResponse extends AcsResponse {

	private Boolean success;

	private String errCode;

	private String errMessage;

	private Integer httpStatusCode;

	private String requestId;

	private List<String> internetIPs;

	private List<String> intranetIPs;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getInternetIPs() {
		return this.internetIPs;
	}

	public void setInternetIPs(List<String> internetIPs) {
		this.internetIPs = internetIPs;
	}

	public List<String> getIntranetIPs() {
		return this.intranetIPs;
	}

	public void setIntranetIPs(List<String> intranetIPs) {
		this.intranetIPs = intranetIPs;
	}

	@Override
	public DescribeNodeCidrListResponse getInstance(UnmarshallerContext context) {
		return	DescribeNodeCidrListResponseUnmarshaller.unmarshall(this, context);
	}
}
