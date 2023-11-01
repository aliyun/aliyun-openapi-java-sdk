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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DoQuickFieldRequest extends RpcAcsRequest<DoQuickFieldResponse> {
	   

	private Integer from;

	private String index;

	private Boolean reverse;

	private Integer size;

	private Integer to;

	private Integer page;
	public DoQuickFieldRequest() {
		super("cloud-siem", "2022-06-16", "DoQuickField", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public Integer getFrom() {
		return this.from;
	}

	public void setFrom(Integer from) {
		this.from = from;
		if(from != null){
			putBodyParameter("From", from.toString());
		}
	}

	public String getIndex() {
		return this.index;
	}

	public void setIndex(String index) {
		this.index = index;
		if(index != null){
			putBodyParameter("Index", index);
		}
	}

	public Boolean getReverse() {
		return this.reverse;
	}

	public void setReverse(Boolean reverse) {
		this.reverse = reverse;
		if(reverse != null){
			putBodyParameter("Reverse", reverse.toString());
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putBodyParameter("Size", size.toString());
		}
	}

	public Integer getTo() {
		return this.to;
	}

	public void setTo(Integer to) {
		this.to = to;
		if(to != null){
			putBodyParameter("To", to.toString());
		}
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putBodyParameter("Page", page.toString());
		}
	}

	@Override
	public Class<DoQuickFieldResponse> getResponseClass() {
		return DoQuickFieldResponse.class;
	}

}
