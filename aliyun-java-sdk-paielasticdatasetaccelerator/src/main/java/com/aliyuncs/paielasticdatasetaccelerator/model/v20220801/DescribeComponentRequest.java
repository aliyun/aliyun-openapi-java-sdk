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

package com.aliyuncs.paielasticdatasetaccelerator.model.v20220801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeComponentRequest extends RoaAcsRequest<DescribeComponentResponse> {
	   

	private String componentId;

	private String values;

	private Boolean renderTemplate;
	public DescribeComponentRequest() {
		super("PAIElasticDatasetAccelerator", "2022-08-01", "DescribeComponent", "datasetacc");
		setUriPattern("/api/v1/components/[ComponentId]");
		setMethod(MethodType.GET);
	}

	public String getComponentId() {
		return this.componentId;
	}

	public void setComponentId(String componentId) {
		this.componentId = componentId;
		if(componentId != null){
			putPathParameter("ComponentId", componentId);
		}
	}

	public String getValues() {
		return this.values;
	}

	public void setValues(String values) {
		this.values = values;
		if(values != null){
			putQueryParameter("Values", values);
		}
	}

	public Boolean getRenderTemplate() {
		return this.renderTemplate;
	}

	public void setRenderTemplate(Boolean renderTemplate) {
		this.renderTemplate = renderTemplate;
		if(renderTemplate != null){
			putQueryParameter("RenderTemplate", renderTemplate.toString());
		}
	}

	@Override
	public Class<DescribeComponentResponse> getResponseClass() {
		return DescribeComponentResponse.class;
	}

}
