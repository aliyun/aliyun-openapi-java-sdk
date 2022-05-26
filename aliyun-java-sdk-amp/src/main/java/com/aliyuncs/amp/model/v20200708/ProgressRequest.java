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

package com.aliyuncs.amp.model.v20200708;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ProgressRequest extends RoaAcsRequest<ProgressResponse> {
	   

	private Integer total;

	private String test;

	private String processId;

	private String taskCode;

	private Integer addend;
	public ProgressRequest() {
		super("amp", "2020-07-08", "Progress", "jeepproduct001");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/Progress");
		setMethod(MethodType.POST);
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
		if(total != null){
			putBodyParameter("Total", total.toString());
		}
	}

	public String getTest() {
		return this.test;
	}

	public void setTest(String test) {
		this.test = test;
		if(test != null){
			putBodyParameter("Test", test);
		}
	}

	public String getProcessId() {
		return this.processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
		if(processId != null){
			putBodyParameter("ProcessId", processId);
		}
	}

	public String getTaskCode() {
		return this.taskCode;
	}

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
		if(taskCode != null){
			putBodyParameter("TaskCode", taskCode);
		}
	}

	public Integer getAddend() {
		return this.addend;
	}

	public void setAddend(Integer addend) {
		this.addend = addend;
		if(addend != null){
			putBodyParameter("Addend", addend.toString());
		}
	}

	@Override
	public Class<ProgressResponse> getResponseClass() {
		return ProgressResponse.class;
	}

}
