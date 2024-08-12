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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddLabelsRequest extends RpcAcsRequest<AddLabelsResponse> {
	   

	private String labelContents;
	public AddLabelsRequest() {
		super("wyota", "2021-04-20", "AddLabels");
		setMethod(MethodType.POST);
	}

	public String getLabelContents() {
		return this.labelContents;
	}

	public void setLabelContents(String labelContents) {
		this.labelContents = labelContents;
		if(labelContents != null){
			putBodyParameter("LabelContents", labelContents);
		}
	}

	@Override
	public Class<AddLabelsResponse> getResponseClass() {
		return AddLabelsResponse.class;
	}

}
