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

package com.aliyuncs.aliyunauth.model.v20181222;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryInEffectQuthOrderRequest extends RpcAcsRequest<QueryInEffectQuthOrderResponse> {
	   

	private String requestFromApp;

	private String bizCode;

	private String requestId;

	private String requestWay;

	private String userNo;

	private String channel;

	private String language;

	private String operatorTypeEnum;
	public QueryInEffectQuthOrderRequest() {
		super("AliyunAuth", "2018-12-22", "QueryInEffectQuthOrder");
		setMethod(MethodType.GET);
	}

	public String getRequestFromApp() {
		return this.requestFromApp;
	}

	public void setRequestFromApp(String requestFromApp) {
		this.requestFromApp = requestFromApp;
		if(requestFromApp != null){
			putQueryParameter("RequestFromApp", requestFromApp);
		}
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
		if(bizCode != null){
			putQueryParameter("BizCode", bizCode);
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public String getRequestWay() {
		return this.requestWay;
	}

	public void setRequestWay(String requestWay) {
		this.requestWay = requestWay;
		if(requestWay != null){
			putQueryParameter("RequestWay", requestWay);
		}
	}

	public String getUserNo() {
		return this.userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
		if(userNo != null){
			putQueryParameter("UserNo", userNo);
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getOperatorTypeEnum() {
		return this.operatorTypeEnum;
	}

	public void setOperatorTypeEnum(String operatorTypeEnum) {
		this.operatorTypeEnum = operatorTypeEnum;
		if(operatorTypeEnum != null){
			putQueryParameter("OperatorTypeEnum", operatorTypeEnum);
		}
	}

	@Override
	public Class<QueryInEffectQuthOrderResponse> getResponseClass() {
		return QueryInEffectQuthOrderResponse.class;
	}

}
