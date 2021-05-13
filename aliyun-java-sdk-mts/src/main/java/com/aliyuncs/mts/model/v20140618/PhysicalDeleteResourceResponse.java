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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.PhysicalDeleteResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PhysicalDeleteResourceResponse extends AcsResponse {

	private String gmtWakeup;

	private Long hid;

	private String invoker;

	private String message;

	private String taskIdentifier;

	private String taskExtraData;

	private String country;

	private String pk;

	private String bid;

	private Boolean success;

	private Boolean interrupt;

	public String getGmtWakeup() {
		return this.gmtWakeup;
	}

	public void setGmtWakeup(String gmtWakeup) {
		this.gmtWakeup = gmtWakeup;
	}

	public Long getHid() {
		return this.hid;
	}

	public void setHid(Long hid) {
		this.hid = hid;
	}

	public String getInvoker() {
		return this.invoker;
	}

	public void setInvoker(String invoker) {
		this.invoker = invoker;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTaskIdentifier() {
		return this.taskIdentifier;
	}

	public void setTaskIdentifier(String taskIdentifier) {
		this.taskIdentifier = taskIdentifier;
	}

	public String getTaskExtraData() {
		return this.taskExtraData;
	}

	public void setTaskExtraData(String taskExtraData) {
		this.taskExtraData = taskExtraData;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Boolean getInterrupt() {
		return this.interrupt;
	}

	public void setInterrupt(Boolean interrupt) {
		this.interrupt = interrupt;
	}

	@Override
	public PhysicalDeleteResourceResponse getInstance(UnmarshallerContext context) {
		return	PhysicalDeleteResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
