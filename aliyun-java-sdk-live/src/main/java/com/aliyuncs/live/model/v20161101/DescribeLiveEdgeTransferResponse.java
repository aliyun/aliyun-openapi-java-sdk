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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveEdgeTransferResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveEdgeTransferResponse extends AcsResponse {

	private String httpDns;

	private String appName;

	private String requestId;

	private String transferArgs;

	private String streamName;

	private String targetDomainList;

	private String domainName;

	public String getHttpDns() {
		return this.httpDns;
	}

	public void setHttpDns(String httpDns) {
		this.httpDns = httpDns;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTransferArgs() {
		return this.transferArgs;
	}

	public void setTransferArgs(String transferArgs) {
		this.transferArgs = transferArgs;
	}

	public String getStreamName() {
		return this.streamName;
	}

	public void setStreamName(String streamName) {
		this.streamName = streamName;
	}

	public String getTargetDomainList() {
		return this.targetDomainList;
	}

	public void setTargetDomainList(String targetDomainList) {
		this.targetDomainList = targetDomainList;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	@Override
	public DescribeLiveEdgeTransferResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveEdgeTransferResponseUnmarshaller.unmarshall(this, context);
	}
}
