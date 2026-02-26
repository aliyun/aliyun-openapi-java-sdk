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

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeTemplatesRequest extends RoaAcsRequest<DescribeTemplatesResponse> {
	   

	private Long page_num;

	private String template_type;

	private Long page_size;
	public DescribeTemplatesRequest() {
		super("CS", "2015-12-15", "DescribeTemplates");
		setUriPattern("/templates");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getPage_num() {
		return this.page_num;
	}

	public void setPage_num(Long page_num) {
		this.page_num = page_num;
		if(page_num != null){
			putQueryParameter("page_num", page_num.toString());
		}
	}

	public String getTemplate_type() {
		return this.template_type;
	}

	public void setTemplate_type(String template_type) {
		this.template_type = template_type;
		if(template_type != null){
			putQueryParameter("template_type", template_type);
		}
	}

	public Long getPage_size() {
		return this.page_size;
	}

	public void setPage_size(Long page_size) {
		this.page_size = page_size;
		if(page_size != null){
			putQueryParameter("page_size", page_size.toString());
		}
	}

	@Override
	public Class<DescribeTemplatesResponse> getResponseClass() {
		return DescribeTemplatesResponse.class;
	}

}
