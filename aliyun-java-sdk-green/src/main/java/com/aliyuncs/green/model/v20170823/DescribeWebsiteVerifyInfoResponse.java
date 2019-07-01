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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeWebsiteVerifyInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebsiteVerifyInfoResponse extends AcsResponse {

	private String requestId;

	private String cname;

	private String hostFile;

	private String indexPage;

	private String domain;

	private String verifyMethod;

	private String protocol;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getHostFile() {
		return this.hostFile;
	}

	public void setHostFile(String hostFile) {
		this.hostFile = hostFile;
	}

	public String getIndexPage() {
		return this.indexPage;
	}

	public void setIndexPage(String indexPage) {
		this.indexPage = indexPage;
	}

	public String getBizDomain() {
		return this.domain;
	}

	public void setBizDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @deprecated use getBizDomain instead of this.
	 */
	@Deprecated
	public String getDomain() {
		return this.domain;
	}

	/**
	 * @deprecated use setBizDomain instead of this.
	 */
	@Deprecated
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getVerifyMethod() {
		return this.verifyMethod;
	}

	public void setVerifyMethod(String verifyMethod) {
		this.verifyMethod = verifyMethod;
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * @deprecated use getBizProtocol instead of this.
	 */
	@Deprecated
	public String getProtocol() {
		return this.protocol;
	}

	/**
	 * @deprecated use setBizProtocol instead of this.
	 */
	@Deprecated
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	@Override
	public DescribeWebsiteVerifyInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebsiteVerifyInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
