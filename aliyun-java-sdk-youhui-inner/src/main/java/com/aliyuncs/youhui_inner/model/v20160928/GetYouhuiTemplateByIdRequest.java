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
public class GetYouhuiTemplateByIdRequest extends RpcAcsRequest<GetYouhuiTemplateByIdResponse> {
	
	public GetYouhuiTemplateByIdRequest() {
		super("Youhui-inner", "2016-09-28", "GetYouhuiTemplateById");
	}

	private String yhRequestId;

	private String yhIdempotentToken;

	private String yhFromApp;

	private Long yhTemplateId;

	public String getYhRequestId() {
		return this.yhRequestId;
	}

	public void setYhRequestId(String yhRequestId) {
		this.yhRequestId = yhRequestId;
		if(yhRequestId != null){
			putQueryParameter("YhRequestId", yhRequestId);
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

	@Override
	public Class<GetYouhuiTemplateByIdResponse> getResponseClass() {
		return GetYouhuiTemplateByIdResponse.class;
	}

}
