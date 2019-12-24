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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.QueryPromotionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPromotionResponse extends AcsResponse {

	private Boolean status;

	private String msg;

	private String errorCode;

	private String requestId;

	private String url;

	private String unionAmount;

	private String noPromotionUrl;

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUnionAmount() {
		return this.unionAmount;
	}

	public void setUnionAmount(String unionAmount) {
		this.unionAmount = unionAmount;
	}

	public String getNoPromotionUrl() {
		return this.noPromotionUrl;
	}

	public void setNoPromotionUrl(String noPromotionUrl) {
		this.noPromotionUrl = noPromotionUrl;
	}

	@Override
	public QueryPromotionResponse getInstance(UnmarshallerContext context) {
		return	QueryPromotionResponseUnmarshaller.unmarshall(this, context);
	}
}
