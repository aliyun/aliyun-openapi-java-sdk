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

package com.aliyuncs.youhui_inner.model.v20160928;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateYouhuiRequest extends RpcAcsRequest<CreateYouhuiResponse> {
	
	public CreateYouhuiRequest() {
		super("Youhui-inner", "2016-09-28", "CreateYouhui");
	}

	private String yhRequestId;

	private Long yhHavanaId;

	private String yhIdempotentToken;

	private String yhAmount;

	private String yhFromApp;

	private Long yhTemplateId;

	private String yhOperator;

	public String getYhRequestId() {
		return this.yhRequestId;
	}

	public void setYhRequestId(String yhRequestId) {
		this.yhRequestId = yhRequestId;
		if(yhRequestId != null){
			putQueryParameter("YhRequestId", yhRequestId);
		}
	}

	public Long getYhHavanaId() {
		return this.yhHavanaId;
	}

	public void setYhHavanaId(Long yhHavanaId) {
		this.yhHavanaId = yhHavanaId;
		if(yhHavanaId != null){
			putQueryParameter("YhHavanaId", yhHavanaId.toString());
		}
	}

	public String getYhIdempotentToken() {
		return this.yhIdempotentToken;
	}

	public void setYhIdempotentToken(String yhIdempotentToken) {
		this.yhIdempotentToken = yhIdempotentToken;
		if(yhIdempotentToken != null){
			putQueryParameter("YhIdempotentToken", yhIdempotentToken);
		}
	}

	public String getYhAmount() {
		return this.yhAmount;
	}

	public void setYhAmount(String yhAmount) {
		this.yhAmount = yhAmount;
		if(yhAmount != null){
			putQueryParameter("YhAmount", yhAmount);
		}
	}

	public String getYhFromApp() {
		return this.yhFromApp;
	}

	public void setYhFromApp(String yhFromApp) {
		this.yhFromApp = yhFromApp;
		if(yhFromApp != null){
			putQueryParameter("YhFromApp", yhFromApp);
		}
	}

	public Long getYhTemplateId() {
		return this.yhTemplateId;
	}

	public void setYhTemplateId(Long yhTemplateId) {
		this.yhTemplateId = yhTemplateId;
		if(yhTemplateId != null){
			putQueryParameter("YhTemplateId", yhTemplateId.toString());
		}
	}

	public String getYhOperator() {
		return this.yhOperator;
	}

	public void setYhOperator(String yhOperator) {
		this.yhOperator = yhOperator;
		if(yhOperator != null){
			putQueryParameter("YhOperator", yhOperator);
		}
	}

	@Override
	public Class<CreateYouhuiResponse> getResponseClass() {
		return CreateYouhuiResponse.class;
	}

}
