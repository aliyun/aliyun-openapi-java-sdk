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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.QueryInfoByTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryInfoByTokenResponse extends AcsResponse {

	private String requestId;

	private String tokenUid;

	private String tokenBid;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTokenUid() {
		return this.tokenUid;
	}

	public void setTokenUid(String tokenUid) {
		this.tokenUid = tokenUid;
	}

	public String getTokenBid() {
		return this.tokenBid;
	}

	public void setTokenBid(String tokenBid) {
		this.tokenBid = tokenBid;
	}

	@Override
	public QueryInfoByTokenResponse getInstance(UnmarshallerContext context) {
		return	QueryInfoByTokenResponseUnmarshaller.unmarshall(this, context);
	}
}
