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

package com.aliyuncs.qualitycheck.model.v20190115;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.DoPhysicalDeleteResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DoPhysicalDeleteResourceResponse extends AcsResponse {

	private String interrupt;

	private Long invoker;

	private String pk;

	private String bid;

	private Long hid;

	private String country;

	private String taskIdentifier;

	private String taskIdentifier1;

	private String gmtWakeup;

	private Boolean success;

	private String message;

	private Long level;

	private String prompt;

	public String getInterrupt() {
		return this.interrupt;
	}

	public void setInterrupt(String interrupt) {
		this.interrupt = interrupt;
	}

	public Long getInvoker() {
		return this.invoker;
	}

	public void setInvoker(Long invoker) {
		this.invoker = invoker;
	}

	public String getPk() {
		return this.pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public Long getHid() {
		return this.hid;
	}

	public void setHid(Long hid) {
		this.hid = hid;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTaskIdentifier() {
		return this.taskIdentifier;
	}

	public void setTaskIdentifier(String taskIdentifier) {
		this.taskIdentifier = taskIdentifier;
	}

	public String getTaskIdentifier1() {
		return this.taskIdentifier1;
	}

	public void setTaskIdentifier1(String taskIdentifier1) {
		this.taskIdentifier1 = taskIdentifier1;
	}

	public String getGmtWakeup() {
		return this.gmtWakeup;
	}

	public void setGmtWakeup(String gmtWakeup) {
		this.gmtWakeup = gmtWakeup;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getLevel() {
		return this.level;
	}

	public void setLevel(Long level) {
		this.level = level;
	}

	public String getPrompt() {
		return this.prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	@Override
	public DoPhysicalDeleteResourceResponse getInstance(UnmarshallerContext context) {
		return	DoPhysicalDeleteResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
