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

package com.aliyuncs.couponnew.model.v20190401;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetCouponFullTemplatePageRequest extends RpcAcsRequest<GetCouponFullTemplatePageResponse> {
	
	public GetCouponFullTemplatePageRequest() {
		super("CouponNew", "2019-04-01", "GetCouponFullTemplatePage");
	}

	private String fromApp;

	private String param;

	private Integer pageNo;

	private Integer pageSize;

	public String getFromApp() {
		return this.fromApp;
	}

	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
		if(fromApp != null){
			putQueryParameter("FromApp", fromApp);
		}
	}

	public String getParam() {
		return this.param;
	}

	public void setParam(String param) {
		this.param = param;
		if(param != null){
			putQueryParameter("Param", param);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<GetCouponFullTemplatePageResponse> getResponseClass() {
		return GetCouponFullTemplatePageResponse.class;
	}

}
