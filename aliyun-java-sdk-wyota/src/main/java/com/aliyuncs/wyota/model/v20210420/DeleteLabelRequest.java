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
public class DeleteLabelRequest extends RpcAcsRequest<DeleteLabelResponse> {
	   

	private String labelContent;

	private String labelId;

	private String force;
	public DeleteLabelRequest() {
		super("wyota", "2021-04-20", "DeleteLabel");
		setMethod(MethodType.POST);
	}

	public String getLabelContent() {
		return this.labelContent;
	}

	public void setLabelContent(String labelContent) {
		this.labelContent = labelContent;
		if(labelContent != null){
			putBodyParameter("LabelContent", labelContent);
		}
	}

	public String getLabelId() {
		return this.labelId;
	}

	public void setLabelId(String labelId) {
		this.labelId = labelId;
		if(labelId != null){
			putBodyParameter("LabelId", labelId);
		}
	}

	public String getForce() {
		return this.force;
	}

	public void setForce(String force) {
		this.force = force;
		if(force != null){
			putBodyParameter("Force", force);
		}
	}

	@Override
	public Class<DeleteLabelResponse> getResponseClass() {
		return DeleteLabelResponse.class;
	}

}
