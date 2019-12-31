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

package com.aliyuncs.mpserverless.model.v20190615;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListSpaceOfLabelRequest extends RpcAcsRequest<ListSpaceOfLabelResponse> {
	   

	private String labelName;

	private String labelValue;
	public ListSpaceOfLabelRequest() {
		super("MPServerless", "2019-06-15", "ListSpaceOfLabel", "MPServerless");
		setMethod(MethodType.POST);
	}

	public String getLabelName() {
		return this.labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
		if(labelName != null){
			putBodyParameter("LabelName", labelName);
		}
	}

	public String getLabelValue() {
		return this.labelValue;
	}

	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
		if(labelValue != null){
			putBodyParameter("LabelValue", labelValue);
		}
	}

	@Override
	public Class<ListSpaceOfLabelResponse> getResponseClass() {
		return ListSpaceOfLabelResponse.class;
	}

}
