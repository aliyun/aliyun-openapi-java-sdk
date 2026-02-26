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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeSystemPropertyTemplatesRequest extends RpcAcsRequest<DescribeSystemPropertyTemplatesResponse> {
	   

	private List<String> templateIdss;

	private String nextToken;

	private Integer maxResults;

	private String templateName;
	public DescribeSystemPropertyTemplatesRequest() {
		super("eds-aic", "2023-09-30", "DescribeSystemPropertyTemplates");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getTemplateIdss() {
		return this.templateIdss;
	}

	public void setTemplateIdss(List<String> templateIdss) {
		this.templateIdss = templateIdss;	
		if (templateIdss != null) {
			for (int i = 0; i < templateIdss.size(); i++) {
				putQueryParameter("TemplateIds." + (i + 1) , templateIdss.get(i));
			}
		}	
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
		}
	}

	@Override
	public Class<DescribeSystemPropertyTemplatesResponse> getResponseClass() {
		return DescribeSystemPropertyTemplatesResponse.class;
	}

}
