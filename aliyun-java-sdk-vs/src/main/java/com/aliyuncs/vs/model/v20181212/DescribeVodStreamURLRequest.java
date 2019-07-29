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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodStreamURLRequest extends RpcAcsRequest<DescribeVodStreamURLResponse> {
	
	public DescribeVodStreamURLRequest() {
		super("vs", "2018-12-12", "DescribeVodStreamURL", "vs");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String txId;

	private Long ownerId;

	private String url;

	public String getTxId() {
		return this.txId;
	}

	public void setTxId(String txId) {
		this.txId = txId;
		if(txId != null){
			putQueryParameter("TxId", txId);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getBizUrl() {
		return this.url;
	}

	public void setBizUrl(String url) {
		this.url = url;
		if(url != null){
			putQueryParameter("Url", url);
		}
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
		if(url != null){
			putQueryParameter("Url", url);
		}
	}

	@Override
	public Class<DescribeVodStreamURLResponse> getResponseClass() {
		return DescribeVodStreamURLResponse.class;
	}

}
