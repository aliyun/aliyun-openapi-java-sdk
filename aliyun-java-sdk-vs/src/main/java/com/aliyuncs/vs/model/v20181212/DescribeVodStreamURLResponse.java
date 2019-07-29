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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeVodStreamURLResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodStreamURLResponse extends AcsResponse {

	private String requestId;

	private String url;

	private String outProtocol;

	private Long port;

	private String txId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizUrl() {
		return this.url;
	}

	public void setBizUrl(String url) {
		this.url = url;
	}

	/**
	 * @deprecated use getBizUrl instead of this.
	 */
	@Deprecated
	public String getUrl() {
		return this.url;
	}

	/**
	 * @deprecated use setBizUrl instead of this.
	 */
	@Deprecated
	public void setUrl(String url) {
		this.url = url;
	}

	public String getOutProtocol() {
		return this.outProtocol;
	}

	public void setOutProtocol(String outProtocol) {
		this.outProtocol = outProtocol;
	}

	public Long getPort() {
		return this.port;
	}

	public void setPort(Long port) {
		this.port = port;
	}

	public String getTxId() {
		return this.txId;
	}

	public void setTxId(String txId) {
		this.txId = txId;
	}

	@Override
	public DescribeVodStreamURLResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodStreamURLResponseUnmarshaller.unmarshall(this, context);
	}
}
