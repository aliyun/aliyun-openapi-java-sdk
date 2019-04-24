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
public class InvalidYouhuiRequest extends RpcAcsRequest<InvalidYouhuiResponse> {
	
	public InvalidYouhuiRequest() {
		super("Youhui-inner", "2016-09-28", "InvalidYouhui");
	}

	private String yhRequestId;

	private Long yhHavanaId;

	private Long yhId;

	private String yhFromApp;

	private String operator;

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

	public Long getYhId() {
		return this.yhId;
	}

	public void setYhId(Long yhId) {
		this.yhId = yhId;
		if(yhId != null){
			putQueryParameter("yhId", yhId.toString());
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

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("operator", operator);
		}
	}

	@Override
	public Class<InvalidYouhuiResponse> getResponseClass() {
		return InvalidYouhuiResponse.class;
	}

}
