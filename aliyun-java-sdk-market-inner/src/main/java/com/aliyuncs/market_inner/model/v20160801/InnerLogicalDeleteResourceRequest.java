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

package com.aliyuncs.market_inner.model.v20160801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerLogicalDeleteResourceRequest extends RpcAcsRequest<InnerLogicalDeleteResourceResponse> {
	
	public InnerLogicalDeleteResourceRequest() {
		super("Market-Inner", "2016-08-01", "InnerLogicalDeleteResource");
	}

	private String country;

	private Long hid;

	private Boolean success;

	private Boolean interrupt;

	private String gmtWakeup;

	private String pk;

	private String invoker;

	private String bid;

	private String message;

	private String taskExtraData;

	private String taskIdentifier;

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putQueryParameter("Country", country);
		}
	}

	public Long getHid() {
		return this.hid;
	}

	public void setHid(Long hid) {
		this.hid = hid;
		if(hid != null){
			putQueryParameter("Hid", hid.toString());
		}
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
		if(success != null){
			putQueryParameter("Success", success.toString());
		}
	}

	public Boolean getInterrupt() {
		return this.interrupt;
	}

	public void setInterrupt(Boolean interrupt) {
		this.interrupt = interrupt;
		if(interrupt != null){
			putQueryParameter("Interrupt", interrupt.toString());
		}
	}

	public String getGmtWakeup() {
		return this.gmtWakeup;
	}

	public void setGmtWakeup(String gmtWakeup) {
		this.gmtWakeup = gmtWakeup;
		if(gmtWakeup != null){
			putQueryParameter("GmtWakeup", gmtWakeup);
		}
	}

	public String getPk() {
		return this.pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
		if(pk != null){
			putQueryParameter("Pk", pk);
		}
	}

	public String getInvoker() {
		return this.invoker;
	}

	public void setInvoker(String invoker) {
		this.invoker = invoker;
		if(invoker != null){
			putQueryParameter("Invoker", invoker);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
		if(message != null){
			putQueryParameter("Message", message);
		}
	}

	public String getTaskExtraData() {
		return this.taskExtraData;
	}

	public void setTaskExtraData(String taskExtraData) {
		this.taskExtraData = taskExtraData;
		if(taskExtraData != null){
			putQueryParameter("TaskExtraData", taskExtraData);
		}
	}

	public String getTaskIdentifier() {
		return this.taskIdentifier;
	}

	public void setTaskIdentifier(String taskIdentifier) {
		this.taskIdentifier = taskIdentifier;
		if(taskIdentifier != null){
			putQueryParameter("TaskIdentifier", taskIdentifier);
		}
	}

	@Override
	public Class<InnerLogicalDeleteResourceResponse> getResponseClass() {
		return InnerLogicalDeleteResourceResponse.class;
	}

}
