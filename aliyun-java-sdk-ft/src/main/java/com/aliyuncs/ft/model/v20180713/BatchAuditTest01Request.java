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

package com.aliyuncs.ft.model.v20180713;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BatchAuditTest01Request extends RpcAcsRequest<BatchAuditTest01Response> {
	   

	private String demo01;

	private Boolean test010101;

	private String name;

	private String batchAuditTest01;
	public BatchAuditTest01Request() {
		super("Ft", "2018-07-13", "BatchAuditTest01");
		setMethod(MethodType.POST);
	}

	public String getDemo01() {
		return this.demo01;
	}

	public void setDemo01(String demo01) {
		this.demo01 = demo01;
		if(demo01 != null){
			putQueryParameter("Demo01", demo01);
		}
	}

	public Boolean getTest010101() {
		return this.test010101;
	}

	public void setTest010101(Boolean test010101) {
		this.test010101 = test010101;
		if(test010101 != null){
			putBodyParameter("Test010101", test010101.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getBatchAuditTest01() {
		return this.batchAuditTest01;
	}

	public void setBatchAuditTest01(String batchAuditTest01) {
		this.batchAuditTest01 = batchAuditTest01;
		if(batchAuditTest01 != null){
			putQueryParameter("BatchAuditTest01", batchAuditTest01);
		}
	}

	@Override
	public Class<BatchAuditTest01Response> getResponseClass() {
		return BatchAuditTest01Response.class;
	}

}
